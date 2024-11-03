package Entitys;

import java.util.ArrayList;
import java.util.List;

public  class DummyService {
    
   public static List<Book> getAllBooks()
   {
     List<Book> li=new ArrayList<>();
     Book b1=new Book(11,"Java SE 8",450.70);
     Book b2=new Book(12,"Micro",1000);
     Book b3=new Book(13,"Quantum",1500);
     Book b4=new Book(14,"English",220.78);
     Book b5=new Book(15,"Operating System",900);
     Book b6=new Book(16,"Digital Electronics",450.70);
     li.add(b1);
     li.add(b2);
     li.add(b3);
     li.add(b4);
     li.add(b5);
     li.add(b6);

     return li;
   }

   public static Book getBookbyId(int id)
   {
       
     List<Book> li= getAllBooks();

     //findfirst returns get that returns a optional and on that optional it returns corresponding object
     Book b=li.stream().filter(e->e.getId()==id).findFirst().get();

     return b;
   }

}
