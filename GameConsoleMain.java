package gameconsole ;

public class GameConsoleMain {
    public static void main(String[]args)
    {
       gameconsole console1 = new gameconsole ("Playstaion 5","Sony","November 2020",512,"PlayStation Network");
       gameconsole console2 = new gameconsole("Xbox one", "Microsoft", "November 2013", 500, "Xbox Network");
       handheldconsole console3 = new handheldconsole("Nintendo Switch", "Nintendo", "March 2017", 32, "Nintendo Switch Online", true);
       gameconsole console4 = new gameconsole("Sega Genesis", "Sega", "October 1988", 4, null);
       gameconsole console5 = new gameconsole("Atari 2600", "Atari, Inc ", "September 1977", 0,null );
       
       System.out.println("Console 1"); 
       System.out.println("Model: " + console1.getModelName());
       System.out.println("Manufacturer: " + console1.getManufacturer());
       System.out.println("ReleaseYear: " + console1.getReleaseYear());
       System.out.println("StorageCapacity: " + console1.getStorageCapacity());
       System.out.println("OnlineServices: " + console1.getOnlineServices() + "\n ");
       
       System.out.println("Console 2");
       System.out.println("Model: " + console2.getModelName());
       System.out.println("Manufacturer: " + console2.getManufacturer());
       System.out.println("ReleaseYear: " + console2.getReleaseYear());
       System.out.println("StorageCapacity: " + console2.getStorageCapacity());
       System.out.println("OnlineServices: " + console2.getOnlineServices() + "\n ");
       
       System.out.println("Console 3");
       System.out.println("Model: " + console3.getModelName());
       System.out.println("Manufacturer: " + console3.getManufacturer());
       System.out.println("ReleaseYear: " + console3.getReleaseYear());
       System.out.println("StorageCapacity: " + console3.getStorageCapacity());
       System.out.println("OnlineServices: " + console3.getOnlineServices());
       console3.playHandheldConsole() ;

       System.out.println ("\n" );
       
       System.out.println("Console 4");
       System.out.println("Model: " + console4.getModelName());
       System.out.println("Manufacturer: " + console4.getManufacturer());
       System.out.println("ReleaseYear: " + console4.getReleaseYear());
       System.out.println("StorageCapacity: " + console4.getStorageCapacity());
       System.out.println("OnlineServices: " + console4.getOnlineServices() + "\n ");
       
       System.out.println("Console 5");
       System.out.println("Model: " + console5.getModelName());
       System.out.println("Manufacturer: " + console5.getManufacturer());
       System.out.println("ReleaseYear: " + console5.getReleaseYear());
       System.out.println("StorageCapacity: " + console5.getStorageCapacity());
       System.out.println("OnlineServices: " + console5.getOnlineServices());
  
    }
}
