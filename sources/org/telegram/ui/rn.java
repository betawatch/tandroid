package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ rn(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                wn wnVar = this.b;
                wnVar.e = sparseIntArray;
                yn ynVar = wnVar.V;
                org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) ynVar.getThemedDrawable("drawableMsgOut");
                wnVar.I = e5Var;
                c5Var = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                e5Var.H = c5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.e5 e5Var2 = (org.telegram.ui.ActionBar.e5) ynVar.getThemedDrawable("drawableMsgOutMedia");
                wnVar.J = e5Var2;
                c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                e5Var2.H = c5Var2.getMessageDrawableOutMediaStart();
                wnVar.I.I = 0.0f;
                wnVar.J.I = 0.0f;
                ynVar.tc();
                wnVar.k(0.0f);
                break;
            default:
                wn wnVar2 = this.b;
                wnVar2.I.H = null;
                wnVar2.J.H = null;
                wnVar2.e = null;
                wnVar2.k(1.0f);
                break;
        }
    }
}
