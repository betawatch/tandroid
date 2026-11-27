// default package

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class pab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rab b;

    public /* synthetic */ pab(rab rabVar, byte b) {
        this.a = b;
        this.b = rabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rab rabVar = this.b;
        switch (b) {
            case 0:
                rbb rbbVar = rabVar.a;
                oy8 oy8Var = rbbVar.D0;
                if (oy8Var != null) {
                    oy8Var.f(false);
                }
                if (rbbVar.R1 && rbbVar.S1 && rbbVar.C0 != null) {
                    rbbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(rbbVar.C0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                rabVar.a.I(1, true);
                break;
            case 2:
                rabVar.a.I(1, true);
                break;
            default:
                rabVar.a.I(1, true);
                break;
        }
    }
}
