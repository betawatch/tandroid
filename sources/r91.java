// default package

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
