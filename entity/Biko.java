package cn.stylefeng.guns.modular.copm.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2019-08-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Biko对象", description="")
public class Biko implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "患者ID")
    @TableField("uId")
    private String uId;

    @ApiModelProperty(value = "创建用户id")
    @TableField("createUserId")
    private String createUserId;

    @ApiModelProperty(value = "客服名称")
    @TableField("serviceName")
    private String serviceName;

    @ApiModelProperty(value = "备注")
    private String biko;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;


}
