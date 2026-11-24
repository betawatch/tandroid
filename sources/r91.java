// default package

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CameraController b;
    public final /* synthetic */ CameraSession c;

    public /* synthetic */ r91(CameraController cameraController, CameraSession cameraSession, byte b) {
        this.a = b;
        this.b = cameraController;
        this.c = cameraSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CameraSession cameraSession = this.c;
        CameraController cameraController = this.b;
        switch (b) {
            case 0:
                cameraController.lambda$stopPreview$8(cameraSession);
                break;
            default:
                cameraController.lambda$startPreview$7(cameraSession);
                break;
        }
    }
}
