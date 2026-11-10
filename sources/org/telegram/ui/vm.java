package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                an anVar = this.b;
                anVar.e = sparseIntArray;
                cn cnVar = anVar.G;
                org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) cnVar.getThemedDrawable("drawableMsgOut");
                anVar.t = u4Var;
                r4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                u4Var.J = r4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.u4 u4Var2 = (org.telegram.ui.ActionBar.u4) cnVar.getThemedDrawable("drawableMsgOutMedia");
                anVar.u = u4Var2;
                r4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                u4Var2.J = r4Var2.getMessageDrawableOutMediaStart();
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
