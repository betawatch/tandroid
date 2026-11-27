// default package

import org.webrtc.EglThread;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EglThread b;

    public /* synthetic */ yu3(EglThread eglThread, byte b) {
        this.a = b;
        this.b = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        EglThread eglThread = this.b;
        switch (b) {
            case 0:
                eglThread.lambda$onRenderWindowOpen$2();
                break;
            default:
                eglThread.lambda$onRenderWindowClose$3();
                break;
        }
    }
}
