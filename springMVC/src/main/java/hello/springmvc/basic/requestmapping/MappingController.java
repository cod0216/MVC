package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 기본 요청
     * 둘다 허용 /hello-basic, / hello-basic/
     * HTTP 메서드 모두 허용 GET, HEAD, PUT, PATCH, DELETE
     */

    @GetMapping(value = "/mapping/{userId}/order/{orderNum}", produces = "text/html")
    public String mappingPath(@PathVariable String userId, @PathVariable String orderNum){
        log.info("{}님이 {}번 상품을 주문하였습니다.", userId, orderNum);
        return "ok";
    }
}

