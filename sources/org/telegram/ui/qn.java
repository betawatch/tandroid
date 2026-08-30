package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                vn vnVar = this.b;
                vnVar.e = sparseIntArray;
                xn xnVar = vnVar.S;
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) xnVar.getThemedDrawable("drawableMsgOut");
                vnVar.F = g5Var;
                e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                g5Var.H = e5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.g5 g5Var2 = (org.telegram.ui.ActionBar.g5) xnVar.getThemedDrawable("drawableMsgOutMedia");
                vnVar.G = g5Var2;
                e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                g5Var2.H = e5Var2.getMessageDrawableOutMediaStart();
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
