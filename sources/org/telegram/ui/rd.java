package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.l41 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final int c;
    public final int d;
    public final cg.l0 e;
    public final /* synthetic */ td f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(td tdVar, Context context, int i3, int i10, int i11, cg.l0 l0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = tdVar;
        this.d = i3;
        this.c = i10;
        this.b = e6Var;
        this.e = l0Var;
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(context, i10, i11, true, new c5(this, 3), new x0(this, 15), null, e6Var);
        this.a = l41Var;
        setClipChildren(false);
        setClipToPadding(false);
        l41Var.setClipToPadding(false);
        l41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        l41Var.g3.r = false;
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        l41Var.setOverScrollMode(0);
        addView(l41Var, b8.mf.c(-1.0f, -1));
        l41Var.setOnScrollListener(new ai.i4(3, this, l0Var));
        pi.q qVar = tdVar.x.e1;
        if (qVar != null) {
            qVar.b(l41Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
