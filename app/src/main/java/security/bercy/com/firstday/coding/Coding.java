package security.bercy.com.firstday.coding;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Bercy on 11/28/17.
 */

public class Coding {


    public static void main(String[] args) {
        String[] s = {"abc","bb","abc","cc","bb"};
        System.out.println(checkDuplicates(s));
    }


    private static List<String> checkDuplicates(String[] s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>();
        for (String words : s) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                map.put(words,map.getOrDefault(words,0)+1);
            }
        }
        for(Map.Entry<String, Integer> stringIntgerMap : map.entrySet()) {
            if(stringIntgerMap.getValue()!=1) {
                list.add(stringIntgerMap.getKey());
            }
        }



        return list;
    }
}
