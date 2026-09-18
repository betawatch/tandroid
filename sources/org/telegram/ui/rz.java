package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ExternalActionActivity a;

    public rz(ExternalActionActivity externalActionActivity) {
        this.a = externalActionActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
