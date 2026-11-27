// default package

import org.webrtc.EglThread;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
