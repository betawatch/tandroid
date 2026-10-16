package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
            x60Var.z0 = (zc) x60Var.y0(x60Var.Z);
        }
        x60Var.z0.f.setOnClickListener(new t60(this, 0));
    }
}
