package dstp7.model;

public enum DiaSemana {
    Lunes(1),
    Martes(2),
    Miercoles(3),
    Jueves(4),
    Viernes(5),
    Sabado(6),
    Domingo(7);
    
    private final int value;
    private DiaSemana(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
