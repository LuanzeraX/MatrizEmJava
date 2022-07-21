import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String[] arrayProduto = new String[] {"Produto1","Produto2","Produto3"};
		String[] arrayLojas = new String[] {"LojaA","LojaB","LojaC"};
		int[][] vendasProd1M = new int [3][3];
		int[][] vendasProd2M = new int [3][3];
		int[][] Bimestre = new int [3][4];
		
		
		//a
		
		for(int i=0;i<3;i++) {
			
			System.out.println("Vendas de Produtos na "+arrayLojas[i]+ " 1º Bimestre");
					
			for(int j=0;j<3;j++) {
				System.out.println(arrayProduto[j]+": ");
				vendasProd1M[i][j]= entrada.nextInt();
				
				
			}
		}
	for(int i=0;i<3;i++) {
			
			System.out.println("Vendas de Produtos na "+arrayLojas[i]+ " 2º Bimestre");
					
			for(int j=0;j<3;j++) {
				System.out.println(arrayProduto[j]+": ");
				vendasProd2M[i][j]= entrada.nextInt();
				
				
			}
		}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println("");
			
			//Bimestre[i][j]= vendasProd1M[i][j]+vendasProd2M[i][j];

			//System.out.println("bi: "+ Bimestre[i][j]);
		}
		}
	
		
		
		
		
		
		
		
		
		
		
		
	//for(int i=0;i<5;i++) {
		//for(int j=0;j<3;j++) {
			//System.out.println("Curso:"+(j+1));
			//System.out.println("Quantidade de matrículas unidade:"+(j+1));
			//anual[i][j]=priSem[i][j]+segSem[i][j];
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
