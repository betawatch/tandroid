// default package

import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class wab extends as3 {
    public final /* synthetic */ rbb c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wab(rbb rbbVar, Context context, boolean z) {
        super(context, z);
        this.c0 = rbbVar;
    }

    @Override // as3
    public final void k0(boolean z) {
        rbb rbbVar = this.c0;
        rbbVar.p1.b(rbbVar.d1.getText());
        rbbVar.p1.a(false, z, rbbVar.l0);
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
        rbb rbbVar = this.c0;
        rbbVar.G0.setValue(isDual());
        rbbVar.G0.setContentDescription(ob6.M0(isDual() ? 2131754882 : 2131754883, null));
        rbbVar.d0(rbbVar.A());
    }
}
