package dev.jba;

import java.util.Optional;
import org.bson.types.ObjectId;
import io.quarkus.mongodb.panache.PanacheQuery;
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

    public void persist(Profile entity) {
        profileRepository.persist(entity);
    }

    public Optional<Profile> persgist(ObjectId entity) {
        return profileRepository.findByIdOptional(entity);
    }

    public PanacheQuery<Profile> all() {
        return profileRepository.findAll();
    }
}
