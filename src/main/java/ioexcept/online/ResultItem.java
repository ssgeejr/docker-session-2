package ioexcept.online;

import java.util.Date;

public class ResultItem {
	private String count = "-1";
	private String connect = "-1";
	private String insert = "-1";
	private String query = "-1";
	private long baseline = new Date().getTime();
	
	public String getCount() {
		return count;
	}
	public String getConnect() {
		return connect;
	}
	public String getInsert() {
		return insert;
	}
	public String getQuery() {
		return query;
	}

	public void setConnect() {
		this.connect = (new Date().getTime() - baseline)  + "";
		baseline = new Date().getTime();
	}
	public void setInsert() {
		this.insert = (new Date().getTime() - baseline)  + "";
		baseline = new Date().getTime();
	}
	public void setQuery() {
		this.query = (new Date().getTime() - baseline)  + "";
	}

	public void setCount(long count) {
		this.count = count + "";
	}

}
