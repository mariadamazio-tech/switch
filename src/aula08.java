void main() {
    IO.println("Consultar Saldo");
    IO.println("Sacar Dinheiro");
    IO.println("Depositar Dinheiro");
    IO.println("Sair");
    Scanner sc=new Scanner(System.in);
    String caixaeletronico=sc.next();
    switch (caixaeletronico){
        case "Consultar Saldo":
            IO.println("Voce usou o Saldo");
            break;
        case "Sacar Dinheiro":
            IO.println("Voce usou o Dinheiro");
            break;
        case "Depositar Dinheiro":
            IO.println("Voce Depositou");
            break;
        case "Sair":
            IO.println("Voce Saiu");
            break;
        default:
            IO.println("Caixa eletronico invalido");
    }
}