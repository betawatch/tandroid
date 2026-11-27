package org.webrtc;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
