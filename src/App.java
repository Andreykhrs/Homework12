public class App {



    public static void main(String[] args) {

        Author dostoevskii = new Author("Федор", "Достоевский");
        Author bulgakov = new Author("Михаил", "Булгаков");


        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevskii, 1866);

        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1967);


        System.out.println("crimeAndPunishment.getBookTitle() = " + crimeAndPunishment.getBookTitle());
        System.out.println("dostoevskii = " + dostoevskii.getName() + " " + dostoevskii.getLastName());
        System.out.println("crimeAndPunishment.getYearOfPublished() = " + crimeAndPunishment.getYearOfPublished());
        System.out.println("masterAndMargarita.getBookTitle() = " + masterAndMargarita.getBookTitle());
        System.out.println("bulgakov = " + bulgakov.getName() + " " + bulgakov.getLastName());
        System.out.println("masterAndMargarita.getYearOfPublished() = " + masterAndMargarita.getYearOfPublished());

        crimeAndPunishment.setYearOfPublished(1900);

        System.out.println("crimeAndPunishment.getYearOfPublished() = " + crimeAndPunishment.getYearOfPublished());

        System.out.println(crimeAndPunishment);

    }

}
