package com.xxy.sbtest.auth;



import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTokenUtils {
    private static String security="lisongbo";
    public static String createJwtToken(){
        Map<String,Object> map=new HashMap<>();
        map.put("username","lisi");
        String sign = JWT.create().withHeader(map)
                .withClaim("as", "lisi")
                .withClaim("exp",new Date())
                .sign(Algorithm.HMAC256(security));

        return sign;
    }

    public static void verifyToken(String token,String key){

        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(key)).build();
        DecodedJWT verify = verifier.verify(token);
        Map<String, Claim> claims = verify.getClaims();
        Claim exp = verify.getClaim("exp");
        System.out.println(claims.get("as").asString());
    }

    public static void main(String[] args) {
        String jwtToken = JwtTokenUtils.createJwtToken();
        JwtTokenUtils.verifyToken(jwtToken,security);
    }

}
