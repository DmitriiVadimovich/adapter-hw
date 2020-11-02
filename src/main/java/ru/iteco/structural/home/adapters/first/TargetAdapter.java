package ru.iteco.structural.home.adapters.first;

import ru.iteco.structural.home.DbUserEntity;
import ru.iteco.structural.home.DbUserInfoEntity;
import ru.iteco.structural.home.IDbEntity;
import ru.iteco.structural.home.orm.first.IFirstOrm;
import ru.iteco.structural.home.orm.second.ISecondOrm;

public class TargetAdapter implements Target {
    private IDbEntity iDbEntity;

    @Override
    public void createUser(DbUserEntity entity) {
        if (iDbEntity instanceof IFirstOrm) {
            IFirstOrm firstOrm = (IFirstOrm) iDbEntity;
            firstOrm.create(entity);
        }
        if (iDbEntity instanceof ISecondOrm) {
            ISecondOrm secondOrm = (ISecondOrm) iDbEntity;
            secondOrm.getContext().getUsers().add(entity);
        }
    }

    @Override
    public DbUserEntity readUser(Long id) {
        if (iDbEntity instanceof IFirstOrm) {
            IFirstOrm firstOrm = (IFirstOrm) iDbEntity;
            firstOrm.read(id.intValue());
        }
        if (iDbEntity instanceof ISecondOrm) {
            ISecondOrm secondOrm = (ISecondOrm) iDbEntity;
            return secondOrm.getContext().getUsers().stream().filter(item->item.getId().equals(id)).findFirst().orElse(null);
        }
        return null;
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        if (iDbEntity instanceof IFirstOrm) {
            IFirstOrm firstOrm = (IFirstOrm) iDbEntity;
            firstOrm.update(entity);
        }
        if (iDbEntity instanceof ISecondOrm) {
            ISecondOrm secondOrm = (ISecondOrm) iDbEntity;
            secondOrm.getContext().getUsers().add(entity);
        }
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        if (iDbEntity instanceof IFirstOrm) {
            IFirstOrm firstOrm = (IFirstOrm) iDbEntity;
            firstOrm.delete(entity);
        }
        if (iDbEntity instanceof ISecondOrm) {
            ISecondOrm secondOrm = (ISecondOrm) iDbEntity;
            secondOrm.getContext().getUsers().remove(entity);
        }
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        if (iDbEntity instanceof IFirstOrm) {
            IFirstOrm firstOrm = (IFirstOrm) iDbEntity;
            firstOrm.create(entity);
        }
        if (iDbEntity instanceof ISecondOrm) {
            ISecondOrm secondOrm = (ISecondOrm) iDbEntity;
            secondOrm.getContext().getUserInfos().add(entity);
        }
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        if (iDbEntity instanceof IFirstOrm) {
            IFirstOrm firstOrm = (IFirstOrm) iDbEntity;
            firstOrm.read(id.intValue());
        }
        if (iDbEntity instanceof ISecondOrm) {
            ISecondOrm secondOrm = (ISecondOrm) iDbEntity;
            secondOrm.getContext().getUserInfos().stream().filter(item->item.getId().equals(id)).findFirst().orElse(null);;
        }
        return null;
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        if (iDbEntity instanceof IFirstOrm) {
            IFirstOrm firstOrm = (IFirstOrm) iDbEntity;
            firstOrm.update(entity);
        }
        if (iDbEntity instanceof ISecondOrm) {
            ISecondOrm secondOrm = (ISecondOrm) iDbEntity;
            secondOrm.getContext().getUserInfos().add(entity);
        }
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        if (iDbEntity instanceof IFirstOrm) {
            IFirstOrm firstOrm = (IFirstOrm) iDbEntity;
            firstOrm.delete(entity);
        }
        if (iDbEntity instanceof ISecondOrm) {
            ISecondOrm secondOrm = (ISecondOrm) iDbEntity;
            secondOrm.getContext().getUserInfos().remove(entity);
        }
    }
}
