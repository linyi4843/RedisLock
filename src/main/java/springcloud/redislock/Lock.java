package springcloud.redislock;

import lombok.Data;

/**
 * Created with IDEA
 * 全局锁类
 *
 * @author:ly
 * @Date:2018/12/10
 * @Time:15:27
 */
@Data
public class Lock {
    private String name;

    private String value;
}
