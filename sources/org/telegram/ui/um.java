package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm b;

    public /* synthetic */ um(zm zmVar, int i7) {
        this.a = i7;
        this.b = zmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zm zmVar = this.b;
                zmVar.e = sparseIntArray;
                bn bnVar = zmVar.G;
                org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOut");
                zmVar.t = u4Var;
                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var.J = r4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.u4 u4Var2 = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOutMedia");
                zmVar.u = u4Var2;
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var2.J = r4Var2.getMessageDrawableOutMediaStart();
                zmVar.t.K = 0.0f;
                zmVar.u.K = 0.0f;
                bnVar.cd();
                zmVar.u(0.0f);
                break;
            default:
                zm zmVar2 = this.b;
                zmVar2.t.J = null;
                zmVar2.u.J = null;
                zmVar2.e = null;
                zmVar2.u(1.0f);
                break;
        }
    }
}
