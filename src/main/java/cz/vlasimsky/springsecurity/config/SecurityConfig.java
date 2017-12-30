package cz.vlasimsky.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("john").password("test123").roles("EMPLOYEE");
        auth.inMemoryAuthentication().withUser("marry").password("test123").roles("MANAGER");
        auth.inMemoryAuthentication().withUser("susan").password("test123").roles("ADMIN");
    }
}
