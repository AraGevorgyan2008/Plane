import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int coUnt = 0 ;
    private static int cv = 7 ;
    private static  int COUNT = 0;
    private static int TELETRAMP;
    private static int t;
    private static int res;
    private static List<Plane> list;
    private static List<Plane> pllist;
    private static List<Integer> p = new ArrayList<>();
    private static List<Integer> ss = new ArrayList<>();
    private static String ed = "";

    private static void freeteletramp (String time){
        List<Integer> integers = new ArrayList<>();
        for (int i = 0 ; i < list.size() ; i++){
            if (list.get(i).getTime().equals(time)) {
                integers.add(list.get(i).getTeletramp());
                cv ++ ;
            }
        }
        Collections.sort(integers);

        if (coUnt == 0){
            TELETRAMP = 1 ;
            integers.add(TELETRAMP);
            coUnt++;
        }
        if (integers.size() == 1 && cv == 8){
                integers.add(integers.get(0) + 1);
                TELETRAMP = integers.get(0) + 1;
        }else {
            for (int i = 0; i < integers.size() - 1; i++) {

                if (integers.get(0) != 1) {
                    TELETRAMP = 1;
                }
                if (integers.get(i) + 1 != integers.get(i + 1)) {
                    TELETRAMP = integers.get(i) + 1;
                } else {
                    TELETRAMP = integers.get(i + 1) + 1 ;
                    if (TELETRAMP > 4){
                        System.out.println("Ayd jamin azat teletramp chka pordzeq 30 rope kam 1 jam avel dnel jam@");
                        addPlane();
                    }
                    }

            }
        }

    }
    private static void addPlane() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nermuceq ID");
        int id = in.nextInt();
        System.out.println("Nermuceq time");
        String time = in.next();
        freeteletramp(time);
        System.out.println("Nermuceq teletramp" + "\n" + TELETRAMP);
        System.out.println("Nermuceq day");
        int day = in.nextInt();
        System.out.println("Nermuceq mount");
        int mount = in.nextInt();
        System.out.println("Nermuceq year");
        int year = in.nextInt();
        System.out.println("Nermuceq arriving(true)_or_departing(false)");
        boolean arriving_or_departing = in.nextBoolean();
        System.out.println("Nermuceq proitet 1-5");
        int proitet = in.nextInt();
        list.add(new Plane(id, TELETRAMP, time, day, mount, year, arriving_or_departing, proitet));
        System.out.println("Uzum eq krkin nermucel ete ayo greq 0 ete voch greq 1");
        int w = in.nextInt();
        if (w == 0) {
            addPlane();
        }


        }
private static void removePlane(int id){
        list.remove(id);
}
private static void freeteletramptime(){
        List<Integer> qw = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
        qw = new ArrayList<>();
        String[] split = list.get(i).getTime().split(":");
        int num1 = Integer.parseInt(split[0]) * 60;
        int num2 = Integer.parseInt(split[1]);
        int res = num1 + num2;
        for (int j = 0; j < list.size(); j++){
            String[] split1 = list.get(j).getTime().split(":");
            int num11 = Integer.parseInt(split1[0]) * 60;
            int num21 = Integer.parseInt(split1[1]);
            int result = num11 + num21;
            if (result == res){
                qw.add(res);
            }
        }
        if (qw.size() != 4){
            String i1 = String.valueOf(res / 60);
            String i2 = String.valueOf(res - (Integer.parseInt(i1) * 60));
            String nm = i1 + ":" + i2;
            System.out.println( nm + " ays jamin azat teletramp ka" );
            break;
        }
    }
}
private static  void freeteletrampdipositorytime(String t1,String t2){
        List<String> ass = new ArrayList<>();
    String[] sp = t1.split(":");
    int n1 = Integer.parseInt(sp[0]) * 60;
    int n2 = Integer.parseInt(sp[1]);
    int res = n1 + n2;

    String[] sp1 = t2.split(":");
    int n11 = Integer.parseInt(sp1[0]) * 60;
    int n22 = Integer.parseInt(sp1[1]);
    int res1 = n11 + n22;
    ass = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
        String[] split = list.get(i).getTime().split(":");
        int num1 = Integer.parseInt(split[0]) * 60;
        int num2 = Integer.parseInt(split[1]);
        int result = num1 + num2;
        if (result >= res && result <= res1 ){
            String i1 = String.valueOf(result / 60);
            String i2 = String.valueOf(result - (Integer.parseInt(i1) * 60));
            String nm = i1 + ":" + i2;
            ass.add(nm);
        }
    }
    if (ass != null || ass.size() != 0 ) {
        System.out.println(ass.get(0));
    }else {
        System.out.println("Ayd jameri minchev azat teletramp chka");
    }
}

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add(new Plane(0, 1, "9:00", 21, 5, 2024, true, 1));
        list.add(new Plane(1, 1, "9:30", 21, 5, 2024, false, 5));
        list.add(new Plane(2, 3, "8:30", 21, 5, 2024, false, 4));
        list.add(new Plane(3, 4, "9:30", 21, 5, 2024, true, 2));
        list.add(new Plane(4, 2, "9:00", 21, 5, 2024, false, 3));
        list.add(new Plane(5, 4, "9:00", 21, 5, 2024, false, 5));
        list.add(new Plane(6, 2, "9:00", 21, 5, 2024, true, 2));
        list.add(new Plane(7, 4, "8:30", 21, 5, 2024, true, 2));
        list.add(new Plane(8, 2, "9:30", 21, 5, 2024, false, 1));
        list.add(new Plane(9, 3, "9:30", 21, 5, 2024, true, 4));
        list.add(new Plane(10, 2, "10:00", 21, 5, 2024, true, 2));
        list.add(new Plane(11, 4, "10:00", 21, 5, 2024, true, 2));
        list.add(new Plane(12, 1, "10:00", 21, 5, 2024, false, 1));
        list.add(new Plane(13, 3, "10:00", 21, 5, 2024, true, 4));
        list.add(new Plane(14, 2, "10:30", 21, 5, 2024, true, 2));
        list.add(new Plane(15, 4, "10:30", 21, 5, 2024, true, 2));
        list.add(new Plane(16, 1, "10:30", 21, 5, 2024, false, 1));
        list.add(new Plane(17, 3, "10:30", 21, 5, 2024, true, 4));

        list.sort(new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }

    });
        for (int i = 0; i < list.size(); i++) {
            p.add(list.get(i).getId());
        }
        List<Plane> planedelay = Planedelay(list, 7, 30);
        System.out.println(planedelay);

    }
private static void freeteletramp(List<Plane> lp,int time){
        ss = new ArrayList<>();
    for (int i = 0; i < lp.size(); i++) {
        String[] split = lp.get(i).getTime().split(":");
        int i1 = Integer.parseInt(split[0]) * 60;
        int i2 = Integer.parseInt(split[1]);
        int num = i1 + i2 ;
        if (time == num){
            ss.add(lp.get(i).getTeletramp());
        }
    }
}
    public static List<Plane> Planedelay(List<Plane> plane, int id, int delay) {
        pllist = new ArrayList<>();
        String time1 = plane.get(id).getTime();
        String[] split = time1.split(":");
        int num1 = Integer.parseInt(split[0]) * 60;
        int num2 = Integer.parseInt(split[1]);
        int res = num1 + num2 + delay;
        for (int i = 0; i <= plane.size() - 1; i++) {
            if (i != id) {
                String[] split1 = plane.get(i).getTime().split(":");
                int n1 = Integer.parseInt(split1[0]) * 60;
                int n2 = Integer.parseInt(split1[1]);
                int r = n1 + n2 ;
                if (res == r ) {
              /*     freeteletramp(plane,res);
                   if (ss.size() >= 4){
                       res += 30 ;
                       freeteletramp(plane,res);
                   }else {
                       pllist.add(new Plane(plane.get(i).getId(), plane.get(i).getTeletramp(), plane.get(i).getTime(), plane.get(i).getDay(), plane.get(i).getMount(), plane.get(i).getYear(), plane.get(i).getArriving_or_departing(), plane.get(i).getProitet()));
                   }*/
                    pllist.add(new Plane(plane.get(i).getId(), plane.get(i).getTeletramp(), plane.get(i).getTime(), plane.get(i).getDay(), plane.get(i).getMount(), plane.get(i).getYear(), plane.get(i).getArriving_or_departing(), plane.get(i).getProitet()));

                } else {
                    pllist.add(new Plane(plane.get(i).getId(), plane.get(i).getTeletramp(), plane.get(i).getTime(), plane.get(i).getDay(), plane.get(i).getMount(), plane.get(i).getYear(), plane.get(i).getArriving_or_departing(), plane.get(i).getProitet()));

                }
            } else {
                String[] split1 = plane.get(i).getTime().split(":");
                int n1 = Integer.parseInt(split1[0]) * 60;
                int n2 = Integer.parseInt(split1[1]);
                 t = n1 + n2 + delay;
                int q = t;
                String i1 = String.valueOf(t / 60);
                String i2 = String.valueOf(q - (Integer.parseInt(i1) * 60));
                String nm = i1 + ":" + i2;

                freeteletramp(plane,res);
                Collections.sort(ss);

                    recplaneteletramp(res,plane,t,i,nm);



            }
        }
        pllist.sort(new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                return Integer.compare(o1.getId(),o2.getId());
            }
        });

        return pllist;

    }

    private static List<Plane> proitettest(List<Integer> list,int e) {
        int max = 0 ;
        int min = list.get(0);
        int q = 0 ;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < pllist.size(); j++) {
                String[] split = pllist.get(j).getTime().split(":");
                int i1 = Integer.parseInt(split[0]) * 60;
                int i2 = Integer.parseInt(split[1]);
                int num = i1 + i2 ;
             if (pllist.get(j).getProitet() > min && e == num){
               q = j;
               max = pllist.get(j).getProitet();
}
            }
min = max;
        }
        ed = pllist.get(q).getTime();
        String[] split = pllist.get(q).getTime().split(":");
        int i1 = Integer.parseInt(split[0]) * 60;
        int i2 = Integer.parseInt(split[1]);
        int num = i1 + i2 + 30 ;
        String i11 = String.valueOf(num / 60);
        String i22 = String.valueOf(num - (Integer.parseInt(i11) * 60));
        String nm = i11 + ":" + i22;
        pllist.get(q).setTime(nm);
        return pllist;
                }
     private  static  void recplaneteletramp(int sw,List<Plane> plane,int e, int i,String nm){
        t = e ;
        res = sw ;
         if (ss.size() == 4) {
             res += 30 ;
             freeteletramp(plane,res);
             Collections.sort(ss);
             if (ss.size() == 4) {
                 t = t + 30;
                 proitettest(ss,t);
                 if(COUNT == 0) {
                     pllist.add(new Plane(plane.get(i).getId(), plane.get(i).getTeletramp(), ed, plane.get(i).getDay(), plane.get(i).getMount(), plane.get(i).getYear(), plane.get(i).getArriving_or_departing(), plane.get(i).getProitet()));
                   COUNT++;
                 }
                     recplaneteletramp(res, plane, t, i, nm);

             }else {
                 for (int f = 0; f < ss.size() - 1; f++) {
                     if (ss.get(0) != 1) {
                         pllist.add(new Plane(plane.get(i).getId(), 1, nm, plane.get(i).getDay(), plane.get(i).getMount(), plane.get(i).getYear(), plane.get(i).getArriving_or_departing(), plane.get(i).getProitet()));
                         break;
                     } else if (ss.get(f) + 1 != ss.get(f + 1)) {
                         pllist.add(new Plane(plane.get(i).getId(), ss.get(f) + 1, plane.get(i).getTime(), plane.get(i).getDay(), plane.get(i).getMount(), plane.get(i).getYear(), plane.get(i).getArriving_or_departing(), plane.get(i).getProitet()));
                         break;
                     }

                 }
             }
         } else {
             for (int f = 0; f < ss.size() - 1; f++) {
                 if (ss.get(0) != 1) {
                     pllist.add(new Plane(plane.get(i).getId(), 1, nm, plane.get(i).getDay(), plane.get(i).getMount(), plane.get(i).getYear(), plane.get(i).getArriving_or_departing(), plane.get(i).getProitet()));
                     break;
                 } else if (ss.get(f) + 1 != ss.get(f + 1)) {
                     pllist.add(new Plane(plane.get(i).getId(), ss.get(f) + 1, plane.get(i).getTime(), plane.get(i).getDay(), plane.get(i).getMount(), plane.get(i).getYear(), plane.get(i).getArriving_or_departing(), plane.get(i).getProitet()));
                     break;
                 }

             }

         }
     }

    }

