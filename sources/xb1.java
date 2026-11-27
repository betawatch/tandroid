// default package

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
