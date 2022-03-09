import java.util.*;
import java.util.stream.Collectors;

public class University {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            List<Estudiante> estudiante = new ArrayList<>();
            List<Profesor> profesor = new ArrayList<>();

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
                            Integer id = scanner.nextInt();
                            System.out.println("Ingrese el nombre del estudiante");
                            String nombre = scanner.next();
                            System.out.println("Ingrese apellido del estudiante");
                            String apellido = scanner.next();
                            System.out.println("Ingrese el semestre actual del estudiante");
                            int semestre = scanner.nextInt();



                            Estudiante est = new Estudiante();

                            est.setId(id);
                            est.setNombre(nombre);
                            est.setApellido(apellido);
                            est.rangoSemestre(semestre);

                            estudiante.add(est);

                            System.out.println("Estudiantes registrados: ");
                            estudiante.forEach((e) -> System.out.println("Nombre: " + e.getNombre() + "\nApellido: " + e.getApellido() + "\nIdentificacion: " +
                                    e.getId() + "\nSemestre Actual: " + e.getSemestreActual() + "\n "));
                            break;


                        }catch (Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            System.out.println("Ingrese el ID del profesor");
                            Integer id = scanner.nextInt();
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

                                System.out.println("Profesores registrados del registro:");
                                profesor.forEach((p) -> System.out.println("Nombre: " + p.getNombre() + "\nApellido: " + p.getApellido()
                                        + "\nIdentificacion: " + p.getId() + "\nTipo de contrato: " + p.getTipoContrato() + "\n "));
                                break;

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
                            int idEstudiante = scanner.nextInt();

                            for (Estudiante estudiante1 : estudiante){
                                List<Asignaturas> asignatura = new ArrayList<>();

                                if (idEstudiante == estudiante1.getId()){

                                    System.out.println("Estudiante registrado");
                                    System.out.println("Ingrese la identificacion del profesor");
                                    int nProfesor = scanner.nextInt();
                                
                                    for (Profesor profesor1 : profesor){


                                        if (nProfesor == profesor1.getId()){

                                            System.out.println("Profesor registrado");
                                            Asignaturas asig = new Asignaturas();
                                            System.out.println("Ingrese la nota del estudiante");
                                            float nota = scanner.nextFloat();
                                            asig.notaCorrespondiente(nota);

                                            System.out.println("Porfavor diganos en que posicion registro al alunmo \nsiendo 0 la primera y 1, 2, etc las siguientes");
                                            int n = scanner.nextInt();
                                            System.out.println("Porfavor diganos en que posicion registro al profesor \nsiendo 0 la primera y 1, 2, etc las siguientes");
                                            int m = scanner.nextInt();



                                            asig.setnMateria(nMateria);
                                            asig.setIestudiante(idEstudiante);
                                            asig.setProfesor(nProfesor);
                                            asignatura.add(asig);

                                            for (int i = n; i < estudiante.size() ;) {
                                                System.out.println("Nombre del estudiante: " + estudiante.get(i).getNombre() + " " + estudiante.get(i).getApellido()
                                                        + "\nIdentificacion del estudiante: " + estudiante.get(i).getId() + "\nSemetre: " + estudiante.get(i).getSemestreActual() + "\n");
                                                break;
                                            }

                                            asignatura.forEach((b) -> System.out.println("ID: " + b.getIestudiante() + "\nMateria: " + b.getnMateria() + "\nNota: " + b.getNota()
                                                     + "\n "));

                                            for (int i = m; i < profesor.size();) {
                                                System.out.println("Calificado por el profesor: " + profesor.get(i).getNombre() + " " + profesor.get(i).getApellido());
                                                break;
                                            }

                                            asignatura.clear();

                                        break;
                                        }else{
                                            System.out.println("El profesor no esta registrado");
                                        }
                                    }
                                    break;
                                }else
                                    System.out.println("El estudiante no esta registrado");
                            }
                            break;
                        }catch (Exception e){
                            System.out.println("Error: " + e.getMessage());
                    }
                    break;
                }
            }while (opcion != 0);
        }
    }
}
/*
System.out.println("Calificado por el profesor: " + c.getNombre() + " " +c.getApellido()
        + "\nCon identificacion numero: " + c.getId())
*/