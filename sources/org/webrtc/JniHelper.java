package org.webrtc;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class JniHelper {
    public static Object getKey(Map.Entry<?, ?> entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(String str) {
        return str.getBytes(StandardCharsets.ISO_8859_1);
    }

    public static Object getStringClass() {
        return String.class;
    }

    public static Object getValue(Map.Entry<?, ?> entry) {
        return entry.getValue();
    }
}
