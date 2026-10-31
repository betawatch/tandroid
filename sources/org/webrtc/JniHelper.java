package org.webrtc;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
class JniHelper {
    public static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("ISO-8859-1 is unsupported");
        }
    }

    public static Object getStringClass() {
        return String.class;
    }

    public static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
