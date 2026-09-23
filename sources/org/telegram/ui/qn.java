package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                vn vnVar = this.b;
                vnVar.e = sparseIntArray;
                xn xnVar = vnVar.V;
                org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) xnVar.getThemedDrawable("drawableMsgOut");
                vnVar.I = e5Var;
                c5Var = ((org.telegram.ui.ActionBar.n2) xnVar).parentLayout;
                e5Var.H = c5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.e5 e5Var2 = (org.telegram.ui.ActionBar.e5) xnVar.getThemedDrawable("drawableMsgOutMedia");
                vnVar.J = e5Var2;
                c5Var2 = ((org.telegram.ui.ActionBar.n2) xnVar).parentLayout;
                e5Var2.H = c5Var2.getMessageDrawableOutMediaStart();
                vnVar.I.I = 0.0f;
                vnVar.J.I = 0.0f;
                xnVar.uc();
                vnVar.k(0.0f);
                break;
            default:
                vn vnVar2 = this.b;
                vnVar2.I.H = null;
                vnVar2.J.H = null;
                vnVar2.e = null;
                vnVar2.k(1.0f);
                break;
        }
    }
}
