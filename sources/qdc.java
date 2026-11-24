// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class qdc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerHolderBase b;
    public final /* synthetic */ float c;

    public /* synthetic */ qdc(VideoPlayerHolderBase videoPlayerHolderBase, float f, byte b) {
        this.a = b;
        this.b = videoPlayerHolderBase;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.c;
        VideoPlayerHolderBase videoPlayerHolderBase = this.b;
        switch (b) {
            case 0:
                videoPlayerHolderBase.lambda$setSpeed$5(f);
                break;
            case 1:
                videoPlayerHolderBase.lambda$play$7(f);
                break;
            default:
                videoPlayerHolderBase.lambda$setVolume$10(f);
                break;
        }
    }
}
