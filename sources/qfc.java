// default package

import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class qfc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerRewinder b;

    public /* synthetic */ qfc(VideoPlayerRewinder videoPlayerRewinder, byte b) {
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
