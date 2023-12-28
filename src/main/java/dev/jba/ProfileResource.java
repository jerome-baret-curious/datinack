package dev.jba;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ProfileResource {

    private final ProfileService profileService;

    public ProfileResource(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ProfileCount hello() {
        return new ProfileCount(profileService.profilesCount());
    }

    public record ProfileCount(long count) {
    }
}
