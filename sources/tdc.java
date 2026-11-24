// default package

import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tdc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerRewinder b;

    public /* synthetic */ tdc(VideoPlayerRewinder videoPlayerRewinder, byte b) {
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
