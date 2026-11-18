package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zm zmVar = this.b;
                zmVar.e = sparseIntArray;
                bn bnVar = zmVar.G;
                org.telegram.ui.ActionBar.v4 v4Var = (org.telegram.ui.ActionBar.v4) bnVar.getThemedDrawable("drawableMsgOut");
                zmVar.t = v4Var;
                s4Var = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
                v4Var.J = s4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.v4 v4Var2 = (org.telegram.ui.ActionBar.v4) bnVar.getThemedDrawable("drawableMsgOutMedia");
                zmVar.u = v4Var2;
                s4Var2 = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
                v4Var2.J = s4Var2.getMessageDrawableOutMediaStart();
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
