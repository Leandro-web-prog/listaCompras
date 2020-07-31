package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import enums.StatusPedido;
import java.util.ArrayList;


public class Pedido {
	
	private static final SimpleDateFormat data = new SimpleDateFormat ("dd/MM/yyy HH:mm:ss");
	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItensPedido> itens  = new ArrayList<>();
    
	
    public Pedido(){
    	
    }
	
	
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public StatusPedido getStatus() {
		return status;
	}


	public void setStatus(StatusPedido status) {
		this.status = status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<ItensPedido> getItens() {
		return itens;
	}


	public static SimpleDateFormat getData() {
		return data;
	}
	
	public  void addItem(ItensPedido item){
		itens.add (item);
	}
	
	public void removeItem(ItensPedido item){
		itens.remove(item);
	}
	public double total(){
		double soma=0.0;
		for (ItensPedido item: itens){
			soma += item.subTotal();
		}
		return soma;
	}
	
   public String toString(){
	   StringBuilder sb = new StringBuilder();
	   sb.append("Data do pedido: ");
	   sb.append(data.format(momento) + "\n");
	   sb.append("Status do pedido: ");
	   sb.append(status + "\n");
	   sb.append("Cliente: ");
	   sb.append(cliente + "\n");
	   sb.append("Itens do Pedido: ");
	   for (ItensPedido item: itens){
		   sb.append(item + "\n" );
	   }
	   sb.append("Preço Total: R$: ");
	   sb.append(String.format("%.2f",  total()));
	   return sb.toString();
	   
   }
	
	


}
