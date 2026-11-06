package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                c40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.R3.j(null);
                org.telegram.messenger.g0.b4(c40Var.d4);
                c40Var.b.requestLayout();
                break;
            default:
                c40 c40Var2 = this.b;
                c40Var2.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var2.R3.j(null);
                org.telegram.messenger.g0.b4(c40Var2.d4);
                c40Var2.b.requestLayout();
                break;
        }
        return false;
    }
}
