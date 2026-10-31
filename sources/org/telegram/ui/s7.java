package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.tk0 a;

    public s7(Context context, org.telegram.ui.Components.tk0 tk0Var) {
        super(context);
        this.a = tk0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(tk0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
