/*
 * SubCategoryService
 *
 * Version information
 *
 * 10/29/2018
 *
 * Copyright (c) 2018 Cybage software Pvt. Ltd. All rights reserved
 */

/**
 * @file SubCategoryService
 * Brief description of contents of file.
 * <p>
 * Long description
 * @date 10/29/2018
 */
package com.ldrp.onlineexamsystem.service;

import com.ldrp.onlineexamsystem.exceptions.CategoryNotFoundException;
import com.ldrp.onlineexamsystem.exceptions.SubCategoryNotFoundException;
import com.ldrp.onlineexamsystem.model.SubCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The Example interface provides ...
 *
 * @author {neelp}
 */
@Service
public interface SubCategoryService {
    /**
     * @param subCategory object to be added
     */
    void insertSubCategory(SubCategory subCategory);

    /**
     * @return all subcategories
     */
    List<SubCategory> getAllSubcategories();

    /**
     * @param categoryId category id to find subcategories
     * @return Specific subcategories of given category ID
     */
    List<SubCategory> getSubcategoryByCategoryId(int categoryId) throws
            CategoryNotFoundException;

    /**
     * @param subCategoryId Id to be searched
     * @return Subcategory object of goven ID
     */
    SubCategory getSubCategoryById(int subCategoryId) throws
            SubCategoryNotFoundException;

    String getCategoryIdBySubcategoryId(int subcategoryId);

}
