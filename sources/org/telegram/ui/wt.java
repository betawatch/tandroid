package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wt extends LinearLayout {
    public final org.telegram.ui.Components.z9 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.ActionBar.c6 c;
    public TLRPC.StickerSetCovered d;

    public wt(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.c = c6Var;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.a = z9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(z9Var, w7.a6.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, w7.a6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
