
public class linkedList {
	int item;
	linkedList nextNode;
	static int size=0;
	
	public linkedList( int i) {
		// TODO Auto-generated constructor stub
		this.item=i;
		size++;
		
	}
	public void insertLast(int i){
		linkedList lastNode = this;
		while(lastNode.nextNode!=null){
			lastNode=lastNode.nextNode;
		}
		lastNode.nextNode=new linkedList(i);
	
		
		
	}
	
	public void insertAfter(linkedList current, linkedList next){
		linkedList temp = current.nextNode;
		current.nextNode=next;
		next.nextNode=temp;
		
	}
	
	public void insertAfter(int i, int n){
		linkedList lastNode = this;
		if(lastNode.item!=i){
			lastNode=lastNode.nextNode;
		}
		
		linkedList temp = lastNode.nextNode;
		lastNode.nextNode=new linkedList(n);
		lastNode.nextNode.nextNode=temp;
		
	}
	public linkedList nth(int p){
		if(p==1){
			return this;
		}
		else if(this.nextNode==null) return null;
		return nextNode.nth(p-1);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList l1 = new linkedList(5);
		l1.insertLast(6);
		l1.insertLast(80);
		l1.insertLast(70);
		l1.insertAfter(l1, new linkedList(8));
		l1.insertAfter(8, 4545);
		
		
		for(int i =0 ;i <=size;i++){
			
			if(l1.nth(i)!=null) {System.out.println(l1.nth(i).item);};
		}

	}

}
