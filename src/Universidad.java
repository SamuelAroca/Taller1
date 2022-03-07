import java.util.*;

public class Universidad {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int opcion;
        List<Estudiante> estudiante = new ArrayList<>();
        List<Profesor> profesor = new ArrayList<>();
        List<Asignaturas> asignatura = new ArrayList<>();

        do {
            System.out.println("Ingrese una opción");
            System.out.println("1. Registre Estudiante");
            System.out.println("2. Registro Profesor");
            System.out.println("3. Resgistro de Materias");
            System.out.println("0. Salir del programa");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    try {
                        System.out.println("Ingrese el ID del estudiante");
                        String id = scanner.next();
                        System.out.println("Ingrese el nombre del estudiante");
                        String nombre = scanner.next();
                        System.out.println("Ingrese apellido del estudiante");
                        String apellido = scanner.next();
                        System.out.println("Ingrese el semestre actual del estudiante");
                        String semestre = scanner.next();

                        Estudiante est = new Estudiante();
                        est.setId(id);
                        est.setNombre(nombre);
                        est.setApellido(apellido);
                        est.setSemestreActual(semestre);
                        estudiante.add(est);
                        estudiante.forEach((e) -> System.out.println("Identificacion: " + e.getId() + "\nNombre: " + e.getNombre()
                                + "\nApellido: " + e.getApellido() + "\nTipo contrato: " + e.getSemestreActual()));

                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Ingrese el ID del profesor");
                        String id = scanner.next();
                        System.out.println("Ingrese el nombre del profesor");
                        String nombre = scanner.next();
                        System.out.println("Ingrese apellido del profesor");
                        String apellido = scanner.next();
                        System.out.println("Ingrese el tipo de contrato del profesor");
                        String contrato = scanner.next();

                        Profesor pro = new Profesor();
                        pro.setId(id);
                        pro.setNombre(nombre);
                        pro.setApellido(apellido);
                        pro.setTipoContrato(contrato);
                        profesor.add(pro);
                        profesor.forEach((p) -> System.out.println("Identificacion: " + p.getId() + "\nNombre: " + p.getNombre()
                        + "\nApellido: " + p.getApellido() + "\nTipo contrato: " + p.getTipoContrato()));

                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                case 3:
                    try {
                        System.out.println("Registro de materias (Tenga en cuenta que el estudiante \ny el profesor tienen que estar registrados)");
                        System.out.println(" ");
                        System.out.println("Ingrese el nombre del estudiante");
                        String nEstudiante = scanner.next();
                        System.out.println("Ingrese el nombre del profesor");
                        String nProfesor = scanner.next();
                        System.out.println("Ingrese la nota del estudiante");
                        Float nota = scanner.nextFloat();

                        Asignaturas asig = new Asignaturas();
                        asig.setEstudiante(nEstudiante);
                        asig.setProfesor(nProfesor);
                        asig.notaCorrespondiente(nota);
                        asignatura.add(asig);



                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }



            }

        }while (opcion != 0);




    }
}
