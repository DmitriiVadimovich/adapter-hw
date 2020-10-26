package ru.iteco.structural.home.adapters.third;

import ru.iteco.structural.home.IDbEntity;

/**
 * Target.
 *
 * @author Ilya_Sukhachev
 */
public interface Target<T extends IDbEntity> {

    void create(T entity);

    T read(Long id);

    void update(T entity);

    void delete(T entity);
}
