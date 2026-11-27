package org.webrtc;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class Histogram {
    private final long handle;

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Natives {
        void addSample(long j, int i);

        long createCounts(String str, int i, int i2, int i3);

        long createEnumeration(String str, int i);
    }

    private Histogram(long j) {
        this.handle = j;
    }

    public static Histogram createCounts(String str, int i, int i2, int i3) {
        return new Histogram(HistogramJni.get().createCounts(str, i, i2, i3));
    }

    public static Histogram createEnumeration(String str, int i) {
        return new Histogram(HistogramJni.get().createEnumeration(str, i));
    }

    public void addSample(int i) {
        HistogramJni.get().addSample(this.handle, i);
    }
}
