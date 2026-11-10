package org.webrtc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
