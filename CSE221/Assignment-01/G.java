import java.util.Scanner;
import java.util.Arrays;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] id = new int[N];
        int[] mark = new int[N];
        for (int i = 0; i < N; i++) id[i] = sc.nextInt();
        for (int i = 0; i < N; i++) mark[i] = sc.nextInt();
        Student[] students = new Student[N];
        for (int i = 0; i < N; i++) {
            students[i] = new Student(id[i], mark[i], i);
        }
        Arrays.sort(students, (a, b) -> {
            if (a.mark != b.mark) return b.mark - a.mark;
            return a.id - b.id;
        });
 
        int[] pos = new int[N];
        for (int i = 0; i < N; i++) {
            pos[students[i].originalIndex] = i;
        }
        boolean[] visited = new boolean[N];
        int minSwaps = 0;
 
        for (int i = 0; i < N; i++) {
            if (visited[i] || pos[i] == i) continue;
 
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = pos[j];
                cycleSize++;
            }
            minSwaps += (cycleSize - 1);
        }
        System.out.println("Minimum swaps: " + minSwaps);
        for (Student s : students) {
            System.out.println("ID: " + s.id + " Mark: " + s.mark);
        }
    }
    static class Student {
        int id, mark, originalIndex;
        Student(int id, int mark, int index) {
            this.id = id;
            this.mark = mark;
            this.originalIndex = index;
        }
    }
}
