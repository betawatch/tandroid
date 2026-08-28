package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yw extends h31 {
    public boolean O;
    public cy P;
    public final /* synthetic */ vx Q;
    public final /* synthetic */ Context R;
    public final /* synthetic */ dy S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(dy dyVar, Context context, vx vxVar, Context context2) {
        super(context);
        this.S = dyVar;
        this.Q = vxVar;
        this.R = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.I = true;
    }

    @Override // org.telegram.ui.h31
    public final void d(boolean z10) {
        cy cyVar = this.P;
        cyVar.c.G = true;
        cyVar.d.O(this.P.a, c());
        cy cyVar2 = this.P;
        cyVar2.d.C = false;
        cyVar2.C.C = false;
        dy dyVar = this.S;
        dyVar.A4(false, true);
        this.P.a.setClipChildren(true);
        this.P.a.invalidate();
        this.P.d.l();
        this.P.C.l();
        this.P.a.y1(null, 0.0f, z10);
        dyVar.y = false;
        this.Q.requestLayout();
        if (!c()) {
            dyVar.M = true;
            dyVar.N = true;
            View view = dyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        mx mxVar = dyVar.y0;
        if (mxVar != null) {
            mxVar.R();
        }
        dyVar.V4(false, true);
        dyVar.D3();
        dyVar.U4();
    }

    @Override // org.telegram.ui.h31
    public final void e(boolean z10) {
        int i9;
        dy dyVar = this.S;
        dyVar.y = true;
        dyVar.A = z10;
        this.Q.requestLayout();
        cy cyVar = dyVar.a0[0];
        this.P = cyVar;
        if (cyVar.B == null) {
            cyVar.B = new ww(this.R, null);
            this.P.B.setLayoutManager(new xw(this, this.P));
            cy cyVar2 = this.P;
            int i10 = this.P.s;
            int i11 = dyVar.R2;
            boolean z11 = dyVar.h2;
            ArrayList arrayList = dyVar.E2;
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            cyVar2.C = new of.m(dyVar, this.R, i10, i11, z11, arrayList, i9, dyVar.C);
            cy cyVar3 = this.P;
            of.m mVar = cyVar3.C;
            mVar.O = true;
            cyVar3.B.setAdapter(mVar);
            cy cyVar4 = this.P;
            cyVar4.addView(cyVar4.B);
        }
        if (!z10) {
            dyVar.M = false;
            dyVar.C4(-dyVar.T3());
        }
        this.P.a.B0();
        cy cyVar5 = this.P;
        of.m mVar2 = cyVar5.C;
        mVar2.h = cyVar5.s;
        mVar2.l();
        cy cyVar6 = this.P;
        cyVar6.d.O(cyVar6.a, false);
        cy cyVar7 = this.P;
        cyVar7.d.C = true;
        cyVar7.C.C = true;
        cyVar7.c.H = false;
        dyVar.A4(true, true);
        dyVar.c4(this.O);
        this.P.d.l();
        this.P.C.l();
        float f10 = !z10 ? dyVar.J : -dyVar.J;
        cy cyVar8 = this.P;
        cyVar8.a.y1(cyVar8.B, f10, false);
        this.P.a.setClipChildren(false);
        this.P.a.B0();
        dyVar.D3();
        dyVar.U4();
    }

    @Override // org.telegram.ui.h31
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        dy dyVar = this.S;
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.h31
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yx yxVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f10 > 0.0f;
        if (this.O != z10) {
            this.O = z10;
        }
        dy dyVar = this.S;
        View view = dyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (dyVar.R2 != 0 || dyVar.T2 != 0) {
            Paint paint = dyVar.b1;
            int i9 = org.telegram.ui.ActionBar.f6.d6;
            paint.setColor(i0.a.d(f10, dyVar.getThemedColor(i9), dyVar.getThemedColor(i9)));
        }
        cy cyVar = this.P;
        if (cyVar != null) {
            cyVar.a.setOpenRightFragmentProgress(f10);
        }
        dyVar.C3();
        dyVar.H3();
        dyVar.u3();
        dyVar.E3();
        cy cyVar2 = dyVar.a0[0];
        if (cyVar2 != null && (yxVar = cyVar2.a) != null) {
            yxVar.requestLayout();
        }
        View view2 = dyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
