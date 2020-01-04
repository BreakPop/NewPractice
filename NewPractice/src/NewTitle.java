import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class NewTitle {
    private int id;
    private String titleName;
    private String creater;
    //构造方法
    public NewTitle(int id,String titleName,String creater){
        this.id=id;
        this.titleName=titleName;
        this.creater=creater;

    }
    //输出新闻标题方法
    public String getTitleName() {

        return titleName;
    }
    //遍历集合的指定元素
    public static void print(List<NewTitle> newTitleList){
        for (int i=0;i<newTitleList.size();i++){
            NewTitle title = newTitleList.get(i);
            System.out.println(title.getTitleName());
        }
    }

    public static void main(String[] args){
        //创建新闻标题对象
        NewTitle car =new NewTitle(1,"汽车","管理员");
        NewTitle test =new NewTitle(2,"高考","管理员");
        //创建储存新闻标题的集合对象
        List newTitleList = new ArrayList();
        //按照顺序依次添加新闻标题
        newTitleList.add(car);
        newTitleList.add(test);
        //获取新闻标题总数
        System.out.println("新闻标题的数目为"+newTitleList.size()+"条");
        //遍历集合对象
        System.out.println("新闻标题为：");
        for (Object obj:newTitleList){
            NewTitle title = (NewTitle)obj;
            System.out.println(title.getTitleName());

        }


    }
}

