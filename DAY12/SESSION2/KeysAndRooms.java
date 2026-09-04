package DAY12.SESSION2;

import java.util.*;

public class KeysAndRooms {

    public boolean canOpen(List<List<Integer>> rooms){
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        //start
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int curren = q.poll();
            for(int key : rooms.get(curren)){
                if(!visited[key]){
                    visited[key] = true;
                    q.offer(key);
                }
            }
        }
        for(boolean room : visited){
            if(!room) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        KeysAndRooms solution = new KeysAndRooms();
        
        // Test case 1: Can open all rooms
        List<List<Integer>> rooms1 = new ArrayList<>();
        rooms1.add(Arrays.asList(1));
        rooms1.add(Arrays.asList(2));
        rooms1.add(Arrays.asList(3));
        rooms1.add(Arrays.asList());
        System.out.println("Test 1 - Can open all rooms: " + solution.canOpen(rooms1));
        
        // Test case 2: Cannot open all rooms
        List<List<Integer>> rooms2 = new ArrayList<>();
        rooms2.add(Arrays.asList(1, 3));
        rooms2.add(Arrays.asList(3, 0, 1));
        rooms2.add(Arrays.asList(2));
        rooms2.add(Arrays.asList(0));
        System.out.println("Test 2 - Can open all rooms: " + solution.canOpen(rooms2));
        
        // Test case 3: Single room
        List<List<Integer>> rooms3 = new ArrayList<>();
        rooms3.add(Arrays.asList());
        System.out.println("Test 3 - Single room: " + solution.canOpen(rooms3));
    }
    
}
