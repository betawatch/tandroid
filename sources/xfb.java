// default package

import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class xfb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SurfaceTextureHelper b;

    public /* synthetic */ xfb(SurfaceTextureHelper surfaceTextureHelper, byte b) {
        this.a = b;
        this.b = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        switch (b) {
            case 0:
                surfaceTextureHelper.lambda$stopListening$1();
                break;
            case 1:
                surfaceTextureHelper.lambda$dispose$6();
                break;
            case 2:
                surfaceTextureHelper.lambda$returnTextureFrame$5();
                break;
            default:
                surfaceTextureHelper.lambda$forceFrame$3();
                break;
        }
    }
}
