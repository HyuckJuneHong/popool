package kr.co.popool.bblmember.service;

public interface RedisService {

    //get
    String getValue(String key);

    //create
    void createData(String key, String value);

    //delete
    void deleteData(String key);
}