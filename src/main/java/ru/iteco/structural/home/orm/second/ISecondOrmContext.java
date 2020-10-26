package ru.iteco.structural.home.orm.second;

import ru.iteco.structural.home.DbUserEntity;
import ru.iteco.structural.home.DbUserInfoEntity;

import java.util.Set;

/**
 * ISecondOrmContext.
 *
 * @author Ilya_Sukhachev
 */
public interface ISecondOrmContext {

    Set<DbUserEntity> getUsers();
    Set<DbUserInfoEntity> getUserInfos();

}
