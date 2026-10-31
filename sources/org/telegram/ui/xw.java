package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xw extends k01 {
    public boolean S;
    public zx T;
    public final /* synthetic */ tx U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ ay W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(ay ayVar, Context context, tx txVar, Context context2) {
        super(context);
        this.W = ayVar;
        this.U = txVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new e2.f(null);
        this.M = true;
    }

    @Override // org.telegram.ui.k01
    public final void d(boolean z10) {
        zx zxVar = this.T;
        zxVar.c.G = true;
        zxVar.d.P(this.T.a, c());
        zx zxVar2 = this.T;
        zxVar2.d.G = false;
        zxVar2.G.G = false;
        ay ayVar = this.W;
        ayVar.L4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.a.B1(null, 0.0f, z10);
        ayVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            ayVar.Q = true;
            ayVar.R = true;
            View view = ayVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        kx kxVar = ayVar.C0;
        if (kxVar != null) {
            kxVar.S();
        }
        ayVar.h5(false, true);
        ayVar.O3();
        ayVar.f5();
    }

    @Override // org.telegram.ui.k01
    public final void e(boolean z10) {
        ei.r rVar;
        int i10;
        ay ayVar = this.W;
        ayVar.D = true;
        ayVar.E = z10;
        this.U.requestLayout();
        zx zxVar = ayVar.e0[0];
        this.T = zxVar;
        if (zxVar.F == null) {
            zxVar.F = new vw(this.V, null);
            rVar = ((org.telegram.ui.ActionBar.k2) ayVar).glassEngine;
            rVar.b(this.T.F);
            this.T.F.setLayoutManager(new ww(this, this.T));
            zx zxVar2 = this.T;
            int i11 = this.T.s;
            int i12 = ayVar.W2;
            boolean z11 = ayVar.l2;
            ArrayList arrayList = ayVar.I2;
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            zxVar2.G = new zf.m(ayVar, this.V, i11, i12, z11, arrayList, i10, ayVar.G);
            zx zxVar3 = this.T;
            zf.m mVar = zxVar3.G;
            mVar.S = true;
            zxVar3.F.setAdapter(mVar);
            zx zxVar4 = this.T;
            zxVar4.addView(zxVar4.F);
        }
        if (!z10) {
            ayVar.Q = false;
            s4.c1 L = this.T.a.L((ayVar.k4() && this.T.s == 0) ? 1 : 0, false);
            ayVar.N4((L == null || L.a.getTop() < this.T.a.getPaddingTop()) ? -ayVar.e4() : 0.0f);
        }
        this.T.a.C0();
        zx zxVar5 = this.T;
        zf.m mVar2 = zxVar5.G;
        mVar2.h = zxVar5.s;
        mVar2.f();
        zx zxVar6 = this.T;
        zxVar6.d.P(zxVar6.a, false);
        zx zxVar7 = this.T;
        zxVar7.d.G = true;
        zxVar7.G.G = true;
        zxVar7.c.H = false;
        ayVar.L4(true, true);
        ayVar.n4(this.S);
        this.T.d.f();
        this.T.G.f();
        float f7 = !z10 ? ayVar.N : -ayVar.N;
        zx zxVar8 = this.T;
        zxVar8.a.B1(zxVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        ayVar.O3();
        ayVar.f5();
    }

    @Override // org.telegram.ui.k01
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ay ayVar = this.W;
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        if (lVar == null) {
            return false;
        }
        lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        return lVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.k01
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        wx wxVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        ay ayVar = this.W;
        View view = ayVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f7);
            lVar5 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            lVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (ayVar.W2 != 0 || ayVar.Y2 != 0) {
            Paint paint = ayVar.f1;
            int i10 = org.telegram.ui.ActionBar.t6.d6;
            paint.setColor(i0.b.f(f7, ayVar.getThemedColor(i10), ayVar.getThemedColor(i10)));
        }
        zx zxVar = this.T;
        if (zxVar != null) {
            zxVar.a.setOpenRightFragmentProgress(f7);
        }
        ayVar.N3();
        ayVar.S3();
        ayVar.F3();
        ayVar.P3();
        zx zxVar2 = ayVar.e0[0];
        if (zxVar2 != null && (wxVar = zxVar2.a) != null) {
            wxVar.requestLayout();
        }
        View view2 = ayVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
