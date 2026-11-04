package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r20 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ r20(x30 x30Var, int i3) {
        this.a = i3;
        this.b = x30Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                x30 x30Var = this.b;
                x30Var.I1.getViewTreeObserver().removeOnPreDrawListener(this);
                x30Var.S3.j(null);
                org.telegram.messenger.g0.b4(x30Var.e4);
                x30Var.b.requestLayout();
                break;
            default:
                x30 x30Var2 = this.b;
                x30Var2.I1.getViewTreeObserver().removeOnPreDrawListener(this);
                x30Var2.S3.j(null);
                org.telegram.messenger.g0.b4(x30Var2.e4);
                x30Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
