package pertemuan7;

public class StrukturListTest {
  public static void main(String[] args) {
    StrukturList list = new StrukturList();
    list.addTail(5);
    list.addTail(4);
    list.addTail(6);

    System.out.println("=== Latihan 2 List (Operasi Find & Size) ===");
    list.displayElement();
    System.out.println();
    System.out.println(list.find(6)); 

  
    StrukturList list1 = new StrukturList();
    list1.addTail(7);
    list1.addTail(6);   
    list1.addTail(4);
    list1.addTail(2);
    list1.addTail(3);

    System.out.println("=== Latihan 4 List (Operasi Find & Size) ===");
    list1.displayElement();
    System.out.println();
    System.out.println(list1.size());
  

    StrukturList list2 = new StrukturList();
    list2.addTail(4);
    list2.addTail(3);   
    list2.addTail(7);
    list2.addTail(8);
    list2.addTail(1);
    list2.addTail(9);

    System.out.println("=== Tugas List (Operasi Find & Size) ===");
    list2.displayElement();
    System.out.println();
    list2.removeAll();
    list2.displayElement();
  }
}