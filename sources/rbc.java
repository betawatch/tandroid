// default package

import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class rbc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerRewinder b;

    public /* synthetic */ rbc(VideoPlayerRewinder videoPlayerRewinder, byte b) {
        this.a = b;
        this.b = videoPlayerRewinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VideoPlayerRewinder videoPlayerRewinder = this.b;
        switch (b) {
            case 0:
                videoPlayerRewinder.lambda$updateRewindSpeed$0();
                break;
            default:
                videoPlayerRewinder.lambda$cancelRewind$1();
                break;
        }
    }
}
