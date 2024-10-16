package access.ex;

public class MaxCounter {
    private int count;
    public int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (!isValid()) {
            System.out.println("최댓값을 출력할 수 없습니다.");
            return;
        }
        count++;

    }
    public int getCount() {
        return count;
    }

    private boolean isValid() {
        if (count>=max) {
            return false;
        }
        return true;
    }

}
