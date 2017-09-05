        
public class Electrodomesticos {
    //Atributos 
    protected double precioBase;
    protected String color;
    protected String consumoEnergetico;
    protected int peso;
    
    //Valores por defecto
    protected final static double PRECIO_BASE_DEF = 10000;
    protected final static String COLOR_DEF = "blanco";
    protected final static String CONSUMO_DEF = "F";
    protected final static int PESO_DEF = 5;
    
    //Constructores
    public Electrodomesticos(){
        this(PRECIO_BASE_DEF, PESO_DEF, COLOR_DEF, CONSUMO_DEF);
        /*this.precioBase = PRECIO_BASE_DEF;
        this.peso = PESO_DEF;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_DEF;*/ 
    }
    
    public Electrodomesticos(double valorPrecioBase, int valorPeso){
        this.precioBase = valorPrecioBase;
        this.peso = valorPeso;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_DEF;
    }
    
    public Electrodomesticos(double valorPrecioBase, int valorPeso, 
            String valorColor, String valorConsumoEnergetico){
        this.precioBase = valorPrecioBase;
        this.peso = valorPeso;
        this.color = valorColor;
        this.consumoEnergetico = valorConsumoEnergetico;
    }
    //getters y setters
    public double getPrecioBase() {
        return precioBase;
    }
    
    public String getColor() {
        return color;
    }
   
    
    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void comprobarColor(String color){
        //Lista de Colores disponibles
        String colores [] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;
        
        for (String col : colores) {
            if (col.equals(color)) {
                encontrado=true;
                break;
            }
        }
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
    }
    
    public double precioFinal(){
        String valorConsumoEnergetico = this.getConsumoEnergetico();
        double valorPeso = this.getPeso();
        double valorPrecioBase = this.getPrecioBase();
        
        double masce=0, maspeso=0;
        switch(valorConsumoEnergetico){
            case "A":  
                masce = 1000;
                break;
            case "B":  
                masce = 800;
                break;
            case "C":  
                masce = 600;
                break;
            case "D":  
                masce = 500;
                break;
            case "E":  
                masce = 300;
                break;
            case "F":  
                masce = 100;
                break;
        }
        if (valorPeso>=0 && valorPeso<=19){
            maspeso = 100;
        }
        else if (valorPeso>=20 && valorPeso<=49){
            maspeso = 500;
        }
        else if (valorPeso>=50 && valorPeso<=79){
                maspeso = 800;
        }
        else if (valorPeso>=80){
            maspeso = 1000;
        }
        return valorPrecioBase + masce + maspeso;
    }
}
