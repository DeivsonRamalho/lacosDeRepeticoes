package testearitmeticos;

import java.util.Scanner;

public class lacosDeRepeticoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu Usuário");
		int x = sc.nextInt();
				
		while ( x != 110860) {
			System.out.println("Usuário não Cadastrado!" );
			if ( x!= 110860) {
				System.out.println("Digite a sua Usuário: ");
			}
			else {
				System.out.println("Usuário cadastrado, acesso permitido." );
			}			
			x = sc.nextInt();			
		}
		System.out.println("Usuário cadastrado, acesso permitido." );
		
		
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
