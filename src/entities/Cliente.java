package entities;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Cliente {
	
	private static final SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyy");
	private String nome;
	private String email;
	private Date dataAniversario;
	
	public Cliente(){
		
	}
	
	public Cliente(String nome, String email, Date dataAniversario) {
		this.nome = nome;
		this.email = email;
		this.dataAniversario = dataAniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public static SimpleDateFormat getData() {
		return data;
	}

	@Override
	public String toString() {
		return " [nome=" + nome + ", email=" + email + ", Aniversario=" + dataAniversario + "]";
	}
	

	
		
	

	    
		
	}
	



