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
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    /**
     * Видаляє елемент із множини.
     *
     * @param element Елемент для видалення із множини.
     */
    public void removeElement(T element) {
        elements.remove(element);
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
        elements.clear();
    }
}
