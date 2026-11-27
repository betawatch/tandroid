package org.webrtc;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
