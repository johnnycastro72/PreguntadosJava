package controller;

/**
 * This interface defines the agreement to obtain an object from the repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public interface IObtain<T> {
    public T obtain(T o);
}
