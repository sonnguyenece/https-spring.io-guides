package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/*  @JsonIgnoreProperties để báo hiệu trường nào ko map được thì kệ cmn

 */

@JsonIgnoreProperties(ignoreUnknown = true)

@Data
public class Quote {
    //    private String type;
    //    private Value value;

// @JsonProperty để chỉ định chính xác cái từ khóa của tài liệu JSON vs trường đc tạo ra
// (trong trường hợp tên 2 thằng không giống nhau. Nếu ko dùng thg này kết quả của trường này sẽ ra null)
//  (to specify the exact key of the JSON document)
    @JsonProperty("type")
    private String typess;
//    @JsonProperty("value")
    private Value vasdasdaluesssssssssssssss;

}
