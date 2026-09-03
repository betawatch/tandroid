package qh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f9 extends v0 {
    public final /* synthetic */ ba V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(ba baVar, Context context, boolean z4) {
        super(context, z4);
        this.V = baVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        q5 q5Var = this.V.L0;
        if (q5Var != null) {
            q5Var.d0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // qh.v0, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        ba baVar = this.V;
        baVar.C0.setValue(isDual());
        baVar.C0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        baVar.e0(baVar.C());
    }

    @Override // qh.v0
    public final void u(boolean z4) {
        ba baVar = this.V;
        baVar.l1.b(baVar.Z0.getText());
        baVar.l1.a(false, z4, baVar.h0);
    }
}
