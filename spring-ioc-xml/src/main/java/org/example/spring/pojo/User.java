package org.example.spring.pojo;

/**
 * @author 未確認の庭師
 */
public class User {
    private Integer id;
    private String username;
    private String password;

    public User() {
        System.out.println("生命周期1: 实例化");
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        System.out.println("生命周期2: 依赖注入");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void init(){
        System.out.println("生命周期3: 初始化");
    }

    public void destroy(){
        System.out.println("生命周期4: 销毁");
    }

}
