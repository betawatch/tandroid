package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class ry extends org.telegram.ui.ActionBar.o2 {
    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, null);
        this.fragmentView = ow0Var;
        return ow0Var;
    }
}
