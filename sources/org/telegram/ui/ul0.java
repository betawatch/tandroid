package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ul0 extends FrameLayout {
    public final org.telegram.ui.Components.bj0 a;

    public ul0(Context context) {
        super(context);
        org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(context);
        this.a = bj0Var;
        bj0Var.setOnClickListener(new m60(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView(bj0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.p0(-1, -2));
    }
}
