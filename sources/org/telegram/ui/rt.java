package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rt extends LinearLayout {
    public final org.telegram.ui.Components.u9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.e6 c;
    public TLRPC.StickerSetCovered d;

    public rt(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.a = u9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(u9Var, w7.x5.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, w7.x5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
