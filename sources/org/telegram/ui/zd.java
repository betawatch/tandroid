package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zd extends FrameLayout {
    public final org.telegram.ui.Components.k51 a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final int c;
    public final int d;
    public final cg.w1 e;
    public final /* synthetic */ be f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(be beVar, Context context, int i10, int i11, int i12, cg.w1 w1Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = beVar;
        this.d = i10;
        this.c = i11;
        this.b = c6Var;
        this.e = w1Var;
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(context, i11, i12, true, new b5(this, 3), new c1(this, 13), null, c6Var);
        this.a = k51Var;
        addView(k51Var, h7.z5.c(-1.0f, -1));
        k51Var.setOnScrollListener(new fh.l(2, this, w1Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.U2.N(false);
    }
}
