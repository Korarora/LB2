package task1;

public class Main {

    public static void main(String[] args) {
        System.out.println((char) 28 + " [92m" + "Войтик Iван КС23] ");
        Library library = new Library("Central library of KhNU V.N.Karazin");

        BookStore bookStore1 = new BookStore("Science");
        BookStore bookStore2 = new BookStore("History");
        BookStore bookStore3 = new BookStore("Chemistry");

        Book b1 = new Book("Мисливськi усмiшки", new Author("Остап", "Вишня"), 1949, 11);
        Book b2 = new Book("Тигролови", new Author("Микола", "Хвильовий"), 1927, 1);
        Book b3 = new Book("Лiсова пiсня", new Author("Леся", "Українка"), 1911, 2);
        Book b4 = new Book("Заповiт", new Author("Тарас", "Шевченко"), 1845, 3);
        Book b5 = new Book("Енеiда", new Author("Iван", "Котляревський"), 1798, 4);
        Book b6 = new Book("Тіні забутих предків", new Author("Михайло", "Коцюбинський"), 1911, 5);
        Book b7 = new Book("Україна: Iсторiя", new Author("Наталя", "Яковенко"), 2000, 15);
        Book b8 = new Book("Солодка Даруся", new Author("Марiя", "Матiос"), 2004, 3);
        Book b9 = new Book("Довгi часи", new Author("Євгенiя", "Кононенко"), 2019, 10);

        bookStore1.addBook(b1);
        bookStore1.addBook(b2);

        bookStore2.addBook(b3);
        bookStore2.addBook(b4);
        bookStore2.addBook(b5);

        bookStore3.addBook(b6);

        bookStore1.addBook(b7);
        bookStore2.addBook(b8);
        bookStore3.addBook(b9);

        library.addBookStore(bookStore1);
        library.addBookStore(bookStore2);
        library.addBookStore(bookStore3);

        BookReader bookReader1 = new BookReader("Valentyn", "Strykalo", 10);
        BookReader bookReader2 = new BookReader("Pavlo", "Zibrov", 10);

        library.registerReader(bookReader1);
        library.registerReader(bookReader2);

        bookReader2.takeBook(library.giveBook(b1));
        bookReader2.takeBook(library.giveBook(b2));
        bookReader2.takeBook(library.giveBook(b3));
        bookReader2.takeBook(library.giveBook(b4));

        bookReader1.takeBook(library.giveBook(b5));
        bookReader1.takeBook(library.giveBook(b6));

        System.out.println((char) 29 + "[35m" + "Before serialization");
        System.out.println(library);

        System.out.println("After deserialization");
        LibraryDriver.serializeObject(library);
        System.out.println(LibraryDriver.deserializeObject());

    }
}
