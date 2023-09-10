import KI306.Yarmola.Lab6.SetContainer;

/**
 * Клас для демонстрації використання класу SetContainer.
 * @author Yura Yarmola
 * @version 1.0
 *
 */
public class SetDriver {
    /**
     * Головний метод для запуску програми.
     *
     * @param args Аргументи командного рядка (не використовуються в цій програмі).
     */
    public static void main(String[] args) {
        // Створюємо множину для цілих чисел і виконуємо декілька операцій з нею
        SetContainer<Integer> integerSet = new SetContainer<>();
        integerSet.addElement(5);
        integerSet.addElement(10);
        integerSet.addElement(3);
        integerSet.removeElement(5);
        Integer[] list = new Integer[] { 1, 3, 23, 4, 3 };
        integerSet.union(list);
        System.out.println("Перелік елементів: " + integerSet.getElements());
        System.out.println("Мінімальний елемент: " + integerSet.findMin());

        // Створюємо множину для рядків і виконуємо декілька операцій з нею
        SetContainer<String> stringSet = new SetContainer<>();
        stringSet.addElement("apple");
        stringSet.addElement("banana");
        stringSet.addElement("cherry");
        System.out.println("Мінімальний елемент: " + stringSet.findMin());
        stringSet.clear();
    }
}
