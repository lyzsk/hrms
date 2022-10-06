package cn.sichu.hrms.mapper;

import cn.sichu.hrms.model.SysMsg;

/**
 * @author sichu
 * @date 2022/05/12
 */
public interface SysMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    SysMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMsg record);

    int updateByPrimaryKey(SysMsg record);
}