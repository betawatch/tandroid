package org.webrtc;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
