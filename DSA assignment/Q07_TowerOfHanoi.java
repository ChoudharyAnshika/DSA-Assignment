public class Q07_TowerOfHanoi {

    static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Tower of Hanoi with " + n + " disks:");
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}