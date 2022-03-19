package app.storage;

public class StorageException extends RuntimeException { //creating custom exception for StorageService

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}