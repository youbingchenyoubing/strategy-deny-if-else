/**
 * @author Mr_chen
 * @date 2019-12-07
 * @Project strategy-deny-if-else
 **/
public class CommandMain {

    public static  void main(String [] args){

        if(args.length < 1){
            System.out.println("error args:");
            return;
        }

        if(args[0] == "1"){
            /*
            *
            * 业务逻辑或者算法逻辑 里面逻辑可以复杂，我这里只用一个最简单的代码替换成复杂代码
            * */

            System.out.println("first command："+ args[0]);
        }
        else if("2" == args[0]){
            /*
            *
            * 业务逻辑或者算法逻辑 里面逻辑可以复杂，我这里只用一个最简单的代码替换成复杂代码
             */
            System.out.println("second command："+ args[0]);
        }
        /**
         * ........ more than two if else ,one day you want you make
         * your soft more stronger ,you have to add some new command in here.
         */

    }
}
