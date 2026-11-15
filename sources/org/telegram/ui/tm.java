package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                ym ymVar = this.b;
                ymVar.e = sparseIntArray;
                an anVar = ymVar.G;
                org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) anVar.getThemedDrawable("drawableMsgOut");
                ymVar.t = r4Var;
                o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                r4Var.J = o4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.r4 r4Var2 = (org.telegram.ui.ActionBar.r4) anVar.getThemedDrawable("drawableMsgOutMedia");
                ymVar.u = r4Var2;
                o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                r4Var2.J = o4Var2.getMessageDrawableOutMediaStart();
                ymVar.t.K = 0.0f;
                ymVar.u.K = 0.0f;
                anVar.cd();
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
