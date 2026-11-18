package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.e51 a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final int c;
    public final int d;
    public final ai.w0 e;
    public final /* synthetic */ td f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.w0 w0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f = tdVar;
        this.d = i7;
        this.c = i10;
        this.b = i6Var;
        this.e = w0Var;
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, i6Var);
        this.a = e51Var;
        setClipChildren(false);
        setClipToPadding(false);
        e51Var.setClipToPadding(false);
        e51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        e51Var.g3.r = false;
        e51Var.setCaptureSectionsDecoratorAllowed(true);
        e51Var.setOverScrollMode(0);
        addView(e51Var, c8.ma.c(-1.0f, -1));
        e51Var.setOnScrollListener(new bi.d6(3, this, w0Var));
        ri.q qVar = tdVar.x.e1;
        if (qVar != null) {
            qVar.b(e51Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
