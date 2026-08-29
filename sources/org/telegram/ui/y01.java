package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class y01 extends org.telegram.ui.Components.da implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public final Rect B;
    public final ky0 C;
    public final mh.a h;
    public final org.telegram.ui.Components.y71 n;
    public final lh.g6 r;
    public final x01 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public y01(Context context, org.telegram.ui.Components.hv0 hv0Var, lh.g6 g6Var, final org.telegram.ui.Components.jr0 jr0Var) {
        super(context, hv0Var);
        this.B = new Rect();
        this.r = g6Var;
        Objects.requireNonNull(g6Var);
        this.C = new ky0(g6Var, 7);
        final org.telegram.ui.Components.kr0 kr0Var = (org.telegram.ui.Components.kr0) this;
        mh.a aVar = new mh.a(kr0Var, context, jr0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        x01 x01Var = new x01(kr0Var);
        this.s = x01Var;
        x01Var.a = g6Var.a();
        aVar.setAdapter(x01Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.y71 n10 = aVar.n(10, true);
        this.n = n10;
        int i10 = org.telegram.ui.ActionBar.g6.Gh;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int i12 = org.telegram.ui.ActionBar.g6.Eh;
        int i13 = org.telegram.ui.ActionBar.g6.Hh;
        int i14 = org.telegram.ui.ActionBar.g6.s8;
        n10.L = i10;
        n10.M = i11;
        n10.N = i12;
        n10.O = i13;
        n10.P = i14;
        n10.K.setColor(org.telegram.ui.ActionBar.g6.v0(i10, n10.f0));
        n10.r = 12;
        final int i15 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.v01
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                lh.s6 storiesController;
                Integer num = (Integer) obj;
                switch (i15) {
                    case 0:
                        if (!kr0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.jr0 jr0Var2 = jr0Var;
                                org.telegram.ui.Components.c5.S(jr0Var2.a, jr0Var2.b, jr0Var2.c, new org.telegram.ui.Components.cv(jr0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !kr0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.jr0 jr0Var3 = jr0Var;
                            org.telegram.ui.Components.qu0 qu0Var = jr0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
                            storiesController = qu0Var.getStoriesController();
                            if (storiesController.i(qu0Var.f1)) {
                                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(o2Var, view);
                                H.W(new ih.t2(jr0Var3));
                                final int i16 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.hr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.r1, qu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.r1, qu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.r1, qu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                qu0Var.x(H, o2Var, qu0Var.f1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.hr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.r1, qu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.r1, qu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.r1, qu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.hr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.r1, qu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.r1, qu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.r1, qu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.hr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.r1, qu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.r1, qu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.r1, qu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, true);
                                H.Z();
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return Boolean.FALSE;
            }
        });
        final int i16 = 1;
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.v01
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                lh.s6 storiesController;
                Integer num = (Integer) obj;
                switch (i16) {
                    case 0:
                        if (!kr0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.jr0 jr0Var2 = jr0Var;
                                org.telegram.ui.Components.c5.S(jr0Var2.a, jr0Var2.b, jr0Var2.c, new org.telegram.ui.Components.cv(jr0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !kr0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.jr0 jr0Var3 = jr0Var;
                            org.telegram.ui.Components.qu0 qu0Var = jr0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
                            storiesController = qu0Var.getStoriesController();
                            if (storiesController.i(qu0Var.f1)) {
                                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(o2Var, view);
                                H.W(new ih.t2(jr0Var3));
                                final int i162 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.hr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i162) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.r1, qu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.r1, qu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.r1, qu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                qu0Var.x(H, o2Var, qu0Var.f1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.hr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.r1, qu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.r1, qu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.r1, qu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.hr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.r1, qu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.r1, qu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.r1, qu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.hr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.r1, qu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.r1, qu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.r1, qu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, true);
                                H.Z();
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return Boolean.FALSE;
            }
        });
        addView(n10, i7.f6.e(-1, 42, 48));
        b(!g6Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.A != z10 || z12) {
            this.A = z10;
            setEnabled(z10);
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            if (!z11) {
                this.y = z10 ? 1.0f : 0.0f;
                a();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.setDuration(480L);
            this.x.setInterpolator(org.telegram.ui.Components.jr.h);
            this.x.addUpdateListener(new w01(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            lh.g6 g6Var = this.r;
            if (longValue != g6Var.b) {
                return;
            }
            org.telegram.ui.Components.y71 y71Var = this.n;
            int currentTabId = y71Var != null ? y71Var.getCurrentTabId() : 0;
            boolean a2 = g6Var.a();
            x01 x01Var = this.s;
            x01Var.a = a2;
            this.h.o(true);
            b(!g6Var.h.isEmpty(), true, false);
            int i12 = this.v;
            if (i12 > 0) {
                if (x01Var.i(i12) != -1) {
                    AndroidUtilities.runOnUIThread(new u01(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (y71Var == null || currentTabId <= 0 || g6Var.b(currentTabId) != null) {
                return;
            }
            y71Var.d(0, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A && super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentAlbumId() {
        return this.s.f(this.n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.y;
    }

    @Override // org.telegram.ui.Components.da, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.r.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.ui.Components.da, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.r.a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.B;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new u01(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        org.telegram.ui.Components.y71 y71Var = this.n;
        y71Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.kr0 kr0Var = (org.telegram.ui.Components.kr0) this;
        org.telegram.ui.Components.qu0 qu0Var = kr0Var.D;
        TextView textView = qu0Var.m0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.p90(4, kr0Var, z11)).start();
        qu0Var.q1(true);
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new fb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.C);
        lh.g6 g6Var = this.r;
        g6Var.e();
        g6Var.f(false);
        int currentPosition = y71Var.getCurrentPosition();
        x01 x01Var = this.s;
        int f9 = x01Var.f(currentPosition);
        this.h.o(true);
        int i10 = x01Var.i(f9);
        y71Var.e(0.0f, i10, i10);
    }
}
