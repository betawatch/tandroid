// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ov9 extends mm3 {
    public final /* synthetic */ nk3 J0;
    public final /* synthetic */ Activity K0;
    public final /* synthetic */ sj3 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov9(sj3 sj3Var, Activity activity, nk3 nk3Var, int i, int i2, sc3 sc3Var, boolean z, nk3 nk3Var2, Activity activity2) {
        super(activity, nk3Var, i, i2, sc3Var, z);
        this.L0 = sj3Var;
        this.J0 = nk3Var2;
        this.K0 = activity2;
    }

    @Override // y59
    public final void f() {
        pu9 pu9Var;
        int i = this.C0;
        super.f();
        sj3 sj3Var = this.L0;
        if (!sj3Var.L0 && (pu9Var = sj3Var.b0) != null) {
            pu9Var.w0(0);
            sj3Var.L0 = true;
        }
        if (b() != 0 || i == 0 || this.E0 > 0) {
            return;
        }
        sj3Var.c0.e(false, false);
    }
}
