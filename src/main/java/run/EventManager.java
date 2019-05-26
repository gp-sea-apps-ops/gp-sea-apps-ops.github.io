import java.io.*;
import java.util.*;
public class EventManager {
   public static void main(String[] args) throws Exception {
      
      Map<String, Map<String, String>> Events = new HashMap<>();
   
      File f = new File("../../../../../gp-sea-apps-ops.github.io/data/calendar_data.csv");
   
      Scanner in = new Scanner(f);
      in.nextLine();
      int i = 0;
      while(in.hasNext()) {
         Map<String, String> h = new HashMap<>();
         String[] temp = in.nextLine().split(",");
         
         h.put("date", temp[0]);
         h.put("startTime", temp[1]);
         h.put("endTime", temp[2]);
         h.put("name", temp[3]);
         h.put("location", temp[4]);
         h.put("group_gp", temp[5]);
         
         Events.put("Event" + i, h);
            
         
         i++;
      }  
      for (Map h1 : Events.values()) {
         System.out.println(h1);
         
      }
      
      
   }
      
/*      
      //  1/1/2019 = tuesday   (0)
      //pre:  takes in an int in the yyyymmdd form
      //post: returns the day of the week that that is on
   public static String countDays(int value) {
      int day = value % 100;
      int month = (value / 100) % 100;
      int year = (value / 10000);
         
      Date d = new Date(year - 1900, month - 1, day);
         
      Calendar c = Calendar.getInstance();
      c.setTime(d);
      int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
         
      System.out.println(d);
         
      switch (dayOfWeek) {
         case 1:
            return "Sunday";
         case 2:
            return "Monday";
         case 3:
            return "Tuesday";
         case 4:
            return "Wednesday";
         case 5:
            return "Thursday";
         case 6:
            return "Friday";
         case 7:
            return "Satday";
      }
      return("ERROR SEE WYATT");
   }
}    
      
   
   /*
   public static class Event implements Comparable<Event>{
      private int date;
      private int startTime;
      private int endTime;
      private String name;
      private String location;
      private int group_GP;
   
   // pre  : Takes in a CSV with the data
      public Event (String data) throws Exception{
         String[] input = data.split(",");
         date = Integer.parseInt(input[0]);
         startTime = Integer.parseInt(input[1]);
         endTime = Integer.parseInt(input[2]);
         name = input[3];
         location = input[4];
         group_GP = Integer.parseInt(input[5]);
      }
      */
}
