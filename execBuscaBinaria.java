/*
Crie um vetor ordenado com aproximadamente mil números
inteiros gerados aleatoriamente. Após isso, digite um
valor a ser buscado dentro do array criado usando o 
processo de busca binária.
*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int v[] = new int [1000];
    Random gerador = new Random();
    
    System.out.println("Digite o valor a ser encontrado: ");
    int valorProcurado = leitor.nextInt();

    for(int i = 0; i < v.length; i++) {
      v[i] = gerador.nextInt(1000);      
    }
    Arrays.sort(v);
   
    for (int i = 0; i < v.length; i++) {
      System.out.println(v[i] + " "); //impressão do Array
    }
    
    int pos = buscaBinaria(v, valorProcurado);
    if(pos >= 0)
      System.out.println("Valor encontrado na posição : " + pos);
    else 
    System.out.println("Achei nada");

  }

  public static int buscaBinaria(int[] vetor, int valorProcurado){
    int inicio = 0;
    int fim = vetor.length - 1;

    while(inicio < fim) {
      int meio = (inicio + fim)/2;
      if(vetor[meio] > valorProcurado)
        fim = meio -1;
      else if(vetor[meio] < valorProcurado)
        inicio = meio + 1;
      else return meio;
    }
    return -1;
  }
}
