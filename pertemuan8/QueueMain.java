package pertemuan8;

//public class QueueMain {
//    public static void main(String[] args) {
//        System.out.println("=== Latihan 4 ===");
//        testLatihan4();
//        
//        System.out.println("\n=== Latihan 5 ===");
//        testLatihan5();
//    }
//    
//    public static void testLatihan4() {
//        // Membuat objek queue dari kelas StrukturQueue
//        StrukturQueue queue = new StrukturQueue();
//
//        // Menampilkan informasi sebelum proses enqueue dilakukan
//        System.out.println("### Sebelum Enqueue 3x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//
//        // Proses enqueue untuk menambahkan elemen ke dalam antrian
//        queue.enqueue(3);
//        queue.enqueue(2);
//        queue.enqueue(1);
//
//        // Menampilkan informasi setelah proses enqueue dilakukan
//        System.out.println("\n### Enqueue 3x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        System.out.println("Front: " + queue.front());
//    }
//    
//    public static void testLatihan5() {
//        // Membuat objek queue dari kelas StrukturQueue
//        StrukturQueue queue = new StrukturQueue();
//
//        // Menampilkan informasi sebelum proses enqueue dilakukan
//        System.out.println("### Sebelum Enqueue 4x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        queue.displayElement();
//
//        // Proses enqueue untuk menambahkan elemen ke dalam antrian
//        queue.enqueue(2);
//        queue.enqueue(7);
//        queue.enqueue(6);
//        queue.enqueue(1);
//
//        // Menampilkan informasi setelah proses enqueue dilakukan
//        System.out.println("\n### Enqueue 4x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        queue.displayElement();
//        System.out.println("Front: " + queue.front());
//    }
//}



public class QueueMain {
    public static void main(String[] args) {
        // Membuat objek queue
        StrukturQueue queue = new StrukturQueue();
        
        System.out.println("=== TEST OPERASI QUEUE ===");
        
        // Test 1: Queue kosong
        System.out.println("\n# Sebelum operasi #");
        System.out.println("Size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElement();
        
        // Test 2: Enqueue 3 elemen
        System.out.println("\n# Setelah Enqueue 3x #");
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println("Size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());
        queue.displayElement();
        
        // Test 3: Dequeue 1 elemen
        System.out.println("\n# Setelah Dequeue 1x #");
        queue.dequeue();
        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.front());
        queue.displayElement();
    }
}


