import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}

class GfG { 
    
    static ArrayList<Integer> leafs;
    
    static Node insertInBST(Node root, int key) { 
        if (root == null) return new Node(key); 
	    if (key < root.data) root.left = insertInBST(root.left, key); 
	    else root.right = insertInBST(root.right, key); 
	    return root; 
    }
    
    static void bstLeafS(Node head) {
        if (head == null) {
            return;
        }
        if(head.left == null && head.right == null){
            leafs.add(head.data);
            return;
        }
        bstLeafS(head.left);
        bstLeafS(head.right);
        return;
    }
    
    static int alternateLeafSum(Node head) {
        bstLeafS(head);
        int res=0;
        for(int i=0; i<leafs.size(); i=i+2)res+=leafs.get(i);
        return res;
    }
    
    public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    Node root = null;
		    inputLine = br.readLine().trim().split(" ");
		    root = insertInBST(root, Integer.parseInt(inputLine[0]));
		    for(int i=1; i<n; i++){
		        insertInBST(root, Integer.parseInt(inputLine[i]));
		    }
		    leafs = new ArrayList<>();
		    System.out.println(alternateLeafSum(root));
		}
	}
} 
