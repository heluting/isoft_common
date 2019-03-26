package com.gaoxi.common.entity.user;

import java.security.Timestamp;
import java.io.Serializable;

public class UserEntity implements Serializable {

    /** 主键 */
    private String id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String mail;

    /** 营业执照照片 */
    private String licencePic;

    /** 注册时间 */
    private Timestamp registerTime;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLicencePic() {
        return licencePic;
    }

    public void setLicencePic(String licencePic) {
        this.licencePic = licencePic;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }





    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", licencePic='" + licencePic + '\'' +
                ", registerTime=" + registerTime +
                '}';
    }
}
