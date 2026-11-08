package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ym b;

    public /* synthetic */ tm(ym ymVar, int i7) {
        this.a = i7;
        this.b = ymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                ym ymVar = this.b;
                ymVar.e = sparseIntArray;
                an anVar = ymVar.G;
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) anVar.getThemedDrawable("drawableMsgOut");
                ymVar.t = t4Var;
                q4Var = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                t4Var.J = q4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.t4 t4Var2 = (org.telegram.ui.ActionBar.t4) anVar.getThemedDrawable("drawableMsgOutMedia");
                ymVar.u = t4Var2;
                q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                t4Var2.J = q4Var2.getMessageDrawableOutMediaStart();
                ymVar.t.K = 0.0f;
                ymVar.u.K = 0.0f;
                anVar.Yc();
                ymVar.u(0.0f);
                break;
            default:
                ym ymVar2 = this.b;
                ymVar2.t.J = null;
                ymVar2.u.J = null;
                ymVar2.e = null;
                ymVar2.u(1.0f);
                break;
        }
    }
}
