// default package

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sj3 extends vv9 {
    public final i15 b1;
    public final i15 c1;
    public final /* synthetic */ nk3 d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj3(nk3 nk3Var, Activity activity, nk3 nk3Var2, int i, int i2, int i3, long j, k6d k6dVar) {
        super(activity, nk3Var2, i, i2, i3, j, k6dVar);
        this.d1 = nk3Var;
        this.b1 = new i15(2);
        this.c1 = new i15(8);
    }

    public final void T() {
        sy4 sy4Var;
        sy4Var = ((d) this.d1).glassEngine;
        sy4Var.g++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        super.dispatchDraw(canvas);
        nk3 nk3Var = this.d1;
        if (nk3Var.b0 != null || nk3Var.a3 != 0) {
            int L = gm.L(54.0f);
            aVar = ((d) nk3Var).actionBar;
            int L2 = ((gm.L(nk3Var.a) + aVar.getMeasuredHeight()) - gm.L(2.0f)) - (nk3Var.a3 != 0 ? L : 0);
            qk3 qk3Var = nk3Var.L1;
            int c = L2 + (qk3Var != null ? (int) qk3Var.c(gm.L(7.0f)) : 0);
            int p1 = cmb.p1(0.7f, nk3Var.getThemedColor(cmb.c6));
            i15 i15Var = this.b1;
            i15Var.b(p1);
            i15Var.c(c, 0);
            i15Var.setBounds(0, 0, getMeasuredWidth(), c + L);
            i15Var.draw(canvas);
        }
        if (nk3Var.m4 > gm.L(32.0f)) {
            int p12 = cmb.p1(0.9f, nk3Var.getThemedColor(cmb.c6));
            i15 i15Var2 = this.c1;
            i15Var2.b(p12);
            i15Var2.setBounds(0, getMeasuredHeight() - nk3Var.m4, getMeasuredWidth(), getMeasuredHeight());
            i15Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        sy4 sy4Var;
        super.setAlpha(f);
        sy4Var = ((d) this.d1).glassEngine;
        sy4Var.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        nu9 nu9Var = this.d1.a0;
        if (nu9Var != null) {
            nu9Var.setTranslationY(f);
        }
    }

    @Override // wgc
    public final void y(int i) {
        bo0 bo0Var = this.W;
        this.d1.A5(bo0Var != null && bo0Var.h(i) == 2);
    }
}
