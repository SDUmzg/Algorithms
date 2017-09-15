package top.alearner.Tree.BinaryTree;

/**
 * Created by mzg on 2017/9/15.
 */
public class BST<Key extends Comparable<Key>,Value>{
    private Node root;

    private class Node{
        private Key key; //键
        private Value val;
        private Node left ,right;
        private int N;

        public Node(Key key,Value val,int N){
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    //获取大小
    public int size(){
        return size(root);
    }
    private int size(Node x){
        if (x == null)
            return 0;
        else
            return x.N;
    }


    //获得值
    public Value get(Key key){
        return get(root,key);
    }
    private Value get(Node x,Key key){
        //在以X为根节点的子树中查找并返回key所对应的值；
        //如果找不到则返回null
        if(x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp<0) return get(x.left,key);
        else if (cmp>0) return get(x.right,key);
        else return x.val;
    }


    public void put(Key key, Value val){
        //查找Key，找到则更新它的值，否则为它创建一个新结点
        root = put(root,key,val);
    }
    private Node put(Node x,Key key,Value val){
        //如果Key存在于以x为根节点的子树中则更新他们的值；
        //否则将以Key和val为键值对的新节点插入到该子树中
        if(x == null) return new Node(key,val,1);
        int cmp = key.compareTo(x.key);
        if (cmp<0) x.left = put(x.left,key,val);
        else if (cmp>0) x.right = put(x.right,key,val);
        else x.val = val;
        x.N = size(x.left)+size(x.right)+1;
        return x;
    }
}
