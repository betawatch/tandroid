package org.webrtc;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class Histogram {
    private final long handle;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
