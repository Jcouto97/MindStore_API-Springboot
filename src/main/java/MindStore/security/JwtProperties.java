package MindStore.security;

public class JwtProperties {
    public static final String SECRET = "MY_SECRET";
    public static final int EXPIRATION_TIME = 864000000; //10 dias
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
