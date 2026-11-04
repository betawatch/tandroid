package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t7 extends FrameLayout {
    public final org.telegram.ui.Components.tj0 a;

    public t7(Context context, org.telegram.ui.Components.tj0 tj0Var) {
        super(context);
        this.a = tj0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(tj0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
