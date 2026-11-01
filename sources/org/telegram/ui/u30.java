package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u30 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a50 b;

    public /* synthetic */ u30(a50 a50Var, int i10) {
        this.a = i10;
        this.b = a50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                a50 a50Var = this.b;
                a50Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                a50Var.R3.j(null);
                org.telegram.messenger.i0.a4(a50Var.d4);
                a50Var.b.requestLayout();
                break;
            default:
                a50 a50Var2 = this.b;
                a50Var2.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                a50Var2.R3.j(null);
                org.telegram.messenger.i0.a4(a50Var2.d4);
                a50Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
