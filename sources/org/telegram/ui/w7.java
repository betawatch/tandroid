package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public final org.telegram.ui.Components.nm0 a;

    public w7(Context context, org.telegram.ui.Components.nm0 nm0Var) {
        super(context);
        this.a = nm0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(nm0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
