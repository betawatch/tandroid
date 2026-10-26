package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tw extends e31 {
    public boolean S;
    public ay T;
    public final /* synthetic */ tx U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ cy W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(cy cyVar, Context context, tx txVar, Context context2) {
        super(context);
        this.W = cyVar;
        this.U = txVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.e31
    public final void d(boolean z10) {
        ay ayVar = this.T;
        ayVar.c.G = true;
        ayVar.d.P(this.T.a, c());
        ay ayVar2 = this.T;
        ayVar2.d.G = false;
        ayVar2.G.G = false;
        cy cyVar = this.W;
        cyVar.I4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.E1(null, 0.0f, z10);
        cyVar.y = false;
        this.U.requestLayout();
        if (!c()) {
            cyVar.Q = true;
            cyVar.R = true;
            View view = cyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        jx jxVar = cyVar.C0;
        if (jxVar != null) {
            jxVar.S();
        }
        cyVar.e5(false, true);
        cyVar.L3();
        cyVar.c5();
    }

    @Override // org.telegram.ui.e31
    public final void e(boolean z10) {
        oi.q qVar;
        int i10;
        cy cyVar = this.W;
        cyVar.y = true;
        cyVar.E = z10;
        this.U.requestLayout();
        ay ayVar = cyVar.e0[0];
        this.T = ayVar;
        if (ayVar.F == null) {
            ayVar.F = new rw(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.r2) cyVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new sw(this, this.T));
            ay ayVar2 = this.T;
            int i11 = this.T.s;
            int i12 = cyVar.W2;
            boolean z11 = cyVar.l2;
            ArrayList arrayList = cyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
            ayVar2.G = new ig.n(cyVar, this.V, i11, i12, z11, arrayList, i10, cyVar.G);
            ay ayVar3 = this.T;
            ig.n nVar = ayVar3.G;
            nVar.S = true;
            ayVar3.F.setAdapter(nVar);
            ay ayVar4 = this.T;
            ayVar4.addView(ayVar4.F);
        }
        if (!z10) {
            cyVar.Q = false;
            cyVar.K4(-cyVar.b4());
        }
        this.T.a.C0();
        ay ayVar5 = this.T;
        ig.n nVar2 = ayVar5.G;
        nVar2.h = ayVar5.s;
        nVar2.l();
        ay ayVar6 = this.T;
        ayVar6.d.P(ayVar6.a, false);
        ay ayVar7 = this.T;
        ayVar7.d.G = true;
        ayVar7.G.G = true;
        ayVar7.c.H = false;
        cyVar.I4(true, true);
        cyVar.k4(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? cyVar.N : -cyVar.N;
        ay ayVar8 = this.T;
        ayVar8.a.E1(ayVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        cyVar.L3();
        cyVar.c5();
    }

    @Override // org.telegram.ui.e31
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cy cyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.e31
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wx wxVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        cy cyVar = this.W;
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            kVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (cyVar.W2 != 0 || cyVar.Y2 != 0) {
            Paint paint = cyVar.f1;
            int i10 = org.telegram.ui.ActionBar.y6.d6;
            paint.setColor(i0.a.f(f7, cyVar.getThemedColor(i10), cyVar.getThemedColor(i10)));
        }
        ay ayVar = this.T;
        if (ayVar != null) {
            ayVar.a.setOpenRightFragmentProgress(f7);
        }
        cyVar.K3();
        cyVar.P3();
        cyVar.C3();
        cyVar.M3();
        ay ayVar2 = cyVar.e0[0];
        if (ayVar2 != null && (wxVar = ayVar2.a) != null) {
            wxVar.requestLayout();
        }
        View view2 = cyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
