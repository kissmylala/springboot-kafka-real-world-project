package kz.adem.springboot.repository;

import kz.adem.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;
//Repo to save recent data from wikimedia to the DB
public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {
}
