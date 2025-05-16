package pertemuan2;

public class nodemain {
	public static void main(String[] args ) {
		
//		membuat 2 buat node n1 dan n2
		node n1 = new node(5);
		node n2 = new node (7);
		
//		membuat relasi node n1 dan n2 
		n1.setNext (n2);
		
//		menampilkan node n1 dan n2 dengan pointer p
		node p = n1;
		while(p !=null)
		{
			System.out.printf("%d", p.getNilai () );
			p = p.getNext ();
		}
	}
}
