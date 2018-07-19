import java.util.HashMap;

/**
 * Created by huzaifa.aejaz on 7/17/18.
 */

    class WordDictionary {

    private class TrieNode{
        char val;
        HashMap<Character,TrieNode> children= new HashMap<>();
        boolean isLeaf;
        public TrieNode(){

        }

        public TrieNode(char ch){
            this.val = ch;
            isLeaf= false;
        }
    }

    TrieNode root;

    public WordDictionary()
    {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */



    public void addWord(String word) {
        HashMap<Character, TrieNode> children = root.children;
        TrieNode Tnode;
        char[] charArray = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (children.containsKey(charArray[i])) {
                Tnode = children.get(charArray[i]);
            }
            else
            {
                Tnode = new TrieNode(charArray[i]);
                children.put(charArray[i], Tnode);
            }
            children = Tnode.children;

            if (i == word.length() - 1) {
                Tnode.isLeaf = true;
            }
        }
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word )
    {
        return searchHelper(root, word, 0);
    }

    private Boolean searchHelper(TrieNode node, String word, int pos){
        HashMap<Character,TrieNode> children = node.children;

        StringBuilder sb = new StringBuilder();
        for(int i = pos; i < word.length(); i++)
        {
            if(word.charAt(i)=='.')
            {
                if(children.size()>0)
                {
                    for(char ch : children.keySet())
                    {
                        TrieNode n = children.get(ch);
                        if(searchHelper(n, word, pos+1))
                        {
                            return true;
                        }

                    }
                }

            }
            else
            if(children.containsKey(word.charAt(i)))
            {
                node = children.get(word.charAt(i));
                sb.append(word.charAt(i));
                children = node.children;
            }
            else
            {
                return false;
            }
        }

        if(node.isLeaf) return true;
        else return false;
    }
}


