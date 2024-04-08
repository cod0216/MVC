package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/user/")
public class MappingClassController {

    @GetMapping
    public String users(){
        return "get users";
    }
    @PostMapping
    public String addUser(){
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get UserId = " + userId;
    }
    @PatchMapping("/{userId}")
    public String patchUser(@PathVariable String userId){
        return "patch UserId = "+ userId;
    }
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "Delete UserId = "+ userId;
    }
}
