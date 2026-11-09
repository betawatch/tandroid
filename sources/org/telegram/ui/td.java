package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class td extends FrameLayout {
    public final org.telegram.ui.Components.r41 a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final int c;
    public final int d;
    public final bg.m0 e;
    public final /* synthetic */ vd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(vd vdVar, Context context, int i7, int i10, int i11, bg.m0 m0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = vdVar;
        this.d = i7;
        this.c = i10;
        this.b = g6Var;
        this.e = m0Var;
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, g6Var);
        this.a = r41Var;
        setClipChildren(false);
        setClipToPadding(false);
        r41Var.setClipToPadding(false);
        r41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        r41Var.f3.r = false;
        r41Var.setCaptureSectionsDecoratorAllowed(true);
        r41Var.setOverScrollMode(0);
        addView(r41Var, c8.ha.c(-1.0f, -1));
        r41Var.setOnScrollListener(new ai.o0(2, this, m0Var));
        oi.q qVar = vdVar.x.d1;
        if (qVar != null) {
            qVar.b(r41Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f3.O(false);
    }
}
