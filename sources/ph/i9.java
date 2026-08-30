package ph;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i9 extends v0 {
    public final /* synthetic */ da V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(da daVar, Context context, boolean z4) {
        super(context, z4);
        this.V = daVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        t5 t5Var = this.V.L0;
        if (t5Var != null) {
            t5Var.d0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // ph.v0, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        da daVar = this.V;
        daVar.C0.setValue(isDual());
        daVar.C0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        daVar.e0(daVar.C());
    }

    @Override // ph.v0
    public final void u(boolean z4) {
        da daVar = this.V;
        daVar.l1.b(daVar.Z0.getText());
        daVar.l1.a(false, z4, daVar.h0);
    }
}
