import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		
		String nomes[] = new String[3];
		
		int numeros[][] = new int[3][3];
		
		
		for(int i=0;i<3;i++) {
			
			System.out.println("Digite um nome: ");
			nomes[i]=entrada.next();
		}
		
		for(int indLinha=0;indLinha<3;indLinha++) {
			
			for(int indColuna=0;indColuna<3;indColuna++) {
				System.out.println("Digite o número ["+indLinha+","+indColuna+"]:");
			
			
			numeros[indLinha][indColuna]=entrada.nextInt();
		}
		}
		
		for(int indLinha=0;indLinha<3;indLinha++) {
			
			for(int indColuna=0;indColuna<3;indColuna++) {
				System.out.print("número["+indLinha+","+indColuna+"]:"+numeros[indLinha][indColuna]+"\t");
			}
			System.out.println("");
			
		}
		

	}

}
