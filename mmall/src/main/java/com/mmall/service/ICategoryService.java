package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by geely
 */
public interface ICategoryService {

    //添加分类
    ServerResponse addCategory(String categoryName, Integer parentId);

    // 更新品类信息
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    //查询子节点
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    //
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
