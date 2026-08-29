package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xd extends FrameLayout {
    public final org.telegram.ui.Components.u51 a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final int c;
    public final int d;
    public final bg.f e;
    public final /* synthetic */ zd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(zd zdVar, Context context, int i10, int i11, int i12, bg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = zdVar;
        this.d = i10;
        this.c = i11;
        this.b = c6Var;
        this.e = fVar;
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, i11, i12, true, new b5(this, 3), new c1(this, 13), null, c6Var);
        this.a = u51Var;
        addView(u51Var, i7.f6.c(-1.0f, -1));
        u51Var.setOnScrollListener(new hh.l(2, this, fVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.U2.N(false);
    }
}
