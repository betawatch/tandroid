package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w71 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 a;
    public final org.telegram.ui.Components.p80 b;
    public final org.telegram.ui.Components.p80 c;
    public final lh.d d;
    public final lh.d e;

    public w71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = c6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.p80 a2 = h7.d6.a(context, 15.0f, i10, true, c6Var);
        this.b = a2;
        a2.setGravity(17);
        addView(a2, h7.z5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.p80 a3 = h7.d6.a(context, 13.0f, i10, false, c6Var);
        this.c = a3;
        a3.setGravity(17);
        addView(a3, h7.z5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        lh.d g10 = org.telegram.messenger.rl.g(24, context, c6Var, true);
        this.d = g10;
        lh.d g11 = org.telegram.messenger.rl.g(24, context, c6Var, true);
        this.e = g11;
        linearLayout.addView(g10, h7.z5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, h7.z5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, h7.z5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
