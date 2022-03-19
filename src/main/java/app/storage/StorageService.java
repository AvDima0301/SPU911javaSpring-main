package app.storage;

import org.springframework.core.io.Resource;

public interface StorageService { //init new service for work with img
    void init();
    Resource loadAsResource(String filename);
    String save(String base64);
}
