// default package

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6b b;

    public /* synthetic */ r6b(t6b t6bVar, byte b) {
        this.a = b;
        this.b = t6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t6b t6bVar = this.b;
        switch (b) {
            case 0:
                t7b t7bVar = t6bVar.a;
                dv8 dv8Var = t7bVar.D0;
                if (dv8Var != null) {
                    dv8Var.f(false);
                }
                if (t7bVar.R1 && t7bVar.S1 && t7bVar.C0 != null) {
                    t7bVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(t7bVar.C0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                t6bVar.a.I(1, true);
                break;
            case 2:
                t6bVar.a.I(1, true);
                break;
            default:
                t6bVar.a.I(1, true);
                break;
        }
    }
}
