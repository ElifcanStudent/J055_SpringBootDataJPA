package com.elifcan.j055_springbootdatajpa.service;

import com.elifcan.j055_springbootdatajpa.entity.UserProfile;
import com.elifcan.j055_springbootdatajpa.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Spring boot genellikle kendi anatosyonlatrı ile işaretlenmiş ya da miras alınmış sınıfların
 * Referanslarını üretir (Bean oluşturur. ).
 * Bu sınıf için bir nesne ayartılmasını istiyorsak, bun aspring anatasyonu eklemeliyiz.
 */
@Service
public class UserProfileService {

//    // Yöntem 1 :
//    @Autowired
//    private UserProfileRepository repository;

    // Yöntem 2 :
    private final UserProfileRepository repository;

    public UserProfileService(UserProfileRepository repository) {
        this.repository = repository;
    }


    /**
     * Dependency Injection - DI / Bağımlılıkların Enjeksiyonu
     * Spring, belli kalıplar ile ihtiyaç duyulan sınıfların nesnelerini kendi sistemi ile oluşturabilir.
     * Yani bir interface için ya da sınıf için nesne oluşturulması gerekiyor ise kendisi oluşturur ve
     * gerekli olan sınıflara enjekte eder.
     * DİKKAT!!!
     * Yukarıdaki işlemlerin gerçekleştirilmesi için gereken 2 önemli kavram var:
     *
     * 1 - Bir sınıf nasıl oluşturulur?
     * Spring ilk ayağa kalkarken, @ComponenetScan tüm sistemi tarar var kednisine ait anatosyabları olan
     * ya da miras alınmış sınıfları tarar ve tümünün bir referansını yaratır(tüm new ler) ve oluşan bir
     * referansları Application Context adı verdiği bir listenin içerisinde saklar. Bu işlem Singleton
     * olarak yürütülür. Bu sınıfların oluşturulmasında @Bean denilen bir yapıyı kullanır.
     *
     * 2 - Oluşturulan bir nesne referansı başka bir sınıfa enjekte edilir?
     * - Yöntem 1 : Bir değişken tanımlanır ve buna bir nesne referansı atanması gerektiğini  @Autowired
     * anatasyonu ile belritirsiniz. (ÖNERİLMEZ)
     * - Yöntem 2 : Dependency injection (constructor injection), eğer bir değişken final ise sınıf
     * başlatılmadan değer atanması gerekiyor.
     * Bu yöntemde ilgili sınıfın constructorına verilmesi gereken nesneyi Spring Boot otomatik olarak
     * bilir ve Apllication Contextin içinde önceden yaratmış olduğu nesnenin referansını bu sınıfa
     * enjekte eder.
     *
     */

    public void save (UserProfile userProfile) {
        repository.save(userProfile);
    }

    public List<UserProfile> getAll() {
        return repository.findAll();
    }
}
