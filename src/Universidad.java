import java.util.*;

public class Universidad {

    public static void main(String[] args) throws Exception{
        try (Scanner scanner = new Scanner(System.in)) {
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
                            Integer semestre = scanner.nextInt();

                            Estudiante est = new Estudiante();

                            est.setId(id);
                            est.setNombre(nombre);
                            est.setApellido(apellido);
                            est.setSemestreActual(semestre);

                            estudiante.add(est);

                            System.out.println("Resumen del registro:");
                            estudiante.forEach((e) -> System.out.println("Nombre: " + e.getNombre() + "\nApellido: " + e.getApellido() + "\nIdentificacion: " +
                                    e.getId() + "\nSemestre Actual: " + e.getSemestreActual()));
                            estudiante.forEach((e) -> System.out.println());
                            estudiante.forEach((e) -> System.out.println());
                            estudiante.forEach((e) -> System.out.println());

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
                            System.out.println("Ingrese el tipo de contrato del profesor, \ntiene que ser (Completo o Catedra)");
                            String contrato = scanner.next();
                            if (contrato.equals("Completo") || contrato.equals("Catedra")){
                                Profesor pro = new Profesor();

                                pro.setId(id);
                                pro.setNombre(nombre);
                                pro.setApellido(apellido);
                                pro.setTipoContrato(contrato);

                                profesor.add(pro);

                                System.out.println("Resumen del registro:");
                                profesor.forEach((p) -> System.out.println("Nombre: " + p.getNombre() + "\nApellido: " + p.getApellido()
                                        + "\nIdentificacion: " + p.getId() + "\nTipo de contrato: " + p.getTipoContrato()));

                            }else
                                System.out.println("Puso mal el tipo de contrato");

                        }catch (Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        try {
                            System.out.println("Registro de notas (Tenga en cuenta que el estudiante \ny el profesor tienen que estar registrados \ny ademas las notas son 4,5 no 4.5)");
                            System.out.println(" ");
                            System.out.println("Ingrese el nombre de la materia");
                            String nMateria = scanner.next();
                            System.out.println("Ingrese el ID del estudiante");
                            String idEstudiante = scanner.next();

                            for (Estudiante estudiante1 : estudiante){

                                if (idEstudiante.equals(estudiante1.getId())){
                                    System.out.println("Estudiante registrado");
                                    System.out.println("Ingrese la identificacion del profesor");
                                    String nProfesor = scanner.next();
                                
                                    for (Profesor profesor1 : profesor){

                                        if (nProfesor.equals(profesor1.getId())){
                                            System.out.println("Profesor registrado");
                                            Asignaturas asig = new Asignaturas();
                                            System.out.println("Ingrese la nota del estudiante");
                                            float nota = scanner.nextFloat();
                                            asig.notaCorrespondiente(nota);
                                            asig.setnMateria(nMateria);
                                            asig.setIestudiante(idEstudiante);
                                            asig.setProfesor(nProfesor);
                                            asignatura.add(asig);

                                            asignatura.forEach((a) -> System.out.println("Materia" + a.getnMateria() + "\nNota: " + a.getNota() + "\nID: " + a.getIestudiante()));

                                        }else
                                            System.out.println("El profesor no esta registrado");
                                    }
                                }else
                                    System.out.println("El estudiante no esta registrado");
                            }
                        }catch (Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                }
            System.out.println(" ");
            }while (opcion != 0);
        }
    }
}
