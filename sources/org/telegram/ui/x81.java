package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class x81 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final org.telegram.ui.Components.q90 b;
    public final org.telegram.ui.Components.q90 c;
    public final ci.d d;
    public final ci.d e;

    public x81(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = d6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.q90 a2 = w7.d6.a(context, 15.0f, i10, true, d6Var);
        this.b = a2;
        a2.setGravity(17);
        addView(a2, w7.z5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.q90 a10 = w7.d6.a(context, 13.0f, i10, false, d6Var);
        this.c = a10;
        a10.setGravity(17);
        addView(a10, w7.z5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d f7 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        this.d = f7;
        ci.d f10 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        this.e = f10;
        linearLayout.addView(f7, w7.z5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(f10, w7.z5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.z5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
