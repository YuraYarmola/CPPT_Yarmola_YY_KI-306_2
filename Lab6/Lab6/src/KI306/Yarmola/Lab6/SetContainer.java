package KI306.Yarmola.Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Клас для зберігання та опрацювання множини елементів, які реалізують інтерфейс Comparable.
 *
 * @param <T> Тип елементів множини, які реалізують інтерфейс Comparable.
 */
public class SetContainer<T extends Comparable<T>> {

    public static int all_nums = 0;
    private List<T> elements = new ArrayList<>();

    /**
     * Додає елементи до множини, якщо вони ще не містяться в ній.
     *
     * @param elements_list Масив елементів для додавання до множини.
     */
    public void union(T[] elements_list) {
        for (T element : elements_list) {
            if (!elements.contains(element)) {
                elements.add(element);
            }
        }
    }


    /**
     * Додає елемент до множини, якщо він ще не міститься в ній.
     *
     * @param element Елемент для додавання до множини.
     */
    public void addElement(T element) {
        int before = this.getElements().size();
        if (!elements.contains(element)) {
            elements.add(element);
        }
        int after = this.getElements().size();
        all_nums += after - before;
    }

    /**
     * Видаляє елемент із множини.
     *
     * @param element Елемент для видалення із множини.
     */
    public void removeElement(T element) {
        int before = this.getElements().size();
        elements.remove(element);
        int after = this.getElements().size();
        all_nums -= before - after;
    }

    /**
     * Знаходить мінімальний елемент у множині.
     *
     * @return Мінімальний елемент у множині або null, якщо множина порожня.
     */
    public T findMin() {
        if (elements.isEmpty()) {
            return null;
        }
        return Collections.min(elements);
    }

    /**
     * Отримує всі елементи множини.
     *
     * @return Список всіх елементів множини.
     */
    public List<T> getElements() {
        return elements;
    }

    /**
     * Очищає множину, видаляючи всі елементи.
     */
    public void clear() {
        int before = this.getElements().size();
        elements.clear();
        int after = this.getElements().size();
        all_nums -= before - after;
    }
}
