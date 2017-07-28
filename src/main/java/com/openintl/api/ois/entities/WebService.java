package com.openintl.api.ois.entities;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class WebService {

	@Id
	private String _id;

	private String nombre;
	private InputStream fileCompressed;
	private String serviceTipe;
	private String contract;	
	private Date creationDate;
	private Date modificationDate;
	private Map<String, Method> methods;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public InputStream getCompressed() {
		return fileCompressed;
	}

	public void setCompressed(InputStream compressed) {
		this.fileCompressed= compressed;
	}

	public String getServiceTipe() {
		return serviceTipe;
	}

	public void setServiceTipe(String serviceTipe) {
		this.serviceTipe = serviceTipe;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public Map<String, Method> getMethods() {
		return methods;
	}

	public void setMethods(Map<String, Method> methods) {
		this.methods = methods;
	}
	
	

}
