package mx.contigo.pojo;

import java.io.Serializable;

public class Hello implements Serializable {
	String saludo ; 
	public Hello() {
		saludo = "hellow"; 
	}
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
