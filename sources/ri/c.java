package ri;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
