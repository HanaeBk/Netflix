package Repository;

import org.springframework.data.repository.CrudRepository;

import Model.Episode;

public interface EpisodeRepository extends CrudRepository<Episode, Long> {

}
