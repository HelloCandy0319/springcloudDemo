package com.example.redisdemo;


import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class RedisObjectSerializer implements RedisSerializer<Object> {

    private Converter<Object, byte[]> serilazier = new SerializingConverter();
    private Converter<byte[], Object> deserilazier = new DeserializingConverter();
    private static final byte[] EMPTY_ARRAY = new byte[0];
    //将对象序列化为字节数组
    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if (null==o){
            return EMPTY_ARRAY;
        }
       try {
           return serilazier.convert(o);
       }catch (Exception e){
           return EMPTY_ARRAY;
       }
    }


    //   将字节数组反列化成对象，序列化失败返回null
    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
            if (isEmpty(bytes))
                return null;
            try {
                return deserilazier.convert(bytes);
            }catch (Exception e){
                return null;
            }
    }

    private static boolean isEmpty(byte[] data){
        if (data ==null || data.length==0 ){
            return true;
        }
        return false;
    }
}
