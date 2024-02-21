public class App {
    public static void main(String[] args) throws Exception {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        customLinkedList.push_back(1);
        customLinkedList.push_front(2);
        System.out.println("size -> " + customLinkedList.getListSize());
        for (long i = 0; i < customLinkedList.getListSize(); i++) {
            System.out.println(i + " -> " + customLinkedList.get(i));
        }
        customLinkedList = new CustomLinkedList<>();
        for (int i = 0; i < 10; i++) {
            customLinkedList.push_back(i);
        }
        for (int i = 10; i < 20; i++) {
            customLinkedList.push_front(i);
        }
        System.out.println("size -> " + customLinkedList.getListSize());
        for (long i = 0; i < customLinkedList.getListSize(); i++) {
            System.out.println(i + " -> " + customLinkedList.get(i));
        }
        System.out.println("Сейчас будет ошибка.");
        customLinkedList.get(238428934798L);
    }
}
