package com.android.volley.toolbox;

import java.util.Date;

public class Cookie {
	private String key;
	private String value;
	private String domain;
	private String path;
	private Date expires;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getExpires() {
		return expires;
	}

	public void setExpires(Date expires) {
		this.expires = expires;
	}

	@Override
	public String toString() {
		return key + "=" + value + ";";
	}

}
