package ru.iteco.structural.home.adapters.second;

import ru.iteco.structural.home.DbUserEntity;

/**
 * UserTarget.
 *
 * @author Ilya_Sukhachev
 */
public interface UserTarget {

    void create(DbUserEntity entity);

    DbUserEntity read(Long id);

    void update(DbUserEntity entity);

    void delete(DbUserEntity entity);
}
