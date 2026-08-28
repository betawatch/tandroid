package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y71 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.Components.l80 b;
    public final org.telegram.ui.Components.l80 c;
    public final kh.d d;
    public final kh.d e;

    public y71(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = b6Var;
        setOrientation(1);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.Components.l80 a2 = g7.i6.a(context, 15.0f, i9, true, b6Var);
        this.b = a2;
        a2.setGravity(17);
        addView(a2, g7.e6.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.l80 a3 = g7.i6.a(context, 13.0f, i9, false, b6Var);
        this.c = a3;
        a3.setGravity(17);
        addView(a3, g7.e6.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        kh.d i10 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        this.d = i10;
        kh.d i11 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        this.e = i11;
        linearLayout.addView(i10, g7.e6.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(i11, g7.e6.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, g7.e6.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
