package utils;

import com.sun.deploy.util.StringUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: auth2
 * @description:
 * @author: yqs
 * @create: 2020-01-20 22:18
 */
@Slf4j
@Component
public class JwtTokenUtil {
    public static final String KEY_NAME = "name";
    public static final String KEY_CREATED = "created";
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;

    /**
     * 根据用户信息生成token，设置自定义属性
     *
     * @param username
     * @return
     */
    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>(10);
        claims.put(KEY_NAME, username);
        claims.put(KEY_CREATED, new Date());
        return generateToken(claims);
    }

    public Boolean validateToken(String token, String username) {
        return username != null && username.equals(getUsernameByToken(token))
                && !isExpired(token);
    }

    /**
     * 判断token是否过期
     *
     * @param token
     * @return
     */
    private Boolean isExpired(String token) {
        Claims claims = getClaimsByToken(token);
        return claims.getExpiration().before(new Date());
    }

    /**
     * 根据token获取负载
     *
     * @param token
     * @return
     */
    private Claims getClaimsByToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            log.debug("jwt格式错误,token: {}", token);
        }
        return claims;
    }

    private String getUsernameByToken(String token) {
        Claims claims = getClaimsByToken(token);
        return claims.getSubject();
    }

    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateJwtExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();

    }

    private Date generateJwtExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

}