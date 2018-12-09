package dstp7.model;
public class ProductoDescuento {
    public ProductoDescuento(){}
    public ProductoDescuento(Producto producto, int cantidad){
        Producto = producto;
        this.Cantidad = cantidad;
    }

    public Producto Producto;
    public int Cantidad;
}
