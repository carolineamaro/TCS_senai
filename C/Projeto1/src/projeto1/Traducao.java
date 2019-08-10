/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

/**
 *
 * @author aluno
 */
public class Traducao {
    final static int TAMANHO = 8;
    static int vetor[] = {12, 11, 13, 5, 6, 7, 9, 50};
    
    //{12, 11, 13, 5, 6, 7, 9, 50}
    
    static void merge(int vetor[], int inicio, int meio, int fim){
        int aux[] = new int[fim - inicio + 1];
        int i = inicio;
        int j = meio + 1;
        int k = 0;
        
        while(i <= meio && j <= fim){
            if(vetor[i] <= vetor[j]){
                aux[k] = vetor[i];
                k++;
                i++;
            }else {
                aux[k] = vetor[j];
                k++;
                j++;
            }
        }
        
        while(i <= meio){
            aux[k] = vetor[i];
            k++;
            i++;
        }
        
        while(j <= fim){
            aux[k] = vetor[j];
            k++;
            j++;
        }

        i = inicio;
        
        while(i <= fim){
            vetor[i] = aux[i-inicio];
            i++;
        }
    }
    
    static void mergeSort(int vetor[], int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim)/2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }
    
    static void printArray(int aux[], int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.println(aux[i]);
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args){
        System.out.println("Array de Entrada \n");
        printArray(vetor, TAMANHO);
        mergeSort(vetor, 0, TAMANHO - 1);
        
        System.out.println("Array Ordenado \n");
        printArray(vetor, TAMANHO);
        mergeSort(vetor, 0, TAMANHO - 1);
        
    }    
}
