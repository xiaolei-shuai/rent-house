package com.harry.renthouse.web.dto;

import com.harry.renthouse.elastic.entity.BaiduMapLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Harry Xu
 * @date 2020/5/18 19:03
 */
@Data
@ApiModel("房屋完整信息详情")
public class HouseCompleteInfoDetailDTO extends HouseCompleteInfoDTO{

    @ApiModelProperty(value = "经纪人")
    private UserDTO agent;

    @ApiModelProperty(value = "当前房屋小区的出租房屋数")
    private Integer houseCountInDistrict;

}
