package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ww extends k01 {
    public boolean S;
    public yx T;
    public final /* synthetic */ sx U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ zx W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(zx zxVar, Context context, sx sxVar, Context context2) {
        super(context);
        this.W = zxVar;
        this.U = sxVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new e2.f((int[]) null);
        this.M = true;
    }

    @Override // org.telegram.ui.k01
    public final void d(boolean z10) {
        yx yxVar = this.T;
        yxVar.c.G = true;
        yxVar.d.P(this.T.a, c());
        yx yxVar2 = this.T;
        yxVar2.d.G = false;
        yxVar2.G.G = false;
        zx zxVar = this.W;
        zxVar.M4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.a.B1(null, 0.0f, z10);
        zxVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            zxVar.Q = true;
            zxVar.R = true;
            View view = zxVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        jx jxVar = zxVar.C0;
        if (jxVar != null) {
            jxVar.S();
        }
        zxVar.i5(false, true);
        zxVar.P3();
        zxVar.g5();
    }

    @Override // org.telegram.ui.k01
    public final void e(boolean z10) {
        ei.r rVar;
        int i10;
        zx zxVar = this.W;
        zxVar.D = true;
        zxVar.E = z10;
        this.U.requestLayout();
        yx yxVar = zxVar.e0[0];
        this.T = yxVar;
        if (yxVar.F == null) {
            yxVar.F = new uw(this.V, null);
            rVar = ((org.telegram.ui.ActionBar.k2) zxVar).glassEngine;
            rVar.b(this.T.F);
            this.T.F.setLayoutManager(new vw(this, this.T));
            yx yxVar2 = this.T;
            int i11 = this.T.s;
            int i12 = zxVar.W2;
            boolean z11 = zxVar.l2;
            ArrayList arrayList = zxVar.I2;
            i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            yxVar2.G = new zf.m(zxVar, this.V, i11, i12, z11, arrayList, i10, zxVar.G);
            yx yxVar3 = this.T;
            zf.m mVar = yxVar3.G;
            mVar.S = true;
            yxVar3.F.setAdapter(mVar);
            yx yxVar4 = this.T;
            yxVar4.addView(yxVar4.F);
        }
        if (!z10) {
            zxVar.Q = false;
            s4.c1 L = this.T.a.L((zxVar.l4() && this.T.s == 0) ? 1 : 0, false);
            zxVar.O4((L == null || L.a.getTop() < this.T.a.getPaddingTop()) ? -zxVar.f4() : 0.0f);
        }
        this.T.a.C0();
        yx yxVar5 = this.T;
        zf.m mVar2 = yxVar5.G;
        mVar2.h = yxVar5.s;
        mVar2.f();
        yx yxVar6 = this.T;
        yxVar6.d.P(yxVar6.a, false);
        yx yxVar7 = this.T;
        yxVar7.d.G = true;
        yxVar7.G.G = true;
        yxVar7.c.H = false;
        zxVar.M4(true, true);
        zxVar.o4(this.S);
        this.T.d.f();
        this.T.G.f();
        float f7 = !z10 ? zxVar.N : -zxVar.N;
        yx yxVar8 = this.T;
        yxVar8.a.B1(yxVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        zxVar.P3();
        zxVar.g5();
    }

    @Override // org.telegram.ui.k01
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        zx zxVar = this.W;
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        if (lVar == null) {
            return false;
        }
        lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        return lVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.k01
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        vx vxVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        zx zxVar = this.W;
        View view = zxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f7);
            lVar5 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            lVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (zxVar.W2 != 0 || zxVar.Y2 != 0) {
            Paint paint = zxVar.f1;
            int i10 = org.telegram.ui.ActionBar.t6.d6;
            paint.setColor(i0.b.f(f7, zxVar.getThemedColor(i10), zxVar.getThemedColor(i10)));
        }
        yx yxVar = this.T;
        if (yxVar != null) {
            yxVar.a.setOpenRightFragmentProgress(f7);
        }
        zxVar.O3();
        zxVar.T3();
        zxVar.G3();
        zxVar.Q3();
        yx yxVar2 = zxVar.e0[0];
        if (yxVar2 != null && (vxVar = yxVar2.a) != null) {
            vxVar.requestLayout();
        }
        View view2 = zxVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
