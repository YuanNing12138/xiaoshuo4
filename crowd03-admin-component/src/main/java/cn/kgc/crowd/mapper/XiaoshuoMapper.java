package cn.kgc.crowd.mapper;

import cn.kgc.crowd.entity.Xiaoshuo;
import cn.kgc.crowd.entity.XiaoshuoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XiaoshuoMapper {
    //模糊查询
    List<Xiaoshuo>getBookByName(@Param("name") String name);
   //添加
    Integer addXiaoShuo(@Param("xiaoshuo") Xiaoshuo xiaoshuo);
    //修改
    Integer updata(@Param("xiaoshuo") Xiaoshuo xiaoshuo);
    //查询一个
    Xiaoshuo getOne(@Param("id") Integer id);
    /*删除*/
    Integer deletexiaoshuo(@Param("id") Integer id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    long countByExample(XiaoshuoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    int deleteByExample(XiaoshuoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    int insert(Xiaoshuo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    int insertSelective(Xiaoshuo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    List<Xiaoshuo> selectByExample(XiaoshuoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    Xiaoshuo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Xiaoshuo record, @Param("example") XiaoshuoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    int updateByExample(@Param("record") Xiaoshuo record, @Param("example") XiaoshuoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    int updateByPrimaryKeySelective(Xiaoshuo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xiaoshuo
     *
     * @mbg.generated Fri Aug 07 21:29:13 CST 2020
     */
    int updateByPrimaryKey(Xiaoshuo record);
}