package org.zerock.apps3.util;

import com.amazonaws.services.s3.AmazonS3Client;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@RequiredArgsConstructor
@Log4j2
public class S3Uploader {

    private final AmazonS3Client amazonS3Client;

    @Value("${cloud.aws.s3.bucket}")
    public String bucket;

    // S3로 파일 업로드하기
    public String upload(String filePath) throws RuntimeException {
        File targetFile = new File(filePath);

        String uploadImageUrl = putS3(targetFile, targetFile.getName()); // s3로 업로드
        //TODO : 여기까지 함. 책 920쪽
    }
}
