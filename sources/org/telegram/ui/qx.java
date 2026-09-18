package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qx extends n41 {
    public boolean S;
    public vy T;
    public final /* synthetic */ py U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ wy W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(wy wyVar, Context context, py pyVar, Context context2) {
        super(context);
        this.W = wyVar;
        this.U = pyVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.n41
    public final void d(boolean z10) {
        vy vyVar = this.T;
        vyVar.c.G = true;
        vyVar.d.O(this.T.a, c());
        vy vyVar2 = this.T;
        vyVar2.d.G = false;
        vyVar2.G.G = false;
        wy wyVar = this.W;
        wyVar.A4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.z1(null, 0.0f, z10);
        wyVar.y = false;
        this.U.requestLayout();
        if (!c()) {
            wyVar.Q = true;
            wyVar.R = true;
            View view = wyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        gy gyVar = wyVar.C0;
        if (gyVar != null) {
            gyVar.S();
        }
        wyVar.V4(false, true);
        wyVar.D3();
        wyVar.U4();
    }

    @Override // org.telegram.ui.n41
    public final void e(boolean z10) {
        int i10;
        wy wyVar = this.W;
        wyVar.y = true;
        wyVar.E = z10;
        this.U.requestLayout();
        vy vyVar = wyVar.e0[0];
        this.T = vyVar;
        if (vyVar.F == null) {
            vyVar.F = new ox(this.V, null);
            this.T.F.setLayoutManager(new px(this, this.T));
            vy vyVar2 = this.T;
            int i11 = this.T.s;
            int i12 = wyVar.V2;
            boolean z11 = wyVar.l2;
            ArrayList arrayList = wyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
            vyVar2.G = new gg.m(wyVar, this.V, i11, i12, z11, arrayList, i10, wyVar.G);
            vy vyVar3 = this.T;
            gg.m mVar = vyVar3.G;
            mVar.S = true;
            vyVar3.F.setAdapter(mVar);
            vy vyVar4 = this.T;
            vyVar4.addView(vyVar4.F);
        }
        if (!z10) {
            wyVar.Q = false;
            wyVar.C4(-wyVar.T3());
        }
        this.T.a.C0();
        vy vyVar5 = this.T;
        gg.m mVar2 = vyVar5.G;
        mVar2.h = vyVar5.s;
        mVar2.l();
        vy vyVar6 = this.T;
        vyVar6.d.O(vyVar6.a, false);
        vy vyVar7 = this.T;
        vyVar7.d.G = true;
        vyVar7.G.G = true;
        vyVar7.c.H = false;
        wyVar.A4(true, true);
        wyVar.c4(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? wyVar.N : -wyVar.N;
        vy vyVar8 = this.T;
        vyVar8.a.z1(vyVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        wyVar.D3();
        wyVar.U4();
    }

    @Override // org.telegram.ui.n41
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wy wyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.n41
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        sy syVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        wy wyVar = this.W;
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
            kVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (wyVar.V2 != 0 || wyVar.X2 != 0) {
            Paint paint = wyVar.f1;
            int i10 = org.telegram.ui.ActionBar.j6.d6;
            paint.setColor(i0.a.d(f7, wyVar.getThemedColor(i10), wyVar.getThemedColor(i10)));
        }
        vy vyVar = this.T;
        if (vyVar != null) {
            vyVar.a.setOpenRightFragmentProgress(f7);
        }
        wyVar.C3();
        wyVar.H3();
        wyVar.u3();
        wyVar.E3();
        vy vyVar2 = wyVar.e0[0];
        if (vyVar2 != null && (syVar = vyVar2.a) != null) {
            syVar.requestLayout();
        }
        View view2 = wyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
