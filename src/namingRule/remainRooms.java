package namingRule;

import java.util.ArrayList;

public class remainRooms {

    public static final int EMPTY = 0;

    static void decreaseRoomsDays(ArrayList<Integer> remainDays) {
        for (int roomNum = 0; roomNum < remainDays.size(); roomNum++) {
            if (remainDays.get(roomNum) == EMPTY) continue;
            remainDays.set(roomNum, remainDays.get(roomNum) - 1);
        }
    }
}
