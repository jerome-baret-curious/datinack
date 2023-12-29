package dev.jba;

import java.util.List;
import io.quarkus.mongodb.panache.PanacheQuery;
import io.quarkus.panache.common.Page;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

    private final ProfileService profileService;

    public ProfileResource(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GET
    public ProfileCount hello() {
        return new ProfileCount(profileService.profilesCount());
    }

    @GET
    @Path("/there")
    public List<Profile> first25() {
        PanacheQuery<Profile> pq = profileService.all();
        pq.page(Page.ofSize(25));
        return pq.list();
    }

    public record ProfileCount(long count) {
    }
}
