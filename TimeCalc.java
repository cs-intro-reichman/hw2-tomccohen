public class TimeCalc {
    public static void main(String[] args) {
        String time = ("" + args[0].charAt(0) + args[0].charAt(1) + ":" + args[0].charAt(3) + args[0].charAt(4)); 
        int min2add = Integer.parseInt(args[1]);    //the input of the min to add    
        String hoursStr = "" + args[0].charAt(0) + args[0].charAt(1);
        String minStr = "" + args[0].charAt(3) + args[0].charAt(4);   
        int hours = Integer.parseInt(hoursStr);
        int minutes = Integer.parseInt(minStr);
        int totalminutes = (hours * 60) + minutes + min2add; 
        int totalhours = totalminutes / 60; // How much hours was added
        int newhours = totalhours % 24; // the new time "hh"
        int newminutes = totalminutes - (totalhours * 60); // the new time "mm"
        if (newhours < 10 && newminutes < 10)
        {
          System.out.println("0" + newhours + ":" + "0" + newminutes);  
        }
        if (newhours < 10 && newminutes >= 10)
        {
            System.out.println("0" + newhours + ":" + newminutes);
        }
        if (newminutes < 10 && newhours >= 10)
        {
            System.out.println(newhours + ":" + "0" + newminutes);
        } 
        if (newhours >= 10 && newminutes >= 10)
        {
            System.out.println(newhours + ":" + newminutes);
        }
            
        



        //System.out.println(newhours + ":" + newminutes); 1380 23

        //System.out.println("hours: " + hours);  
        //System.out.println("minutes: " + minutes);  
        //System.out.println("minutes to add: " + min2add);
        //System.out.println("new hours : " + newhours);
        //System.out.println("new minutes : " + newminutes);
    }
}
