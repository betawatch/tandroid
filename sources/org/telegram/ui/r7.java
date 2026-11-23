package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public final org.telegram.ui.Components.ek0 a;

    public r7(Context context, org.telegram.ui.Components.ek0 ek0Var) {
        super(context);
        this.a = ek0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ek0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
