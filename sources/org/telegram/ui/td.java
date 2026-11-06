package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class td extends FrameLayout {
    public final org.telegram.ui.Components.q41 a;
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
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, f6Var);
        this.a = q41Var;
        setClipChildren(false);
        setClipToPadding(false);
        q41Var.setClipToPadding(false);
        q41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        q41Var.f3.r = false;
        q41Var.setCaptureSectionsDecoratorAllowed(true);
        q41Var.setOverScrollMode(0);
        addView(q41Var, c8.ha.c(-1.0f, -1));
        q41Var.setOnScrollListener(new ai.o0(2, this, m0Var));
        oi.q qVar = vdVar.x.d1;
        if (qVar != null) {
            qVar.b(q41Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f3.O(false);
    }
}
