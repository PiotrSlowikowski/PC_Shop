package pl.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        BookDao bookDao = (BookDao) context.getBean("bookDao");
//        PhoneDao phoneDao = (PhoneDao) context.getBean("phoneDao");
////        PhoneDetailsDao phoneDetailsDao = (PhoneDetailsDao) context.getBean("phoneDetailsDao");
//        PersonDao personDao = (PersonDao) context.getBean("personDao");
//        AddressDao addressDao = (AddressDao) context.getBean("addressDao");
//
//        Person person = new Person();
//        personDao.save(person);
//
//        Phone phone1 = new Phone();
//        phone1.setPerson(person);
//
//        Phone phone2 = new Phone();
//        phone2.setPerson(person);
//
//        phoneDao.save(phone1);
//        phoneDao.save(phone2);
//
//        Person person1 = personDao.findById(1);
//        System.out.println(person1);
//
//        Book book = new Book();
//        book.setAuthor("Adam");
//        bookDao.saveBook(book);
//
//        //edycja
//        Book byId = bookDao.findById(book.getId());
//        System.out.println(byId.getAuthor());
//
//        byId.setAuthor("Adam");
//        bookDao.update(byId);
//
//        System.out.println(byId.getAuthor());
//
//        //usuwanie
//        Book book1 = new Book();
//        book1.setAuthor("Zenon");
//        bookDao.saveBook(book1);
//
//        Book book2 = new Book();
//        book2.setAuthor("Zenon");
//        bookDao.saveBook(book2);
//
//
//        bookDao.delete(book2.getId());
//        PhoneDao phoneDao = (PhoneDao) context.getBean("phoneDao");
//        PhoneDetailsDao phoneDetailsDao = (PhoneDetailsDao) context.getBean("phoneDetailsDao");
//
//        Phone phone = new Phone();
//        phoneDao.save(phone);
//        PhoneDetails phonebyId = phoneDetailsDao.findById(1);
//        System.out.println(phonebyId);
//
//        phoneDetails.setPhone(phone);
//        phoneDetailsDao.save(phoneDetails);
//        AuthorDao authorDao = (AuthorDao) context.getBean("authorDao");
//        Author author = new Author("Marek","Nowak");
//        authorDao.saveAuthor(author);
//
//        PublisherDao publisherDao = (PublisherDao) context.getBean("publisherDao");
//        Publisher publisher = new Publisher("Marek");
//        publisherDao.savePublisher(publisher);


//        Address address1 = new Address();
//        Address address2 = new Address();
//
//        addressDao.save(address1);
//        addressDao.save(address2);
//
//        Person person1 = new Person();
//        personDao.save(person1);
//
//        List<Address> addresses = person1.getAddresses();
//        addresses.add(address1);
//        addresses.add(address2);
//
//        personDao.update(person1);





    }

}
