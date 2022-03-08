package com.edwincodex.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("codex-image-upload-123");

    private final String bucketName;
    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

}
