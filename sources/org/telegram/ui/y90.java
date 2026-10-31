package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y90 implements OnBackAnimationCallback {
    public boolean b;
    public boolean e;
    public final /* synthetic */ LaunchActivity f;
    public final e2.f a = new e2.f(null);
    public boolean c = false;
    public boolean d = false;

    public y90(LaunchActivity launchActivity) {
        this.f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.c = false;
        this.d = false;
        if (this.b) {
            this.a.e();
            this.b = false;
        }
        if (org.telegram.messenger.i0.Q1() || (actionBarLayout = this.f.q0) == null || !actionBarLayout.i1) {
            return;
        }
        actionBarLayout.i1 = false;
        actionBarLayout.e(true);
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.b) {
            this.a.e();
            this.b = false;
        }
        if (org.telegram.messenger.i0.Q1()) {
            this.f.onBackPressed();
            return;
        }
        if (this.f.d0(true)) {
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
            if (!org.telegram.messenger.i0.Q1() && this.f.d0(false) && (actionBarLayout2 = this.f.q0) != null && actionBarLayout2.I(backEvent.getTouchX(), backEvent.getTouchY()) && !this.b) {
                this.a.d();
                this.b = true;
            }
        }
        float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
        if (org.telegram.messenger.i0.Q1() || (actionBarLayout = this.f.q0) == null || !actionBarLayout.i1) {
            return;
        }
        float interpolation = org.telegram.ui.Components.gr.l.getInterpolation(max) * org.telegram.messenger.i0.L(56.0f);
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
