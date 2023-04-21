package com.bezkoder.spring.webflux.file.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.codec.multipart.FilePart;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FileStorageService {
  public void init();

  public Mono<String> save(Mono<FilePart> filePartMono);

  public Flux<DataBuffer> load(String filename);

  public boolean delete(String filename);

  public Stream<Path> loadAll();
}
