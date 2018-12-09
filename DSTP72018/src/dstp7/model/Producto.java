package dstp7.model;
public class Producto {
    public Producto()
        {
            
        }
        public Producto(int codigo, String descripcion, double precio, Rubro rubro)
        {
            Codigo = codigo;
            Descripcion = descripcion;
            Precio = precio;
            Rubro = rubro;
        }
        public int Codigo;
        public String Descripcion;
        public double Precio;
        public Rubro Rubro;
}
