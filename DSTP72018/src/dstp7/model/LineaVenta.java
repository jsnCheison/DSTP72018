package dstp7.model;
public class LineaVenta {
      public LineaVenta(){}

      public LineaVenta(Producto producto, int cantidad){
            Producto = producto;
            Cantidad = cantidad;
            Precio = producto.Precio;
      }

      public int Cantidad; 
      public Producto Producto;
      public double Precio;

      public double SubTotal(){
         return Precio*Cantidad; 
      }
}
