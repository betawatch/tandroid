package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ x60 b;

    public u60(x60 x60Var, FrameLayout frameLayout) {
        this.b = x60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        x60 x60Var = this.b;
        if (x60Var.z0 == null) {
            x60Var.z0 = (ad) x60Var.y0(x60Var.Z);
        }
        x60Var.z0.f.setOnClickListener(new t60(this, 0));
    }
}
