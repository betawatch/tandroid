package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.uk0 a;

    public s7(Context context, org.telegram.ui.Components.uk0 uk0Var) {
        super(context);
        this.a = uk0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(uk0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
