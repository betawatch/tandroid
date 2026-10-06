package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
