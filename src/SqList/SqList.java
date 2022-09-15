package SqList;

public class SqList {
    public SqList(int maxSize) {
        this.maxSize = maxSize;
        sqlist = new Object[this.maxSize];
    }
    int maxSize;
    int size = 6;
    Object[] sqlist;

    /**
     * 在指定位置上插入元素
     * @param index
     * @param obj
     */
    public void insertElem(int index,Object obj){
        if(index < 0 || index>maxSize){
            throw new RuntimeException("插入元素越界");
        }
        if(index > getSize() && index < maxSize){
            sqlist[index-1] = obj;
            size++;
            return;
        }
        for(int i=getSize()-1;i>=index-1;i--){
            sqlist[i+1] = sqlist[i];
        }
        sqlist[index-1] = obj;
        size++;
    }

    public String removeElem(int index){
        String flag = "";
        for(int i=index-1;i<=getSize()-1;i++){
            sqlist[i] = sqlist[i+1];
        }
        size--;
        return flag;

    }

    /**
     * 统计数组中元素的个数
     * @return
     */
    public int getSize(){

        return size;
    }

}
