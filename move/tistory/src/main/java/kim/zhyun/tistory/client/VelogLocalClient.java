package kim.zhyun.tistory.client;

import kim.zhyun.tistory.vo.response.PhotosFromVelog;
import kim.zhyun.tistory.vo.response.PostsFromVelog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "velogLocalClient", url = "http://localhost:9090/")
public interface VelogLocalClient {

    @GetMapping("/find-all-posts")
    List<PostsFromVelog> getPostsFromH2Velog();

    @GetMapping("/find-all-photo")
    List<PhotosFromVelog> getPhotosFromH2Velog();

}