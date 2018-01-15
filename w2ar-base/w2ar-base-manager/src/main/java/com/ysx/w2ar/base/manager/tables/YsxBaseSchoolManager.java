package com.ysx.w2ar.base.manager.tables;

import java.util.List;
import com.ysx.w2ar.base.domain.tables.YsxBaseSchoolBean;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.ysx.w2ar.base.dao.tables.YsxBaseSchoolDao;


/**
 * @实体名称: 基础_中国小学表
 * @数据库表: YSX_BASE_SCHOOL
 * @开发日期: 2017-10-21
 */
@Service
public class YsxBaseSchoolManager implements IYsxBaseSchoolManager {

    private final Logger LOG = Logger.getLogger(getClass());

    @Autowired
    private YsxBaseSchoolDao ysxBaseSchoolDao;
    
    /**
     * 1.新增一条数据
     * 注: 根据Bean实体执行新增操作.
     * @param ysxBaseSchool  - 基础_中国小学表
     * @return int           - 执行结果
     * @throws Exception     - 异常捕捉
     */
    public void getInsert(YsxBaseSchoolBean ysxBaseSchool) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getInsert()");
        
        // 非空判断
        if( null != ysxBaseSchool )
        {
            // 执行新增一条数据
            ysxBaseSchoolDao.getInsert(ysxBaseSchool);
        }
    }


    /**
     * 2.删除一条数据
     * 注: 根据Bean实体的主键ID执行删除操作.
     * @param schoolGradeId       - 基础_中国小学表
     * @return YsxBaseSchoolBean  - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getDelete(long schoolGradeId) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getDelete()");
        
        // 非空判断
        if( schoolGradeId > -1 )
        {
            // 执行删除一条数据
            return ysxBaseSchoolDao.getDelete(schoolGradeId);
        }
        return 0;
    }


    /**
     * 3.变更一条数据
     * 注: 根据Bean实体的主键ID执行变更操作.
     * @param ysxBaseSchool      - 基础_中国小学表
     * @return int               - 执行结果
     * @throws Exception         - 异常捕捉
     */
    public int getUpdate(YsxBaseSchoolBean ysxBaseSchool) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getUpdate()");
        
        // 非空判断
        if( null != ysxBaseSchool )
        {
            // 执行变更一条数据
            return ysxBaseSchoolDao.getUpdate(ysxBaseSchool);
        }
        return 0;
    }


    /**
     * 4.获取一个Bean实体
     * 注: 根据Bean实体的主键ID获取一个Bean实体.
     * @param schoolGradeId       - 基础_中国小学表
     * @return YsxBaseSchoolBean  - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public YsxBaseSchoolBean getBean(long schoolGradeId) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getBean()");
        
        // 非空判断
        if( schoolGradeId > -1 )
        {
            // 执行获取一个Bean实体
            return ysxBaseSchoolDao.getBean(schoolGradeId);
        }
        return null;
    }


    /**
     * 5.条件查询
     * 注: 支持多条件查询、分页查询、模糊查询、日期比较查询等操作.
     * @param ysxBaseSchool             - 基础_中国小学表
     * @return List<YsxBaseSchoolBean>  - 执行结果
     * @throws Exception                - 异常捕捉
     */
    public List<YsxBaseSchoolBean> getList(YsxBaseSchoolBean ysxBaseSchool) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getList()");
        
        // 非空判断
        if( null != ysxBaseSchool )
        {
            // 执行条件查询
            return ysxBaseSchoolDao.getList(ysxBaseSchool);
        }
        return null;
    }


    /**
     * 6.删除一条数据
     * 注: 根据Bean实体执行删除操作.
     * @param ysxBaseSchool  - 基础_中国小学表
     * @return int           - 执行结果
     * @throws Exception     - 异常捕捉
     */
    public int getDeleteBean(YsxBaseSchoolBean ysxBaseSchool) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getDeleteBean()");
        
        // 非空判断
        if( null != ysxBaseSchool )
        {
            // 执行删除一条数据
            return ysxBaseSchoolDao.getDeleteBean(ysxBaseSchool);
        }
        return 0;
    }


    /**
     * 7.删除多条数据
     * 注: 根据拼接有限个主键ID执行多条数据的删除操作.
     * @param IDs             - 小学ID数组
     * @return int            - 执行结果
     * @throws Exception      - 异常捕捉
     */
    public int getDeleteIn(long[] IDs) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getDeleteIn()");
        
        // 非空判断
        if( null != IDs && IDs.length > 0 )
        {
            // 执行删除多条数据
            return ysxBaseSchoolDao.getDeleteIn(IDs);
        }
        return 0;
    }


    /**
     * 8.删除批量数据
     * 注: 根据多种条件执行批量删除操作.
     * @param ysxBaseSchool  - 基础_中国小学表
     * @return int           - 执行结果
     * @throws Exception     - 异常捕捉
     */
    public int getDeleteBy(YsxBaseSchoolBean ysxBaseSchool) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getDeleteBy()");
        
        // 非空判断
        if( null != ysxBaseSchool )
        {
            // 执行删除批量数据
            return ysxBaseSchoolDao.getDeleteBy(ysxBaseSchool);
        }
        return 0;
    }


    /**
     * 9.变更批量数据
     * 注: 根据多种条件执行批量变更操作.
     * @param ysxBaseSchool  - 基础_中国小学表
     * @return int           - 执行结果
     * @throws Exception     - 异常捕捉
     */
    public int getUpdateBy(YsxBaseSchoolBean ysxBaseSchool) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getUpdateBy()");
        
        // 非空判断
        if( null != ysxBaseSchool )
        {
            // 执行变更批量数据
            return ysxBaseSchoolDao.getUpdateBy(ysxBaseSchool);
        }
        return 0;
    }


    /**
     * 10.验证一条数据是否存在
     * 注: 根据Bean实体的主键ID验证该数据是否存在.
     * @param schoolGradeId  - 基础_中国小学表
     * @return int           - 存在数量
     * @throws Exception     - 异常捕捉
     */
    public int getCheck(long schoolGradeId) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getCheck()");
        
        // 非空判断
        if( schoolGradeId > -1 )
        {
            // 执行验证一条数据是否存在
            return ysxBaseSchoolDao.getCheck(schoolGradeId);
        }
        return 0;
    }


    /**
     * 11.验证多条件数据是否存在
     * 注: 该方法返回数据量 ,若返回0则表示数据不存在.
     * @param ysxBaseSchool  - 基础_中国小学表
     * @return int           - 存在数量
     * @throws Exception     - 异常捕捉
     */
    public int getCheckBy(YsxBaseSchoolBean ysxBaseSchool) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getCheckBy()");
        
        // 非空判断
        if( null != ysxBaseSchool )
        {
            // 执行验证多条件数据是否存在
            return ysxBaseSchoolDao.getCheckBy(ysxBaseSchool);
        }
        return 0;
    }


    /**
     * 12.Batch - 批量新增数据
     * 注: 根据基础_中国小学表List对象执行批量新增操作.
     * @param list        - 基础_中国小学表List
     * @throws Exception  - 异常捕捉
     */
    public void getInsertBatch(List<YsxBaseSchoolBean> list) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getInsertBatch()");
        
        // 非空判断
        if( null != list && !list.isEmpty() )
        {
            // 执行Batch - 批量新增数据
            ysxBaseSchoolDao.getInsertBatch(list);
        }
    }




}
