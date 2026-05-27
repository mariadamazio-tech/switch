void main() {
    IO.println("Qual é o maior e o menor numero do vetor");
    int[] numeros ={1,2,7,9,4,6};
    for (int i=0;i<numeros.length; i++){
        if (numeros[i] %2==0){
            IO.println(numeros[i]);
        }
    }
}