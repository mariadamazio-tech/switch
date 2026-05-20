void main() {
    IO.println("Java");
    IO.println("Banco de Dados");
    IO.println("Desenvolvimento Web");
    IO.println("Redes");
    Scanner sc =new Scanner(System.in);
    String curso= sc.next();
    switch (curso){
        case "Java":
            IO.println("Voce entrou no Java");
            break;
        case "Banco de Dados":
            IO.println("Voce entrou no Banco de Dados");
            break;
        case "Desenvolvimento Web":
            IO.println("Voce entrou no Desenvolvimento Web");
            break;
        case "Redes":
            IO.println("Voce entrou em Redes");
            break;
        default:
            IO.println("Curso invalido");
    }
}