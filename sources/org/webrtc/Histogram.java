package org.webrtc;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
class Histogram {
    private final long handle;

    private Histogram(long j) {
        this.handle = j;
    }

    public static Histogram createCounts(String str, int i, int i2, int i3) {
        return new Histogram(nativeCreateCounts(str, i, i2, i3));
    }

    public static Histogram createEnumeration(String str, int i) {
        return new Histogram(nativeCreateEnumeration(str, i));
    }

    private static native void nativeAddSample(long j, int i);

    private static native long nativeCreateCounts(String str, int i, int i2, int i3);

    private static native long nativeCreateEnumeration(String str, int i);

    public void addSample(int i) {
        nativeAddSample(this.handle, i);
    }
}
