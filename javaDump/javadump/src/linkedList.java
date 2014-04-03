
public class linkedList {
	int item;
	linkedList nextNode;
	static int size=0;
	
	public linkedList( int i) {
		// TODO Auto-generated constructor stub
		this.item=i;
		size++;
		
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

}
