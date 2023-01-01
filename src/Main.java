public class Main {
    public static void main(String[] args) throws Exception {
//        User user = new User();
//        user.name = "Vuqar";
//        user.surname = "Nadirli";
//        user.age = 29;
//
//        FileUtility2.writeObjectToFile(user,"user.obj");

        User u = (User) FileUtility2.readFileDeserialize("user.obj");

        System.out.println(u.name);
        System.out.println(u.surname);
        System.out.println(u.age);


    }
}