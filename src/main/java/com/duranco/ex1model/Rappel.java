package com.duranco.ex1model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
public class Rappel {
@Id
private int id;
@NotNull
private String titre;
@NotNull
@Temporal(TemporalType.TIMESTAMP)
private Date date;
@Null
private String description;
@Column(nullable = false)
private String type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}






}
