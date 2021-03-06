import java.util.List;

public class LinkedList {
    private Listnode head;//Head node to hold the list
    private static void display(Listnode head){
        if(head==null){
            return;
        }
        Listnode current =  head;

        while(current!=null){
            System.out.print(current.data+"--> ");
            current=current.next;
        }
        System.out.print(current);//this will print null at the end

    }

    private static class Listnode{
        private int data;
        private Listnode next;
        //constructor
        private Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    we move fastPtr n-1 times then we move both pointer 1 time
   public static Listnode getNodeFromLast(Listnode head,int n){
        if(head==null){
            return head;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid value of n:"+n);
        }
        Listnode slowPtr = head;
        Listnode FastPtr = head;
        int count =0;
        while(count<n){//this while loop move fast pointer n-1 times
            if(refPtr==null){
                throw new IllegalArgumentException(n+" is greater than the number of nodes");
            }
            Fast.ptr = fastPtr.next;
            count++;
        }
        while (FsatPtr!=null){
            FastPtr = fastPtr.next;
            slwPtr = slwPtr.next;
        }
        return slwPtr;
   }

    public static void main(String[] args){
        Listnode head =new Listnode(10);
        Listnode second =new Listnode(1);
        Listnode third =new Listnode(15);
        Listnode fourth =new Listnode(4);
        head.next= second;
        second.next=third;
        third.next=fourth;


        LinkedList node= new LinkedList();
        node.display(head);
        System.out.println();

        Listnode nNodeFromEnd= node.getNodeFromLast(head,0);
        System.out.println(nNodeFromEnd.data);




       

    }
}
   









