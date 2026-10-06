package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class qt extends LinearLayout {
    public final org.telegram.ui.Components.w9 a;
    public final org.telegram.ui.ActionBar.i5 b;
    public final org.telegram.ui.ActionBar.d6 c;
    public TLRPC.StickerSetCovered d;

    public qt(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = d6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.b = i5Var;
        i5Var.setTextSize(16);
        i5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.z5.t(24, 24, 17, 17, 0, 17, 0));
        addView(i5Var, w7.z5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
