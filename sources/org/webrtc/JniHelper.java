package org.webrtc;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
