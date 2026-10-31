package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wk extends org.telegram.ui.Components.rm0 {
    public final /* synthetic */ un I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(un unVar, Context context, un unVar2, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, unVar2, i10, j10, p6Var);
        this.I = unVar;
    }

    @Override // org.telegram.ui.Components.rm0
    public final void b(boolean z10) {
        un unVar = this.I;
        unVar.B7();
        unVar.z7();
        dl dlVar = unVar.wb;
        if (dlVar != null) {
            dlVar.setTranslationY(unVar.P9 + getCurrentHeight());
        }
        if (z10) {
            unVar.W9 = true;
            unVar.Dc();
        }
    }

    @Override // org.telegram.ui.Components.rm0
    public final boolean f(sg.o0 o0Var) {
        int i10;
        un unVar = this.I;
        unVar.E3 = o0Var;
        unVar.F3 = o0Var != null;
        if (o0Var == null) {
            org.telegram.messenger.ui mediaDataController = unVar.getMediaDataController();
            mediaDataController.Y0.clear();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            unVar.Cb(false);
            unVar.Zc(0, 0, -1);
        }
        unVar.cd();
        unVar.Pc();
        unVar.H3 = unVar.j0.getSearchField().getText().toString();
        org.telegram.messenger.ui mediaDataController2 = unVar.getMediaDataController();
        String str = unVar.H3;
        long j10 = unVar.j6;
        long j11 = unVar.b7;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        mediaDataController2.X1(str, j10, j11, i10, 0, unVar.r4, false, unVar.C3, unVar.D3, (TextUtils.isEmpty(unVar.H3) && unVar.E3 == null) ? false : true, unVar.E3);
        org.telegram.messenger.i0.v1(unVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.rm0
    public final void h(boolean z10) {
        super.h(z10);
        un unVar = this.I;
        org.telegram.ui.ActionBar.t0 t0Var = unVar.j0;
        g(t0Var != null && t0Var.v() && a() && unVar.I3 == null);
    }
}
