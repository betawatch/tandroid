// default package

import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class xab extends as3 {
    public final /* synthetic */ sbb c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xab(sbb sbbVar, Context context, boolean z) {
        super(context, z);
        this.c0 = sbbVar;
    }

    @Override // as3
    public final void k0(boolean z) {
        sbb sbbVar = this.c0;
        sbbVar.p1.b(sbbVar.d1.getText());
        sbbVar.p1.a(false, z, sbbVar.l0);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        u59 u59Var = this.c0.P0;
        if (u59Var != null) {
            u59Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // as3, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        sbb sbbVar = this.c0;
        sbbVar.G0.setValue(isDual());
        sbbVar.G0.setContentDescription(ob6.M0(isDual() ? 2131754882 : 2131754883, null));
        sbbVar.d0(sbbVar.A());
    }
}
