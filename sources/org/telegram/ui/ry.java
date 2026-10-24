package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class ry extends org.telegram.ui.ActionBar.o2 {
    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, null);
        this.fragmentView = ow0Var;
        return ow0Var;
    }
}
