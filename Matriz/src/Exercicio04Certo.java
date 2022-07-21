import java.util.Scanner;

public class Exercicio04Certo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String []loja=new String[] {"A","B","C","D","E","F","G","H"};
		String [] produto = new String [] {"W","X","Z","Y"};
		double[][] arraypreco = new double[4][8];
		
		
		System.out.println("--------------Preços dos produtos por loja-----------");
		
		
		for(int i=0; i<4;i++) {
			System.out.println("Produto: "+ produto[i]);
			
		
		for(int j=0; j<8;j++) {
			System.out.println("Informe o preço do produto"+produto[i]+" na loja "+ loja[j]+" :");
			arraypreco[i][j] = (double) (Math.random()*190);
			
		
		
		
	}
		}}
}
