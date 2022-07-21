import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double [][] arraypreco= new double[12][5];
		String [] produto = new String [] {"A","B","C","D","E","F","G","H","I","J","K","L"};
		String []loja=new String[] {"LojaA","LojaB","LojaC","LojaD","LojaE"};
			int numProduto=0, numLojaB=0, numProdutoB=0, numLojaC=0;
			double produtoMaisCaro=0, produtoMaisBarato=0;
		for(int i=0; i<12;i++) {
			System.out.println("Produto: "+produto[i]);
			
				
		
		
		for(int j=0; j<5;j++) {
			System.out.println("Informe o preço na loja: "+loja[j]+" :");
			
			arraypreco[i][j]= (double) (Math.random()*200);
			
			
			if(i==0 && j==0) {
				produtoMaisBarato = arraypreco[i][j];
				numProdutoB=i;
				numLojaB=j;
				
			}else {
				if(arraypreco[i][j] > produtoMaisCaro) {
					produtoMaisCaro = arraypreco[i][j];
					numProdutoB=i;
					numLojaB =j;
				}
			}
			
		
		}
	}

}
}