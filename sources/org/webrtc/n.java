package org.webrtc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
