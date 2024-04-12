import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakinaExpendedora {
    /*
    *se está utilizando un HashMap para almacenar los productos en la máquina expendedora.
    *  Un HashMap es una implementación de la interfaz Map en Java que utiliza una tabla hash para almacenar los elementos
     */
    private Map<Integer, Producto> productos; // variable llamada productos que es un objeto de tipo Map<Integer, Producto>.

    public MakinaExpendedora() {
        productos = new HashMap<>();
        inicializarProductos();
    }

    private void inicializarProductos() {
        productos.put(1, new Producto("Galletas de chocolate", 1500));
        productos.put(2, new Producto("Papitas de queso", 1200));
        productos.put(3, new Producto("Barra de chocolate", 2000));
        productos.put(4, new Producto("Paquete de gomitas", 1800));
        productos.put(5, new Producto("Botella de agua", 1000));
        productos.put(6, new Producto("Sandwich de jamón y queso", 2500));
        productos.put(7, new Producto("Paquete de frutas secas", 2300));
        productos.put(8, new Producto("Bolsa de maní salado", 1700));
        productos.put(9, new Producto("Barrita de cereales", 1300));
        productos.put(10, new Producto("Paquete de chicles", 1100));
        productos.put(11, new Producto("Mini brownie", 2200));
        productos.put(12, new Producto("Bollo de canela", 1600));
        productos.put(13, new Producto("Yogur de fresa", 2700));
        productos.put(14, new Producto("Jugo de naranja", 2400));
        productos.put(15, new Producto("Paquete de palomitas de maíz", 1400));
        productos.put(16, new Producto("Sándwich de atún", 2800));
        productos.put(17, new Producto("Botella de jugo de manzana", 2200));
        productos.put(18, new Producto("Muffin de arándanos", 2100));
        productos.put(19, new Producto("Barra de cereal con chocolate", 1900));
        productos.put(20, new Producto("Paquete de pretzels", 1600));
    }

    public void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getNombre() + " - $" + entry.getValue().getPrecio());
        }
    }

    public void venderProducto(int numeroProducto, int dinero) {
        Producto producto = productos.get(numeroProducto);
        if (producto == null) {
            System.out.println("Producto no válido.");
            return;
        }

        if (dinero < producto.getPrecio()) {
            System.out.println("Dinero insuficiente. El precio del producto es $" + producto.getPrecio());
            return;
        }

        int cambio = dinero - producto.getPrecio();
        System.out.println("Has comprado " + producto.getNombre() + ". Tu cambio es $" + cambio);
    }


}
