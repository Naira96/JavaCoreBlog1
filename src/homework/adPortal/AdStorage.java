package homework.adPortal;

import homework.adPortal.models.Ad;
import homework.adPortal.models.Category;
import homework.adPortal.models.User;

public interface AdStorage {
    void add(Ad ad);

    void printMyAds(User user);

    void printAllAds();

    void printByCategory(Category category);

    void deleteMyAds(User user);

    void deleteAdByTitle(String title, User currentUser);
}
