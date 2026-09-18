package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zn znVar = this.b;
                znVar.e = sparseIntArray;
                bo boVar = znVar.V;
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) boVar.getThemedDrawable("drawableMsgOut");
                znVar.I = g5Var;
                e5Var = ((org.telegram.ui.ActionBar.o2) boVar).parentLayout;
                g5Var.H = e5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.g5 g5Var2 = (org.telegram.ui.ActionBar.g5) boVar.getThemedDrawable("drawableMsgOutMedia");
                znVar.J = g5Var2;
                e5Var2 = ((org.telegram.ui.ActionBar.o2) boVar).parentLayout;
                g5Var2.H = e5Var2.getMessageDrawableOutMediaStart();
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
