// default package

import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class y6b extends ir3 {
    public final /* synthetic */ t7b c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6b(t7b t7bVar, Context context, boolean z) {
        super(context, z);
        this.c0 = t7bVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        f29 f29Var = this.c0.P0;
        if (f29Var != null) {
            f29Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // ir3
    public final void s(boolean z) {
        t7b t7bVar = this.c0;
        t7bVar.p1.b(t7bVar.d1.getText());
        t7bVar.p1.a(false, z, t7bVar.l0);
    }

    @Override // ir3, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        t7b t7bVar = this.c0;
        t7bVar.G0.setValue(isDual());
        t7bVar.G0.setContentDescription(k96.M0(isDual() ? 2131754886 : 2131754887, null));
        t7bVar.d0(t7bVar.A());
    }
}
