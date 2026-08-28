package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ y50 b;

    public v50(y50 y50Var, FrameLayout frameLayout) {
        this.b = y50Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        y50 y50Var = this.b;
        if (y50Var.v0 == null) {
            y50Var.v0 = (pc) y50Var.x0(y50Var.V);
        }
        y50Var.v0.f.setOnClickListener(new q50(this, 1));
    }
}
