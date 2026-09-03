package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ya0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ LaunchActivity a;

    public ya0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.a1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.a1);
    }
}
