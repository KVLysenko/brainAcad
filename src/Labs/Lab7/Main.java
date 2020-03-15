package Labs.Lab7;

public class Main {
    public static void main(String[] args) {
//    Часть 1.
//    Первая часть посвящена базовым навыкам по работе с классами.Необходимо создать несколько классов,описывающих определенныеобъекты.
//    1.1Создать 3 классаспубличными полями, которыеописывают объекты из списка:Книга, Отделение почты, Клиент магазина, свой вариант.
//    1.2Константы.Дополнить классы константными значениями, полями класса(staticfinal). Поля должны иметь отношение к предметной области.
//    1.3Создание экземпляровСоздать дополнительный класс, например Main, для проверки предыдущих шагов.В этом классе создать main метод, в котором создать экземпляры описанных ранее классов.
//    1.4Инициализацияполей объектаС помощью доступа к переменной, через «точку»у объекта класса, проинициализировать поля.Пример:obj.field= 12L;
//    1.5Вывод информации о объектеВывести на экран информацию о каждом объектев формате:Имя класса: TestField1= 123Field2 =”qwerty”
//    Часть 2.
//    2.1 Поменять все модификаторы доступа у полей экземпляра класса на private.Попробовать запустить Mainкласс.
//    2.2 Сгенерировать во всехописанных классах методы getи set.Для того, чтобы быстро сгенерировать нужные,
//    шаблонные методы, установите курсор в то место, где хотите вставить новый код и нажмите клавиши:alt+ insert
    Book newBook = new Book();
    newBook.setAuthor("Bublik");
    newBook.setNumberOfPages(365);
    newBook.setTitle("Книга");

    newBook.goTo(45);
    newBook.goTo("Глава 4");

    PostOffice newPostOffice = new PostOffice();
    newPostOffice.setAdress("Grebel'na 25");
    newPostOffice.setEmployeesNum(56);
    newPostOffice.send(new int[] {10,11,12});
        System.out.println("Вес вашей посылки - " + PostOffice.calculateVolumeWeight(65, 978,97) + "кг.");

    ShopCustomer newShopCustomer = new ShopCustomer();
    newShopCustomer.setName("Denis");
    newShopCustomer.setDiscount(true);

        System.out.println(newBook);
        System.out.println(newPostOffice);
        System.out.println(newShopCustomer);



    }

}
