package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ un(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zn znVar = this.b;
                znVar.e = sparseIntArray;
                bo boVar = znVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) boVar.getThemedDrawable("drawableMsgOut");
                znVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                f5Var.H = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) boVar.getThemedDrawable("drawableMsgOutMedia");
                znVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                f5Var2.H = d5Var2.getMessageDrawableOutMediaStart();
                znVar.I.I = 0.0f;
                znVar.J.I = 0.0f;
                boVar.uc();
                znVar.k(0.0f);
                break;
            default:
                zn znVar2 = this.b;
                znVar2.I.H = null;
                znVar2.J.H = null;
                znVar2.e = null;
                znVar2.k(1.0f);
                break;
        }
    }
}
