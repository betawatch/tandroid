package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ExternalActionActivity a;

    public qx(ExternalActionActivity externalActionActivity) {
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
