package com.example.demo;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;

public class ProductPageTest {
    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
    }

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://vk.com/club225299895?w=product-225299895_10044406");
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(1_000);
    }
}
