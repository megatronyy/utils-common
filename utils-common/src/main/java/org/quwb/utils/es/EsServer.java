package org.quwb.utils.es;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author quwb
 * @create 2018-05-07 14:55
 * @desc
 **/
public class EsServer {
    private static final Logger logger = LoggerFactory.getLogger(EsServer.class);

    public static void main(String[] args){
        try{
            ElasticsearchUtil.init();
            ElasticsearchUtil.createindex();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
