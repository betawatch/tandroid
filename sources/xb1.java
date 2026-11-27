// default package

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class xb1 extends qo9 {
    public final /* synthetic */ zb1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(zb1 zb1Var, Context context) {
        super(context);
        this.G = zb1Var;
    }

    @Override // qo9
    public final void c() {
        hl.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        zb1 zb1Var = this.G;
        if (zb1Var.O1) {
            zb1Var.z(true, false);
        }
    }
}
