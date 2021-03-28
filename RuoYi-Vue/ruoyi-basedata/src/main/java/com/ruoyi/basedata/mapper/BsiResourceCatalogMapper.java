package com.ruoyi.basedata.mapper;

import java.util.List;
import com.ruoyi.basedata.domain.BsiResourceCatalog;
import org.apache.ibatis.annotations.Param;

/**
 * 资源目录Mapper接口
 * 
 * @author ruoyi
 * @date 2021-02-24
 */
public interface BsiResourceCatalogMapper 
{
    /**
     * 查询资源目录
     * 
     * @param id 资源目录ID
     * @return 资源目录
     */
    public BsiResourceCatalog selectBsiResourceCatalogById(String id);

    /**
     * 查询资源目录列表
     * 
     * @param bsiResourceCatalog 资源目录
     * @return 资源目录集合
     */
    public List<BsiResourceCatalog> selectBsiResourceCatalogList(BsiResourceCatalog bsiResourceCatalog);

    /**
     * 新增资源目录
     * 
     * @param bsiResourceCatalog 资源目录
     * @return 结果
     */
    public int insertBsiResourceCatalog(BsiResourceCatalog bsiResourceCatalog);

    /**
     * 修改资源目录
     * 
     * @param bsiResourceCatalog 资源目录
     * @return 结果
     */
    public int updateBsiResourceCatalog(BsiResourceCatalog bsiResourceCatalog);

    /**
     * 删除资源目录
     * 
     * @param id 资源目录ID
     * @return 结果
     */
    public int deleteBsiResourceCatalogById(String id);

    /**
     * 批量删除资源目录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBsiResourceCatalogByIds(String[] ids);

    /**
     * 根据父级目录id和资源目录名称，查询是否有相同数据，如果为0，则可以新增
     * @param parentId
     * @param catalogName
     * @return
     */
    public int getCountByParentId(@Param("parentId") String parentId, @Param("catalogName")String catalogName);

    /**
     * 根据父级目录id，查询该父级目录层级
     * @param parentId
     * @return
     */
    public int getParentLevel(String parentId);

    /**
     * 根据parentid，获取父目录所有的id，按照层级从低到高排序
     * @param parentId
     * @return
     */
    public List<String> getParentList(String parentId);
}
