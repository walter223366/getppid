package service.impl;

import service.TestService;

/**
 * @author walte
 * @category 业务板块/方向分类/类中文名称
 * @Date 2018年12月11日
 */
public class TestServiceImpl implements TestService {

    @Override
    public String hello(String name) {
        for(int i=0;i<100;i++){
            try {
                System.out.println(name);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return name+"OK";
    }
}
