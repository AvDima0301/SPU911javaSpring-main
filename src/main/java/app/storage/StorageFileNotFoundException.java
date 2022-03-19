package app.storage;

public class StorageFileNotFoundException extends StorageException { //creating custom exception for StorageService

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}