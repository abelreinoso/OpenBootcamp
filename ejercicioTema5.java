package com.openbootcamp.Ejercitacion.ejerciciosTema5;

public class ejercicioTema5 {

    public interface CocheCRUD{
         void save();
         void findAll();
         void delete();
    }

    public static class CocheCRUDImpl implements CocheCRUD {
        @Override
        public void save() {
            System.out.println("Save = Coche guardado");
        }
        @Override
        public void findAll() {
            System.out.println("findAll = Coche encontrado");
        }
        @Override
        public void delete() {
            System.out.println("delete = Coche borrado");
        }
        @Override
        public String toString() {
            return "CocheCRUDImpl{}";
        }
    }

    public static void main(String[] args) {
        CocheCRUD coche = new CocheCRUDImpl();
        coche.save();
        coche.findAll();
        coche.delete();
    }

}
