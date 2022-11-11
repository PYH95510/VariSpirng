package thinkoutloud.firstproject.data.repository;
import org.springframework.data.repository.CrudRepository;
import thinkoutloud.firstproject.data.dto.ShortUrlResponseDto;

/**
 * PackageName : studio.thinkground.aroundhub.data.repository
 * FileName : ShortUrlRedisRepository
 * Author : Flature
 * Date : 2022-05-21
 * Description :
 */
public interface ShortUrlRedisRepository extends CrudRepository<ShortUrlResponseDto, String> {

}