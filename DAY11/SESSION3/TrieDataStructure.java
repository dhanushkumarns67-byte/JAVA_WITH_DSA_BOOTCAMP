package DAY11.SESSION3;

class TrieNode{
    TrieNode[] children;
    boolean isEnd = false;

    public TrieNode(){
    children=new TrieNode[26];
    isEnd=false;
}
}
public class TrieDataStructure {
private final TrieNode root;
public TrieDataStructure(){
    root=new TrieNode();
}
public void insert(String word){
    TrieNode node = root;
    for(char ch : word.toCharArray()){
    int index = Character.toLowerCase(ch) - 'a';
    if(node.children[index] == null){
        node.children[index] = new TrieNode();
    }
    node = node.children[index];
    }
    node.isEnd = true;
}
// insert node

public boolean search(String word){
    TrieNode current = root;
    for(char ch : word.toCharArray()){
        int index = Character.toLowerCase(ch) - 'a';
        if(current.children[index] == null){
            return false;
        }
        current = current.children[index];
    }
    return current.isEnd;
}
public static void main(String[] args) {
    TrieDataStructure s = new TrieDataStructure();
    s.insert("apple");
    s.insert("chandan");
    s.insert("Thomas");

    System.out.println(s.search("apple"));
    System.out.println(s.search("chandan"));
    System.out.println(s.search("Thomas"));
}
}
