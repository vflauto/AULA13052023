//Ler os vetores e escolher o maior

import java.util.Scanner;
public class MaiorDoVetor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o tamanho do vetor: ");
    int tamanho = entrada.nextInt();
    int[] v = new int[t]
    for (int i=0; i<v.length; i++){
      System.out.println( "posicao" + i + ": ");
      v[i] = entrada.nextInt();

    }

    int maior = v[0];
    for(int i=1; i<v.length; i++){
      if(v[1] > maior){
        maior = v[i];
      }

    }

    System.out.println("maior = " + maior);
  entrada.close();
  }

}
