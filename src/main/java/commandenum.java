import java.util.HashMap;
import java.util.Map;

/**
 * @author Mr_chen
 * @date 2019-12-07
 * @Project strategy-deny-if-else
 **/
public enum commandenum {
    /**
     *
     */
    FIRST_COMMAND("1","重启应用程序","firstcommand"),
    SECOND_COMMAND("2","启动应用程序","secondcommand");

    /** 枚举值码 */
    private final String commandType;

    /** 枚举描述 */
    private final String desc;

    /**
     * 实现类
     */
    private final String clazz ;

    public String getCommandType() {
        return commandType;
    }

    public String getDesc() {
        return desc;
    }

    public String getClazz() {
        return clazz;
    }


    commandenum(String commandType, String desc, String clazz) {
        this.commandType = commandType;
        this.desc = desc;
        this.clazz = clazz;
    }
    public static Map<String,String> getAllStatusCode() {
        Map<String,String> map = new HashMap<String, String>() ;
        for ( commandenum command : values()) {
            map.put(command.getCommandType(),command.getDesc()) ;
        }
        return map;
    }

    public static Map<String,String> getAllClazz() {
        Map<String,String> map = new HashMap<String, String>() ;
        for ( commandenum command : values()) {
            map.put(command.getCommandType(),command.getClazz()) ;
        }
        return map;
    }

}
