package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

import entities.Cliente;
import entities.ItensPedido;
import entities.Pedido;
import entities.Produto;
import enums.StatusPedido;

public class TestaPedido {
	
	
	public static void main(String[]args) throws ParseException{
		
	Scanner sc  = new Scanner(System.in);
	SimpleDateFormat data = new SimpleDateFormat ("dd/MM/yyy");
	
	System.out.println("Entre com os dados do cliente: ");
	System.out.println("Nome: ");
	String nome = sc.nextLine();
	System.out.println("e-mail: ");
	String email = sc.nextLine();
	System.out.println("Informe a data de aniverário (DD/MM/YYY): ");
	Date dataAniversario = data.parse(sc.next());
	
	Cliente cliente = new Cliente(nome,email,dataAniversario);
	
	System.out.println("Entre com os dados do pedido: ");
	System.out.println("Status:PAGAMENTO_PENDENTE,APROVADO,PROCESSADO,ENVIADO ou ENTREGUE ");
	StatusPedido status = StatusPedido.valueOf(sc.next());
	Pedido pedido = new Pedido (new Date(),status, cliente);
	System.out.println("Quantos produtos: ");
	int n = sc.nextInt();
	for (int i=1;i<=n;i++){
		System.out.println("Entre # " + i + "item: ");
		System.out.println("Nome do produto: ");
		sc.nextLine();
		String nomeProduto  = sc.nextLine();
		System.out.println("Preço do produto: ");
		double precoProduto = sc.nextDouble();
		Produto produto  = new Produto (nomeProduto,precoProduto);
		
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		
		ItensPedido itensPedido = new ItensPedido (quantidade, precoProduto, produto);
		pedido.addItem(itensPedido);
		
		System.out.println("Deseja remover ou confirmar este item? 1-remover/2-confirmar ");
		int num = sc.nextInt();
		if (num ==1){
			pedido.removeItem(itensPedido);
		}
		else {
			continue;			
		}
	}	
		System.out.println();
		System.out.println("Resumo do pedido:");
		System.out.println(pedido);
		String texto=String.format ("Obrigado %s pela confiança! ",cliente.getNome() );
		System.out.println(texto);
		sc.close();
		
	}
	
		
	}


