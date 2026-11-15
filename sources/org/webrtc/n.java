package org.webrtc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ n(RenderSynchronizer renderSynchronizer, int i7) {
        this.a = i7;
        this.b = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$registerListener$1();
                break;
            default:
                this.b.lambda$new$0();
                break;
        }
    }
}
