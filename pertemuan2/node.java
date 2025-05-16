package pertemuan2;

public class node {

	private int nilai;
	private node next;
	
//	inisialisasi node
	public node(int nilai) {
		this.nilai = nilai;
	}
	
//	setter & getter
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}
	public int getNilai() {
		return nilai;
	}
	
//	getter atribut next
	public node getNext() {
		return next;
	}
	
//	setter atribut next
	public void setNext(node next) {
		this.next = next;
	}
}
