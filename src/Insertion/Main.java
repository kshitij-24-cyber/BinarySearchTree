package Insertion;

public class Main {
    public static void main(String[] args) {
        Insertion Bstroot = new Insertion();
        Bstroot.insert(100);
        Bstroot.insert(95);
        Bstroot.insert(105);
        Bstroot.insert(120);
        Bstroot.insert(85);
        Bstroot.insert(97);
        Bstroot.insert(103);
        Bstroot.bfs();
    }

}
