package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ao b;

    public /* synthetic */ vn(ao aoVar, int i10) {
        this.a = i10;
        this.b = aoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                ao aoVar = this.b;
                aoVar.e = sparseIntArray;
                co coVar = aoVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) coVar.getThemedDrawable("drawableMsgOut");
                aoVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                f5Var.H = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) coVar.getThemedDrawable("drawableMsgOutMedia");
                aoVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                f5Var2.H = d5Var2.getMessageDrawableOutMediaStart();
                aoVar.I.I = 0.0f;
                aoVar.J.I = 0.0f;
                coVar.uc();
                aoVar.k(0.0f);
                break;
            default:
                ao aoVar2 = this.b;
                aoVar2.I.H = null;
                aoVar2.J.H = null;
                aoVar2.e = null;
                aoVar2.k(1.0f);
                break;
        }
    }
}
