package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rj0 extends FrameLayout {
    public final org.telegram.ui.Components.ei0 a;

    public rj0(Context context) {
        super(context);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.a = ei0Var;
        ei0Var.setOnClickListener(new f50(this, 15));
        int L = org.telegram.messenger.i0.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView(ei0Var, layoutParams);
        setPadding(0, org.telegram.messenger.i0.L(32.0f), 0, 0);
        setLayoutParams(new s4.o0(-1, -2));
    }
}
