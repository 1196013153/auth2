package com.example.auth2.springoauthserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-10-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysPermission对象", description="")
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "父ID")
    private Integer pid;

    @ApiModelProperty(value = "资源类型（1：菜单，2：按钮，3：操作）")
    private Integer type;

    @ApiModelProperty(value = "资源名称")
    private String name;

    @ApiModelProperty(value = "资源标识（或者叫权限字符串）")
    private String code;

    @ApiModelProperty(value = "资源URI")
    private String uri;

    @ApiModelProperty(value = "序号")
    private Integer seq;

    private String createUser;

    private LocalDateTime createTime;

    private String updateUser;

    private LocalDateTime updateTime;


}
