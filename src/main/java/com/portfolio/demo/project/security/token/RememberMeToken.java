package com.portfolio.demo.project.security.token;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "persistant_logins")
@Getter
@Setter
@NoArgsConstructor
public class RememberMeToken {
    @Id
    @Column(name = "SERIES")
    private String series;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "TOKEN", nullable = false)
    private String token;

    @Column(name = "LAST_USED", nullable = false)
    private Date lastUsed;

//    public RememberMeToken(PersistentRememberMeToken token){
//        this.series = token.getSeries();
//        this.email = token.getUsername();
//        this.token = token.getTokenValue();
//        this.lastUsed = token.getDate();
//    }
}
