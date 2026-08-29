package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class sy extends org.telegram.ui.ActionBar.o2 {
    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.Components.hv0 hv0Var = new org.telegram.ui.Components.hv0(context, null);
        this.fragmentView = hv0Var;
        return hv0Var;
    }
}
