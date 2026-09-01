package qh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g9 extends v0 {
    public final /* synthetic */ ca V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(ca caVar, Context context, boolean z4) {
        super(context, z4);
        this.V = caVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        r5 r5Var = this.V.L0;
        if (r5Var != null) {
            r5Var.d0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // qh.v0, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        ca caVar = this.V;
        caVar.C0.setValue(isDual());
        caVar.C0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        caVar.e0(caVar.C());
    }

    @Override // qh.v0
    public final void u(boolean z4) {
        ca caVar = this.V;
        caVar.l1.b(caVar.Z0.getText());
        caVar.l1.a(false, z4, caVar.h0);
    }
}
