package vh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t7 extends u0 {
    public final /* synthetic */ o8 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(o8 o8Var, Context context, boolean z10) {
        super(context, z10);
        this.b0 = o8Var;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        r4 r4Var = this.b0.O0;
        if (r4Var != null) {
            r4Var.g0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // vh.u0, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        o8 o8Var = this.b0;
        o8Var.F0.setValue(isDual());
        o8Var.F0.setContentDescription(cd.L0(isDual() ? 2131754886 : 2131754887, null));
        o8Var.d0(o8Var.B());
    }

    @Override // vh.u0
    public final void u(boolean z10) {
        o8 o8Var = this.b0;
        o8Var.o1.b(o8Var.c1.getText());
        o8Var.o1.a(false, z10, o8Var.k0);
    }
}
