package org.webrtc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
class Histogram {
    private final long handle;

    private Histogram(long j3) {
        this.handle = j3;
    }

    public static Histogram createCounts(String str, int i7, int i10, int i11) {
        return new Histogram(nativeCreateCounts(str, i7, i10, i11));
    }

    public static Histogram createEnumeration(String str, int i7) {
        return new Histogram(nativeCreateEnumeration(str, i7));
    }

    private static native void nativeAddSample(long j3, int i7);

    private static native long nativeCreateCounts(String str, int i7, int i10, int i11);

    private static native long nativeCreateEnumeration(String str, int i7);

    public void addSample(int i7) {
        nativeAddSample(this.handle, i7);
    }
}
