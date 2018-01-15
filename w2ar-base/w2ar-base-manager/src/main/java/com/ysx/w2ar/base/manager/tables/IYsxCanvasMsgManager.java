package com.ysx.w2ar.base.manager.tables;

import java.util.List;
import com.ysx.w2ar.base.domain.tables.YsxCanvasMsgBean;

/**
 * @实体名称: 画板消息
 * @数据库表: YSX_CANVAS_MSG
 * @开发日期: 2017-10-21
 */
public interface IYsxCanvasMsgManager {

    /**
     * 1.新增一条数据
     * 注: 根据Bean实体执行新增操作.
     * @param ysxCanvasMsg  - 画板消息
     * @return int          - 执行结果
     * @throws Exception    - 异常捕捉
     */
    public void getInsert(YsxCanvasMsgBean ysxCanvasMsg) throws Exception;


    /**
     * 2.删除一条数据
     * 注: 根据Bean实体的主键ID执行删除操作.
     * @param canvasMsgId        - 画板消息
     * @return YsxCanvasMsgBean  - 执行结果
     * @throws Exception         - 异常捕捉
     */
    public int getDelete(long canvasMsgId) throws Exception;


    /**
     * 3.变更一条数据
     * 注: 根据Bean实体的主键ID执行变更操作.
     * @param ysxCanvasMsg  - 画板消息
     * @return int          - 执行结果
     * @throws Exception    - 异常捕捉
     */
    public int getUpdate(YsxCanvasMsgBean ysxCanvasMsg) throws Exception;


    /**
     * 4.获取一个Bean实体
     * 注: 根据Bean实体的主键ID获取一个Bean实体.
     * @param canvasMsgId        - 画板消息
     * @return YsxCanvasMsgBean  - 执行结果
     * @throws Exception         - 异常捕捉
     */
    public YsxCanvasMsgBean getBean(long canvasMsgId) throws Exception;


    /**
     * 5.条件查询
     * 注: 支持多条件查询、分页查询、模糊查询、日期比较查询等操作.
     * @param ysxCanvasMsg             - 画板消息
     * @return List<YsxCanvasMsgBean>  - 执行结果
     * @throws Exception               - 异常捕捉
     */
    public List<YsxCanvasMsgBean> getList(YsxCanvasMsgBean ysxCanvasMsg) throws Exception;


    /**
     * 6.删除一条数据
     * 注: 根据Bean实体执行删除操作.
     * @param ysxCanvasMsg  - 画板消息
     * @return int          - 执行结果
     * @throws Exception    - 异常捕捉
     */
    public int getDeleteBean(YsxCanvasMsgBean ysxCanvasMsg) throws Exception;


    /**
     * 7.删除多条数据
     * 注: 根据拼接有限个主键ID执行多条数据的删除操作.
     * @param canvasMsgIds  - msg_id
     * @return int          - 执行结果
     * @throws Exception    - 异常捕捉
     */
    public int getDeleteIn(long[] canvasMsgIds) throws Exception;


    /**
     * 8.删除批量数据
     * 注: 根据多种条件执行批量删除操作.
     * @param ysxCanvasMsg  - 画板消息
     * @return int          - 执行结果
     * @throws Exception    - 异常捕捉
     */
    public int getDeleteBy(YsxCanvasMsgBean ysxCanvasMsg) throws Exception;


    /**
     * 9.变更批量数据
     * 注: 根据多种条件执行批量变更操作.
     * @param ysxCanvasMsg  - 画板消息
     * @return int          - 执行结果
     * @throws Exception    - 异常捕捉
     */
    public int getUpdateBy(YsxCanvasMsgBean ysxCanvasMsg) throws Exception;


    /**
     * 10.验证一条数据是否存在
     * 注: 根据Bean实体的主键ID验证该数据是否存在.
     * @param canvasMsgId  - 画板消息
     * @return int         - 存在数量
     * @throws Exception   - 异常捕捉
     */
    public int getCheck(long canvasMsgId) throws Exception;


    /**
     * 11.验证多条件数据是否存在
     * 注: 该方法返回数据量 ,若返回0则表示数据不存在.
     * @param ysxCanvasMsg  - 画板消息
     * @return int          - 存在数量
     * @throws Exception    - 异常捕捉
     */
    public int getCheckBy(YsxCanvasMsgBean ysxCanvasMsg) throws Exception;


    /**
     * 12.Batch - 批量新增数据
     * 注: 根据画板消息List对象执行批量新增操作.
     * @param list        - 画板消息List
     * @throws Exception  - 异常捕捉
     */
    public void getInsertBatch(List<YsxCanvasMsgBean> list) throws Exception;



}
