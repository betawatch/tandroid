package org.webrtc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
