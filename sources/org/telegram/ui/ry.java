package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class ry extends org.telegram.ui.ActionBar.r2 {
    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        org.telegram.ui.Components.ww0 ww0Var = new org.telegram.ui.Components.ww0(context, null);
        this.fragmentView = ww0Var;
        return ww0Var;
    }
}
