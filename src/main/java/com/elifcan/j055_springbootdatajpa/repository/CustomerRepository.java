package com.elifcan.j055_springbootdatajpa.repository;

import com.elifcan.j055_springbootdatajpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
    /**
     * Özelleştiirlmiş sorgu yazacağız
     * Interface içerisine method gövdesi yazılmaz. Bu nedenle Spring kendi yapısına uygun
     * şekilde geliştirmiş olduğu  TERSINE MUHENDISLIK yapısı sayesinde sorgu yazmanızı kolaylaştırır.
     * Sadece methodun tanımınu yaparak sorgu oluşturabiliyorsunuz.
     *
     * Spring Data ile Sorgu oluşturma
     * 1 - *find(arama) / count(sayac) / exist(var mı)
     * 1.1 - Optional; optional, all, top
     * 2 - By : neye göre arama, sayma, varlık-yokluk kontrol etme
     * 3 - [Entity -> Değişken Adı] : hangi entitye ait repository de işlem yapıyorsanız onun
     * içersindeki değişken adlarını ekliyoruz.
     * 4 - Eğer birden fazla sorgulama kriteri var ise,
     * 4.1 - And, Or diye devam edilir.
     * 4.2 - [Entity -> değişken]
     * method adı oluşturulduktan sonra methodun alacağı parametreler değişken olarak yazılır.
     */

    // select * from tblcustomer where name = ?
    List<Customer> findAllByName(String name);

    // List<Customer>
}
