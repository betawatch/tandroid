package vh;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7 b;

    public /* synthetic */ m7(o7 o7Var, int i10) {
        this.a = i10;
        this.b = o7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o8 o8Var = this.b.a;
                o4 o4Var = o8Var.C0;
                if (o4Var != null) {
                    o4Var.c(false);
                }
                if (o8Var.Q1 && o8Var.R1 && o8Var.B0 != null) {
                    o8Var.i0(false);
                    CameraController.getInstance().stopVideoRecording(o8Var.B0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                this.b.a.J(1, true);
                break;
            case 2:
                this.b.a.J(1, true);
                break;
            default:
                this.b.a.J(1, true);
                break;
        }
    }
}
