package qh;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ v8(x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ba baVar = this.b.a;
                m5 m5Var = baVar.z0;
                if (m5Var != null) {
                    m5Var.c(false);
                }
                if (baVar.N1 && baVar.O1 && baVar.y0 != null) {
                    baVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(baVar.y0.getCameraSessionRecording(), false, false);
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
