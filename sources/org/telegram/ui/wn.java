package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ wn(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                bo boVar = this.b;
                boVar.e = sparseIntArray;
                eo eoVar = boVar.V;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) eoVar.getThemedDrawable("drawableMsgOut");
                boVar.I = h5Var;
                f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                h5Var.H = f5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) eoVar.getThemedDrawable("drawableMsgOutMedia");
                boVar.J = h5Var2;
                f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                h5Var2.H = f5Var2.getMessageDrawableOutMediaStart();
                boVar.I.I = 0.0f;
                boVar.J.I = 0.0f;
                eoVar.uc();
                boVar.k(0.0f);
                break;
            default:
                bo boVar2 = this.b;
                boVar2.I.H = null;
                boVar2.J.H = null;
                boVar2.e = null;
                boVar2.k(1.0f);
                break;
        }
    }
}
