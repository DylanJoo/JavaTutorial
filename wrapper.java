public class wrapper {
    public static void main(String[] args) {
        int data1 = 10;
        int data2 = 20;

        // 使用Integer來包裏int資料，讓數字變成了物件
        Integer data1Wrapper = new Integer(100);
        Integer data2Wrapper = new Integer(200);

        // 直接除以3
        System.out.println(data1 / 3);

        // 轉為double值再除以3
        System.out.println(data1Wrapper.doubleValue() / 3);

        // 進行兩個值的比較
        System.out.println(data1Wrapper.compareTo(data2Wrapper));
    }
}
