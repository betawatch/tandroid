package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public final org.telegram.ui.Components.ck0 a;

    public r7(Context context, org.telegram.ui.Components.ck0 ck0Var) {
        super(context);
        this.a = ck0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ck0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
