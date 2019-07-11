package com.thinkgem.jeesite.common.enums;

/**
 * @Author: ZPJeck
 * @Description:
 * @Date: 2018/9/29  19:56
 */
public enum RoleEnum {

    HUI_YUAN("会员","huiyuan","0"),
    GUAN_LI_YUAN("管理员","dept","1"),
    ;

    private String name;

    private String enName;

    private String type;

    RoleEnum(String name, String enName, String type) {
        this.name = name;
        this.enName = enName;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
