public class acikotopark extends Otopark{
    private static acikotopark instance;

    public static acikotopark getInstance(){
        if (instance==null){
            synchronized (acikotopark.class){
                if (instance==null){
                    System.out.println("getInstance():getInstance" +
                            " ilk kez çağrıldı!");
                    instance=new acikotopark();
                }
            }
        }
        return instance;
    }
}
