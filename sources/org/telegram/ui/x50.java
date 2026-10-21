package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class x50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ z50 b;

    public x50(z50 z50Var, FrameLayout frameLayout) {
        this.b = z50Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        z50 z50Var = this.b;
        if (z50Var.z0 == null) {
            z50Var.z0 = (tc) z50Var.y0(z50Var.Z);
        }
        z50Var.z0.f.setOnClickListener(new s50(this, 1));
    }
}
