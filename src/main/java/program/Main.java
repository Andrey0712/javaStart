package program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Humen humen=new Humen();
        humen.setFirstName("Petro");
        humen.setLastName("Ivanov");
        System.out.println(humen.getFirstName()+" "+humen.getLastName());

        City city=new City();
        city.setName("Lutsk");
        city.setRegion("Volunska");
        System.out.println("City name: "+city.getName());
        System.out.println("Region: "+city.getRegion());

        Country country= new Country("Ukrain",380);
        System.out.println("Country: "+country.getName());
        System.out.println("Telephone cod: "+country.getPhoneCod());

                Scanner in = new Scanner(System.in);
        System.out.println("Введіть чисельник:");
        int n=in.nextInt();
        System.out.println("Введіть знаменик:");
        int m=in.nextInt();
        Fraction fraction=new Fraction(n,m);
        double r=fraction.getRez(n,m);

        System.out.println(n+"/"+m+"="+r);



        System.out.println("Введіть автора:");
        String author=in.nextLine();
        System.out.println("Введіть назву книги:");
        String name=in.nextLine();
        System.out.println("Введіть жанр:");
        String genre=in.nextLine();
        System.out.println("Введіть издательство:");
        String publishing=in.next();
        System.out.println("Введіть год издательства:");
        int year=in.nextInt();
        System.out.println("Введіть кол-во страниц:");
        int pages=in.nextInt();

        Book book=new Book(name,author,publishing,genre,year,pages);

        System.out.println("Книга: "+book.getName());
        System.out.println("Автор: "+book.getAuthor());
        System.out.println("год издательства: "+book.getYear());
        System.out.println("Жанр: "+book.getGenre());
        System.out.println("Издательство: "+book.getPublishing());
        System.out.println("Кол-во страниц: "+book.getPages());

        System.out.println("Введіть марку авто:");
        String brand=in.next();
        System.out.println("Введіть модель авто:");
        String model=in.next();
        System.out.println("Введіть рік випуску авто:");
        int yearStart=Integer.parseInt(in.next());
        System.out.println("Введіть обєм двигуна в см3:");
        int power=in.nextInt();

        Car car= new Car(brand,model,yearStart,power);

        System.out.println("марка авто: "+car.getBrand());
        System.out.println("модель авто: "+car.getModel());
        System.out.println("рік випуску авто: "+car.getYear());
        System.out.println("обєм двигуна в см3: "+car.getPower());



    }

}
