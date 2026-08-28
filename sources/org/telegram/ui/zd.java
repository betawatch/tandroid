package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zd extends FrameLayout {
    public final org.telegram.ui.Components.i51 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final int c;
    public final int d;
    public final bg.c2 e;
    public final /* synthetic */ be f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(be beVar, Context context, int i9, int i10, int i11, bg.c2 c2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f = beVar;
        this.d = i9;
        this.c = i10;
        this.b = b6Var;
        this.e = c2Var;
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(context, i10, i11, true, new a5(this, 3), new b1(this, 13), null, b6Var);
        this.a = i51Var;
        addView(i51Var, g7.e6.c(-1.0f, -1));
        i51Var.setOnScrollListener(new eh.n(2, this, c2Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.U2.N(false);
    }
}
