public class node <t> {
    t value;
    node<t> next;

    public node(t val) {
        value = val;
        next = null;
    }

    public t getvalue() {
        return value;
    }

    public node<t> getNext() {
        return next;
    }

    public void setvalue(t newValue) {
        value = newValue;
    }

    public void setnext(node<t> n) {
        next = n;
    }

}
