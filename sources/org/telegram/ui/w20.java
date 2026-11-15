package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w20 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ w20(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                c40 c40Var = this.b;
                c40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.Z3.j(null);
                org.telegram.messenger.g0.a4(c40Var.l4);
                c40Var.b.requestLayout();
                break;
            default:
                c40 c40Var2 = this.b;
                c40Var2.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var2.Z3.j(null);
                org.telegram.messenger.g0.a4(c40Var2.l4);
                c40Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
