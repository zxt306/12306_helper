package com.tzx.test.text;

import junit.framework.TestCase;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 18:13
 **/
public class TextAnalysisTest extends TestCase{

    public void testAnalysis(){
        String resultRow = "7kkcyMVvdquET1jRdgT%2BnFoMHySVpmq0vATxV4lTso8g7wJI8X%2FWWWY%2Bch4A1lxFGFl9pTQdaK4j%0ACiqVaYUrXuNWR%2BiLKagKWKY48j4vokcP7fS0yYBe9E7xvQM8gJHbbQNvTlSoANqCEV8v3Vjw42%2FH%0AShORrIRMKfP6qDNZLUDz7bI%2F6%2BipGCYONNY89BDMuBP2lxA%2BMS%2BT5DC44ALB2zU0T1FxuGL3Oyay%0A9yROq%2BHZeVwXXzjjWQ%3D%3D|预订|4e000C563300|C5633|WHN|KAN|WHN|GNN|08:24|08:42|00:18|Y|jq2ILCeZ4cnvSekey7kSbg4Ira%2FluaW6LwZ3JW0xwPvCM60I%2F5oIN%2FhyTS4%3D|20170919|3|N2|01|02|0|0|||||||有||||有|有|20||O090M0O0|O9MO";
        String[] rows = resultRow.split("\\|");
        System.out.println(rows.length);
    }
}
