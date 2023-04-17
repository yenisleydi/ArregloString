public class ObtenerMateria {
    public  String[] obtenerNombreMateria(String[] materiaCal) {
        int size = materiaCal.length;
        String[] mat = new String[size];
        for (int i = 0; i < size; i++) {
            int guion = materiaCal[i].indexOf("-");
            String c = materiaCal[i].substring(0, guion);
            mat[i] = c;
        }
        return mat;
    }
}
