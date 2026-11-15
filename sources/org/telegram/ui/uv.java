package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class uv extends uy0 {
    public boolean T;
    public xw U;
    public final /* synthetic */ rw V;
    public final /* synthetic */ Context W;
    public final /* synthetic */ yw a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(yw ywVar, Context context, rw rwVar, Context context2) {
        super(context);
        this.a0 = ywVar;
        this.V = rwVar;
        this.W = context2;
        this.e = 0.0f;
        this.n = new h2.f((int[]) null);
        this.N = true;
    }

    @Override // org.telegram.ui.uy0
    public final void d(boolean z10) {
        xw xwVar = this.U;
        xwVar.c.G = true;
        xwVar.d.P(this.U.a, c());
        xw xwVar2 = this.U;
        xwVar2.d.H = false;
        xwVar2.H.H = false;
        yw ywVar = this.a0;
        ywVar.M4(false, true);
        this.U.a.setClipChildren(true);
        this.U.a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.a.B1(null, 0.0f, z10);
        ywVar.E = false;
        this.V.requestLayout();
        if (!c()) {
            ywVar.R = true;
            if (ywVar.O != 0.0f) {
                ywVar.S = true;
            }
            View view = ywVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        hw hwVar = ywVar.D0;
        if (hwVar != null) {
            hwVar.R();
        }
        ywVar.i5(false, true);
        ywVar.P3();
        ywVar.g5();
    }

    @Override // org.telegram.ui.uy0
    public final void e(boolean z10) {
        ri.q qVar;
        int i7;
        yw ywVar = this.a0;
        ywVar.E = true;
        ywVar.F = z10;
        this.V.requestLayout();
        xw xwVar = ywVar.f0[0];
        this.U = xwVar;
        if (xwVar.G == null) {
            xwVar.G = new sv(this.W, null);
            qVar = ((org.telegram.ui.ActionBar.e2) ywVar).glassEngine;
            qVar.b(this.U.G);
            this.U.G.setLayoutManager(new tv(this, this.U));
            xw xwVar2 = this.U;
            int i10 = this.U.s;
            int i11 = ywVar.Y2;
            boolean z11 = ywVar.n2;
            ArrayList arrayList = ywVar.K2;
            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            xwVar2.H = new jg.m(ywVar, this.W, i10, i11, z11, arrayList, i7, ywVar.H);
            xw xwVar3 = this.U;
            jg.m mVar = xwVar3.H;
            mVar.T = true;
            xwVar3.G.setAdapter(mVar);
            xw xwVar4 = this.U;
            xwVar4.addView(xwVar4.G);
        }
        if (!z10) {
            ywVar.R = false;
            v4.e1 L = this.U.a.L((ywVar.l4() && this.U.s == 0) ? 1 : 0, false);
            ywVar.O4((L == null || L.a.getTop() < this.U.a.getPaddingTop()) ? -ywVar.f4() : 0.0f);
        }
        this.U.a.C0();
        xw xwVar5 = this.U;
        jg.m mVar2 = xwVar5.H;
        mVar2.h = xwVar5.s;
        mVar2.f();
        xw xwVar6 = this.U;
        xwVar6.d.P(xwVar6.a, false);
        xw xwVar7 = this.U;
        xwVar7.d.H = true;
        xwVar7.H.H = true;
        xwVar7.c.H = false;
        ywVar.M4(true, true);
        ywVar.o4(this.T);
        this.U.d.f();
        this.U.H.f();
        float f10 = !z10 ? ywVar.O : -ywVar.O;
        xw xwVar8 = this.U;
        xwVar8.a.B1(xwVar8.G, f10, false);
        this.U.a.setClipChildren(false);
        this.U.a.C0();
        ywVar.P3();
        ywVar.g5();
    }

    @Override // org.telegram.ui.uy0
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar = this.a0;
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.uy0
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uw uwVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f10 > 0.0f;
        if (this.T != z10) {
            this.T = z10;
        }
        yw ywVar = this.a0;
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (ywVar.Y2 != 0 || ywVar.a3 != 0) {
            Paint paint = ywVar.h1;
            int i7 = org.telegram.ui.ActionBar.j6.d6;
            paint.setColor(i0.a.f(f10, ywVar.getThemedColor(i7), ywVar.getThemedColor(i7)));
        }
        xw xwVar = this.U;
        if (xwVar != null) {
            xwVar.a.setOpenRightFragmentProgress(f10);
        }
        ywVar.O3();
        ywVar.T3();
        ywVar.G3();
        ywVar.Q3();
        xw xwVar2 = ywVar.f0[0];
        if (xwVar2 != null && (uwVar = xwVar2.a) != null) {
            uwVar.requestLayout();
        }
        View view2 = ywVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
