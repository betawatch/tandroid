package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class td extends FrameLayout {
    public final org.telegram.ui.Components.k41 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final bg.m0 e;
    public final /* synthetic */ vd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(vd vdVar, Context context, int i7, int i10, int i11, bg.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = vdVar;
        this.d = i7;
        this.c = i10;
        this.b = f6Var;
        this.e = m0Var;
        org.telegram.ui.Components.k41 k41Var = new org.telegram.ui.Components.k41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, f6Var);
        this.a = k41Var;
        setClipChildren(false);
        setClipToPadding(false);
        k41Var.setClipToPadding(false);
        k41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        k41Var.f3.r = false;
        k41Var.setCaptureSectionsDecoratorAllowed(true);
        k41Var.setOverScrollMode(0);
        addView(k41Var, c8.ha.c(-1.0f, -1));
        k41Var.setOnScrollListener(new ai.o0(2, this, m0Var));
        oi.q qVar = vdVar.x.d1;
        if (qVar != null) {
            qVar.b(k41Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f3.O(false);
    }
}
