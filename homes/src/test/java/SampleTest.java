import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootConfiguration
@SpringBootTest(classes=SampleTest.class)
public class SampleTest {

//    @Autowired
//    private UserMapper userMapper;


    @Test
    public void testSelect() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(queryWrapper);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
    }
}