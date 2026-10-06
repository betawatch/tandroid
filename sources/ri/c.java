package ri;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
