package com.huerta.bean;
import java.io.Serializable;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import redis.clients.jedis.Jedis;
import com.huerta.model.User;

@ManagedBean(name="obj")
@ViewScoped
public class ViewManager implements Serializable{
  private String nombre;
  private String apellido;
  private String email;  
  private boolean good;

  public ViewManager() {
     good=true;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public boolean isGood() {
    return good;
  }
  public String getApellido() {
    return apellido;
  } 

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<User> getFindAll(){
    List<String> list = new ArrayList<String>();
    Jedis jedis = new Jedis();
    if(jedis.exists("users")){
      list = jedis.lrange("users",0,-1);
    }
    List<User> list_users = new ArrayList<User>();
    for(String us :list){
      String ar[] = us.split(",");
      User u = new User(ar[0],ar[1],ar[2]);
      list_users.add(u);
    }   
    return list_users;
  }
  
  public String add() {
    String concat = this.nombre + "," + this.apellido + "," + this.email;
    Jedis conn = new Jedis();
    conn.rpush("users", concat);    
    this.setNombre("");
    this.setApellido("");
    this.setEmail("");
    return null; //el return null es una estrategia para que se mantenga en la vista en la que esta
  }
}
