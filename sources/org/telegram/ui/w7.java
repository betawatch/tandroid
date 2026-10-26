package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public final org.telegram.ui.Components.mm0 a;

    public w7(Context context, org.telegram.ui.Components.mm0 mm0Var) {
        super(context);
        this.a = mm0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(mm0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
