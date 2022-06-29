import java.util.UUID;

public class Taxi {
    int oilVolume;  // 기름 양
    int cost;       // 요금
    String destination;// 목적지
    int moreCost;   // 추가 요금
    int basicDistance; // 기본 거리
    int nowSpeed; //현재 속도
    int destinationDistance; // 목적지까지 거리
    String taxiNumber; //택시번호
    String isOperate; //운행 상태

    Taxi(int oilVolume, String destination, int nowSpeed, int destinationDistance)
    {
        this.taxiNumber = UUID.randomUUID().toString();
        this.oilVolume = oilVolume;
        this.destination = destination;
        this.nowSpeed = nowSpeed;
        this.destinationDistance = destinationDistance;
        this.cost = 3000;
        this.moreCost = 100;
        this.basicDistance = 0;
        this.isOperate = "일반";
    }

    public int getOilVolume() {
        return oilVolume;
    }

    public void setOilVolume(int oilVolume) {
        this.oilVolume = oilVolume;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getMoreCost() {
        return moreCost;
    }

    public void setMoreCost(int moreCost) {
        this.moreCost = moreCost;
    }

    public int getBasicDistance() {
        return basicDistance;
    }

    public void setBasicDistance(int basicDistance) {
        this.basicDistance = basicDistance;
    }

    public int getNowSpeed() {
        return nowSpeed;
    }

    public void setNowSpeed(int nowSpeed) {
        this.nowSpeed = nowSpeed;
    }

    public int getDestinationDistance() {
        return destinationDistance;
    }

    public void setDestinationDistance(int destinationDistance) {
        this.destinationDistance = destinationDistance;
    }

    public String getTaxiNumber() {
        return taxiNumber;
    }

    public void setTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public String getIsOperate() {
        return isOperate;
    }

    public void setIsOperate(String isOperate) {
        this.isOperate = isOperate;
    }

    public void drive() {
        if(this.oilVolume < 10)
        {
            this.setIsOperate("탑승 불가");
            System.out.println("주유가 필요합니다.");
        }
        else
        {
            setOilVolume(getOilVolume() - 5);
            this.setIsOperate("운행 중");
            System.out.println("운행 중 입니다.");
        }
    }
    public void destinationDistance() {
        setCost( getCost() + getMoreCost() * getDestinationDistance());
        System.out.println("요금은 "+getCost()+ " 입니다.");
    }
    public void pay() {
        int allCost = getCost() + getMoreCost() * getDestinationDistance();
        System.out.println("요금은 "+allCost+" 원 입니다.");
        setCost(0);
    }
    public void taxiSpeedUp(int speed) {
        int speedUp = speed;
        setNowSpeed(getNowSpeed()+speedUp);
        System.out.println(speedUp+" 만큼 속도가 증가");
    }

    public void taxiSpeedDown(int speed) {
        int speedDown = speed;
        if(getNowSpeed() > speedDown)
        {
            setNowSpeed(getNowSpeed() - speedDown);
            System.out.println(speedDown + " 만큼 속도가 감소");
        }
        else
            System.out.println("속도가 충분하지 않습니다.");
    }

    public void ridePassenger() {
        setIsOperate("운행");
        System.out.println("운행 중 입니다. 탑승 불가");
    }
    public void unloadPassenger() {
        setIsOperate("일반");
        System.out.println("탑승 가능");
    }
}
