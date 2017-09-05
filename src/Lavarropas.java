
public class Lavarropas extends Electrodomesticos{
    //atributo de la clase
    private int carga;
    
    //valor por defecto de carga
    private final static int CARGA_DEF = 5;
    
    //constructores
    public Lavarropas(){
        this(PRECIO_BASE_DEF, PESO_DEF, COLOR_DEF, CONSUMO_DEF, CARGA_DEF);
    }
    
    public Lavarropas(double valorPrecioBase, int valorPeso){
        this(valorPrecioBase, valorPeso, COLOR_DEF, CONSUMO_DEF, CARGA_DEF);
    }
    
    public Lavarropas(double valorPrecioBase, int valorPeso, 
            String valorColor, String valorConsumoEnergetico, int valorCarga){
        super(valorPrecioBase, valorPeso, valorColor, valorConsumoEnergetico);
        this.carga = valorCarga;
    }
    public int getCarga() {
        return carga;
    }
    
    public double precioFinal(){
        double preciof = super.precioFinal();
        if (carga>30){
            preciof+=500;
        }
        return preciof;
    }
}
