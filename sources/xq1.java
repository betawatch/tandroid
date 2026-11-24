// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xq1 extends cd2 {
    public final /* synthetic */ mu1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq1(mu1 mu1Var, Context context) {
        super(context);
        this.f = mu1Var;
    }

    @Override // cd2
    public final void a(boolean z) {
        mu1 mu1Var = this.f;
        mu1Var.z5();
        mu1Var.x5();
        mu1Var.A5();
        mu1Var.B5();
        sr1 sr1Var = mu1Var.Bb;
        if (sr1Var != null) {
            sr1Var.setTranslationY(mu1Var.T9 + getCurrentHeight());
        }
        if (!z) {
            mu1Var.G7();
        } else {
            mu1Var.aa = true;
            mu1Var.Fc();
        }
    }
}
