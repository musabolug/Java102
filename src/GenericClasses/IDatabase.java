package GenericClasses;

public interface IDatabase<T> {
    // Generic Interface

    public boolean insert(T data);
    public boolean delete(T data);
    public boolean update(T data);
    public T select();
}
