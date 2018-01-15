package com.ysx.w2ar.base.manager.tables;

import java.util.List;
import com.ysx.w2ar.base.domain.tables.YsxMoocClassMemberBean;

/**
 * @实体名称: 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
 * @数据库表: YSX_MOOC_CLASS_MEMBER
 * @开发日期: 2017-10-21
 */
public interface IYsxMoocClassMemberManager {

    /**
     * 1.新增一条数据
     * 注: 根据Bean实体执行新增操作.
     * @param ysxMoocClassMember  - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public void getInsert(YsxMoocClassMemberBean ysxMoocClassMember) throws Exception;


    /**
     * 2.删除一条数据
     * 注: 根据Bean实体的主键ID执行删除操作.
     * @param moocClassMemberId        - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return YsxMoocClassMemberBean  - 执行结果
     * @throws Exception               - 异常捕捉
     */
    public int getDelete(long moocClassMemberId) throws Exception;


    /**
     * 3.变更一条数据
     * 注: 根据Bean实体的主键ID执行变更操作.
     * @param ysxMoocClassMember  - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getUpdate(YsxMoocClassMemberBean ysxMoocClassMember) throws Exception;


    /**
     * 4.获取一个Bean实体
     * 注: 根据Bean实体的主键ID获取一个Bean实体.
     * @param moocClassMemberId        - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return YsxMoocClassMemberBean  - 执行结果
     * @throws Exception               - 异常捕捉
     */
    public YsxMoocClassMemberBean getBean(long moocClassMemberId) throws Exception;


    /**
     * 5.条件查询
     * 注: 支持多条件查询、分页查询、模糊查询、日期比较查询等操作.
     * @param ysxMoocClassMember             - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return List<YsxMoocClassMemberBean>  - 执行结果
     * @throws Exception                     - 异常捕捉
     */
    public List<YsxMoocClassMemberBean> getList(YsxMoocClassMemberBean ysxMoocClassMember) throws Exception;


    /**
     * 6.删除一条数据
     * 注: 根据Bean实体执行删除操作.
     * @param ysxMoocClassMember  - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getDeleteBean(YsxMoocClassMemberBean ysxMoocClassMember) throws Exception;


    /**
     * 7.删除多条数据
     * 注: 根据拼接有限个主键ID执行多条数据的删除操作.
     * @param moocClassMemberIds  - 主键ID
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getDeleteIn(long[] moocClassMemberIds) throws Exception;


    /**
     * 8.删除批量数据
     * 注: 根据多种条件执行批量删除操作.
     * @param ysxMoocClassMember  - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getDeleteBy(YsxMoocClassMemberBean ysxMoocClassMember) throws Exception;


    /**
     * 9.变更批量数据
     * 注: 根据多种条件执行批量变更操作.
     * @param ysxMoocClassMember  - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getUpdateBy(YsxMoocClassMemberBean ysxMoocClassMember) throws Exception;


    /**
     * 10.验证一条数据是否存在
     * 注: 根据Bean实体的主键ID验证该数据是否存在.
     * @param moocClassMemberId  - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return int               - 存在数量
     * @throws Exception         - 异常捕捉
     */
    public int getCheck(long moocClassMemberId) throws Exception;


    /**
     * 11.验证多条件数据是否存在
     * 注: 该方法返回数据量 ,若返回0则表示数据不存在.
     * @param ysxMoocClassMember  - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)
     * @return int                - 存在数量
     * @throws Exception          - 异常捕捉
     */
    public int getCheckBy(YsxMoocClassMemberBean ysxMoocClassMember) throws Exception;


    /**
     * 12.Batch - 批量新增数据
     * 注: 根据云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)List对象执行批量新增操作.
     * @param list        - 云舒写_阅读慕课_班级_人员表(0:学生;1:学校教师;2家长;3:导读老师,4:课程)List
     * @throws Exception  - 异常捕捉
     */
    public void getInsertBatch(List<YsxMoocClassMemberBean> list) throws Exception;



}
