import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		
		DecimalFormat formataMoeda = new DecimalFormat("#0.0");
		
		int codigoCliente[][]= new int[4][4];
		int clientes[][]= new int[4][5];
	
	
		
		
		for(int i=0;i<4;i++) {
			System.out.println("Digite o código do "+ (i+1)+"º cliente :");
			codigoCliente[i][0]=entrada.nextInt();
			
			
			System.out.println("Digite a quantidade de milhagem:");
			clientes[i][1]=entrada.nextInt();
			
			
			System.out.println("Digite a categoria");
			clientes[i][2]=entrada.nextInt();
		
			while ((clientes[i][2]!=1) &&
					(clientes[i][2]!=2) &&
					(clientes[i][2]!=3)) {
				System.out.println("Digite a categoria corretamente:");
				clientes[i][2]=entrada.nextInt();
			}
				if (clientes[i][2]==1) {
					clientes[i][3]=10000;
					
				}else if(clientes[i][2]==2) {
					clientes[i][3]=5000;
				}else {
					clientes[i][3]=0;
				}
					
				clientes[i][4]= clientes [i][1]+ clientes[i][3];
			
		}
		
		System.out.println("");
		
		for(int i=0;i<4;i++) {
			System.out.println("Código do Cliente:"+codigoCliente[i][0]+"\t Quant. Milhagem:" +clientes[i][1]+ "\t Categoria:"+ clientes[i][2]+"\t Bônus:"+ clientes[i][3]+"\t Milhagem Atual:" + clientes[i][4]);
		}
		
		
	

}}
