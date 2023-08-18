package com.apiex.api01.util;

import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@Component
@Log4j2
public  class JWTUtilTest {
    @Autowired
    private JWTUtil jwtUtil;

    @Test
    public void testGenerate() {

        Map<String, Object> claimMap = Map.of("mid","ABCDE");

        String jwtStr = jwtUtil.generateToken(claimMap,1);

        log.info(jwtStr);
    }
    @Test
    public void testValidate() {

        //유효시간이 지난 토큰
        String jwtStr = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2NTYyMDgzOTksIm1pZCI6IkFCQ0RFIiwiaWF0IjoxNjU2MjA4MzM5fQ.Zgn_d3NkZ8LjG3pligMt3Uor_U5stGGIsL7RJhgeObo";

        Map<String, Object> claim = jwtUtil.validateToken(jwtStr);

        log.info(claim);

    }
}