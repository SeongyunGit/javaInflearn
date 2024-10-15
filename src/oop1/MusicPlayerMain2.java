package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicePlayerData data = new MusicePlayerData();

        on(data);

        volumeUp(data);
        volumeUp(data);

        volumeDown(data);

        showStatus(data);

        off(data);

    }
    static void on(MusicePlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicePlayerData data) {
        data.isOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicePlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " +data.volume);
    }
    static void volumeDown(MusicePlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " +data.volume);

    }
    static void showStatus(MusicePlayerData data) {
        System.out.println("음악 플레이어 상태확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " +data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
