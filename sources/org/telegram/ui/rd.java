package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.h51 a;
    public final org.telegram.ui.ActionBar.h6 b;
    public final int c;
    public final int d;
    public final ai.c1 e;
    public final /* synthetic */ td f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.c1 c1Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f = tdVar;
        this.d = i7;
        this.c = i10;
        this.b = h6Var;
        this.e = c1Var;
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, h6Var);
        this.a = h51Var;
        setClipChildren(false);
        setClipToPadding(false);
        h51Var.setClipToPadding(false);
        h51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        h51Var.g3.r = false;
        h51Var.setCaptureSectionsDecoratorAllowed(true);
        h51Var.setOverScrollMode(0);
        addView(h51Var, c8.ma.c(-1.0f, -1));
        h51Var.setOnScrollListener(new bi.g6(3, this, c1Var));
        ri.q qVar = tdVar.x.e1;
        if (qVar != null) {
            qVar.b(h51Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
