void main() {
   Scanner sc=new Scanner(System.in);
    IO.println("Digite um número");
    int num1= sc.nextInt();
    IO.println("Digite o segundo número");
    int num2= sc.nextInt();
    IO.println("Digite a operacao");
    String operacao=sc.next();
    switch (operacao){
        case "+":
            IO.println(num1+num2);
            break;
        case "-":
            IO.println(num1-num2);
            break;
        case "*":
            IO.println(num1*num2);
            break;
        case "/":
            IO.println(num1/num2);
            break;
        default:
            IO.println("Escolha um número valido");
    }
}