package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tl0 extends FrameLayout {
    public final org.telegram.ui.Components.fk0 a;

    public tl0(Context context) {
        super(context);
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(context);
        this.a = fk0Var;
        fk0Var.setOnClickListener(new m60(this, 13));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView(fk0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.q0(-1, -2));
    }
}
