package com.learn.DesignPatterns.Behavioural.Decorator;

public class Main {
    public static void main(String[] args) {
       // If we just want to upload our data without any additional constraints
       Stream uploader = new CloudStream();
       uploader.uploadData("Hello Bro");

       // If we want to compress and then upload data
        Stream compressedUploader = new CompressedCloudStream(new CloudStream());
        compressedUploader.uploadData("Chamika Jayasinghe");

        // If want to encrypt and then upload
        Stream encryptedUploader = new EncryptedCloudStream(new CloudStream());
        encryptedUploader.uploadData("Sri Lanka");

        // If want to encrypt first and then compress and then upload
        Stream allInOneUploader = new EncryptedCloudStream(new CompressedCloudStream(new CloudStream()));
        allInOneUploader.uploadData("More than you know....");








    }


}
