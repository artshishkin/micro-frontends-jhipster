package net.shyshkin.study.mf.store.repository;

import net.shyshkin.study.mf.store.domain.Authority;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends ReactiveMongoRepository<Authority, String> {}
