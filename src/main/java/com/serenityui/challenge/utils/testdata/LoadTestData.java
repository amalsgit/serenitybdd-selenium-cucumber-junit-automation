package com.serenityui.challenge.utils.testdata;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Load test data from yaml file
 */
public class LoadTestData {

  public static TestDataDTO testData = new TestDataDTO();

  static {
    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    try {
      InputStream dataFile = LoadTestData.class.getClassLoader()
          .getResourceAsStream("testdata/TestData.yaml");
      testData = mapper.readValue(dataFile, TestDataDTO.class);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (JsonParseException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}



