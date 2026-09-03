package ph;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a9 b;

    public /* synthetic */ x8(a9 a9Var, int i10) {
        this.a = i10;
        this.b = a9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da daVar = this.b.a;
                o5 o5Var = daVar.z0;
                if (o5Var != null) {
                    o5Var.c(false);
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
