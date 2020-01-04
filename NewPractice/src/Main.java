import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        //添加元素
        list.add("边坤");
        list.add("么么哒");
        list.add("改变世界");
        //判断是否包含“边坤”这个元素
        System.out.println(list.contains("边坤"));
        //把索引为0的元素移除
        list.remove(0);
        System.out.println("-----------");
        //替换索引为1的元素
        list.set(1,"爱你");
        //输出集合中所有元素
        for(int i=0;i<list.size();i++){
            String name = (String)list.get(i);
            System.out.println(name);
        }
        System.out.println("----------");
        //输出某个元素所在的索引位置
        System.out.println(list.indexOf("小龙女"));
        list.clear();
        System.out.println("----------");
        for(Object obj:list){
            String name=(String)obj;
            System.out.println(name);
        }
        System.out.println(list.isEmpty());
        System.out.println("Hello World!");
    }
}
