package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wv extends xy0 {
    public boolean T;
    public ax U;
    public final /* synthetic */ uw V;
    public final /* synthetic */ Context W;
    public final /* synthetic */ bx a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(bx bxVar, Context context, uw uwVar, Context context2) {
        super(context);
        this.a0 = bxVar;
        this.V = uwVar;
        this.W = context2;
        this.e = 0.0f;
        this.n = new h2.f((int[]) null);
        this.N = true;
    }

    @Override // org.telegram.ui.xy0
    public final void d(boolean z10) {
        ax axVar = this.U;
        axVar.c.G = true;
        axVar.d.P(this.U.a, c());
        ax axVar2 = this.U;
        axVar2.d.H = false;
        axVar2.H.H = false;
        bx bxVar = this.a0;
        bxVar.U4(false, true);
        this.U.a.setClipChildren(true);
        this.U.a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.a.B1(null, 0.0f, z10);
        bxVar.E = false;
        this.V.requestLayout();
        if (!c()) {
            bxVar.R = true;
            if (bxVar.O != 0.0f) {
                bxVar.S = true;
            }
            View view = bxVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        jw jwVar = bxVar.D0;
        if (jwVar != null) {
            jwVar.Q();
        }
        bxVar.q5(false, true);
        bxVar.P3();
        bxVar.o5();
    }

    @Override // org.telegram.ui.xy0
    public final void e(boolean z10) {
        ri.q qVar;
        int i7;
        bx bxVar = this.a0;
        bxVar.E = true;
        bxVar.F = z10;
        this.V.requestLayout();
        ax axVar = bxVar.f0[0];
        this.U = axVar;
        if (axVar.G == null) {
            axVar.G = new uv(this.W, null);
            qVar = ((org.telegram.ui.ActionBar.g2) bxVar).glassEngine;
            qVar.b(this.U.G);
            this.U.G.setLayoutManager(new vv(this, this.U));
            ax axVar2 = this.U;
            int i10 = this.U.s;
            int i11 = bxVar.Y2;
            boolean z11 = bxVar.n2;
            ArrayList arrayList = bxVar.K2;
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            axVar2.H = new jg.m(bxVar, this.W, i10, i11, z11, arrayList, i7, bxVar.H);
            ax axVar3 = this.U;
            jg.m mVar = axVar3.H;
            mVar.T = true;
            axVar3.G.setAdapter(mVar);
            ax axVar4 = this.U;
            axVar4.addView(axVar4.G);
        }
        if (!z10) {
            bxVar.R = false;
            v4.f1 L = this.U.a.L((bxVar.n4() && this.U.s == 0) ? 1 : 0, false);
            bxVar.W4((L == null || L.a.getTop() < this.U.a.getPaddingTop()) ? -bxVar.f4() : 0.0f);
        }
        this.U.a.C0();
        ax axVar5 = this.U;
        jg.m mVar2 = axVar5.H;
        mVar2.h = axVar5.s;
        mVar2.f();
        ax axVar6 = this.U;
        axVar6.d.P(axVar6.a, false);
        ax axVar7 = this.U;
        axVar7.d.H = true;
        axVar7.H.H = true;
        axVar7.c.H = false;
        bxVar.U4(true, true);
        bxVar.q4(this.T);
        this.U.d.f();
        this.U.H.f();
        float f10 = !z10 ? bxVar.O : -bxVar.O;
        ax axVar8 = this.U;
        axVar8.a.B1(axVar8.G, f10, false);
        this.U.a.setClipChildren(false);
        this.U.a.C0();
        bxVar.P3();
        bxVar.o5();
    }

    @Override // org.telegram.ui.xy0
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bx bxVar = this.a0;
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.xy0
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xw xwVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f10 > 0.0f;
        if (this.T != z10) {
            this.T = z10;
        }
        bx bxVar = this.a0;
        View view = bxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (bxVar.Y2 != 0 || bxVar.a3 != 0) {
            Paint paint = bxVar.h1;
            int i7 = org.telegram.ui.ActionBar.n6.d6;
            paint.setColor(i0.a.f(f10, bxVar.getThemedColor(i7), bxVar.getThemedColor(i7)));
        }
        ax axVar = this.U;
        if (axVar != null) {
            axVar.a.setOpenRightFragmentProgress(f10);
        }
        bxVar.O3();
        bxVar.T3();
        bxVar.G3();
        bxVar.Q3();
        ax axVar2 = bxVar.f0[0];
        if (axVar2 != null && (xwVar = axVar2.a) != null) {
            xwVar.requestLayout();
        }
        View view2 = bxVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
