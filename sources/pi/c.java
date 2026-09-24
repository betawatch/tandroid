package pi;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class c {
    public volatile boolean a;
    public volatile int b;

    public final int a() {
        if (!this.a) {
            synchronized (this) {
                try {
                    if (!this.a) {
                        this.b = d.a.getInt("round_video_video_bitrate", MediaController.VIDEO_BITRATE_480);
                        this.a = true;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
