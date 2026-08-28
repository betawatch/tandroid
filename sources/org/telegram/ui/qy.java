package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class qy extends org.telegram.ui.ActionBar.o2 {
    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.Components.xu0 xu0Var = new org.telegram.ui.Components.xu0(context, null);
        this.fragmentView = xu0Var;
        return xu0Var;
    }
}
