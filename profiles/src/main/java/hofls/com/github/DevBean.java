package hofls.com.github;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("dev-profile")
public class DevBean {

    // ":" means its optional
    @Value("${spring.profiles.active:}")
    private String activeProfile;

    @Value("${redefined-property}")
    private String redefinedProperty;

    @Value("${common-property}")
    private String commonProperty;

    @PostConstruct
    public void init() {
        System.out.println("DevBean init");
        System.out.println("DevBean.activeProfile = " + activeProfile);
        System.out.println("DevBean.redefinedProperty = " + redefinedProperty);
        System.out.println("DevBean.commonProperty = " + commonProperty);
    }

}
