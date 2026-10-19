package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
