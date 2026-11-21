package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
