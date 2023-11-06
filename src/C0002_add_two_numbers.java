/**
 * 2.两数相加
 *  给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *  请你将两个数相加，并以相同形式返回一个表示和的链表。
 *  你可以假设除了数字 `0` 之外，这两个数都不会以 `0` 开头。
 */
public class C0002_add_two_numbers {

    public static void main(String[] args) {
        // 创建输入链表 l1: [2, 4, 3]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        System.out.print("输入链表 l1: ");
        printLinked(l1);

        // 创建输入链表 l2: [5, 6, 4]
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.print("输入链表 l2: ");
        printLinked(l2);

        // 调用 addTwoNumbers 方法来计算结果
        ListNode ll = addTwoNumbers(l1, l2);

        // 打印结果链表
        System.out.print("结果链表 ll: ");
        printLinked(ll);
        System.out.println("解释：342 + 465 = 807");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 创建一个虚拟头节点，用来存储最终的结果链表
        ListNode dummyHead = new ListNode(0);
        // 创建一个指针 current，用来构建结果链表
        ListNode current = dummyHead;
        // 初始化进位为 0
        int carry = 0;

        // 循环，直到两个输入链表都为空
        while (l1 != null || l2 != null) {
            // 获取 l1 和 l2 当前节点的值，如果为空则默认为 0
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            // 计算当前位的和，加上进位
            int sum = x + y + carry;
            // 计算新的进位
            carry = sum / 10;
            // 创建一个新节点，存储当前位的值
            current.next = new ListNode(sum % 10);
            // 将指针 current 向后移动一位
            current = current.next;

            // 如果 l1 不为空，移动 l1 指针到下一个节点
            if (l1 != null) l1 = l1.next;
            // 如果 l2 不为空，移动 l2 指针到下一个节点
            if (l2 != null) l2 = l2.next;
        }

        // 如果循环结束后还有进位，需要将进位加到结果链表的末尾
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // 返回结果链表的头部，实际结果在 dummyHead.next 中
        return dummyHead.next;

        // 时间复杂度：O(max(m, n)), 其中 m 和 n 分别为两个链表的长度。
        // 空间复杂度：O(1)
    }

    public static void printLinked(ListNode ll) {
        while (ll != null) {
            System.out.print(ll.val);
            if (ll.next != null) {
                System.out.print(" -> ");
            }
            ll = ll.next;
        }
        System.out.println();
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}