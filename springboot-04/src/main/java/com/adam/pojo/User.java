package com.adam.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ApiModel("用户实体类")给生成api文档注释
public class User {
//    @ApiModelProperty("用户id")给生成api文档注释
    private int id;
    private String name;
    private String pwd;
}
