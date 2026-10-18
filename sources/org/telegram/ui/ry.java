package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public abstract class ry extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(context, null);
        this.fragmentView = jw0Var;
        return jw0Var;
    }
}
