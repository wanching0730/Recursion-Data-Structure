public class TowerOfHanoi {
    public static void main (String[] args) {
        moveDisk(3, 'A', 'B', 'C');
    }

    public static void moveDisk(int n, char fromTower, char toTower, char auxTower) {
        if(n == 1)
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisk(n-1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisk(n-1, auxTower, toTower, fromTower);
        }
    }
}
