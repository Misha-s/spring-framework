package com.tomato.bootstrap;

import com.tomato.entity.Customer;
import com.tomato.entity.Merchant;
import com.tomato.entity.Payment;
import com.tomato.entity.PaymentDetail;
import com.tomato.enums.PaymentStatus;
import com.tomato.repository.CustomerRepository;
import com.tomato.repository.MerchantRepository;
import com.tomato.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class DataGenerator implements CommandLineRunner {
    PaymentRepository paymentRepository;
    MerchantRepository merchantRepository;
    CustomerRepository customerRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, CustomerRepository customerRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {



        Payment payment1 = new Payment(BigDecimal.valueOf(245.67), LocalDate.of(2023,12,14), PaymentStatus.COMPLETED);
        PaymentDetail paymentDetail1 = new PaymentDetail(BigDecimal.valueOf(1.09),BigDecimal.valueOf(34.56),LocalDate.of(2023,1,29));
        payment1.setPaymentDetail(paymentDetail1);

        Payment payment2 = new Payment(BigDecimal.valueOf(642.87), LocalDate.of(2022,12,12), PaymentStatus.COMPLETED);
        PaymentDetail paymentDetail2 = new PaymentDetail(BigDecimal.valueOf(3.04),BigDecimal.valueOf(64.86),LocalDate.of(2023,5,10));
        payment2.setPaymentDetail(paymentDetail2);

        Payment payment3 = new Payment(BigDecimal.valueOf(142.09), LocalDate.of(2022,12,14), PaymentStatus.COMPLETED);
        PaymentDetail paymentDetail3 = new PaymentDetail(BigDecimal.valueOf(7.12),BigDecimal.valueOf(124.38),LocalDate.of(2023,2,22));
        payment3.setPaymentDetail(paymentDetail3);

        Merchant merchant1 = new Merchant("Adidas","S231",new BigDecimal("0.77"),new BigDecimal("3.25"),1);

        Customer customer1 = new Customer("2272 Ave", "mail@gmail.com",
                "Jack","Johnson","Jackie33");

        payment1.setCustomer(customer1);
        payment2.setCustomer(customer1);
        customerRepository.save(customer1);

        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        merchantRepository.save(merchant1);



        paymentRepository.save(payment1);
        paymentRepository.save(payment2);
        paymentRepository.save(payment3);

    }
}
