import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author Mr_chen
 * @date 2019-12-07
 * @Project strategy-deny-if-else
 **/
public class NewCommandMain {
    /**
     * main 用的是反射模式
     * @param args
     */
    public static void main(String [] args){

        if(args.length < 1){
            System.out.println("error args:");
            return;
        }
        Map<String, String> allClazz = commandenum.getAllClazz();
        String clazz = allClazz.get(args[0]);
        command abcommand = null;

        try {
            if (StringUtils.isEmpty(clazz)){
                clazz = firstcommand.class.getName() ;
            }
//            innerCommand = (InnerCommand) SpringBeanFactory.getBean(Class.forName(clazz));
            //通过类名生成实例对象并将其返回
            Class c=Class.forName(clazz);
            abcommand =(command) c.newInstance();
            abcommand.process(args[0]);
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}
