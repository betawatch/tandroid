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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class y01 extends org.telegram.ui.Components.w9 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public final Rect B;
    public final ky0 C;
    public final kh.a h;
    public final org.telegram.ui.Components.o71 n;
    public final jh.f6 r;
    public final x01 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public y01(Context context, org.telegram.ui.Components.zu0 zu0Var, jh.f6 f6Var, final org.telegram.ui.Components.zq0 zq0Var) {
        super(context, zu0Var);
        this.B = new Rect();
        this.r = f6Var;
        Objects.requireNonNull(f6Var);
        this.C = new ky0(f6Var, 7);
        final org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this;
        kh.a aVar = new kh.a(ar0Var, context, zq0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        x01 x01Var = new x01(ar0Var);
        this.s = x01Var;
        x01Var.a = f6Var.a();
        aVar.setAdapter(x01Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.o71 n10 = aVar.n(10, true);
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
                jh.s6 storiesController;
                Integer num = (Integer) obj;
                switch (i15) {
                    case 0:
                        if (!ar0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                                org.telegram.ui.Components.y4.S(zq0Var2.a, zq0Var2.b, zq0Var2.c, new org.telegram.ui.Components.vu(zq0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ar0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.zq0 zq0Var3 = zq0Var;
                            org.telegram.ui.Components.hu0 hu0Var = zq0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
                            storiesController = hu0Var.getStoriesController();
                            if (storiesController.i(hu0Var.f1)) {
                                org.telegram.ui.Components.b70 H = org.telegram.ui.Components.b70.H(n2Var, view);
                                H.W(new gh.z2(zq0Var3));
                                final int i16 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                hu0 hu0Var2 = zq0Var3.d;
                                                hu0Var2.O0(hu0Var2.r1, hu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                hu0 hu0Var3 = zq0Var3.d;
                                                hu0Var3.Q0(hu0Var3.r1, hu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                zq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                hu0 hu0Var4 = zq0Var3.d;
                                                hu0Var4.P0(hu0Var4.r1, hu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                hu0Var.x(H, n2Var, hu0Var.f1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                hu0 hu0Var2 = zq0Var3.d;
                                                hu0Var2.O0(hu0Var2.r1, hu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                hu0 hu0Var3 = zq0Var3.d;
                                                hu0Var3.Q0(hu0Var3.r1, hu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                zq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                hu0 hu0Var4 = zq0Var3.d;
                                                hu0Var4.P0(hu0Var4.r1, hu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                hu0 hu0Var2 = zq0Var3.d;
                                                hu0Var2.O0(hu0Var2.r1, hu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                hu0 hu0Var3 = zq0Var3.d;
                                                hu0Var3.Q0(hu0Var3.r1, hu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                zq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                hu0 hu0Var4 = zq0Var3.d;
                                                hu0Var4.P0(hu0Var4.r1, hu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                hu0 hu0Var2 = zq0Var3.d;
                                                hu0Var2.O0(hu0Var2.r1, hu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                hu0 hu0Var3 = zq0Var3.d;
                                                hu0Var3.Q0(hu0Var3.r1, hu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                zq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                hu0 hu0Var4 = zq0Var3.d;
                                                hu0Var4.P0(hu0Var4.r1, hu0Var4.f1, intValue);
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
                jh.s6 storiesController;
                Integer num = (Integer) obj;
                switch (i16) {
                    case 0:
                        if (!ar0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                                org.telegram.ui.Components.y4.S(zq0Var2.a, zq0Var2.b, zq0Var2.c, new org.telegram.ui.Components.vu(zq0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ar0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.zq0 zq0Var3 = zq0Var;
                            org.telegram.ui.Components.hu0 hu0Var = zq0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
                            storiesController = hu0Var.getStoriesController();
                            if (storiesController.i(hu0Var.f1)) {
                                org.telegram.ui.Components.b70 H = org.telegram.ui.Components.b70.H(n2Var, view);
                                H.W(new gh.z2(zq0Var3));
                                final int i162 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i162) {
                                            case 0:
                                                hu0 hu0Var2 = zq0Var3.d;
                                                hu0Var2.O0(hu0Var2.r1, hu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                hu0 hu0Var3 = zq0Var3.d;
                                                hu0Var3.Q0(hu0Var3.r1, hu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                zq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                hu0 hu0Var4 = zq0Var3.d;
                                                hu0Var4.P0(hu0Var4.r1, hu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                hu0Var.x(H, n2Var, hu0Var.f1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                hu0 hu0Var2 = zq0Var3.d;
                                                hu0Var2.O0(hu0Var2.r1, hu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                hu0 hu0Var3 = zq0Var3.d;
                                                hu0Var3.Q0(hu0Var3.r1, hu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                zq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                hu0 hu0Var4 = zq0Var3.d;
                                                hu0Var4.P0(hu0Var4.r1, hu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                hu0 hu0Var2 = zq0Var3.d;
                                                hu0Var2.O0(hu0Var2.r1, hu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                hu0 hu0Var3 = zq0Var3.d;
                                                hu0Var3.Q0(hu0Var3.r1, hu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                zq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                hu0 hu0Var4 = zq0Var3.d;
                                                hu0Var4.P0(hu0Var4.r1, hu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                hu0 hu0Var2 = zq0Var3.d;
                                                hu0Var2.O0(hu0Var2.r1, hu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                hu0 hu0Var3 = zq0Var3.d;
                                                hu0Var3.Q0(hu0Var3.r1, hu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                zq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                hu0 hu0Var4 = zq0Var3.d;
                                                hu0Var4.P0(hu0Var4.r1, hu0Var4.f1, intValue);
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
        addView(n10, h7.z5.e(-1, 42, 48));
        b(!f6Var.h.isEmpty(), false, true);
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
            this.x.setInterpolator(org.telegram.ui.Components.er.h);
            this.x.addUpdateListener(new w01(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            jh.f6 f6Var = this.r;
            if (longValue != f6Var.b) {
                return;
            }
            org.telegram.ui.Components.o71 o71Var = this.n;
            int currentTabId = o71Var != null ? o71Var.getCurrentTabId() : 0;
            boolean a2 = f6Var.a();
            x01 x01Var = this.s;
            x01Var.a = a2;
            this.h.o(true);
            b(!f6Var.h.isEmpty(), true, false);
            int i12 = this.v;
            if (i12 > 0) {
                if (x01Var.i(i12) != -1) {
                    AndroidUtilities.runOnUIThread(new u01(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (o71Var == null || currentTabId <= 0 || f6Var.b(currentTabId) != null) {
                return;
            }
            o71Var.d(0, 0);
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

    @Override // org.telegram.ui.Components.w9, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.r.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.ui.Components.w9, android.view.ViewGroup, android.view.View
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
        org.telegram.ui.Components.o71 o71Var = this.n;
        o71Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this;
        org.telegram.ui.Components.hu0 hu0Var = ar0Var.D;
        TextView textView = hu0Var.m0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.f50(5, ar0Var, z11)).start();
        hu0Var.q1(true);
        if (z10) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new gb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.C);
        jh.f6 f6Var = this.r;
        f6Var.e();
        f6Var.f(false);
        int currentPosition = o71Var.getCurrentPosition();
        x01 x01Var = this.s;
        int f10 = x01Var.f(currentPosition);
        this.h.o(true);
        int i10 = x01Var.i(f10);
        o71Var.e(0.0f, i10, i10);
    }
}
