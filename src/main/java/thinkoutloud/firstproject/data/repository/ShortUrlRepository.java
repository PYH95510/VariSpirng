package thinkoutloud.firstproject.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thinkoutloud.firstproject.data.entity.ShortUrl;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    ShortUrl findByUrl(String url);

    ShortUrl findByOrgUrl(String originalUrl);

}
