package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ve0 implements Runnable {
    public final /* synthetic */ ff0 a;

    public ve0(ff0 ff0Var) {
        this.a = ff0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ff0 ff0Var = this.a;
        if (ff0Var.b == null) {
            return;
        }
        for (int i7 = 0; i7 < ff0Var.b.getChildCount(); i7++) {
            View childAt = ff0Var.b.getChildAt(i7);
            if (childAt instanceof cf0) {
                cf0 cf0Var = (cf0) childAt;
                if (cf0Var.I) {
                    cf0Var.b(cf0Var.n, cf0Var.r);
                }
            }
        }
        org.telegram.messenger.g0.i3(this, 500L);
    }
}
