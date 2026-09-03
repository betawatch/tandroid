package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                xn xnVar = this.b;
                xnVar.e = sparseIntArray;
                zn znVar = xnVar.S;
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) znVar.getThemedDrawable("drawableMsgOut");
                xnVar.F = g5Var;
                e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                g5Var.H = e5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.g5 g5Var2 = (org.telegram.ui.ActionBar.g5) znVar.getThemedDrawable("drawableMsgOutMedia");
                xnVar.G = g5Var2;
                e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                g5Var2.H = e5Var2.getMessageDrawableOutMediaStart();
                xnVar.F.I = 0.0f;
                xnVar.G.I = 0.0f;
                znVar.uc();
                xnVar.k(0.0f);
                break;
            default:
                xn xnVar2 = this.b;
                xnVar2.F.H = null;
                xnVar2.G.H = null;
                xnVar2.e = null;
                xnVar2.k(1.0f);
                break;
        }
    }
}
