package org.zerock.b03.dto;

import lombok.Data;

@Data
public class MemberJoinDTO {

    private String mid;
    private String mpw;
    private String email;
    private boolean del;
    private boolean social;


}