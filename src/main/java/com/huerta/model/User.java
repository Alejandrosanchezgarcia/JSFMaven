package com.huerta.model;
public class User {
  private String nombre;
  private String apellido;
  private String email;
  public User(String n, String a, String e) {
     nombre=n;
     apellido=a;
     email = e;
  }
  public User() {
  }

  public String getNombre() {
     return nombre;
  }
  public String getApellido() {
     return apellido;
  }
  public String getEmail() {
    return email;
 }
  public void setNombre(String n) {
     nombre = n;
  }
  public void setApellido(String a) {
     apellido=a;
  }
  public void setEmail(String e) {
    email=e;
 }

}
