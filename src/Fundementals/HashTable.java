package Fundementals;

import java.util.Random;

/**
 * Created by huzaifa.aejaz on 6/28/18.
 */
public class HashTable {
    ListNode[] hashslots;
    int size;
    public HashTable(int size){
        this.size = size;
        hashslots = new ListNode[size];
    }

    public void insert(int val){
        int slot = hash(val)%size;
        if(hashslots[slot]!=null){
            ListNode node = new ListNode(val);
            hashslots[slot] = node;
            //quadratic probing
        }
        else{
            ListNode node = new ListNode(val);
            hashslots[slot] = node;
        }
    }

    public int quadraticProbing(int slot, int val){
        int inc = 1;
        int count  =1;
        while(hashslots[slot]==null && hashslots[slot].val!= val && count < size/2){
            count++;
            slot = (slot+inc)%size;
            inc = inc+2;
        }
        return slot;
    }



    public int hash(int numb){
        int hash = numb * numb;
        String val = Integer.toString(hash);
        String mid = val.substring((val.length()/2)-1, (val.length()/2)+1);
        hash = Integer.valueOf(mid);
        hash%=size;
        System.out.println(hash);
        return hash;
    }

    public int quadraticremove(int val){
        int slot = hash(val);
        if(hashslots[slot].val!= val){
           slot =  quadraticProbing(slot,val);
           if(hashslots[slot].val != val){
               hashslots[slot].val=0;
               return 1;
           }
        }
        return -1;
    }

    public void chainedInsert(int val){
        int slot = hash(val)%size;
        if(hashslots[slot]!=null){
            ListNode node = hashslots[slot];
            while(node.next !=null){
                node = node.next;
            }
            ListNode newNode = new ListNode(val);
            node.next = newNode;
            newNode.next = null;
        }
        else{
            ListNode node = new ListNode(val);
            hashslots[slot] = node;
        }
    }

    public void chainedRemove(int val){
        int slot = hash(val)%size;
        if(hashslots[slot]!=null){
            ListNode node = hashslots[slot];
            while(node.next !=null && node.next.val != val){
                node = node.next;
            }
            if(node.next.val == val){
                System.out.println("node deleted");
                node.next = node.next.next;
            }
            else{
                System.out.println("no such node found");
            }
        }
        else{
            ListNode node = new ListNode(val);
            hashslots[slot] = node;
        }
    }


}
