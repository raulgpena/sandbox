package teach.redbinaria.language.ms.configuration;



import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tech.redbinaria.repository.jpa.JPARepositoryConfiguration;
import tech.redbinaria.services.commons.CommonsServicesConfiguration;
import tech.redbinaria.services.ObservabilityConfiguration;

@Import({
        ObservabilityConfiguration.class,
        JPARepositoryConfiguration.class,
        CommonsServicesConfiguration.class
})
@Configuration
public class LanguageConfig { }