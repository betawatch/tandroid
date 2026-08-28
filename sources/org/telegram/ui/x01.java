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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class x01 extends org.telegram.ui.Components.y9 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public final Rect B;
    public final ky0 C;
    public final jh.a h;
    public final org.telegram.ui.Components.m71 n;
    public final ih.j6 r;
    public final w01 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public x01(Context context, org.telegram.ui.Components.xu0 xu0Var, ih.j6 j6Var, final org.telegram.ui.Components.yq0 yq0Var) {
        super(context, xu0Var);
        this.B = new Rect();
        this.r = j6Var;
        Objects.requireNonNull(j6Var);
        this.C = new ky0(j6Var, 7);
        final org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this;
        jh.a aVar = new jh.a(zq0Var, context, yq0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        w01 w01Var = new w01(zq0Var);
        this.s = w01Var;
        w01Var.a = j6Var.a();
        aVar.setAdapter(w01Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.m71 n10 = aVar.n(10, true);
        this.n = n10;
        int i9 = org.telegram.ui.ActionBar.f6.Gh;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        int i11 = org.telegram.ui.ActionBar.f6.Eh;
        int i12 = org.telegram.ui.ActionBar.f6.Hh;
        int i13 = org.telegram.ui.ActionBar.f6.s8;
        n10.L = i9;
        n10.M = i10;
        n10.N = i11;
        n10.O = i12;
        n10.P = i13;
        n10.K.setColor(org.telegram.ui.ActionBar.f6.v0(i9, n10.f0));
        n10.r = 12;
        final int i14 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.u01
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ih.v6 storiesController;
                Integer num = (Integer) obj;
                switch (i14) {
                    case 0:
                        if (!zq0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.yq0 yq0Var2 = yq0Var;
                                org.telegram.ui.Components.y4.S(yq0Var2.a, yq0Var2.b, yq0Var2.c, new org.telegram.ui.Components.wu(yq0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zq0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.yq0 yq0Var3 = yq0Var;
                            org.telegram.ui.Components.eu0 eu0Var = yq0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
                            storiesController = eu0Var.getStoriesController();
                            if (storiesController.i(eu0Var.f1)) {
                                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(o2Var, view);
                                H.W(new fh.e3(yq0Var3));
                                final int i15 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.wq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.r1, eu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.r1, eu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.r1, eu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                eu0Var.x(H, o2Var, eu0Var.f1, intValue);
                                final int i16 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.wq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.r1, eu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.r1, eu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.r1, eu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i17 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.wq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.r1, eu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.r1, eu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.r1, eu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.wq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.r1, eu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.r1, eu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.r1, eu0Var4.f1, intValue);
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
        final int i15 = 1;
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.u01
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ih.v6 storiesController;
                Integer num = (Integer) obj;
                switch (i15) {
                    case 0:
                        if (!zq0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.yq0 yq0Var2 = yq0Var;
                                org.telegram.ui.Components.y4.S(yq0Var2.a, yq0Var2.b, yq0Var2.c, new org.telegram.ui.Components.wu(yq0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zq0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.yq0 yq0Var3 = yq0Var;
                            org.telegram.ui.Components.eu0 eu0Var = yq0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
                            storiesController = eu0Var.getStoriesController();
                            if (storiesController.i(eu0Var.f1)) {
                                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(o2Var, view);
                                H.W(new fh.e3(yq0Var3));
                                final int i152 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.wq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i152) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.r1, eu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.r1, eu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.r1, eu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                eu0Var.x(H, o2Var, eu0Var.f1, intValue);
                                final int i16 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.wq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.r1, eu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.r1, eu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.r1, eu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i17 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.wq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.r1, eu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.r1, eu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.r1, eu0Var4.f1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.wq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.r1, eu0Var2.f1, intValue);
                                                break;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.r1, eu0Var3.f1, intValue);
                                                break;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.r1, eu0Var4.f1, intValue);
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
        addView(n10, g7.e6.e(-1, 42, 48));
        b(!j6Var.h.isEmpty(), false, true);
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
            this.x.setInterpolator(org.telegram.ui.Components.gr.h);
            this.x.addUpdateListener(new v01(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ih.j6 j6Var = this.r;
            if (longValue != j6Var.b) {
                return;
            }
            org.telegram.ui.Components.m71 m71Var = this.n;
            int currentTabId = m71Var != null ? m71Var.getCurrentTabId() : 0;
            boolean a2 = j6Var.a();
            w01 w01Var = this.s;
            w01Var.a = a2;
            this.h.o(true);
            b(!j6Var.h.isEmpty(), true, false);
            int i11 = this.v;
            if (i11 > 0) {
                if (w01Var.i(i11) != -1) {
                    AndroidUtilities.runOnUIThread(new t01(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (m71Var == null || currentTabId <= 0 || j6Var.b(currentTabId) != null) {
                return;
            }
            m71Var.d(0, 0);
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

    @Override // org.telegram.ui.Components.y9, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.r.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.ui.Components.y9, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.r.a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.B;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i9) {
        if (this.s.i(i9) != -1) {
            AndroidUtilities.runOnUIThread(new t01(this, i9, 0), 500L);
        } else {
            this.v = i9;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        org.telegram.ui.Components.m71 m71Var = this.n;
        m71Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this;
        org.telegram.ui.Components.eu0 eu0Var = zq0Var.D;
        TextView textView = eu0Var.m0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.a50(5, zq0Var, z11)).start();
        eu0Var.q1(true);
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new cb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.C);
        ih.j6 j6Var = this.r;
        j6Var.e();
        j6Var.f(false);
        int currentPosition = m71Var.getCurrentPosition();
        w01 w01Var = this.s;
        int f10 = w01Var.f(currentPosition);
        this.h.o(true);
        int i9 = w01Var.i(f10);
        m71Var.e(0.0f, i9, i9);
    }
}
