public class Trie {
    private Node root;

    public Trie(){
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.isWordAtIndex(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }
            node = node.get(word.charAt(i));
        }

        node.setEnd();
    }

    public boolean search(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.isWordAtIndex(word.charAt(i))) {
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return node.isEnd();
    }

    public boolean startsWith(String word){
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.isWordAtIndex(word.charAt(i))) {
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return true;
    }

    public void print(){
        root.print();
    }

    public boolean isCompleteString(String word){
        return search(word);
    }

    public String longestCompleteString(String[] words){
        String longest = "";
        Node node = root;
        for (String word:
             words) {
            if(isCompleteString(word)){
                if(longest.length() < word.length()){
                    longest=word;
                }
                else if (longest.length() == word.length() && word.compareTo(longest)<0){
                    longest =word;
                }
            }
        }
        return longest;
    }


    public static void main(String[] args) {
        String[] words = {
                "n", "ni", "nin", "ninj", "ninja",
                "k", "ki", "kin", "king",
                "a", "ap", "app", "appl", "apple", "apply",
                "cat", "cater", "caterpillar",
                "s", "sh", "sho", "shor", "short", "shorty"
        };
        Trie obj = new Trie();

//        Node root = new Node();
        for (String word:
             words) {
            obj.insert(word);
        }
//        obj.print();
        System.out.println(obj.search("ninjago"));
        System.out.println(obj.search("short"));
        System.out.println(obj.startsWith("short"));

        System.out.println(obj.startsWith("dooms"));
        System.out.println(obj.startsWith("ze"));

        String[] testQueries = {
                "ninja",
                "ninjago",
                "apple",
                "apply",
                "king",
                "caterpillar",
                "shorty",
                "shor",
                "zebra"
        };

        System.out.println(obj.longestCompleteString(testQueries));
    }
}
