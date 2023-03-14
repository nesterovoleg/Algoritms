package org.example;

public class BSTNode {
    private Node root;
    private class Node {
        private int key;
        private String value;
        private Node l,r;
        private int N;

        public Node(int key, java.lang.String value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }

    public int size() {
        return size(root);
    }
    private int size(Node x) {
        if(x == null)
            return 0;
        else
            return x.N;
    }

    public String get(int key) {
        return get(root,key);
    }
    private String get(Node x, int key) {
        if (x == null) {
            return null;
        }
        if (key > x.key) {
            return get(x.r,key);
        } else if (key < x.key) {
            return get(x.l,key);
        } else {
            return x.value;
        }
    }

    public void put(int key, String val) {
        root = put(root,key,val);
    }

    private Node put(Node x, int key, String val) {
        if (x == null) {return new Node(key,val,1);}

        if (key > x.key) {
            x.r = put(x.r,key,val);
        }
        else if (key < x.key) {
            x.l = put(x.l,key,val);
        }
        else {
             x.value = val;
        }
        x.N = size(x.l) + size(x.r) + 1;
        return x;
    }

    private Node min(Node x) {
        if (x.l == null) {
            return x;
        }
        return min(x.l);
    }
    private Node deleteMin(Node x) {
        if(x.l == null) {
            return x.r;
        }
        x.l = deleteMin(x.l);
        x.N = size(x.l) + size(x.r) + 1;
        return x;
    }

    public void delete(int key) {
        root = delete(root,key);
    }
    private Node delete(Node x,int key) {
        if (x == null) {
            return null;
        }
        if (key > x.key) {
            x.r = delete(x.r,key);
        } else if (key < x.key) {
            x.l = delete(x.l,key);
        } else {
            if (x.r == null) {
                return x.l;
            }
            if (x.l == null) {
                return x.r;
            }
            Node t = x;
            x=min(t.r);
            x.r = deleteMin(t.r);
            x.l = t.l;
        }
        x.N = size(x.l) + size(x.r) + 1;
        return x;
    }
    public void depthOrderTraversal() {
        depthTraversal(root);
    }

    private void depthTraversal(Node  x) {
        if (x!=null) {
            System.out.print("Key= " + x.key + " Value= " + x.value + "\n");
            depthTraversal(x.l);
            depthTraversal(x.r);
        }
    }


}
