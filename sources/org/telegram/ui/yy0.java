package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class yy0 extends FrameLayout implements org.telegram.messenger.vs {
    public final wy0 a;
    public final org.telegram.ui.Components.w71 b;
    public final th.t4 c;
    public final xy0 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final vv0 w;

    public yy0(Context context, th.t4 t4Var, final org.telegram.ui.Components.zq0 zq0Var) {
        super(context);
        this.s = new Rect();
        this.c = t4Var;
        Objects.requireNonNull(t4Var);
        this.w = new vv0(t4Var, 10);
        final org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this;
        wy0 wy0Var = new wy0(ar0Var, context, zq0Var, 0);
        this.a = wy0Var;
        wy0Var.setAllowDisallowInterceptTouch(true);
        xy0 xy0Var = new xy0(ar0Var);
        this.d = xy0Var;
        xy0Var.a = t4Var.a();
        wy0Var.setAdapter(xy0Var);
        wy0Var.setTranslationY(org.telegram.messenger.i0.L(42.0f));
        org.telegram.ui.Components.w71 n10 = wy0Var.n(10, true);
        this.b = n10;
        n10.g(org.telegram.ui.ActionBar.t6.ui, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.si, org.telegram.ui.ActionBar.t6.vi, org.telegram.ui.ActionBar.t6.s8);
        n10.r = 12;
        final int i10 = 0;
        n10.setPreTabClick(new org.telegram.messenger.l20() { // from class: org.telegram.ui.uy0
            @Override // org.telegram.messenger.l20
            public final Object d(Number number, Object obj) {
                th.e5 storiesController;
                int i11 = i10;
                final org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                org.telegram.ui.Components.ar0 ar0Var2 = ar0Var;
                Integer num = (Integer) number;
                switch (i11) {
                    case 0:
                        if (!ar0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.s4.R(zq0Var2.a, zq0Var2.b, zq0Var2.c, new org.telegram.ui.Components.px(zq0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ar0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.au0 au0Var = zq0Var2.d;
                            org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
                            storiesController = au0Var.getStoriesController();
                            if (storiesController.i(au0Var.l1)) {
                                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(k2Var, view);
                                H.W(new org.telegram.ui.Components.yq0(zq0Var2));
                                final int i12 = 0;
                                H.c(R.drawable.menu_add_stories, org.telegram.messenger.dd.L0(2131744816, null), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.x1, au0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.x1, au0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                break;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.x1, au0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                au0Var.A(new k2.m0(H), k2Var, au0Var.l1, intValue);
                                final int i13 = 1;
                                H.c(R.drawable.msg_edit, org.telegram.messenger.dd.L0(2131744811, null), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.x1, au0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.x1, au0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                break;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.x1, au0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 2;
                                H.c(R.drawable.tabs_reorder, org.telegram.messenger.dd.L0(2131744808, null), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.x1, au0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.x1, au0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                break;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.x1, au0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i15 = 3;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.dd.L0(2131744814, null), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.x1, au0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.x1, au0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                break;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.x1, au0Var4.l1, intValue);
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
        final int i11 = 1;
        n10.setOnTabLongClick(new org.telegram.messenger.l20() { // from class: org.telegram.ui.uy0
            @Override // org.telegram.messenger.l20
            public final Object d(Number number, Object obj) {
                th.e5 storiesController;
                int i112 = i11;
                final org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                org.telegram.ui.Components.ar0 ar0Var2 = ar0Var;
                Integer num = (Integer) number;
                switch (i112) {
                    case 0:
                        if (!ar0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.s4.R(zq0Var2.a, zq0Var2.b, zq0Var2.c, new org.telegram.ui.Components.px(zq0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ar0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.au0 au0Var = zq0Var2.d;
                            org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
                            storiesController = au0Var.getStoriesController();
                            if (storiesController.i(au0Var.l1)) {
                                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(k2Var, view);
                                H.W(new org.telegram.ui.Components.yq0(zq0Var2));
                                final int i12 = 0;
                                H.c(R.drawable.menu_add_stories, org.telegram.messenger.dd.L0(2131744816, null), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.x1, au0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.x1, au0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                break;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.x1, au0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                au0Var.A(new k2.m0(H), k2Var, au0Var.l1, intValue);
                                final int i13 = 1;
                                H.c(R.drawable.msg_edit, org.telegram.messenger.dd.L0(2131744811, null), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.x1, au0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.x1, au0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                break;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.x1, au0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 2;
                                H.c(R.drawable.tabs_reorder, org.telegram.messenger.dd.L0(2131744808, null), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.x1, au0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.x1, au0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                break;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.x1, au0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i15 = 3;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.dd.L0(2131744814, null), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.x1, au0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.x1, au0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                break;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.x1, au0Var4.l1, intValue);
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
        addView(n10, w7.b6.e(-1, 42, 48));
        c(!t4Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.w71 w71Var = this.b;
        int currentTabId = w71Var != null ? w71Var.getCurrentTabId() : 0;
        th.t4 t4Var = this.c;
        boolean a2 = t4Var.a();
        xy0 xy0Var = this.d;
        xy0Var.a = a2;
        this.a.o(true);
        c(!t4Var.h.isEmpty(), true, false);
        int i10 = this.e;
        if (i10 > 0) {
            if (xy0Var.i(i10) != -1) {
                org.telegram.messenger.i0.h3(new vy0(this, this.e, 1), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (w71Var == null || currentTabId <= 0 || t4Var.b(currentTabId) != null) {
            return;
        }
        w71Var.d(0, 0);
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.r != z10 || z12) {
            this.r = z10;
            setEnabled(z10);
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            if (!z11) {
                this.n = z10 ? 1.0f : 0.0f;
                b();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
            this.h = ofFloat;
            ofFloat.setDuration(480L);
            this.h.setInterpolator(org.telegram.ui.Components.gr.h);
            this.h.addUpdateListener(new a3(this, 28));
            this.h.start();
        }
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.j3 && ((Long) objArr[0]).longValue() == this.c.b) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.r && super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        th.t4 t4Var = this.c;
        org.telegram.messenger.at.f(t4Var.a).c(this, org.telegram.messenger.at.j3);
        if (this.r == t4Var.h.isEmpty() || this.d.a != t4Var.a()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.c.a).n(this, org.telegram.messenger.at.j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.d.i(i10) != -1) {
            org.telegram.messenger.i0.h3(new vy0(this, i10, 0), 500L);
        } else {
            this.e = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        org.telegram.ui.Components.w71 w71Var = this.b;
        w71Var.setReordering(z10);
        boolean z11 = this.f;
        org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this;
        org.telegram.ui.Components.au0 au0Var = ar0Var.x;
        TextView textView = au0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new k2.v(21, ar0Var, z11)).start();
        au0Var.E1(true);
        if (z10) {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.U4(false);
                org.telegram.messenger.i0.g3(new na0(profileActivity, 28));
            }
        }
        if (z10) {
            return;
        }
        org.telegram.messenger.i0.r(this.w);
        th.t4 t4Var = this.c;
        t4Var.e();
        t4Var.f(false);
        int currentPosition = w71Var.getCurrentPosition();
        xy0 xy0Var = this.d;
        int f7 = xy0Var.f(currentPosition);
        this.a.o(true);
        int i10 = xy0Var.i(f7);
        w71Var.e(0.0f, i10, i10);
    }
}
