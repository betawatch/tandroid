package org.webrtc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new RuntimeException("Failed to get WebRTC class loader.");
    }
}
