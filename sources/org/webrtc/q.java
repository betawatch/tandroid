package org.webrtc;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
