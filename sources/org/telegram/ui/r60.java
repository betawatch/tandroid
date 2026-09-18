package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ u60 b;

    public r60(u60 u60Var, FrameLayout frameLayout) {
        this.b = u60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        u60 u60Var = this.b;
        if (u60Var.z0 == null) {
            u60Var.z0 = (vc) u60Var.y0(u60Var.Z);
        }
        u60Var.z0.f.setOnClickListener(new m60(this, 1));
    }
}
