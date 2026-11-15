package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.u41 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final int c;
    public final int d;
    public final ai.w0 e;
    public final /* synthetic */ td f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.w0 w0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = tdVar;
        this.d = i7;
        this.c = i10;
        this.b = e6Var;
        this.e = w0Var;
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, e6Var);
        this.a = u41Var;
        setClipChildren(false);
        setClipToPadding(false);
        u41Var.setClipToPadding(false);
        u41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        u41Var.g3.r = false;
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        u41Var.setOverScrollMode(0);
        addView(u41Var, c8.ja.c(-1.0f, -1));
        u41Var.setOnScrollListener(new bi.w3(3, this, w0Var));
        ri.q qVar = tdVar.x.e1;
        if (qVar != null) {
            qVar.b(u41Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
