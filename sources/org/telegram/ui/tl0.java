package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tl0 extends FrameLayout {
    public final org.telegram.ui.Components.aj0 a;

    public tl0(Context context) {
        super(context);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.a = aj0Var;
        aj0Var.setOnClickListener(new l60(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView(aj0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.p0(-1, -2));
    }
}
