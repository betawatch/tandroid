package org.webrtc;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceTextureHelper b;

    public /* synthetic */ q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.a = i10;
        this.b = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$stopListening$1();
                break;
            case 1:
                this.b.lambda$dispose$6();
                break;
            case 2:
                this.b.lambda$returnTextureFrame$5();
                break;
            default:
                this.b.lambda$forceFrame$3();
                break;
        }
    }
}
