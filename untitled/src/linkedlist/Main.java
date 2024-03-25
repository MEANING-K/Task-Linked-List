package linkedlist;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        LOGGER.info("List 출력:");
        if (list.size() > 2) { // 메서드 호출을 조건에 따라 실행
            for (int data : list) {
                LOGGER.info(String.valueOf(data));
            }
        }

        if (list.size() > 2) { // 메서드 호출을 조건에 따라 실행
            LOGGER.info("Index 2의 값: " + list.get(2));
        }

        list.delete(1);
        LOGGER.info("Index 1 삭제 후:");
        for (int data : list) {
            LOGGER.info(String.valueOf(data));
        }
    }
}
