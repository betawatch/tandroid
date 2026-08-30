package ph;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a9 b;

    public /* synthetic */ y8(a9 a9Var, int i10) {
        this.a = i10;
        this.b = a9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da daVar = this.b.a;
                p5 p5Var = daVar.z0;
                if (p5Var != null) {
                    p5Var.c(false);
                }
                if (daVar.N1 && daVar.O1 && daVar.y0 != null) {
                    daVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(daVar.y0.getCameraSessionRecording(), false, false);
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
