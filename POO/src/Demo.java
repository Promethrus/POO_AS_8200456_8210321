import estg.ipp.pt.tp02_conferencesystem.dashboards.Dashboard;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Demo {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", 100);

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

        t




        String arr[] = new String[2];
        arr[0] = "{type:'bar',data:{labels:[2012,2013,2014,2015,2016],datasets:[{label:'Users',data:[120,60,50,180,120]}]}}";
        //arr[2] = "123";
        //arr[3] = "ok";
        //arr[4] = "1";
        arr[1] = "{\n" +
                " \"type\":\"bar\"," +
                " \"data\":{" +
                " \"labels\":[" +
                " \"NUNO\"," +
                " \"AFONSO\"," +
                " \"Q3\"," +
                " \"Q4\"" +
                " ],\n" +
                " \"datasets\":[" +
                " {\n" +
                " \"label\":\"Users\"," +
                " \"data\":[" +
                " 69," +
                " 0," +
                " 70," +
                " 180" +
                " ]" +
                " }," +
                " {" +
                " \"label\":\"Revenue\"," +
                " \"data\":[" +
                " 100," +
                " 200," +
                " 300," +
                " 400" +
                " ]" +
                " }" +
                " ]" +
                " }" +
                "}";
        Dashboard.render(arr);
    }
}
