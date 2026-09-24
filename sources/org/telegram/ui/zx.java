package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class zx extends org.telegram.ui.Components.lo0 {
    public final yf.y Z0;
    public final yf.y a1;
    public final /* synthetic */ qy b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(qy qyVar, Activity activity, qy qyVar2, int i10, int i11, int i12, long j3, vx vxVar) {
        super(activity, qyVar2, i10, i11, i12, j3, vxVar);
        this.b1 = qyVar;
        this.Z0 = new yf.y(2);
        this.a1 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        qy qyVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT < 31 || (hVar = (qyVar = this.b1).k4) == null) {
            return;
        }
        hVar.f(i10, i11);
        qyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        qy qyVar = this.b1;
        if (qyVar.a0 != null || qyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(qyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (qyVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.ls lsVar = qyVar.J1;
            int c10 = dp2 + (lsVar != null ? (int) lsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.h6.l1(0.7f, qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            yf.y yVar = this.Z0;
            yVar.b(l1);
            yVar.c(c10, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            yVar.draw(canvas);
        }
        if (qyVar.f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.h6.l1(0.9f, qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            yf.y yVar2 = this.a1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - qyVar.f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.b1.m3();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        m41 m41Var = this.b1.Z;
        if (m41Var != null) {
            m41Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            qy qyVar = this.b1;
            if (qyVar.k4 != null) {
                qyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final void x(int i10) {
        org.telegram.ui.Components.ko0 ko0Var = this.T;
        this.b1.c5(ko0Var != null && ko0Var.h(i10) == 2);
    }
}
