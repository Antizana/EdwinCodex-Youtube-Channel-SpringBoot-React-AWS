package com.edwincodex.awsimageupload.datastore;

import com.edwincodex.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "annwilliams", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("9b0c40b8-a0d7-4b65-8dde-422a3b32460c")
                , "annwilliams"
                , null));
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "johnsmith", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("e28cebdd-83e1-4e8e-a5e2-97eef06b863c")
                , "johnsmith"
                , null));
    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
