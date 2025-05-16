package pertemuan2;

public class nodemain1 {
	public static void main (String [] args) {
		
		//membuat 2 buah node n1 dan n1  
		node n1 = new node (5);
		node n2 = new node (7);
		node n3 = new node (9);
		node n4 = new node (8);
		
		//membuat relasi node n1 dan n2 
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		//memnampilkan node n1 dan n2 dengan pointer p
		node p = n1; 
		while(p != null)
		{
			System.out.printf("%d ", p.getNilai());
			p = p.getNext();
		}
	}
}
