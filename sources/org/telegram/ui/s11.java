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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public abstract class s11 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final vz0 G;
    public final bi.a h;
    public final org.telegram.ui.Components.x81 n;
    public final ai.x8 r;
    public final r11 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public s11(Context context, org.telegram.ui.Components.cw0 cw0Var, ai.x8 x8Var, final org.telegram.ui.Components.fs0 fs0Var) {
        super(context, cw0Var);
        this.F = new Rect();
        this.r = x8Var;
        Objects.requireNonNull(x8Var);
        this.G = new vz0(x8Var, 6);
        final org.telegram.ui.Components.gs0 gs0Var = (org.telegram.ui.Components.gs0) this;
        bi.a aVar = new bi.a(gs0Var, context, fs0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        r11 r11Var = new r11(gs0Var);
        this.s = r11Var;
        r11Var.a = x8Var.a();
        aVar.setAdapter(r11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.x81 n10 = aVar.n(10, true);
        this.n = n10;
        int i10 = org.telegram.ui.ActionBar.h6.Gh;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        int i12 = org.telegram.ui.ActionBar.h6.Eh;
        int i13 = org.telegram.ui.ActionBar.h6.Hh;
        int i14 = org.telegram.ui.ActionBar.h6.s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.h6.v0(i10, n10.j0));
        n10.r = 12;
        final int i15 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.p11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (i15) {
                    case 0:
                        if (!gs0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.fs0 fs0Var2 = fs0Var;
                                org.telegram.ui.Components.e5.S(fs0Var2.a, fs0Var2.b, fs0Var2.c, new org.telegram.ui.Components.ov(fs0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !gs0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.fs0 fs0Var3 = fs0Var;
                            org.telegram.ui.Components.lv0 lv0Var = fs0Var3.d;
                            org.telegram.ui.ActionBar.m2 m2Var = lv0Var.v1;
                            storiesController = lv0Var.getStoriesController();
                            if (storiesController.i(lv0Var.j1)) {
                                org.telegram.ui.Components.a80 H = org.telegram.ui.Components.a80.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.es0(fs0Var3));
                                final int i16 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.cs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.v1, lv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.v1, lv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.v1, lv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                lv0Var.x(H, m2Var, lv0Var.j1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.cs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.v1, lv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.v1, lv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.v1, lv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.cs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.v1, lv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.v1, lv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.v1, lv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.cs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.v1, lv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.v1, lv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.v1, lv0Var4.j1, intValue);
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
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.p11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (i16) {
                    case 0:
                        if (!gs0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.fs0 fs0Var2 = fs0Var;
                                org.telegram.ui.Components.e5.S(fs0Var2.a, fs0Var2.b, fs0Var2.c, new org.telegram.ui.Components.ov(fs0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !gs0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.fs0 fs0Var3 = fs0Var;
                            org.telegram.ui.Components.lv0 lv0Var = fs0Var3.d;
                            org.telegram.ui.ActionBar.m2 m2Var = lv0Var.v1;
                            storiesController = lv0Var.getStoriesController();
                            if (storiesController.i(lv0Var.j1)) {
                                org.telegram.ui.Components.a80 H = org.telegram.ui.Components.a80.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.es0(fs0Var3));
                                final int i162 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.cs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i162) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.v1, lv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.v1, lv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.v1, lv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                lv0Var.x(H, m2Var, lv0Var.j1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.cs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.v1, lv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.v1, lv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.v1, lv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.cs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.v1, lv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.v1, lv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.v1, lv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.cs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.v1, lv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.v1, lv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.v1, lv0Var4.j1, intValue);
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
        addView(n10, w7.y5.e(-1, 42, 48));
        b(!x8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E != z10 || z12) {
            this.E = z10;
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
            this.x.setInterpolator(org.telegram.ui.Components.sr.h);
            this.x.addUpdateListener(new q11(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.x8 x8Var = this.r;
            if (longValue != x8Var.b) {
                return;
            }
            org.telegram.ui.Components.x81 x81Var = this.n;
            int currentTabId = x81Var != null ? x81Var.getCurrentTabId() : 0;
            boolean a2 = x8Var.a();
            r11 r11Var = this.s;
            r11Var.a = a2;
            this.h.o(true);
            b(!x8Var.h.isEmpty(), true, false);
            int i12 = this.v;
            if (i12 > 0) {
                if (r11Var.i(i12) != -1) {
                    AndroidUtilities.runOnUIThread(new o11(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (x81Var == null || currentTabId <= 0 || x8Var.b(currentTabId) != null) {
                return;
            }
            x81Var.d(0, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.E && super.dispatchTouchEvent(motionEvent);
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

    @Override // org.telegram.ui.Components.ga, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.r.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.ui.Components.ga, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.r.a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new o11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        org.telegram.ui.Components.x81 x81Var = this.n;
        x81Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.gs0 gs0Var = (org.telegram.ui.Components.gs0) this;
        org.telegram.ui.Components.lv0 lv0Var = gs0Var.H;
        TextView textView = lv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.as0(1, gs0Var, z11)).start();
        lv0Var.q1(true);
        if (z10) {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new sb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        ai.x8 x8Var = this.r;
        x8Var.e();
        x8Var.f(false);
        int currentPosition = x81Var.getCurrentPosition();
        r11 r11Var = this.s;
        int f7 = r11Var.f(currentPosition);
        this.h.o(true);
        int i10 = r11Var.i(f7);
        x81Var.e(0.0f, i10, i10);
    }
}
