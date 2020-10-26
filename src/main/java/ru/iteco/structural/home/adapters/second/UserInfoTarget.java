package ru.iteco.structural.home.adapters.second;

import ru.iteco.structural.home.DbUserInfoEntity;

/**
 * UserInfoTarget.
 *
 * @author Ilya_Sukhachev
 */
public interface UserInfoTarget {

    void create(DbUserInfoEntity entity);

    DbUserInfoEntity read(Long id);

    void update(DbUserInfoEntity entity);

    void delete(DbUserInfoEntity entity);
}
