void main() {
    IO.println(" A Excelente");
    IO.println("B Bom");
    IO.println("C Regular");
    IO.println("D Ruim");
    Scanner sc=new Scanner(System.in);
    String notas= sc.next();
    switch (notas){
        case "A Execelente":
            IO.println("Voce foi excelente");
            break;
        case "B Bom":
            IO.println("Voce foi bom");
            break;
        case "C Regular":
            IO.println("voce foi regular");
            break;
        case "D Ruim":
            IO.println("Voce foi ruim");
            break;
        default:
            IO.println("Conversaodenotas invalido");
    }
}