package qh;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ w8(y8 y8Var, int i10) {
        this.a = i10;
        this.b = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ca caVar = this.b.a;
                n5 n5Var = caVar.z0;
                if (n5Var != null) {
                    n5Var.c(false);
                }
                if (caVar.N1 && caVar.O1 && caVar.y0 != null) {
                    caVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(caVar.y0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                this.b.a.K(1, true);
                break;
            case 2:
                this.b.a.K(1, true);
                break;
            default:
                this.b.a.K(1, true);
                break;
        }
    }
}
