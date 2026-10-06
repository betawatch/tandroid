package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
