package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class z50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ b60 b;

    public z50(b60 b60Var, FrameLayout frameLayout) {
        this.b = b60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        b60 b60Var = this.b;
        if (b60Var.z0 == null) {
            b60Var.z0 = (vc) b60Var.y0(b60Var.Z);
        }
        b60Var.z0.f.setOnClickListener(new y50(this, 0));
    }
}
