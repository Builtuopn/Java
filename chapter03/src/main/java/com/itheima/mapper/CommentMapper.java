package com.itheima.mapper;

import com.itheima.domain.Comment;
import org.apache.ibatis.annotations.*;

/**
 * @Classname CommentMapper
 * @Description TODO
 * @Date 2019-3-1 15:34
 * @Created by CrazyStone
 */
@Mapper
public interface CommentMapper {
    @Select("SELECT * FROM t_comment WHERE id =#{id}")
    public Comment findById(Integer id);

}
