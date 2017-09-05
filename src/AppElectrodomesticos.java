
public class AppElectrodomesticos {
 
    public static void main(String[] args) {
   
        //Creamos un array de Electrodomesticos
        Electrodomesticos listaElectrodomesticos[]=new Electrodomesticos[10];
   
        //Asignamos cada una de las posiciones, también podemos agregar Electrodomesticos
        listaElectrodomesticos[0]=new Electrodomesticos(200, 60, "C", "Verde");
        listaElectrodomesticos[1]=new Lavarropas(150, 30);
        listaElectrodomesticos[2]=new Televisores(500, 80, "E", "negro", 42, false);
        listaElectrodomesticos[3]=new Electrodomesticos();
        listaElectrodomesticos[4]=new Electrodomesticos(600, 20, "D", "gris");
        listaElectrodomesticos[5]=new Lavarropas(300, 40, "Z", "blanco", 40);
        listaElectrodomesticos[6]=new Televisores(250, 70);
        listaElectrodomesticos[7]=new Lavarropas(400, 100, "A", "verde", 15);
        listaElectrodomesticos[8]=new Televisores(200, 60, "C", "naranja", 30, true);
        listaElectrodomesticos[9]=new Electrodomesticos(50, 10);
   
   
        //Recorremos el array invocando el metodo precioFinal y mostramos 
        for(int i=0;i<listaElectrodomesticos.length;i++){
            System.out.println("Precio final del electrodoméstico "
                    + "[" + i + "] " +  listaElectrodomesticos[i].precioFinal());
        }
        
        /*
        * Vamos a sumar los precios finales de cada clase
        * por separado y mostrarlos por consola
        */
        
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisores=0;
        double sumaLavarropas=0;
        
        //creamos el bucle
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal y
             * para saber a que clase pertenece usamos la sentencia "instanceof"
             */
   
            if(listaElectrodomesticos[i] instanceof Electrodomesticos){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavarropas){
                sumaLavarropas+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Televisores){
                sumaTelevisores+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavarropas);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisores);
   
   }
}