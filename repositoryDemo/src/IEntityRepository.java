public interface IEntityRepository<T> {
    void add(T entity);
    void remove(T entity);
    void update(T entity);
}
