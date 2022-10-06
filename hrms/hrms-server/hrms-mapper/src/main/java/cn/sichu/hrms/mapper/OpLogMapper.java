package cn.sichu.hrms.mapper;

import cn.sichu.hrms.model.OpLog;

/**
 * @author sichu
 * @date 2022/05/12
 */
public interface OpLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpLog record);

    int insertSelective(OpLog record);

    OpLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKey(OpLog record);
}