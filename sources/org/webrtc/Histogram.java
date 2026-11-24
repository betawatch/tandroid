package org.webrtc;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
