package moshrouk.android.example.com.recyclerview;

public class Itemlist {
    //Declaration of variable
    String head, description;

    //Generate constructor to initialize theas string
    public Itemlist( String head, String description ) {
        this.head = head;
        this.description = description;
    }

    //Generate getter
    public String getHead() {
        return head;
    }

    public String getDescription() {
        return description;
    }
}
