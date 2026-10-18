package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public abstract class ry extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(context, null);
        this.fragmentView = jw0Var;
        return jw0Var;
    }
}
