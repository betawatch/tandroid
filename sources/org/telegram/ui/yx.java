package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yx extends org.telegram.ui.Components.eo0 {
    public final lf.b0 V0;
    public final lf.b0 W0;
    public final /* synthetic */ py X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(py pyVar, Activity activity, py pyVar2, int i10, int i11, int i12, long j10, ux uxVar) {
        super(activity, pyVar2, i10, i11, i12, j10, uxVar);
        this.X0 = pyVar;
        this.V0 = new lf.b0(2);
        this.W0 = new lf.b0(8);
    }

    public final void S(int i10, int i11) {
        py pyVar;
        og.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = (pyVar = this.X0).i4) == null) {
            return;
        }
        eVar.f(i10, i11);
        pyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        py pyVar = this.X0;
        if (pyVar.X != null || pyVar.U2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(pyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (pyVar.U2 != 0 ? dp : 0);
            org.telegram.ui.Components.ls lsVar = pyVar.G1;
            int c3 = dp2 + (lsVar != null ? (int) lsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.k6.l1(0.7f, pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            lf.b0 b0Var = this.V0;
            b0Var.b(l1);
            b0Var.c(c3, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), c3 + dp);
            b0Var.draw(canvas);
        }
        if (pyVar.d4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.k6.l1(0.9f, pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            lf.b0 b0Var2 = this.W0;
            b0Var2.b(l12);
            b0Var2.setBounds(0, getMeasuredHeight() - pyVar.d4, getMeasuredWidth(), getMeasuredHeight());
            b0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.X0.m3();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        c41 c41Var = this.X0.W;
        if (c41Var != null) {
            c41Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.m81
    public final void w(boolean z4) {
        if (Build.VERSION.SDK_INT >= 31) {
            py pyVar = this.X0;
            if (pyVar.i4 != null) {
                pyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.m81
    public final void x(int i10) {
        org.telegram.ui.Components.do0 do0Var = this.Q;
        this.X0.c5(do0Var != null && do0Var.h(i10) == 2);
    }
}
