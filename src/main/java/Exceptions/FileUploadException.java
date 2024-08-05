package Exceptions;

public class FileUploadException extends RuntimeException {
    public FileUploadException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "File does not upload: " + super.getMessage();
    }
}
