package org.webrtc;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class Metrics {
    private static final String TAG = "Metrics";
    public final Map<String, HistogramInfo> map = new HashMap();

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        public HistogramInfo(int i10, int i11, int i12) {
            this.min = i10;
            this.max = i11;
            this.bucketCount = i12;
        }

        public void addSample(int i10, int i11) {
            this.samples.put(Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static void enable() {
        nativeEnable();
    }

    public static Metrics getAndReset() {
        return nativeGetAndReset();
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();
}
