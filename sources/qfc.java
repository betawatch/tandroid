// default package

import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
