import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String, Integer> notas = new HashMap<>();


        notas.put("Sergio", 10);
        notas.put("Paula", 10);
        notas.put("Alejandro", 11);



        User user = new User(1, "Paula", Status.AUSENTE);
        User user1 = new User(2, "Sergio", Status.ACTIVO);
        User user2 = new User(3, "Nil", Status.ACTIVO);
        User user3 = new User(4, "Alessio", Status.DESCONECTADO);
        User user4 = new User(5, "Alex", Status.AUSENTE);
        User user5 = new User(6, "Carlos", Status.ACTIVO);
        System.out.println(user.getStatus());

        Map<String, User> alumnos = new HashMap<>();
        alumnos.put(user.getName(), user);
        alumnos.put(user1.getName(), user1);
        alumnos.put(user2.getName(), user2);
        alumnos.put(user3.getName(), user3);
        alumnos.put(user4.getName(), user4);
        alumnos.put(user5.getName(), user5);

        System.out.println(" ==== BEFORE ====");
        for (String s: alumnos.keySet()) {
            System.out.println(s);
        }

        for(User i : alumnos.values()) {
            System.out.println(i);
        }

        System.out.println("=====");


        System.out.println(alumnos.get("Alessio"));
        User newUser = new User(123, "Raul", Status.AUSENTE);
        alumnos.put("Alessio", newUser);

        System.out.println(" ==== AFTER ====");

        for (String s: alumnos.keySet()) {
            System.out.println(s);
        }

        for(User i : alumnos.values()) {
            System.out.println(i);
        }

        Map<String, List<User>> clases = new HashMap<>();
        clases.put("Breakout Room 1", List.of(user1, user2));
        clases.put("Breakout Room 2", List.of(user3, user4));



        List<User> users = new ArrayList<>(List.of(user1, user2, user3, user4));

        for (User u: users) {
            if(u.getName().equals("Alessio")) {
                System.out.println(u);
            }
        }

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Katherine");
        usuarios.put(2, "Nahuel");

        System.out.println(usuarios.get(1));

        usuarios.put(1, "Jaume");

        System.out.println(usuarios.get(1));






    }
}
