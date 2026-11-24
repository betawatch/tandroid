// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ys1 extends xu9 {
    public final /* synthetic */ yv1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys1(yv1 yv1Var, Context context, yv1 yv1Var2, int i, long j, ylb ylbVar) {
        super(context, yv1Var2, i, j, ylbVar);
        this.J = yv1Var;
    }

    @Override // xu9
    public final void b(boolean z) {
        yv1 yv1Var = this.J;
        yv1Var.G5();
        yv1Var.E5();
        ft1 ft1Var = yv1Var.Jb;
        if (ft1Var != null) {
            ft1Var.setTranslationY(yv1Var.T9 + getCurrentHeight());
        }
        if (z) {
            yv1Var.aa = true;
            yv1Var.Rc();
        }
    }

    @Override // xu9
    public final boolean f(k39 k39Var) {
        int i;
        yv1 yv1Var = this.J;
        yv1Var.F3 = k39Var;
        yv1Var.G3 = k39Var != null;
        if (k39Var == null) {
            hs6 mediaDataController = yv1Var.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            yv1Var.Ib(false);
            yv1Var.nd(0, 0, -1);
        }
        yv1Var.qd();
        yv1Var.dd();
        yv1Var.I3 = yv1Var.k0.getSearchField().getText().toString();
        hs6 mediaDataController2 = yv1Var.getMediaDataController();
        String str = yv1Var.I3;
        long j = yv1Var.l6;
        long j2 = yv1Var.d7;
        i = ((d) yv1Var).classGuid;
        mediaDataController2.Z1(str, j, j2, i, 0, yv1Var.s4, false, yv1Var.D3, yv1Var.E3, (TextUtils.isEmpty(yv1Var.I3) && yv1Var.F3 == null) ? false : true, yv1Var.F3);
        gm.t1(yv1Var.k0.getSearchField());
        return true;
    }

    @Override // xu9
    public final void h(boolean z) {
        super.h(z);
        yv1 yv1Var = this.J;
        r7 r7Var = yv1Var.k0;
        g(r7Var != null && r7Var.w() && a() && yv1Var.J3 == null);
    }
}
