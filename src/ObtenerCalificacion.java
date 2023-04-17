public class ObtenerCalificacion {
    public   double[] obtenerCali(String[] materia) {
        int size=materia.length;
        double[] cal=new double[size];
        for (int i=0;i<size;i++){
            int guion = materia[i].indexOf("-");
            String calificacion1 = materia[i].substring(guion + 1);
            cal[i]= Double.parseDouble(calificacion1);
        }
        return cal;
    }
}
