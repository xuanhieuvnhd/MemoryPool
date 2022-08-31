public class Main {
    public static void main(String[] args) {
        Gun gun=new Gun();
        System.out.println("Bat dau");
        gun.fire();
        System.out.println("Ket thuc");
        System.out.println("Tocal dan duoc tao: " + Bullet.count);
    }
}
