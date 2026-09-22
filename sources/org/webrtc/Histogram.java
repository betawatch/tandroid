package org.webrtc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
class Histogram {
    private final long handle;

    private Histogram(long j3) {
        this.handle = j3;
    }

    public static Histogram createCounts(String str, int i10, int i11, int i12) {
        return new Histogram(nativeCreateCounts(str, i10, i11, i12));
    }

    public static Histogram createEnumeration(String str, int i10) {
        return new Histogram(nativeCreateEnumeration(str, i10));
    }

    private static native void nativeAddSample(long j3, int i10);

    private static native long nativeCreateCounts(String str, int i10, int i11, int i12);

    private static native long nativeCreateEnumeration(String str, int i10);

    public void addSample(int i10) {
        nativeAddSample(this.handle, i10);
    }
}
