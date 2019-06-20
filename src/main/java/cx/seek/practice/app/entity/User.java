package cx.seek.practice.app.entity;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Data
@Entity(name = "user")
@ApiModel(description = "用户")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "用户名", required = true)
    private String name;

    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
