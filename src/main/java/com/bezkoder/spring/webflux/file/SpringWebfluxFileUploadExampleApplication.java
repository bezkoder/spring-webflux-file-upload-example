package com.bezkoder.spring.webflux.file;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bezkoder.spring.webflux.file.service.FileStorageService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class SpringWebfluxFileUploadExampleApplication implements CommandLineRunner {

  @Resource
  FileStorageService storageService;

  public static void main(String[] args) {
    SpringApplication.run(SpringWebfluxFileUploadExampleApplication.class, args);
  }

  @Override
  public void run(String... arg) throws Exception {
    storageService.init();
  }
}
