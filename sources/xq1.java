// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        mu1Var.y5();
        mu1Var.w5();
        mu1Var.z5();
        mu1Var.A5();
        sr1 sr1Var = mu1Var.Bb;
        if (sr1Var != null) {
            sr1Var.setTranslationY(mu1Var.T9 + getCurrentHeight());
        }
        if (!z) {
            mu1Var.E7();
        } else {
            mu1Var.aa = true;
            mu1Var.Dc();
        }
    }
}
