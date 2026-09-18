package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class wt implements View.OnAttachStateChangeListener {
    public vt a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.a, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.a, NotificationCenter.emojiLoaded);
    }
}
