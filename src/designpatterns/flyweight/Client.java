package designpatterns.flyweight;

public class Client {
    public static void main(String[] args) {
        // flyweight
        var flyweightBullet = new Bullet();
        flyweightBullet.name = "Alpha";
        flyweightBullet.maxDistance = 10;
        flyweightBullet.radius = 1;

        // object using the flyweight
        var flyingBullet = new FlyingBullet();
        flyingBullet.direction = "North";
        flyingBullet.speed = 100;
        flyingBullet.bullet = flyweightBullet;

        System.out.println("Flying Bullet: " + flyingBullet.bullet.name);
    }
}
