package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zx extends org.telegram.ui.Components.co0 {
    public final kf.b0 V0;
    public final kf.b0 W0;
    public final /* synthetic */ qy X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(qy qyVar, Activity activity, qy qyVar2, int i10, int i11, int i12, long j10, vx vxVar) {
        super(activity, qyVar2, i10, i11, i12, j10, vxVar);
        this.X0 = qyVar;
        this.V0 = new kf.b0(2);
        this.W0 = new kf.b0(8);
    }

    public final void S(int i10, int i11) {
        qy qyVar;
        ng.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = (qyVar = this.X0).i4) == null) {
            return;
        }
        eVar.f(i10, i11);
        qyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        qy qyVar = this.X0;
        if (qyVar.X != null || qyVar.U2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(qyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (qyVar.U2 != 0 ? dp : 0);
            org.telegram.ui.Components.is isVar = qyVar.G1;
            int c3 = dp2 + (isVar != null ? (int) isVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            kf.b0 b0Var = this.V0;
            b0Var.b(l1);
            b0Var.c(c3, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), c3 + dp);
            b0Var.draw(canvas);
        }
        if (qyVar.d4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            kf.b0 b0Var2 = this.W0;
            b0Var2.b(l12);
            b0Var2.setBounds(0, getMeasuredHeight() - qyVar.d4, getMeasuredWidth(), getMeasuredHeight());
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
        h41 h41Var = this.X0.W;
        if (h41Var != null) {
            h41Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        if (Build.VERSION.SDK_INT >= 31) {
            qy qyVar = this.X0;
            if (qyVar.i4 != null) {
                qyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void x(int i10) {
        org.telegram.ui.Components.bo0 bo0Var = this.Q;
        this.X0.c5(bo0Var != null && bo0Var.h(i10) == 2);
    }
}
