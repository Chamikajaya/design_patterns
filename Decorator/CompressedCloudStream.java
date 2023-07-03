package com.learn.DesignPatterns.Behavioural.Decorator;

public class CompressedCloudStream implements Stream{
    /*
    This is another decorator
     */
    private Stream mystream;

    public CompressedCloudStream(Stream mystream) {
        this.mystream = mystream;
    }

    @Override
    public void uploadData(String data) {
        // upload the compressed data to the cloud
        mystream.uploadData(compress(data));
    }

    public String compress(String data){
        return data.substring(0, 10);
    }

}
