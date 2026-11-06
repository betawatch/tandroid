package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sv extends wy0 {
    public boolean S;
    public vw T;
    public final /* synthetic */ pw U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ ww W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(ww wwVar, Context context, pw pwVar, Context context2) {
        super(context);
        this.W = wwVar;
        this.U = pwVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new h2.f((int[]) null);
        this.M = true;
    }

    @Override // org.telegram.ui.wy0
    public final void d(boolean z9) {
        vw vwVar = this.T;
        vwVar.c.G = true;
        vwVar.d.P(this.T.a, c());
        vw vwVar2 = this.T;
        vwVar2.d.G = false;
        vwVar2.G.G = false;
        ww wwVar = this.W;
        wwVar.M4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.a.B1(null, 0.0f, z9);
        wwVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            wwVar.Q = true;
            if (wwVar.N != 0.0f) {
                wwVar.R = true;
            }
            View view = wwVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        fw fwVar = wwVar.C0;
        if (fwVar != null) {
            fwVar.S();
        }
        wwVar.i5(false, true);
        wwVar.P3();
        wwVar.g5();
    }

    @Override // org.telegram.ui.wy0
    public final void e(boolean z9) {
        oi.q qVar;
        int i7;
        ww wwVar = this.W;
        wwVar.D = true;
        wwVar.E = z9;
        this.U.requestLayout();
        vw vwVar = wwVar.e0[0];
        this.T = vwVar;
        if (vwVar.F == null) {
            vwVar.F = new qv(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.f2) wwVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new rv(this, this.T));
            vw vwVar2 = this.T;
            int i10 = this.T.s;
            int i11 = wwVar.W2;
            boolean z10 = wwVar.l2;
            ArrayList arrayList = wwVar.I2;
            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            vwVar2.G = new jg.n(wwVar, this.V, i10, i11, z10, arrayList, i7, wwVar.G);
            vw vwVar3 = this.T;
            jg.n nVar = vwVar3.G;
            nVar.S = true;
            vwVar3.F.setAdapter(nVar);
            vw vwVar4 = this.T;
            vwVar4.addView(vwVar4.F);
        }
        if (!z9) {
            wwVar.Q = false;
            v4.d1 L = this.T.a.L((wwVar.l4() && this.T.s == 0) ? 1 : 0, false);
            wwVar.O4((L == null || L.a.getTop() < this.T.a.getPaddingTop()) ? -wwVar.f4() : 0.0f);
        }
        this.T.a.C0();
        vw vwVar5 = this.T;
        jg.n nVar2 = vwVar5.G;
        nVar2.h = vwVar5.s;
        nVar2.f();
        vw vwVar6 = this.T;
        vwVar6.d.P(vwVar6.a, false);
        vw vwVar7 = this.T;
        vwVar7.d.G = true;
        vwVar7.G.G = true;
        vwVar7.c.H = false;
        wwVar.M4(true, true);
        wwVar.o4(this.S);
        this.T.d.f();
        this.T.G.f();
        float f10 = !z9 ? wwVar.N : -wwVar.N;
        vw vwVar8 = this.T;
        vwVar8.a.B1(vwVar8.F, f10, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        wwVar.P3();
        wwVar.g5();
    }

    @Override // org.telegram.ui.wy0
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ww wwVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.wy0
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        sw swVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z9 = f10 > 0.0f;
        if (this.S != z9) {
            this.S = z9;
        }
        ww wwVar = this.W;
        View view = wwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (wwVar.W2 != 0 || wwVar.Y2 != 0) {
            Paint paint = wwVar.f1;
            int i7 = org.telegram.ui.ActionBar.k6.d6;
            paint.setColor(i0.a.f(f10, wwVar.getThemedColor(i7), wwVar.getThemedColor(i7)));
        }
        vw vwVar = this.T;
        if (vwVar != null) {
            vwVar.a.setOpenRightFragmentProgress(f10);
        }
        wwVar.O3();
        wwVar.T3();
        wwVar.G3();
        wwVar.Q3();
        vw vwVar2 = wwVar.e0[0];
        if (vwVar2 != null && (swVar = vwVar2.a) != null) {
            swVar.requestLayout();
        }
        View view2 = wwVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
