package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wj extends org.telegram.ui.Components.tl0 {
    public final /* synthetic */ wm J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(wm wmVar, Context context, wm wmVar2, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, wmVar2, i3, j10, e6Var);
        this.J = wmVar;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void b(boolean z10) {
        wm wmVar = this.J;
        wmVar.H7();
        wmVar.F7();
        dk dkVar = wmVar.yb;
        if (dkVar != null) {
            dkVar.setTranslationY(wmVar.Q9 + getCurrentHeight());
        }
        if (z10) {
            wmVar.X9 = true;
            wmVar.Nc();
        }
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean f(dh.n0 n0Var) {
        int i3;
        wm wmVar = this.J;
        wmVar.F3 = n0Var;
        wmVar.G3 = n0Var != null;
        if (n0Var == null) {
            org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            wmVar.Mb(false);
            wmVar.jd(0, 0, -1);
        }
        wmVar.md();
        wmVar.Zc();
        wmVar.I3 = wmVar.k0.getSearchField().getText().toString();
        org.telegram.messenger.li mediaDataController2 = wmVar.getMediaDataController();
        String str = wmVar.I3;
        long j10 = wmVar.k6;
        long j11 = wmVar.c7;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        mediaDataController2.X1(str, j10, j11, i3, 0, wmVar.s4, false, wmVar.D3, wmVar.E3, (TextUtils.isEmpty(wmVar.I3) && wmVar.F3 == null) ? false : true, wmVar.F3);
        org.telegram.messenger.g0.v1(wmVar.k0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void h(boolean z10) {
        super.h(z10);
        wm wmVar = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = wmVar.k0;
        g(q0Var != null && q0Var.v() && a() && wmVar.J3 == null);
    }
}
