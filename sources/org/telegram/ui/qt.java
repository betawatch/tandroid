package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qt extends LinearLayout {
    public final org.telegram.ui.Components.p9 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public TLRPC.StickerSetCovered d;

    public qt(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = f6Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(-1);
        setOrientation(0);
        addView(p9Var, k7.b6.t(24, 24, 17, 17, 0, 17, 0));
        addView(k5Var, k7.b6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
