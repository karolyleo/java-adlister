package adLister;

//Temp:
import java.util.List;
import java.sql.SQLException;


public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }


//    This is for migration
//    public static void main(String[] args) throws SQLException {
//        MySQLAdsDao test = new MySQLAdsDao();
//        adsDao = new ListAdsDao();
//        List<Ad> ads = adsDao.all();
//        for(Ad ad: ads) {
//            test.insert(ad);
//        }
//    }
}
