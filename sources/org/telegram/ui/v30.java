package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v30 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b50 b;

    public /* synthetic */ v30(b50 b50Var, int i10) {
        this.a = i10;
        this.b = b50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                b50 b50Var = this.b;
                b50Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                b50Var.R3.j(null);
                org.telegram.messenger.i0.a4(b50Var.d4);
                b50Var.b.requestLayout();
                break;
            default:
                b50 b50Var2 = this.b;
                b50Var2.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                b50Var2.R3.j(null);
                org.telegram.messenger.i0.a4(b50Var2.d4);
                b50Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
