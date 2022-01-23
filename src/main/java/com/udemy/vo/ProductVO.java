package com.udemy.vo;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductVO {
    private Long id;
    private MysqlxDatatypes.Scalar.String name;
}
