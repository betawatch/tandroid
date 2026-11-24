// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class pdc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerHolderBase b;

    public /* synthetic */ pdc(VideoPlayerHolderBase videoPlayerHolderBase, byte b) {
        this.a = b;
        this.b = videoPlayerHolderBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VideoPlayerHolderBase videoPlayerHolderBase = this.b;
        switch (b) {
            case 0:
                videoPlayerHolderBase.lambda$new$13();
                break;
            case 1:
                videoPlayerHolderBase.lambda$start$1();
                break;
            case 2:
                videoPlayerHolderBase.lambda$new$14();
                break;
            case 3:
                videoPlayerHolderBase.lambda$play$6();
                break;
            case 4:
                videoPlayerHolderBase.lambda$pause$4();
                break;
            default:
                videoPlayerHolderBase.lambda$loopBack$9();
                break;
        }
    }
}
