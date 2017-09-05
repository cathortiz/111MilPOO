
public class Televisores extends Electrodomesticos{
  
    //Atributos
    private int resolucion;
    private boolean sintonizadorTDT;
    
    //Constantes
    private final static int RESOLUCION_DEF=20;
    
    //Constructor
    public Televisores(){
        this(PRECIO_BASE_DEF, PESO_DEF, COLOR_DEF, CONSUMO_DEF, RESOLUCION_DEF, false);
    }

    public Televisores(double valorPrecioBase, int valorPeso){
        this(valorPrecioBase, valorPeso, COLOR_DEF, CONSUMO_DEF, RESOLUCION_DEF, false);
    }
  
    public Televisores(double valorPrecioBase, int valorPeso, 
            String valorColor, String valorConsumoEnergetico, int valorResolucion, 
            boolean valorSintonizadorTDT){
        super(valorPrecioBase, valorPeso, valorColor, valorConsumoEnergetico);
        this.resolucion = valorResolucion;
        this.sintonizadorTDT = valorSintonizadorTDT;
    }
  
    //Métodos publicos
    public double precioFinal(){
        double preciof=super.precioFinal();
          if (resolucion>40){
            preciof+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            preciof+=50;
        }
        return preciof;
    }
}