package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y20 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ y20(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                e40 e40Var = this.b;
                e40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.Z3.j(null);
                org.telegram.messenger.g0.Z3(e40Var.l4);
                e40Var.b.requestLayout();
                break;
            default:
                e40 e40Var2 = this.b;
                e40Var2.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var2.Z3.j(null);
                org.telegram.messenger.g0.Z3(e40Var2.l4);
                e40Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
