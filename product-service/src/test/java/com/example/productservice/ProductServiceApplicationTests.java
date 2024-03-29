package com.example.productservice;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {

//    @Container
//    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//    private ObjectMapper objectMapper;
//    @Autowired
//    private ProductRepository productRepository;
//
//    @DynamicPropertySource
//    static void setProperties(DynamicPropertyRegistry dymDynamicPropertyRegistry) {
//        dymDynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//    }
//
//    @Test
//    void shouldCreateProduct() throws Exception {
//        ProductRequest productRequest = getProductRequest();
//        String productRequestString = objectMapper.writeValueAsString(productRequest);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(productRequestString))
//                .andExpect(status().isCreated());
//        Assertions.assertEquals(1, productRepository.findAll().size());
//    }
//
//    private ProductRequest getProductRequest() {
//        return ProductRequest.builder()
//                .name("iPhone 13")
//                .description("iPhone 13")
//                .price(BigDecimal.valueOf(1200))
//                .build();
//    }

}