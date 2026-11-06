package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.pj0 a;

    public s7(Context context, org.telegram.ui.Components.pj0 pj0Var) {
        super(context);
        this.a = pj0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(pj0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
