package equipamentos.apple;

public class Iphone extends Mobile {
    String marca = "Iphone";
    String modelo = "XV";

    public void ligar() {
        touchID();
        System.out.println("Ligando " + marca + " " + modelo);
    }

    private static void touchID() {
        System.out.println("Desbloqueando com impressão digital...");
    }
}
