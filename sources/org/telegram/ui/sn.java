package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ sn(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                xn xnVar = this.b;
                xnVar.e = sparseIntArray;
                zn znVar = xnVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) znVar.getThemedDrawable("drawableMsgOut");
                xnVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                f5Var.H = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) znVar.getThemedDrawable("drawableMsgOutMedia");
                xnVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                f5Var2.H = d5Var2.getMessageDrawableOutMediaStart();
                xnVar.I.I = 0.0f;
                xnVar.J.I = 0.0f;
                znVar.uc();
                xnVar.k(0.0f);
                break;
            default:
                xn xnVar2 = this.b;
                xnVar2.I.H = null;
                xnVar2.J.H = null;
                xnVar2.e = null;
                xnVar2.k(1.0f);
                break;
        }
    }
}
