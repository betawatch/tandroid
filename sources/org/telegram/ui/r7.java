package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
