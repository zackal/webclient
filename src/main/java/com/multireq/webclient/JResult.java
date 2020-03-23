package com.multireq.webclient;

import java.util.ArrayList;

public class JResult {
	private String resource_id;
	ArrayList<Object> fields = new ArrayList<Object>();
	private String q;
	ArrayList<Object> records = new ArrayList<Object>();
	UnderscoreLinks _linksObject;
	private float total;

	// Getter Methods

	public String getResource_id() {
		return resource_id;
	}

	public String getQ() {
		return q;
	}

	public UnderscoreLinks get_links() {
		return _linksObject;
	}

	public float getTotal() {
		return total;
	}

	// Setter Methods

	public void setResource_id(String resource_id) {
		this.resource_id = resource_id;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public void set_links(UnderscoreLinks _linksObject) {
		this._linksObject = _linksObject;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public ArrayList<Object> getFields() {
		return fields;
	}

	public void setFields(ArrayList<Object> fields) {
		this.fields = fields;
	}

	public ArrayList<Object> getRecords() {
		return records;
	}

	public void setRecords(ArrayList<Object> records) {
		this.records = records;
	}

	public UnderscoreLinks get_linksObject() {
		return _linksObject;
	}

	public void set_linksObject(UnderscoreLinks _linksObject) {
		this._linksObject = _linksObject;
	}
}