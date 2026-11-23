package org.webrtc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceTextureHelper b;

    public /* synthetic */ p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.a = i7;
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
