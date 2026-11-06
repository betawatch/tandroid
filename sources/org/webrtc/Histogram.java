package org.webrtc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
