package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class rt extends LinearLayout {
    public final org.telegram.ui.Components.x9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public TLRPC.StickerSetCovered d;

    public rt(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = f6Var;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.a = x9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(x9Var, w7.x5.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, w7.x5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
