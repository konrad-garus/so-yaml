package io.example;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableConfigurationProperties
public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder(Tester.class).run(args);
		AvailableChannelsConfiguration cfg = context.getBean(AvailableChannelsConfiguration.class);
		cfg.getChannelConfigurations()
				.forEach(cc -> System.out.println(cc.getName() + "\t" + cc.getCompanyBankAccount()));
	}
}
