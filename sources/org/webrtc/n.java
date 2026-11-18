package org.webrtc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
