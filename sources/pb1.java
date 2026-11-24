// default package

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class pb1 extends bl9 {
    public final /* synthetic */ rb1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb1(rb1 rb1Var, Context context) {
        super(context);
        this.G = rb1Var;
    }

    @Override // bl9
    public final void c() {
        gl.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        rb1 rb1Var = this.G;
        if (rb1Var.O1) {
            rb1Var.z(true, false);
        }
    }
}
