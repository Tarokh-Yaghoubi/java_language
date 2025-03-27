package Classes;

// Writing some test code for the sake of practice and testing


import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Payment {

    private HashMap<String, String> isoDetails = new HashMap<String, String>();

    public Payment(HashMap<String, String> map) {
        this.setHashMapData(map);
    }

    // default constructor
    public Payment() {

    }


    public void setHashMapData(@NotNull HashMap<String, String> map_data) {
        if (map_data.isEmpty()) {
            System.out.println("map_data is null -> ");
            return;
        }

        isoDetails.put("merchantName", map_data.get("merchantName"));
        isoDetails.put("merchantId", map_data.get("merchantId"));
        isoDetails.put("pan", map_data.get("pan"));

    }

    public void sendData() {
        System.out.println("Sending Data -> ");
        for (var value : isoDetails.values())
            System.out.println("-> " + value);
    }
}
