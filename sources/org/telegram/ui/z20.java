package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z20 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ z20(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                f40 f40Var = this.b;
                f40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.Z3.j(null);
                org.telegram.messenger.g0.Z3(f40Var.l4);
                f40Var.b.requestLayout();
                break;
            default:
                f40 f40Var2 = this.b;
                f40Var2.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var2.Z3.j(null);
                org.telegram.messenger.g0.Z3(f40Var2.l4);
                f40Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
