package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class u7 extends FrameLayout {
    public final org.telegram.ui.Components.zl0 a;

    public u7(Context context, org.telegram.ui.Components.zl0 zl0Var) {
        super(context);
        this.a = zl0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(zl0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
