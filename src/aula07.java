void main() {
    IO.println("A");
    IO.println("E");
    IO.println("I");
    IO.println("O");
    IO.println("U");
    Scanner sc=new Scanner(System.in);
    String vogais=sc.next();
    switch (vogais){
        case "A":
            IO.println("Voce usou A");
            break;
        case "E":
            IO.println("Voce usou E");
            break;
        case "I":
            IO.println("Voce usou I");
            break;
        case "O":
            IO.println("Voce usou O");
            break;
        case "U":
            IO.println("Voce usou U");
            break;
        default:
            IO.println("Vogais invalido");
    }
}