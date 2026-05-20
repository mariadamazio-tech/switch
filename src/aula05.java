void main() {
    IO.println("Qual voce deseja entrar");
    IO.println("A-Administrador");
    IO.println("F-Funcionamento ");
    IO.println("C-Cliente");
    Scanner sc=new Scanner(System.in);
    String nivel= sc.next();
    switch (nivel){
        case "A":
            IO.println("Voce logou o codigo adiministrador");
            break;
        case "F":
            IO.println("Voce logou o codigo funcionamento");
            break;
        case "C":
            IO.println("Voce logou o cliente");
            break;
        default:
            IO.println("Acesso total liberado");
    }
}