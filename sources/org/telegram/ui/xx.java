package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xx extends org.telegram.ui.Components.do0 {
    public final lf.b0 V0;
    public final lf.b0 W0;
    public final /* synthetic */ oy X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(oy oyVar, Activity activity, oy oyVar2, int i10, int i11, int i12, long j10, tx txVar) {
        super(activity, oyVar2, i10, i11, i12, j10, txVar);
        this.X0 = oyVar;
        this.V0 = new lf.b0(2);
        this.W0 = new lf.b0(8);
    }

    public final void S(int i10, int i11) {
        oy oyVar;
        ng.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = (oyVar = this.X0).i4) == null) {
            return;
        }
        eVar.f(i10, i11);
        oyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        oy oyVar = this.X0;
        if (oyVar.X != null || oyVar.U2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(oyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (oyVar.U2 != 0 ? dp : 0);
            org.telegram.ui.Components.js jsVar = oyVar.G1;
            int c3 = dp2 + (jsVar != null ? (int) jsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            lf.b0 b0Var = this.V0;
            b0Var.b(l1);
            b0Var.c(c3, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), c3 + dp);
            b0Var.draw(canvas);
        }
        if (oyVar.d4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            lf.b0 b0Var2 = this.W0;
            b0Var2.b(l12);
            b0Var2.setBounds(0, getMeasuredHeight() - oyVar.d4, getMeasuredWidth(), getMeasuredHeight());
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
        a41 a41Var = this.X0.W;
        if (a41Var != null) {
            a41Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        if (Build.VERSION.SDK_INT >= 31) {
            oy oyVar = this.X0;
            if (oyVar.i4 != null) {
                oyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void x(int i10) {
        org.telegram.ui.Components.co0 co0Var = this.Q;
        this.X0.c5(co0Var != null && co0Var.h(i10) == 2);
    }
}
