package ioexcept.online;


import javax.servlet.http.HttpServletRequest;
import com.mongodb.BasicDBObject;
import com.mongodb.DB; 
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.TreeMultiset;

public class Counter {
	
	
	public static ResultItem getCount(HttpServletRequest request) throws Exception{
		ResultItem ri = new ResultItem();
		MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient("db");
			String remoteIP = request.getRemoteAddr();
			DB db = mongoClient.getDB("docker");
			ri.setConnect();
			DBCollection countercol = db.getCollection("counter");
			BasicDBObject webhit = new BasicDBObject("ip", remoteIP).append("timestamp", new Date());
			countercol.insert(webhit);		
			ri.setInsert();
			countercol = db.getCollection("counter");
			ri.setCount(countercol.getCount());
			ri.setQuery();
		}catch(Exception ex) {
			throw ex;
		}finally {
			try {mongoClient.close();}catch(Exception ex) {}
		}
		return ri;
	}
	
	public Counter() {	}
}