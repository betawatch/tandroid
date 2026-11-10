package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                f40Var.K1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.U3.j(null);
                org.telegram.messenger.g0.b4(f40Var.g4);
                f40Var.b.requestLayout();
                break;
            default:
                f40 f40Var2 = this.b;
                f40Var2.K1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var2.U3.j(null);
                org.telegram.messenger.g0.b4(f40Var2.g4);
                f40Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
