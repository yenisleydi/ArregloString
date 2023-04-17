
public class Materia {
        String materiasCal;
        int calificaciones;

        public String getMateriasCal() {
                return materiasCal;
        }

        public void setMateriasCal(String materiasCal) {
                this.materiasCal = materiasCal;
        }

        public int getCalificaciones() {
                return calificaciones;
        }
        public void setCalificaciones(int calificaciones) {
                this.calificaciones = calificaciones;
        }
        @Override
        public String toString() {

                return "Materias" + materiasCal + ", calificacion" + calificaciones + "]";
        }
}

