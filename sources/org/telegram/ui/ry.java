package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class ry extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(context, null);
        this.fragmentView = jw0Var;
        return jw0Var;
    }
}
