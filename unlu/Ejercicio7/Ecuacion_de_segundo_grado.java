package unlu.Ejercicio7;

public class Ecuacion_de_segundo_grado {
    private int a;
    private int b;
    private int c;

   public void setEcuacion(int a,int b,int c){
       this.a= a;
       this.b= b;
       this.c= c;
   }

   public double[] ecuacion(){
       double discriminante = (Math.pow(b, 2) - (4 * a * c));
       if (discriminante >= 0) {
           double soluciones[];

           if(discriminante == 0){  // Una solucion
               soluciones = new double[1];
               soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
           }else{ // Dos soluciones
               soluciones = new double[2];
               soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
               soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
           }
           return soluciones;
       } else {// Sin solucion
           return null;
       }
   };

    public String toString() {
        String mensaje;
        double[] soluciones = ecuacion();
        mensaje =  a + "X^2 + "+ b + " X+ "+ c +"\n Esta ecuacion es igual a:";
        if (soluciones == null) {
            mensaje +=(" No tiene solucion");
        } else {
            for (int i = 0; i < soluciones.length; i++) {
                mensaje += soluciones[i] + " ";
            }
        }
        return mensaje;
    }
}