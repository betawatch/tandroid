package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.uj0 a;

    public s7(Context context, org.telegram.ui.Components.uj0 uj0Var) {
        super(context);
        this.a = uj0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(uj0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
