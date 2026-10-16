package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class sx extends r41 {
    public boolean S;
    public xy T;
    public final /* synthetic */ ry U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ yy W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(yy yyVar, Context context, ry ryVar, Context context2) {
        super(context);
        this.W = yyVar;
        this.U = ryVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.r41
    public final void d(boolean z10) {
        xy xyVar = this.T;
        xyVar.c.G = true;
        xyVar.d.O(this.T.a, c());
        xy xyVar2 = this.T;
        xyVar2.d.G = false;
        xyVar2.G.G = false;
        yy yyVar = this.W;
        yyVar.y4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.z1(null, 0.0f, z10);
        yyVar.y = false;
        this.U.requestLayout();
        if (!c()) {
            yyVar.Q = true;
            yyVar.R = true;
            View view = yyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        iy iyVar = yyVar.C0;
        if (iyVar != null) {
            iyVar.R();
        }
        yyVar.T4(false, true);
        yyVar.B3();
        yyVar.S4();
    }

    @Override // org.telegram.ui.r41
    public final void e(boolean z10) {
        int i10;
        yy yyVar = this.W;
        yyVar.y = true;
        yyVar.E = z10;
        this.U.requestLayout();
        xy xyVar = yyVar.e0[0];
        this.T = xyVar;
        if (xyVar.F == null) {
            xyVar.F = new qx(this.V, null);
            this.T.F.setLayoutManager(new rx(this, this.T));
            xy xyVar2 = this.T;
            int i11 = this.T.s;
            int i12 = yyVar.W2;
            boolean z11 = yyVar.l2;
            ArrayList arrayList = yyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            xyVar2.G = new hg.m(yyVar, this.V, i11, i12, z11, arrayList, i10, yyVar.G);
            xy xyVar3 = this.T;
            hg.m mVar = xyVar3.G;
            mVar.S = true;
            xyVar3.F.setAdapter(mVar);
            xy xyVar4 = this.T;
            xyVar4.addView(xyVar4.F);
        }
        if (!z10) {
            yyVar.Q = false;
            yyVar.A4(-yyVar.R3());
        }
        this.T.a.B0();
        xy xyVar5 = this.T;
        hg.m mVar2 = xyVar5.G;
        mVar2.h = xyVar5.s;
        mVar2.l();
        xy xyVar6 = this.T;
        xyVar6.d.O(xyVar6.a, false);
        xy xyVar7 = this.T;
        xyVar7.d.G = true;
        xyVar7.G.G = true;
        xyVar7.c.H = false;
        yyVar.y4(true, true);
        yyVar.a4(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? yyVar.N : -yyVar.N;
        xy xyVar8 = this.T;
        xyVar8.a.z1(xyVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.B0();
        yyVar.B3();
        yyVar.S4();
    }

    @Override // org.telegram.ui.r41
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yy yyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.r41
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uy uyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        yy yyVar = this.W;
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            kVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (yyVar.W2 != 0 || yyVar.Y2 != 0) {
            Paint paint = yyVar.f1;
            int i10 = org.telegram.ui.ActionBar.g6.d6;
            paint.setColor(i0.a.d(f7, yyVar.getThemedColor(i10), yyVar.getThemedColor(i10)));
        }
        xy xyVar = this.T;
        if (xyVar != null) {
            xyVar.a.setOpenRightFragmentProgress(f7);
        }
        yyVar.A3();
        yyVar.F3();
        yyVar.s3();
        yyVar.C3();
        xy xyVar2 = yyVar.e0[0];
        if (xyVar2 != null && (uyVar = xyVar2.a) != null) {
            uyVar.requestLayout();
        }
        View view2 = yyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
