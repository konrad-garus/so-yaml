package io.example;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "available-payment-channels-list")
@Configuration
public class AvailableChannelsConfiguration {

	private String xyz;

	private List<ChannelConfiguration> channelConfigurations;

	public AvailableChannelsConfiguration(String xyz, List<ChannelConfiguration> channelConfigurations) {
		this.xyz = xyz;
		this.channelConfigurations = channelConfigurations;
	}

	public AvailableChannelsConfiguration() {

	}

	// getters, setters

	public String getXyz() {
		return xyz;
	}

	public void setXyz(String xyz) {
		this.xyz = xyz;
	}

	public List<ChannelConfiguration> getChannelConfigurations() {
		return channelConfigurations;
	}

	public void setChannelConfigurations(List<ChannelConfiguration> channelConfigurations) {
		this.channelConfigurations = channelConfigurations;
	}

	// Nested properties need not be annotated
	// @ConfigurationProperties(prefix =
	// "available-payment-channels-list.channelConfigurations")
	// @Configuration
	public static class ChannelConfiguration {

		private String name;
		private String companyBankAccount;

		public ChannelConfiguration(String name, String companyBankAccount) {
			this.name = name;
			this.companyBankAccount = companyBankAccount;
		}

		public ChannelConfiguration() {
		}

		// getters, setters

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCompanyBankAccount() {
			return companyBankAccount;
		}

		public void setCompanyBankAccount(String companyBankAccount) {
			this.companyBankAccount = companyBankAccount;
		}

	}

}