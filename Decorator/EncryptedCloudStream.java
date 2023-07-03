package com.learn.DesignPatterns.Behavioural.Decorator;

public class EncryptedCloudStream implements Stream{

    /*
    This is a decorator
     */
    private  Stream myStream;

    public EncryptedCloudStream(Stream myStream) {
        this.myStream = myStream;
    }

    @Override
    public void uploadData(String data) {
        // Upload the encrypted data
        myStream.uploadData(encrypt(data));

    }

    public String encrypt(String data){
        return "$#@$#@!@%(&*%$$#%%^&^%*%^@#$@#$#%$^%&^%&*%^$^%";
    }


}
