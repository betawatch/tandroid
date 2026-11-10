package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vv extends az0 {
    public boolean S;
    public yw T;
    public final /* synthetic */ sw U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ zw W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(zw zwVar, Context context, sw swVar, Context context2) {
        super(context);
        this.W = zwVar;
        this.U = swVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new h2.f((int[]) null);
        this.M = true;
    }

    @Override // org.telegram.ui.az0
    public final void d(boolean z9) {
        yw ywVar = this.T;
        ywVar.c.G = true;
        ywVar.d.P(this.T.a, c());
        yw ywVar2 = this.T;
        ywVar2.d.G = false;
        ywVar2.G.G = false;
        zw zwVar = this.W;
        zwVar.M4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.a.B1(null, 0.0f, z9);
        zwVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            zwVar.Q = true;
            if (zwVar.N != 0.0f) {
                zwVar.R = true;
            }
            View view = zwVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        iw iwVar = zwVar.C0;
        if (iwVar != null) {
            iwVar.S();
        }
        zwVar.i5(false, true);
        zwVar.P3();
        zwVar.g5();
    }

    @Override // org.telegram.ui.az0
    public final void e(boolean z9) {
        oi.q qVar;
        int i7;
        zw zwVar = this.W;
        zwVar.D = true;
        zwVar.E = z9;
        this.U.requestLayout();
        yw ywVar = zwVar.e0[0];
        this.T = ywVar;
        if (ywVar.F == null) {
            ywVar.F = new tv(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.f2) zwVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new uv(this, this.T));
            yw ywVar2 = this.T;
            int i10 = this.T.s;
            int i11 = zwVar.X2;
            boolean z10 = zwVar.m2;
            ArrayList arrayList = zwVar.J2;
            i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            ywVar2.G = new jg.n(zwVar, this.V, i10, i11, z10, arrayList, i7, zwVar.G);
            yw ywVar3 = this.T;
            jg.n nVar = ywVar3.G;
            nVar.S = true;
            ywVar3.F.setAdapter(nVar);
            yw ywVar4 = this.T;
            ywVar4.addView(ywVar4.F);
        }
        if (!z9) {
            zwVar.Q = false;
            v4.d1 L = this.T.a.L((zwVar.l4() && this.T.s == 0) ? 1 : 0, false);
            zwVar.O4((L == null || L.a.getTop() < this.T.a.getPaddingTop()) ? -zwVar.f4() : 0.0f);
        }
        this.T.a.C0();
        yw ywVar5 = this.T;
        jg.n nVar2 = ywVar5.G;
        nVar2.h = ywVar5.s;
        nVar2.f();
        yw ywVar6 = this.T;
        ywVar6.d.P(ywVar6.a, false);
        yw ywVar7 = this.T;
        ywVar7.d.G = true;
        ywVar7.G.G = true;
        ywVar7.c.H = false;
        zwVar.M4(true, true);
        zwVar.o4(this.S);
        this.T.d.f();
        this.T.G.f();
        float f10 = !z9 ? zwVar.N : -zwVar.N;
        yw ywVar8 = this.T;
        ywVar8.a.B1(ywVar8.F, f10, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        zwVar.P3();
        zwVar.g5();
    }

    @Override // org.telegram.ui.az0
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        zw zwVar = this.W;
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        if (lVar == null) {
            return false;
        }
        lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        return lVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.az0
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        vw vwVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        boolean z9 = f10 > 0.0f;
        if (this.S != z9) {
            this.S = z9;
        }
        zw zwVar = this.W;
        View view = zwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f10);
            lVar5 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            lVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (zwVar.X2 != 0 || zwVar.Z2 != 0) {
            Paint paint = zwVar.g1;
            int i7 = org.telegram.ui.ActionBar.m6.d6;
            paint.setColor(i0.a.f(f10, zwVar.getThemedColor(i7), zwVar.getThemedColor(i7)));
        }
        yw ywVar = this.T;
        if (ywVar != null) {
            ywVar.a.setOpenRightFragmentProgress(f10);
        }
        zwVar.O3();
        zwVar.T3();
        zwVar.G3();
        zwVar.Q3();
        yw ywVar2 = zwVar.e0[0];
        if (ywVar2 != null && (vwVar = ywVar2.a) != null) {
            vwVar.requestLayout();
        }
        View view2 = zwVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
