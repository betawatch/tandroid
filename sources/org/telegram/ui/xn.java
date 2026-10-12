package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ xn(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                co coVar = this.b;
                coVar.e = sparseIntArray;
                fo foVar = coVar.V;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) foVar.getThemedDrawable("drawableMsgOut");
                coVar.I = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
                d5Var.J = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) foVar.getThemedDrawable("drawableMsgOutMedia");
                coVar.J = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
                d5Var2.J = b5Var2.getMessageDrawableOutMediaStart();
                coVar.I.K = 0.0f;
                coVar.J.K = 0.0f;
                foVar.yc();
                coVar.k(0.0f);
                break;
            default:
                co coVar2 = this.b;
                coVar2.I.J = null;
                coVar2.J.J = null;
                coVar2.e = null;
                coVar2.k(1.0f);
                break;
        }
    }
}
