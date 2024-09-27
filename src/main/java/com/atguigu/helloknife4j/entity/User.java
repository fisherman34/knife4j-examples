package com.atguigu.helloknife4j.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author Sam
 * @create 2024-09-20 10:23 PM
 */

@Schema(description = "用户信息实体")
@Data
public class User {

  @Schema(description = "用户ID")
  private Integer id;

  @Schema(description = "用户姓名")
  private String name;

  @Schema(description = "用户年龄")
  private Integer age;
}
