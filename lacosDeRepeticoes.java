package testearitmeticos;

import java.util.Scanner;

public class lacosDeRepeticoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu Usu�rio");
		int x = sc.nextInt();
				
		while ( x != 110860) {
			System.out.println("Usu�rio n�o Cadastrado!" );
			if ( x!= 110860) {
				System.out.println("Digite a sua Usu�rio: ");
			}
			else {
				System.out.println("Usu�rio cadastrado, acesso permitido." );
			}			
			x = sc.nextInt();			
		}
		System.out.println("Usu�rio cadastrado, acesso permitido." );
		
		
		System.out.println("Digite a sua Senha");
		
		int y = sc.nextInt();		
		while ( y != 16032015) {
			System.out.println("Acesso negado! ");
			if ( y != 16032015) {
			System.out.println("Digite a sua Senha");
			}
			else{
				System.out.println("Acesso Permitido. ");
			}
			y = sc.nextInt();			
		}
		
		System.out.println("Acesso Permitido. ");
		sc.close();
	}

}
