
public class headList {
	public linkedList head;
	public static int size;
	
	public headList(int i) {
		// TODO Auto-generated constructor stub
		this.head=new linkedList(i);
	
	}
	
	public void insertLast(int i){
		linkedList lastNode = this.head;
		while(lastNode.nextNode!=null){
			lastNode=lastNode.nextNode;
		}
		lastNode.nextNode=new linkedList(i);
		
	}
	
	public void insertAfter(int i, int n){
		linkedList lastNode = this.head;
		while(lastNode.item!=i){
			lastNode=lastNode.nextNode;
			if(lastNode==null) return;
		}
		
		
		
		linkedList temp = lastNode.nextNode;
		lastNode.nextNode=new linkedList(n);
		lastNode.nextNode.nextNode=temp;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		headList a=new headList(1);
	
		a.insertLast(4);
		
		a.insertLast(48);
	
		
		a.insertAfter(1, 10);
		
		a.insertLast(47);
		
		a.insertAfter(48, 17);
		
		
		for(int i =0 ;i <=linkedList.size;i++){
			
			if(a.head.nth(i)!=null) {
				
				System.out.println(a.head.nth(i).item);};
		}
	}

}
