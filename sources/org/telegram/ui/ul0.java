package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ul0 extends FrameLayout {
    public final org.telegram.ui.Components.lj0 a;

    public ul0(Context context) {
        super(context);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(context);
        this.a = lj0Var;
        lj0Var.setOnClickListener(new k60(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView(lj0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.p0(-1, -2));
    }
}
