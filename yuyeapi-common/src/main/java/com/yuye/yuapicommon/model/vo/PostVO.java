package com.yupi.yuapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.yupi.yuapicommon.model.entity.Post;

@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}