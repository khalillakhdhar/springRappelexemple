package com.duranco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity(name = "employee")
public class Worker {
@Id
private long identifiant;
@Column(nullable = false ,length = 30)
private String nom;
@Column(nullable = false ,length = 30)
private String prenom;
@Email
@NotNull // nullable=false
@Column(unique = true)
private String email;
@Column(nullable = false)
private String mdp;
@Min(value = 1200)
private double salaire;
@Column(columnDefinition = "varchar(20) default 'ouvrier' ")
private String grade;
@Null // nullable =true
private String adresse;



}
