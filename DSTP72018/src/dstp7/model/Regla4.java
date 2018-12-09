package dstp7.model;
import java.util.ArrayList;
public class Regla4 implements IRegla{
        private static final double porcentaje = 0.1d;
        @Override
        public double RealizarDescuento(Venta venta){
            if (venta.Total() < 1000) return 0;

            double descuento = 0;
            ArrayList<ProductoDescuento> productos = new ArrayList<>();
            
            for (LineaVenta Detalle : venta.Detalle()) {
                boolean existe = false;
                for (ProductoDescuento productoDescuento : productos) {
                    if (productoDescuento.Producto.Codigo == Detalle.Producto.Codigo) {
                        existe = true;
                        productoDescuento.Cantidad += Detalle.Cantidad;
                        break;
                    }
                }
                if (!existe) {
                    productos.add(new ProductoDescuento(Detalle.Producto, Detalle.Cantidad));
                }
            }
            for(ProductoDescuento productoDescuento : productos){
                if (productoDescuento.Cantidad > 3)
                {
                    descuento += productoDescuento.Producto.Precio * productoDescuento.Cantidad * porcentaje;
                }
            }
            return descuento;
        }
    }
