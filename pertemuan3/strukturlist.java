package pertemuan3;

public class strukturlist {
	node HEAD;
	public void addTail(int data) {
    	node posnode = null, curnode = null;
    	node newnode = new node(data);
        if (isEmpty ()) {
            // Jika list kosong, data akan menjadi HEAD
            HEAD = newnode;
        } else {
            curnode = HEAD;
            while (curnode != null) {
            	posnode = curnode;
                curnode = curnode.getNext();
            }
            // Menambahkan node baru di belakang node terakhir
            posnode.setNext(newnode);
        }
    }
	
//	public void addTall (int data) {
//		node postnode=null, curnode=null;
//		
//		node newnode = new node(data);
//		if (isEmpty()) {
//			HEAD = newnode;
//		}
//		else {
//			curnode = HEAD;
//			while (curnode != null) {
//				postnode = curnode;
//				curnode = curnode.getNext();
//			}
//			postnode.setNext (newnode);
//		}
//	}
	
	
	// Konstruktor untuk inisialisasi HEAD
    public strukturlist() {
        this.HEAD = null;
    }
    
    // fungsi untuk pengecekan list apakah kosong atau tidak
    private boolean isEmpty () {
    	return HEAD == null;
    }
	
	
	public void addHead(int data) {
        node newnode = new node(data);
        if (isEmpty()) { 
            System.out.println("LIST KOSONG"); 
        } else {
            newnode.setNext(HEAD);
            HEAD = newnode;
        }
    }
	
	public void displayElement() {
    	if (isEmpty()) {
    		System.out.println("LIST KOSONG");
    		return;
    	}
    	node curNode = HEAD ;
    	while (curNode != null) {
    		System.out.println(curNode.getData()+ "");
    		curNode = curNode.getNext();
    	}
    }
}
