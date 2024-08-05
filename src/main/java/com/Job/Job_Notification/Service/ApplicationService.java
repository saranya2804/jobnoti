package com.Job.Job_Notification.Service;

import Exceptions.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Job.Job_Notification.Entity.Application;
import com.Job.Job_Notification.Repository.ApplicationRepository;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class ApplicationService {

    private static final String UPLOAD_DIR = "C:/Users/91799/OneDrive/Desktop/Job_resumes";

    @Autowired
    private ApplicationRepository applicationRepository;

    public String uploadResume(MultipartFile file, int userId) throws IOException {
        if (file.isEmpty()) {
            throw new FileUploadException("File is empty");
        }
        try {

            // Save the file to the upload directory
            String fileName = file.getOriginalFilename();
            String filePath = UPLOAD_DIR + fileName;
            File dest = new File(filePath);
            file.transferTo(dest);

            // Save Application metadata to the database
            String fileType = file.getContentType();
            String uploadTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            Application application = new Application(userId, fileName, filePath, fileType, uploadTime);
            applicationRepository.save(application);

            return "Successfully uploaded '" + fileName + "'";
        } catch (IOException e) {
            throw new FileUploadException("Failed to upload file: " + e.getMessage());
        }
    }
}
