package org.application.dao;

import org.application.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.util.List;


@Repository
public class RedisDao {
    @Resource
    StringRedisTemplate stringRedisTemplate;
    @Resource(name = "stringRedisTemplate")
    ValueOperations<String,String> valueOperations;
    @Resource
    RedisTemplate<Object,Object> redisTemplate;
    @Resource(name = "redisTemplate")
    ValueOperations<Object,Object> valueOperation;

    public void insertByRedis(String flag,List<Person> person){
        valueOperation.set(flag,person);
    }

    public List<Person> findByRedis(String flag){
        return (List<Person>) valueOperation.get(flag);
    }

    public void delete(String flag){
        redisTemplate.delete(flag);
    }
}
