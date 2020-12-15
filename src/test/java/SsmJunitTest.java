import com.javakc.ssm.user.entity.User;
import com.javakc.ssm.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class SsmJunitTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert()
    {
        User entity=new User();
        entity.setId(UUID.randomUUID().toString().replace("-",""));
        entity.setName("name1");
        entity.setAge(23);
        entity.setGender(1);
        entity.setPhone("15001390311");
        entity.setBirthday(new Date());
        entity.setAddress("北京市海淀区");


        userService.insert(entity);


    }
}
