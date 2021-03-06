package com.Project.ESB.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppelService implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable = false)
private long id;
	public AppelService() {
		
		}
	public long getId() {
	return id;
}
	public void setId(long id) {
		this.id=id;
	}
@Override
public String toString() {
	return "AppelService{" +
"id=" + id +
'}';
}
}