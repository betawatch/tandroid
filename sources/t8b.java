// default package

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class t8b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v8b b;

    public /* synthetic */ t8b(v8b v8bVar, byte b) {
        this.a = b;
        this.b = v8bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v8b v8bVar = this.b;
        switch (b) {
            case 0:
                v9b v9bVar = v8bVar.a;
                ex8 ex8Var = v9bVar.D0;
                if (ex8Var != null) {
                    ex8Var.f(false);
                }
                if (v9bVar.R1 && v9bVar.S1 && v9bVar.C0 != null) {
                    v9bVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(v9bVar.C0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                v8bVar.a.I(1, true);
                break;
            case 2:
                v8bVar.a.I(1, true);
                break;
            default:
                v8bVar.a.I(1, true);
                break;
        }
    }
}
