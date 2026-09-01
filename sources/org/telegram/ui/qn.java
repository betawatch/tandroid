package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vn b;

    public /* synthetic */ qn(vn vnVar, int i10) {
        this.a = i10;
        this.b = vnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                vn vnVar = this.b;
                vnVar.e = sparseIntArray;
                xn xnVar = vnVar.S;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) xnVar.getThemedDrawable("drawableMsgOut");
                vnVar.F = h5Var;
                f5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                h5Var.H = f5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) xnVar.getThemedDrawable("drawableMsgOutMedia");
                vnVar.G = h5Var2;
                f5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                h5Var2.H = f5Var2.getMessageDrawableOutMediaStart();
                vnVar.F.I = 0.0f;
                vnVar.G.I = 0.0f;
                xnVar.uc();
                vnVar.k(0.0f);
                break;
            default:
                vn vnVar2 = this.b;
                vnVar2.F.H = null;
                vnVar2.G.H = null;
                vnVar2.e = null;
                vnVar2.k(1.0f);
                break;
        }
    }
}
