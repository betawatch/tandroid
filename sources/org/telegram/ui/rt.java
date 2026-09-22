package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rt extends LinearLayout {
    public final org.telegram.ui.Components.v9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public TLRPC.StickerSetCovered d;

    public rt(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = f6Var;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.a = v9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(v9Var, w7.y5.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, w7.y5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
