package StructuralDesignPatterns.ProxyDesignPattern.InternetAccessControl;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet{

    private IInternet internet;
    private static List<String> bannedSites;


    static{
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook");
        bannedSites.add("instagram");
        bannedSites.add("whatsapp");
        bannedSites.add("snapchat");

    }

    @Override
    public void connectTo(String site) throws Exception {
        if(internet==null){
            internet = new RealInternet();
        }
        if(bannedSites.contains(site.toLowerCase())){
            throw new Exception("Access denied: cannot access the site "+site);
        }
        internet.connectTo(site);
    }
    
}
