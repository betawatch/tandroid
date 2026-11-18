package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
