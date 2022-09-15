package SqList;

public class TestSqList {
    public static void main(String[] args) {
        SqList sqList = new SqList(10);
        sqList.sqlist[0] = 1;
        sqList.sqlist[1] = 2;
        sqList.sqlist[2] = 3;
        sqList.sqlist[3] = 4;
        sqList.sqlist[4] = 5;
        sqList.sqlist[5] = 6;
        System.out.println(sqList.getSize());
        sqList.insertElem(7,7);
        System.out.println(sqList.getSize());
        //sqList.insertElem(2,"你好呀世界");
        System.out.println(sqList.getSize());
        //sqList.removeElem(2);
        System.out.println(sqList.getSize());

        for(Object res :sqList.sqlist){
            System.out.println(res);
        }
    }
}
