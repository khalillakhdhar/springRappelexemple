package com.duranco.ex1model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class User {
@Id
private int id;
@NotBlank
private String nom_complet;
@Min(value = 18)
@NotNull
private int age;
@Column(nullable = true)
private String adresse;
@Column(length = 20)
@NotBlank
private String telephone;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom_complet() {
	return nom_complet;
}
public void setNom_complet(String nom_complet) {
	this.nom_complet = nom_complet;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}







}
