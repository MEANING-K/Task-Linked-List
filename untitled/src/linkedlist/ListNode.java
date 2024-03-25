package linkedlist;

public class ListNode<T> {
    private T data;
    private ListNode<T> link;

    public ListNode() {
        this.data = null;
        this.link = null;
    }

    public ListNode(T data) {
        this.data = data;
        this.link = null;
    }

    public ListNode(T data, ListNode<T> link) {
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return this.data;
    }

    public ListNode<T> getLink() {
        return link;
    }

    // link 필드의 값을 설정하는 메서드
    public void setLink(ListNode<T> link) {
        this.link = link;
    }
}
