void main() {
    IO.println("Digite o número do mês que você deseja");
    Scanner sc=new Scanner(System.in);
    int mes= sc.nextInt();
    switch (mes){
        case 1:
            IO.println("Janeiro");
            break;
        case 2:
            IO.println("Feverreiro");
            break;
        case 3:
            IO.println("Março");
            break;
        case 4:
            IO.println("Abril");
            break;
        case 5:
            IO.println("Maio");
            break;
        case 6:
            IO.println("Junho");
            break;
        case 7:
            IO.println("Julho");
            break;
        case 8:
            IO.println("Agosto");
            break;
        case 9:
            IO.println("Setembro");
            break;
        case 10:
            IO.println("Outubro");
            break;
        case 11:
            IO.println("Novembro");
            break;
        case 12:
            IO.println("Dezembro");
            break;
        default:
            IO.println("escolha um mes valido");
    }
}