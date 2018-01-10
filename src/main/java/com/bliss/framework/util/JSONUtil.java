/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bliss.framework.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import org.apache.commons.lang3.StringUtils;
import org.apache.thrift.protocol.TJSONProtocol;

/**
 *
 * @author huynxt
 */
public class JSONUtil {

    public static final Gson json = new Gson();

    public static String Serialize(Object value) {
        return json.toJson(value);
    }

    public static <T extends Object> T DeSerialize(String value, Type typeOfT) {

        T result = json.fromJson(value, typeOfT);

        return result;
    }

    public static String getString(JsonObject obj, String member) {
        JsonElement elem = obj.get(member);
        if (elem != null && !elem.isJsonNull()) {
            return elem.getAsString();
        }
        return StringUtils.EMPTY;
    }

    public static int getInt(JsonObject obj, String member) {
        JsonElement elem = obj.get(member);
        if (elem != null && !elem.isJsonNull()) {
            return elem.getAsInt();
        }        
        
        return 0;
    }
}
