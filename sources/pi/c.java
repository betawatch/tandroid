package pi;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
