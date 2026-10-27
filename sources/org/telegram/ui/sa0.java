package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sa0 implements OnBackAnimationCallback {
    public boolean b;
    public boolean e;
    public final /* synthetic */ LaunchActivity f;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public boolean c = false;
    public boolean d = false;

    public sa0(LaunchActivity launchActivity) {
        this.f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.c = false;
        this.d = false;
        if (this.b) {
            this.a.unlock();
            this.b = false;
        }
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.q0) == null || !actionBarLayout.i1) {
            return;
        }
        actionBarLayout.i1 = false;
        actionBarLayout.e(true);
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.b) {
            this.a.unlock();
            this.b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f.onBackPressed();
            return;
        }
        if (this.f.e0(true)) {
            LaunchActivity launchActivity = this.f;
            ActionBarLayout actionBarLayout = launchActivity.q0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.i1) {
                actionBarLayout.H();
            } else {
                actionBarLayout.i1 = false;
                actionBarLayout.e(false);
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (this.c && this.d) {
            return;
        }
        float progress = backEvent.getProgress();
        if (!this.e && progress > 0.015f) {
            this.e = true;
            if (!AndroidUtilities.isTablet() && this.f.e0(false) && (actionBarLayout2 = this.f.q0) != null && actionBarLayout2.I(backEvent.getTouchX(), backEvent.getTouchY()) && !this.b) {
                this.a.lock();
                this.b = true;
            }
        }
        float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.q0) == null || !actionBarLayout.i1) {
            return;
        }
        float interpolation = org.telegram.ui.Components.ds.l.getInterpolation(max) * AndroidUtilities.dp(56.0f);
        actionBarLayout.k1 = max > 0.0f;
        actionBarLayout.s.setTranslationX(interpolation);
        actionBarLayout.setInnerTranslationX(interpolation);
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.c = true;
        this.d = false;
        this.e = false;
    }
}
