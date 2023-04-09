import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        System.out.print("Digite a nota do 1º Bimestre: ");
        nota1 = entrada.nextInt();
        System.out.print("Digite a nota do 2º Bimestre: ");
        nota2 = entrada.nextInt();
        System.out.print("Digite a nota do 3º Bimestre: ");
        nota3 = entrada.nextInt();
        System.out.print("Digite a nota do 4º Bimestre: ");
        nota4 = entrada.nextInt();
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A media é: " + media);
        


       
        
    }
}
