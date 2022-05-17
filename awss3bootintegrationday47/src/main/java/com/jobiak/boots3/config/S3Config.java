package com.jobiak.boots3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.s3.AmazonS3;



@Configuration
public class S3Config {

	
	@Value("${cloud.aws.credentials.access-key}")
	   private String accessKey;
	
	@Value("${cloud.aws.credentials.secret-key}")
	   private String secretKey;
	
	
	@Value("${cloud.aws.region.static}")
	   private String region;
	
//	@Bean
//	public AmazonS3 s3 Client()
//	{
//		AWSCredentials credentials new BasicAWSCredentials(accesskey,secretkey);
//		
//		AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(region).build();
//	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

