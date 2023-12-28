package dev.jba;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public long profilesCount() {
        return profileRepository.count();
    }
}
