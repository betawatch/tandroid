package vh;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends v4 {
    public final /* synthetic */ p F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Context context) {
        super(context);
        this.F = pVar;
    }

    @Override // vh.v4
    public final void c() {
        org.telegram.messenger.i0.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        p pVar = this.F;
        if (pVar.N1) {
            pVar.z(true, false);
        }
    }
}
