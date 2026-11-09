package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ vm(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                an anVar = this.b;
                anVar.e = sparseIntArray;
                cn cnVar = anVar.G;
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) cnVar.getThemedDrawable("drawableMsgOut");
                anVar.t = t4Var;
                q4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                t4Var.J = q4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.t4 t4Var2 = (org.telegram.ui.ActionBar.t4) cnVar.getThemedDrawable("drawableMsgOutMedia");
                anVar.u = t4Var2;
                q4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                t4Var2.J = q4Var2.getMessageDrawableOutMediaStart();
                anVar.t.K = 0.0f;
                anVar.u.K = 0.0f;
                cnVar.bd();
                anVar.u(0.0f);
                break;
            default:
                an anVar2 = this.b;
                anVar2.t.J = null;
                anVar2.u.J = null;
                anVar2.e = null;
                anVar2.u(1.0f);
                break;
        }
    }
}
