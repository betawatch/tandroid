package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ c60 b;

    public z50(c60 c60Var, FrameLayout frameLayout) {
        this.b = c60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        c60 c60Var = this.b;
        if (c60Var.v0 == null) {
            c60Var.v0 = (qc) c60Var.y0(c60Var.V);
        }
        c60Var.v0.f.setOnClickListener(new u50(this, 1));
    }
}
