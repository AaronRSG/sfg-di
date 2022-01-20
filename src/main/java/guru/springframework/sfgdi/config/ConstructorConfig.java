package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("guru")
public class ConstructorConfig {
    private final String username;
    private final String password;
    private final String url;


    public ConstructorConfig(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getUsername() {
        return this.username;
    }


    public String getPassword() {
        return this.password;
    }


    public String getUrl() {
        return this.url;
    }

}
