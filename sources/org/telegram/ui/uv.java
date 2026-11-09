package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uv extends zy0 {
    public boolean S;
    public xw T;
    public final /* synthetic */ rw U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ yw W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(yw ywVar, Context context, rw rwVar, Context context2) {
        super(context);
        this.W = ywVar;
        this.U = rwVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new h2.f((int[]) null);
        this.M = true;
    }

    @Override // org.telegram.ui.zy0
    public final void d(boolean z9) {
        xw xwVar = this.T;
        xwVar.c.G = true;
        xwVar.d.P(this.T.a, c());
        xw xwVar2 = this.T;
        xwVar2.d.G = false;
        xwVar2.G.G = false;
        yw ywVar = this.W;
        ywVar.M4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.a.B1(null, 0.0f, z9);
        ywVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            ywVar.Q = true;
            if (ywVar.N != 0.0f) {
                ywVar.R = true;
            }
            View view = ywVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        hw hwVar = ywVar.C0;
        if (hwVar != null) {
            hwVar.S();
        }
        ywVar.i5(false, true);
        ywVar.P3();
        ywVar.g5();
    }

    @Override // org.telegram.ui.zy0
    public final void e(boolean z9) {
        oi.q qVar;
        int i7;
        yw ywVar = this.W;
        ywVar.D = true;
        ywVar.E = z9;
        this.U.requestLayout();
        xw xwVar = ywVar.e0[0];
        this.T = xwVar;
        if (xwVar.F == null) {
            xwVar.F = new sv(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.f2) ywVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new tv(this, this.T));
            xw xwVar2 = this.T;
            int i10 = this.T.s;
            int i11 = ywVar.X2;
            boolean z10 = ywVar.m2;
            ArrayList arrayList = ywVar.J2;
            i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            xwVar2.G = new jg.n(ywVar, this.V, i10, i11, z10, arrayList, i7, ywVar.G);
            xw xwVar3 = this.T;
            jg.n nVar = xwVar3.G;
            nVar.S = true;
            xwVar3.F.setAdapter(nVar);
            xw xwVar4 = this.T;
            xwVar4.addView(xwVar4.F);
        }
        if (!z9) {
            ywVar.Q = false;
            v4.d1 L = this.T.a.L((ywVar.l4() && this.T.s == 0) ? 1 : 0, false);
            ywVar.O4((L == null || L.a.getTop() < this.T.a.getPaddingTop()) ? -ywVar.f4() : 0.0f);
        }
        this.T.a.C0();
        xw xwVar5 = this.T;
        jg.n nVar2 = xwVar5.G;
        nVar2.h = xwVar5.s;
        nVar2.f();
        xw xwVar6 = this.T;
        xwVar6.d.P(xwVar6.a, false);
        xw xwVar7 = this.T;
        xwVar7.d.G = true;
        xwVar7.G.G = true;
        xwVar7.c.H = false;
        ywVar.M4(true, true);
        ywVar.o4(this.S);
        this.T.d.f();
        this.T.G.f();
        float f10 = !z9 ? ywVar.N : -ywVar.N;
        xw xwVar8 = this.T;
        xwVar8.a.B1(xwVar8.F, f10, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        ywVar.P3();
        ywVar.g5();
    }

    @Override // org.telegram.ui.zy0
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.zy0
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uw uwVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z9 = f10 > 0.0f;
        if (this.S != z9) {
            this.S = z9;
        }
        yw ywVar = this.W;
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (ywVar.X2 != 0 || ywVar.Z2 != 0) {
            Paint paint = ywVar.g1;
            int i7 = org.telegram.ui.ActionBar.l6.d6;
            paint.setColor(i0.a.f(f10, ywVar.getThemedColor(i7), ywVar.getThemedColor(i7)));
        }
        xw xwVar = this.T;
        if (xwVar != null) {
            xwVar.a.setOpenRightFragmentProgress(f10);
        }
        ywVar.O3();
        ywVar.T3();
        ywVar.G3();
        ywVar.Q3();
        xw xwVar2 = ywVar.e0[0];
        if (xwVar2 != null && (uwVar = xwVar2.a) != null) {
            uwVar.requestLayout();
        }
        View view2 = ywVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
