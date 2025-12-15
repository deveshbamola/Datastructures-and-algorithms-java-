public class Node {
    private Node links[] = new Node[26];
    private boolean end = false;


    public boolean isEnd(){
        return this.end;
    }

    public void setEnd(){
        this.end=true;
    }

    public void put(char ch, Node node){
        links[ch - 'a'] = node;
    }


    public Node get(char ch){
        return links[ch - 'a'];
    }



    public boolean isWordAtIndex(char ch){
        return links[ch - 'a'] != null;
    }

    public  void print(){
        for (int i = 0; i <links.length; i++) {
            System.out.println(links[i]);
        }
    }
}
