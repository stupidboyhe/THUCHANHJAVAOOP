package getterANDsetter;

public class HinhTron {
    private final float PI=3.14f;
    private float banKinh;

    public float getBanKinh(){
        return banKinh;
    }

    public void setBanKinh(float banKinh){
        this.banKinh = banKinh;
    }

    public float tinhcv(){
        return 2*PI*banKinh;
    }

    public float tinhdt(){
        return PI*banKinh*banKinh;
    }
}
