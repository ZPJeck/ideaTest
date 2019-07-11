package com.zpjeck.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

/**
 * @Auther: Zpjeck
 * @Date: 2019/2/18 18:19
 * @Description:
 */
public class User extends Model<User> {


    public static User me = new User();

    public Page<User> paginate(int pageNumber, int pageSize) {
        return paginate(pageNumber, pageSize, "select *", "from user order by userid asc");
    }
}
