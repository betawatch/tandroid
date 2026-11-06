package xi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class c {
    public volatile boolean a;
    public volatile int b;

    public final int a() {
        if (!this.a) {
            synchronized (this) {
                try {
                    if (!this.a) {
                        this.b = d.a.getInt("round_video_video_bitrate", 1200000);
                        this.a = true;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
