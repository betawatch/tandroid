package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                e40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.R3.j(null);
                org.telegram.messenger.g0.b4(e40Var.d4);
                e40Var.b.requestLayout();
                break;
            default:
                e40 e40Var2 = this.b;
                e40Var2.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var2.R3.j(null);
                org.telegram.messenger.g0.b4(e40Var2.d4);
                e40Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
