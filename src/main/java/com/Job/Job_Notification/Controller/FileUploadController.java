package com.Job.Job_Notification.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Job.Job_Notification.Service.ApplicationService;

import java.io.IOException;

@Controller
@RequestMapping("/application")
public class FileUploadController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("resume") MultipartFile file, @RequestParam("userId") int userId) {
        try {
            String message = applicationService.uploadResume(file, userId);
            return ResponseEntity.ok(message);
        }
        catch (IOException e) {
            return ResponseEntity.status(500).body("Error uploading file: " + e.getMessage());
        }
    }

}
