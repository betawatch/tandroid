package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xv extends yy0 {
    public boolean T;
    public bx U;
    public final /* synthetic */ vw V;
    public final /* synthetic */ Context W;
    public final /* synthetic */ cx a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(cx cxVar, Context context, vw vwVar, Context context2) {
        super(context);
        this.a0 = cxVar;
        this.V = vwVar;
        this.W = context2;
        this.e = 0.0f;
        this.n = new h2.f((int[]) null);
        this.N = true;
    }

    @Override // org.telegram.ui.yy0
    public final void d(boolean z10) {
        bx bxVar = this.U;
        bxVar.c.G = true;
        bxVar.d.P(this.U.a, c());
        bx bxVar2 = this.U;
        bxVar2.d.H = false;
        bxVar2.H.H = false;
        cx cxVar = this.a0;
        cxVar.U4(false, true);
        this.U.a.setClipChildren(true);
        this.U.a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.a.B1(null, 0.0f, z10);
        cxVar.E = false;
        this.V.requestLayout();
        if (!c()) {
            cxVar.R = true;
            if (cxVar.O != 0.0f) {
                cxVar.S = true;
            }
            View view = cxVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        kw kwVar = cxVar.D0;
        if (kwVar != null) {
            kwVar.O();
        }
        cxVar.q5(false, true);
        cxVar.P3();
        cxVar.o5();
    }

    @Override // org.telegram.ui.yy0
    public final void e(boolean z10) {
        ri.q qVar;
        int i7;
        cx cxVar = this.a0;
        cxVar.E = true;
        cxVar.F = z10;
        this.V.requestLayout();
        bx bxVar = cxVar.f0[0];
        this.U = bxVar;
        if (bxVar.G == null) {
            bxVar.G = new vv(this.W, null);
            qVar = ((org.telegram.ui.ActionBar.g2) cxVar).glassEngine;
            qVar.b(this.U.G);
            this.U.G.setLayoutManager(new wv(this, this.U));
            bx bxVar2 = this.U;
            int i10 = this.U.s;
            int i11 = cxVar.Y2;
            boolean z11 = cxVar.n2;
            ArrayList arrayList = cxVar.K2;
            i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
            bxVar2.H = new jg.m(cxVar, this.W, i10, i11, z11, arrayList, i7, cxVar.H);
            bx bxVar3 = this.U;
            jg.m mVar = bxVar3.H;
            mVar.T = true;
            bxVar3.G.setAdapter(mVar);
            bx bxVar4 = this.U;
            bxVar4.addView(bxVar4.G);
        }
        if (!z10) {
            cxVar.R = false;
            v4.f1 L = this.U.a.L((cxVar.n4() && this.U.s == 0) ? 1 : 0, false);
            cxVar.W4((L == null || L.a.getTop() < this.U.a.getPaddingTop()) ? -cxVar.f4() : 0.0f);
        }
        this.U.a.C0();
        bx bxVar5 = this.U;
        jg.m mVar2 = bxVar5.H;
        mVar2.h = bxVar5.s;
        mVar2.f();
        bx bxVar6 = this.U;
        bxVar6.d.P(bxVar6.a, false);
        bx bxVar7 = this.U;
        bxVar7.d.H = true;
        bxVar7.H.H = true;
        bxVar7.c.H = false;
        cxVar.U4(true, true);
        cxVar.q4(this.T);
        this.U.d.f();
        this.U.H.f();
        float f10 = !z10 ? cxVar.O : -cxVar.O;
        bx bxVar8 = this.U;
        bxVar8.a.B1(bxVar8.G, f10, false);
        this.U.a.setClipChildren(false);
        this.U.a.C0();
        cxVar.P3();
        cxVar.o5();
    }

    @Override // org.telegram.ui.yy0
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cx cxVar = this.a0;
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.yy0
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f10 > 0.0f;
        if (this.T != z10) {
            this.T = z10;
        }
        cx cxVar = this.a0;
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (cxVar.Y2 != 0 || cxVar.a3 != 0) {
            Paint paint = cxVar.h1;
            int i7 = org.telegram.ui.ActionBar.m6.d6;
            paint.setColor(i0.a.f(f10, cxVar.getThemedColor(i7), cxVar.getThemedColor(i7)));
        }
        bx bxVar = this.U;
        if (bxVar != null) {
            bxVar.a.setOpenRightFragmentProgress(f10);
        }
        cxVar.O3();
        cxVar.T3();
        cxVar.G3();
        cxVar.Q3();
        bx bxVar2 = cxVar.f0[0];
        if (bxVar2 != null && (ywVar = bxVar2.a) != null) {
            ywVar.requestLayout();
        }
        View view2 = cxVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
