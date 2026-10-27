package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vw extends g31 {
    public boolean S;
    public dy T;
    public final /* synthetic */ wx U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ ey W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(ey eyVar, Context context, wx wxVar, Context context2) {
        super(context);
        this.W = eyVar;
        this.U = wxVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.g31
    public final void d(boolean z10) {
        dy dyVar = this.T;
        dyVar.c.G = true;
        dyVar.d.P(this.T.a, c());
        dy dyVar2 = this.T;
        dyVar2.d.G = false;
        dyVar2.G.G = false;
        ey eyVar = this.W;
        eyVar.I4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.E1(null, 0.0f, z10);
        eyVar.y = false;
        this.U.requestLayout();
        if (!c()) {
            eyVar.Q = true;
            eyVar.R = true;
            View view = eyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        mx mxVar = eyVar.C0;
        if (mxVar != null) {
            mxVar.S();
        }
        eyVar.e5(false, true);
        eyVar.L3();
        eyVar.c5();
    }

    @Override // org.telegram.ui.g31
    public final void e(boolean z10) {
        oi.q qVar;
        int i10;
        ey eyVar = this.W;
        eyVar.y = true;
        eyVar.E = z10;
        this.U.requestLayout();
        dy dyVar = eyVar.e0[0];
        this.T = dyVar;
        if (dyVar.F == null) {
            dyVar.F = new tw(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.r2) eyVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new uw(this, this.T));
            dy dyVar2 = this.T;
            int i11 = this.T.s;
            int i12 = eyVar.W2;
            boolean z11 = eyVar.l2;
            ArrayList arrayList = eyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
            dyVar2.G = new ig.n(eyVar, this.V, i11, i12, z11, arrayList, i10, eyVar.G);
            dy dyVar3 = this.T;
            ig.n nVar = dyVar3.G;
            nVar.S = true;
            dyVar3.F.setAdapter(nVar);
            dy dyVar4 = this.T;
            dyVar4.addView(dyVar4.F);
        }
        if (!z10) {
            eyVar.Q = false;
            eyVar.K4(-eyVar.b4());
        }
        this.T.a.C0();
        dy dyVar5 = this.T;
        ig.n nVar2 = dyVar5.G;
        nVar2.h = dyVar5.s;
        nVar2.l();
        dy dyVar6 = this.T;
        dyVar6.d.P(dyVar6.a, false);
        dy dyVar7 = this.T;
        dyVar7.d.G = true;
        dyVar7.G.G = true;
        dyVar7.c.H = false;
        eyVar.I4(true, true);
        eyVar.k4(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? eyVar.N : -eyVar.N;
        dy dyVar8 = this.T;
        dyVar8.a.E1(dyVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        eyVar.L3();
        eyVar.c5();
    }

    @Override // org.telegram.ui.g31
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ey eyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.g31
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zx zxVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        ey eyVar = this.W;
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            kVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (eyVar.W2 != 0 || eyVar.Y2 != 0) {
            Paint paint = eyVar.f1;
            int i10 = org.telegram.ui.ActionBar.y6.d6;
            paint.setColor(i0.a.f(f7, eyVar.getThemedColor(i10), eyVar.getThemedColor(i10)));
        }
        dy dyVar = this.T;
        if (dyVar != null) {
            dyVar.a.setOpenRightFragmentProgress(f7);
        }
        eyVar.K3();
        eyVar.P3();
        eyVar.C3();
        eyVar.M3();
        dy dyVar2 = eyVar.e0[0];
        if (dyVar2 != null && (zxVar = dyVar2.a) != null) {
            zxVar.requestLayout();
        }
        View view2 = eyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
