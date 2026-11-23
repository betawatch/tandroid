package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.g51 a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final int c;
    public final int d;
    public final ai.u0 e;
    public final /* synthetic */ td f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.u0 u0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f = tdVar;
        this.d = i7;
        this.c = i10;
        this.b = i6Var;
        this.e = u0Var;
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, i6Var);
        this.a = g51Var;
        setClipChildren(false);
        setClipToPadding(false);
        g51Var.setClipToPadding(false);
        g51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        g51Var.g3.r = false;
        g51Var.setCaptureSectionsDecoratorAllowed(true);
        g51Var.setOverScrollMode(0);
        addView(g51Var, c8.na.c(-1.0f, -1));
        g51Var.setOnScrollListener(new bi.j6(3, this, u0Var));
        ri.q qVar = tdVar.x.e1;
        if (qVar != null) {
            qVar.b(g51Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
