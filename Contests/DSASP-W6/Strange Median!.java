//User function Template for Java
/*
    class Node {
        int data;
        Node left, right;
        Node(int key){
            this.data = key;
            this.left = this.right = null;
        }
    }
*/
class GfG {
        ArrayList<Node> nodesList;
    void traverseInorder(Node node) {
        if(node==null)return;
        traverseInorder(node.left);
        nodesList.add(node);
        traverseInorder(node.right);
        return;
    }
    int median(Node root, int k) {
        if(root==null)return -1;
        // Code here
        if(root==null)return -1;
        // Code here
        nodesList = new ArrayList<>();
        traverseInorder(root);
        Node subTree = nodesList.get(k-1);
        nodesList = new ArrayList<>();
        traverseInorder(subTree);
        int len=nodesList.size();
        if(len%2!=0){
            return nodesList.get(len/2).data;
        } else {
            return (nodesList.get(len/2).data+nodesList.get((len/2)-1).data)/2;
        }
        
    }
}
