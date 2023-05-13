//Ler o tamanho de uma lista
//Ler os valores e preencher a lista
//Somar todos valores e exibir o resultado


public class SomaVetor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o tamanho do vetor: ");
    int t = entrada.nextInt();
    int[] v = new int[tamanho];

    System.out.println("Agora digite: " + t + "valores ");
    for (int i = 0; i < v.length; i++) {
      System.out.println("posicao") + i + ": ";
      v[i] = entrada.nextInt();
    }
  
    //Somar posição a posição

    int soma = 0;
    for (int i = 0; i < v.length; i++) {
      soma += v[1];
    }
    System.out.println("soma = " + soma);
    
  }
}
