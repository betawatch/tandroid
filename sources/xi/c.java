package xi;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
