void main() {
    IO.println("Digite 1 x-Burguer");
    IO.println("Digite 2 x-Salada");
    IO.println("Digite 3 Refrigerante");
    IO.println("Digite 4 Batata-frita");
    Scanner sc=new Scanner(System.in);
    int escolha =sc.nextInt();
    switch (escolha){
        case 1:
            IO.println("Voce escolheu x-Burguer");
            break;
        case 2:
            IO.println("Voce escolheu x-Salada");
            break;
        case 3:
            IO.println("Voce escolheu Refrigerante");
            break;
        case 4:
            IO.println("Voce escolheu Batata-frita");
        default:
            IO.println("Digite uma pessoa valida");
    }
}