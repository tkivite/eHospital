package eHospitalUserManagement;

import org.apache.commons.lang3.StringEscapeUtils;

public class TestHashing{

    public static void main(String args[]){

        String testStr = "< > \" & .";

        System.out.println("Original : " + testStr);

        System.out.println("Escaped : " + StringEscapeUtils.unescapeHtml4(testStr));

    }
}

