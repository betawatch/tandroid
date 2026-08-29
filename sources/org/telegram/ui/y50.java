package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ a60 b;

    public y50(a60 a60Var, FrameLayout frameLayout) {
        this.b = a60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        a60 a60Var = this.b;
        if (a60Var.v0 == null) {
            a60Var.v0 = (oc) a60Var.y0(a60Var.V);
        }
        a60Var.v0.f.setOnClickListener(new t50(this, 1));
    }
}
