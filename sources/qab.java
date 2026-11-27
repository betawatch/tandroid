// default package

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sab b;

    public /* synthetic */ qab(sab sabVar, byte b) {
        this.a = b;
        this.b = sabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sab sabVar = this.b;
        switch (b) {
            case 0:
                sbb sbbVar = sabVar.a;
                oy8 oy8Var = sbbVar.D0;
                if (oy8Var != null) {
                    oy8Var.f(false);
                }
                if (sbbVar.R1 && sbbVar.S1 && sbbVar.C0 != null) {
                    sbbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(sbbVar.C0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                sabVar.a.I(1, true);
                break;
            case 2:
                sabVar.a.I(1, true);
                break;
            default:
                sabVar.a.I(1, true);
                break;
        }
    }
}
