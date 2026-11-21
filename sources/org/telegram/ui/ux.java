package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ux implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ExternalActionActivity a;

    public ux(ExternalActionActivity externalActionActivity) {
        this.a = externalActionActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.a;
        externalActionActivity.g();
        ActionBarLayout actionBarLayout = externalActionActivity.c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
