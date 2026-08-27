package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class ty extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, null);
        this.fragmentView = zu0Var;
        return zu0Var;
    }
}
