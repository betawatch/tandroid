package org.webrtc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
class Histogram {
    private final long handle;

    private Histogram(long j10) {
        this.handle = j10;
    }

    public static Histogram createCounts(String str, int i3, int i10, int i11) {
        return new Histogram(nativeCreateCounts(str, i3, i10, i11));
    }

    public static Histogram createEnumeration(String str, int i3) {
        return new Histogram(nativeCreateEnumeration(str, i3));
    }

    private static native void nativeAddSample(long j10, int i3);

    private static native long nativeCreateCounts(String str, int i3, int i10, int i11);

    private static native long nativeCreateEnumeration(String str, int i3);

    public void addSample(int i3) {
        nativeAddSample(this.handle, i3);
    }
}
