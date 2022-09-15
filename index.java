public class index {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Voici notre Premier Projet Simple");
        System.out.println();

        System.out.println("Ajout de notre methode enum");
        enumMot("BIEN");

    }

    public static void enumMot(

            String a) {
        int l = a.length();
        int i = 0;
        while (i < l) {
            System.out.println(a);
            i++;
        }
    }
}