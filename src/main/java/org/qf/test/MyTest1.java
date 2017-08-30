package org.qf.test;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/29.
 */
public class MyTest1 {
    @Test
    public void test1() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException{
        List<String> list=new ArrayList<String>();
        //使用步骤：
        //1、加载配置文件
        File file=new File("src/main/resources/generatorConfig.xml");
//        E:\IdeaProjects\MyBatis-reverse\src\main\resources\generatorConfig.xml
        //2、创建解析配置文件对象
        ConfigurationParser parser=new ConfigurationParser(list);
        //3、获取配置文件对象
        Configuration configuration=parser.parseConfiguration(file);
        //4、设置是否覆盖
        DefaultShellCallback callback=new DefaultShellCallback(true);
        //5、创建自动生成对象
        MyBatisGenerator generator=new MyBatisGenerator(configuration, callback,list );
        //6、生成
        generator.generate(null);

    }
}
