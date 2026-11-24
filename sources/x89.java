// default package

import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class x89 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ x89(RenderSynchronizer renderSynchronizer, byte b) {
        this.a = b;
        this.b = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RenderSynchronizer renderSynchronizer = this.b;
        switch (b) {
            case 0:
                renderSynchronizer.lambda$registerListener$1();
                break;
            default:
                renderSynchronizer.lambda$new$0();
                break;
        }
    }
}
