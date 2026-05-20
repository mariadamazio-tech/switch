void main() {
    IO.println("Cadastrar usúario");
    IO.println("Listar usúario");
    IO.println("Atualizar usúario");
    IO.println("Excluir usúario");
    IO.println("Encerrar sistema");
    Scanner sc=new Scanner(System.in);
    String sistemas= sc.next();
    switch (sistemas){
        case "Cadastrar usúario":
            IO.println("Voce se cadastrou");
            break;
        case "Listar usúario":
            IO.println("Voce esta na lista");
            break;
        case "Atualizar usúario":
            IO.println("Voce atualizou");
            break;
        case "Excluir usúario":
            IO.println("Voce excluiu");
            break;
        case "Encerrar sistema":
            IO.println("Voce encerrou");
            break;
        default:
            IO.println("Menu de sistema invalido");
    }
}