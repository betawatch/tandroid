package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ra0 implements OnBackAnimationCallback {
    public boolean b;
    public boolean e;
    public final /* synthetic */ LaunchActivity f;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public boolean c = false;
    public boolean d = false;

    public ra0(LaunchActivity launchActivity) {
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r1.T != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        org.telegram.ui.ActionBar.r rVar;
        if (this.c && this.d) {
            return;
        }
        float progress = backEvent.getProgress();
        if (!this.e && progress > 0.015f) {
            this.e = true;
            if (!AndroidUtilities.isTablet() && this.f.e0(false) && (actionBarLayout2 = this.f.q0) != null) {
                float touchX = backEvent.getTouchX();
                float touchY = backEvent.getTouchY();
                Activity activity = actionBarLayout2.Q0;
                if (actionBarLayout2.T) {
                    AnimatorSet animatorSet = actionBarLayout2.n1;
                    if (animatorSet != null) {
                        animatorSet.end();
                        actionBarLayout2.n1 = null;
                    }
                }
                if (!actionBarLayout2.j1 && !actionBarLayout2.i1 && !actionBarLayout2.a0 && !actionBarLayout2.Q && !actionBarLayout2.i() && actionBarLayout2.U0.size() > 1 && !actionBarLayout2.x() && ((rVar = actionBarLayout2.G) == null || !rVar.hasShownSheet())) {
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) si.o0.g(1, actionBarLayout2.U0);
                    if (o2Var.onBackPressed(false) && !o2Var.hasShownSheet() && o2Var.canBeginSlide()) {
                        actionBarLayout2.k1 = false;
                        actionBarLayout2.j1 = true;
                        actionBarLayout2.i1 = true;
                        actionBarLayout2.m1 = touchX < ((float) AndroidUtilities.displaySize.x) / 2.0f;
                        actionBarLayout2.l1 = touchY;
                        actionBarLayout2.P();
                        if (activity != null && activity.getCurrentFocus() != null) {
                            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                        }
                        o2Var.onBeginSlide();
                        if (!this.b) {
                            this.a.lock();
                            this.b = true;
                        }
                    }
                }
            }
        }
        float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.q0) == null || !actionBarLayout.i1) {
            return;
        }
        float interpolation = org.telegram.ui.Components.bs.l.getInterpolation(max) * AndroidUtilities.dp(56.0f);
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
