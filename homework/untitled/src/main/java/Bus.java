import java.util.UUID;

public class Bus {
    int maxPassenger = 20;
    int cost = 1000;
    int nowPassenger;
    String busNumber;
    int oilVolume;
    int busSpeed;
    String isOperate;
    int addPassenger;

    public Bus (int oilVolume, int busSpeed, int nowPassenger ) {
        this.busNumber = UUID.randomUUID().toString();
        this.nowPassenger = nowPassenger;
        this.oilVolume = oilVolume;
        this.isOperate = "운행";
        this.busSpeed = busSpeed;
        this.maxPassenger = 20;
        this.cost = 1000;
    }

    public String getIsOperate() {
        return isOperate;
    }

    public void setIsOperate(String isOperate) {
        this.isOperate = isOperate;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNowPassenger() {
        return nowPassenger;
    }

    public void setNowPassenger(int nowPassenger) {
        this.nowPassenger = nowPassenger + addPassenger;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getOilVolume() {
        return oilVolume;
    }

    public void setOilVolume(int oilVolume) {
        this.oilVolume = oilVolume;
    }

    public int getBusSpeed() {
        return busSpeed;
    }

    public void setBusSpeed(int busSpeed) {
        this.busSpeed = busSpeed;
    }

    public void busSpeedUp(int speed) {
        int speedUp = speed;
        setBusSpeed(getBusSpeed()+speedUp);
        System.out.println(speedUp+" 만큼 속도가 증가");
    }

    public void busSpeedDown(int speed) {
        int speedDown = speed;
        if(getBusSpeed() > speedDown)
            setBusSpeed(getBusSpeed()-speedDown);
        else
            System.out.println("속도가 충분하지 않습니다.");
    }

    public void drive() {
        if (this.getOilVolume() < 10)
        {
            System.out.println("주유가 필요합니다.");
            this.setIsOperate("차고지행");
        }
        else
        {
            setOilVolume(getOilVolume() - 5);
            this.setIsOperate("운행");
            System.out.println("운행 중");
        }
    }

    public void passengerRide(int addPassenger)
    {
        if (this.getNowPassenger() >= this.getMaxPassenger() || this.getIsOperate().equals("차고지행"))
        {
            System.out.println("탑승 불가");
        }
        else if(this.getNowPassenger() < this.getMaxPassenger() && this.getIsOperate().equals("운행"))
        {
            this.setNowPassenger(addPassenger);
            System.out.println("탑승 완료");
        }
    }
}
