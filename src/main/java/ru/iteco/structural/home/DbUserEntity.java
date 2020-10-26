package ru.iteco.structural.home;

/**
 * DbUserEntity.
 *
 * @author Ilya_Sukhachev
 */
public class DbUserEntity implements IDbEntity {

    private Long id;
    private String login;
    private String password;
    private Long userInfoId;

    public DbUserEntity() {
    }

    public DbUserEntity(Long id, String login, String password, Long userInfoId) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.userInfoId = userInfoId;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }
}
