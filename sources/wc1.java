// default package

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class wc1 extends bn9 {
    public final /* synthetic */ yc1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc1(yc1 yc1Var, Context context) {
        super(context);
        this.G = yc1Var;
    }

    @Override // bn9
    public final void c() {
        gm.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        yc1 yc1Var = this.G;
        if (yc1Var.O1) {
            yc1Var.z(true, false);
        }
    }
}
