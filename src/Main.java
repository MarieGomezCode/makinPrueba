import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MakinaExpendedora maquina = new MakinaExpendedora();
        maquina.mostrarProductos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número del producto que deseas comprar:");
        int numeroProducto = scanner.nextInt();
        System.out.println("Ingresa la cantidad de dinero que vas a pagar:");
        int dinero = scanner.nextInt();

        maquina.venderProducto(numeroProducto, dinero);
        scanner.close();
    }
}