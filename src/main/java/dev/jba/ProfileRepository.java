package dev.jba;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProfileRepository implements PanacheMongoRepository<Profile> {

}
