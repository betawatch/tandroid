// default package

import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
