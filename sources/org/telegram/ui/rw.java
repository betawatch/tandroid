package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rw extends org.telegram.ui.Components.tt0 {
    public final Paint f0;
    public int g0;
    public int h0;
    public int i0;
    public VelocityTracker j0;
    public final Rect k0;
    public boolean l0;
    public final org.telegram.ui.Cells.l9 m0;
    public final /* synthetic */ yw n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(Context context, yw ywVar) {
        super(context, null);
        this.n0 = ywVar;
        this.f0 = new Paint(1);
        this.k0 = new Rect();
        this.m0 = new org.telegram.ui.Cells.l9(new f(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = org.telegram.messenger.qs.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = org.telegram.messenger.qs.t3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.l6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.tt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.iz.f()) {
            yw ywVar = this.n0;
            if (ywVar.l4 != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.f2) ywVar).resourceProvider;
                if (c8.g0.c(i7, g6Var)) {
                    g6Var2 = ((org.telegram.ui.ActionBar.f2) ywVar).resourceProvider;
                    if (g6Var2 != null) {
                        g6Var3 = ((org.telegram.ui.ActionBar.f2) ywVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    ywVar.l4.e(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(i10);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override // org.telegram.ui.Components.tt0
    public final void J(Canvas canvas, ArrayList arrayList) {
        hw hwVar;
        org.telegram.ui.Components.qj0 p10;
        yw ywVar = this.n0;
        if (ywVar.r3 && (hwVar = ywVar.C0) != null && hwVar.getVisibility() == 0) {
            hw hwVar2 = ywVar.C0;
            View[] viewArr = hwVar2.e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.w61.p(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < p10.getChildCount(); i10++) {
                        View childAt = p10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + p10.getY() + viewArr[i7].getY() + hwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.tt0
    public final void L() {
        oi.q qVar;
        org.telegram.messenger.iz.f();
        qVar = ((org.telegram.ui.ActionBar.f2) this.n0).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.Components.tt0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        yw ywVar = this.n0;
        if (!ywVar.i3) {
            return false;
        }
        if (!ywVar.l3) {
            if (Math.abs(ywVar.e0[1].getTranslationX()) < 1.0f) {
                ywVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (ywVar.j3 ? -1 : 1));
                ywVar.e0[1].setTranslationX(0.0f);
                yw.j1(ywVar, true);
                animatorSet = ywVar.h3;
                if (animatorSet != null) {
                }
                ywVar.i3 = false;
            }
            return ywVar.i3;
        }
        if (Math.abs(ywVar.e0[0].getTranslationX()) < 1.0f) {
            ywVar.e0[0].setTranslationX(0.0f);
            ywVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (ywVar.j3 ? 1 : -1));
            yw.j1(ywVar, true);
            animatorSet = ywVar.h3;
            if (animatorSet != null) {
                animatorSet.cancel();
                ywVar.h3 = null;
            }
            ywVar.i3 = false;
        }
        return ywVar.i3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        yw ywVar = this.n0;
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        float height = kVar.getHeight();
        uv uvVar = ywVar.G3;
        float f10 = (uvVar == null || !uvVar.c()) ? 0.0f : ywVar.G3.e;
        if (ywVar.K) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, ywVar.v3, (1.0f - f10) * (1.0f - ywVar.y1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, (1.0f - ywVar.y1) * (1.0f - ywVar.v3) * org.telegram.messenger.g0.L(48.0f), height + ywVar.T);
    }

    public final int Z() {
        yw ywVar = this.n0;
        float f10 = ywVar.N;
        uv uvVar = ywVar.G3;
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, ywVar.y1, org.telegram.messenger.k5.A(1.0f, (uvVar == null || !uvVar.c()) ? 0.0f : ywVar.G3.e, 1.0f - ywVar.v3, f10), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        yw ywVar = this.n0;
        ow owVar = ywVar.z0;
        int i7 = owVar.j0.get(owVar.K + (z9 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        ywVar.o3 = false;
        ywVar.n3 = true;
        this.h0 = (int) (motionEvent.getX() + ywVar.k3);
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        kVar.setEnabled(false);
        ywVar.z0.setEnabled(false);
        xw xwVar = ywVar.e0[1];
        xwVar.h = i7;
        xwVar.setVisibility(0);
        ywVar.j3 = z9;
        yw.j1(ywVar, false);
        ywVar.d5(true);
        if (z9) {
            ywVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        ywVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r1 == 1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        oi.q qVar;
        boolean z9;
        float f10;
        boolean z10;
        Canvas canvas2;
        uv uvVar;
        nw nwVar;
        float f11;
        bi.ec ecVar;
        float f12;
        nw nwVar2;
        float f13;
        org.telegram.ui.ActionBar.k kVar;
        uv uvVar2;
        yw ywVar = this.n0;
        Paint paint = ywVar.g1;
        qVar = ((org.telegram.ui.ActionBar.f2) ywVar).glassEngine;
        qVar.g();
        if (ywVar.Q && (((uvVar2 = ywVar.G3) == null || !uvVar2.c()) && ywVar.v3 == 0.0f)) {
            ywVar.Q = false;
            int i7 = (ywVar.l4() && ywVar.e0[0].s == 0) ? 1 : 0;
            uw uwVar = ywVar.e0[0].a;
            if (ywVar.R) {
                if (!ywVar.c1) {
                    if (i7 == 0) {
                        ywVar.R = false;
                    }
                    if (ywVar.R) {
                        v4.d1 L = uwVar.L(0, false);
                        if (L == null) {
                            ywVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= uwVar.getPaddingTop() - org.telegram.messenger.g0.L(81.0f)) {
                                ywVar.R = false;
                            } else if (view.getTop() >= uwVar.getPaddingTop()) {
                                ywVar.R = false;
                            }
                        }
                        if (ywVar.R) {
                        }
                    }
                }
                i7 = 0;
            }
            v4.d1 L2 = uwVar.L(i7, false);
            if (L2 != null) {
                float paddingTop = uwVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -ywVar.f4();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    ywVar.O4(f14);
                } else {
                    ywVar.O4(0.0f);
                }
            } else {
                ywVar.O4(-ywVar.f4());
            }
        }
        int Y = Y();
        z9 = ((org.telegram.ui.ActionBar.f2) ywVar).inPreviewMode;
        int Z = z9 ? org.telegram.messenger.g0.m : Z();
        int i10 = Z + Y;
        ywVar.G3.setCurrentTop(i10);
        boolean z11 = ywVar.t3;
        Rect rect = this.k0;
        Paint paint2 = this.f0;
        if (z11) {
            float f16 = ywVar.y1;
            if (f16 == 1.0f) {
                paint2.setColor(ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
            } else if (f16 == 0.0f && (nwVar2 = ywVar.X) != null) {
                nwVar2.setTranslationY(ywVar.i4() + ywVar.N);
            }
            rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(ywVar.y1 * 2.0f));
            float f17 = ywVar.y1;
            if (f17 < 0.0f) {
                if (f17 == 1.0f) {
                    paint = paint2;
                }
                f13 = 2.0f;
                f10 = 1.0f;
                H(canvas, 0.0f, this.k0, paint, true);
            } else {
                f13 = 2.0f;
                f10 = 1.0f;
            }
            float f18 = ywVar.y1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
                if (!ywVar.r3 && ywVar.s3) {
                    rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(ywVar.y1 * f13));
                    H(canvas, 0.0f, this.k0, paint2, true);
                }
                nw nwVar3 = ywVar.X;
                if (nwVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                    int height = kVar.getHeight();
                    nwVar3.setTranslationY(ywVar.i4() + (i10 - (height + (ywVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            z10 = ((org.telegram.ui.ActionBar.f2) ywVar).inPreviewMode;
            if (!z10) {
                if (ywVar.v3 > 0.0f) {
                    paint2.setColor(ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(ywVar.y1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(ywVar.y1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint, true);
                }
                ywVar.y3 = 0.0f;
                ywVar.x3 = 0.0f;
                float min = ywVar.y3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!ywVar.K ? 81.0f : 0.0f)) + ywVar.N, ywVar.v3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!ywVar.K ? 81.0f : 0.0f)));
                ywVar.y3 = min;
                ywVar.x3 = min;
                uvVar = ywVar.G3;
                if (uvVar == null && uvVar.c()) {
                    float f19 = ywVar.G3.e;
                    float f42 = ywVar.y3 - ((ywVar.f4() + ywVar.N) * f19);
                    ywVar.y3 = f42;
                    ywVar.x3 = f42;
                    float i11 = ywVar.G0 ? f10 - Utilities.i(f19 / 0.5f, f10, 0.0f) : f10;
                    ow owVar = ywVar.z0;
                    if (owVar != null && owVar.getVisibility() == 0) {
                        ywVar.y3 -= (f10 - ywVar.r.e) * ywVar.z0.getMeasuredHeight();
                    }
                    nw nwVar4 = ywVar.X;
                    if (nwVar4 != null) {
                        nwVar4.setTranslationY(ywVar.i4() + org.telegram.messenger.g0.T1(ywVar.N + ywVar.y3, -org.telegram.messenger.g0.L(ywVar.K ? 81.0f : 0.0f), f19));
                    }
                    if (ywVar.D) {
                        float f20 = ywVar.E ? 0.0f : ywVar.N;
                        f12 = -org.telegram.messenger.g0.T1(-f20, f20, ywVar.G3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    ywVar.e0[0].setTranslationY(f12 - (((ywVar.K ? org.telegram.messenger.g0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f)) * ywVar.G3.e));
                    f11 = i11;
                } else {
                    nwVar = ywVar.X;
                    if (nwVar != null) {
                        nwVar.setTranslationY(org.telegram.messenger.g0.T1(((ywVar.N + ywVar.y3) + ywVar.T) - org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L((ywVar.K ? 81 : 0) + 48), ywVar.y1));
                    }
                    f11 = f10;
                }
                ywVar.e5();
                yw.X2(ywVar, f11);
                super.dispatchDraw(canvas);
                yw.Y2(ywVar, canvas2, i10);
                ecVar = ywVar.K0;
                if (ecVar != null && ecVar.getVisibility() == 0) {
                    if (ywVar.K0.getAlpha() != f10) {
                        ywVar.K0.draw(canvas2);
                    } else if (ywVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(ywVar.K0.getLeft(), ywVar.K0.getTop(), ywVar.K0.getRight(), ywVar.K0.getBottom(), (int) (ywVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(ywVar.K0.getLeft(), ywVar.K0.getTop());
                        ywVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!ywVar.W && ywVar.Z2 == 0) {
                    org.telegram.messenger.g0.O(canvas2, this, ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.d6), ywVar.g4, f10);
                }
                ywVar.V = true;
            }
        }
        canvas2 = canvas;
        ywVar.y3 = 0.0f;
        ywVar.x3 = 0.0f;
        float min2 = ywVar.y3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!ywVar.K ? 81.0f : 0.0f)) + ywVar.N, ywVar.v3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!ywVar.K ? 81.0f : 0.0f)));
        ywVar.y3 = min2;
        ywVar.x3 = min2;
        uvVar = ywVar.G3;
        if (uvVar == null) {
        }
        nwVar = ywVar.X;
        if (nwVar != null) {
        }
        f11 = f10;
        ywVar.e5();
        yw.X2(ywVar, f11);
        super.dispatchDraw(canvas);
        yw.Y2(ywVar, canvas2, i10);
        ecVar = ywVar.K0;
        if (ecVar != null) {
            if (ywVar.K0.getAlpha() != f10) {
            }
        }
        if (!ywVar.W) {
            org.telegram.messenger.g0.O(canvas2, this, ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.d6), ywVar.g4, f10);
        }
        ywVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.m0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar = this.n0;
        if (view == ywVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.tt0.e0) {
            return super.drawChild(canvas, view, j3);
        }
        xw[] xwVarArr = ywVar.e0;
        if (view == xwVarArr[0] || ((xwVarArr.length > 1 && view == xwVarArr[1]) || view == ywVar.K1 || view == ywVar.z0)) {
            canvas.save();
            if (view != ywVar.K1 && view != ywVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = ywVar.X3;
            if (f10 != 1.0f) {
                if (ywVar.Y3) {
                    canvas.translate((1.0f - ywVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float v = com.google.android.recaptcha.internal.a.v(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - ywVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    canvas.scale(v, v, 0.0f, (-getY()) + ywVar.N + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        if (view != kVar || ywVar.X3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (ywVar.Y3) {
            canvas.translate((1.0f - ywVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
        } else {
            float v10 = com.google.android.recaptcha.internal.a.v(1.0f, ywVar.X3, 0.05f, 1.0f);
            canvas.translate((1.0f - ywVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            canvas.scale(v10, v10, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.g5 g5Var = this.n0.E3;
        if (g5Var != null) {
            g5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.g5 g5Var = this.n0.E3;
        if (g5Var != null) {
            g5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        ow owVar;
        int actionMasked = motionEvent.getActionMasked();
        yw ywVar = this.n0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            if (kVar.w()) {
                ywVar.Z0 = true;
            }
        }
        return X() || ((owVar = ywVar.z0) != null && owVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.tt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        yw ywVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        rv rvVar;
        rv rvVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        rw rwVar = this;
        int childCount = rwVar.getChildCount();
        int Q = rwVar.Q();
        int i19 = 0;
        rwVar.setBottomClip(0);
        int measuredWidth = rwVar.getMeasuredWidth();
        int measuredHeight = rwVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            ywVar = rwVar.n0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = rwVar.getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & org.telegram.messenger.qs.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + rwVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = measuredHeight - measuredHeight2;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != ywVar.X || childAt == ywVar.Z || childAt == (rvVar2 = ywVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                            i18 = kVar.getMeasuredHeight();
                            if (childAt != ywVar.X && childAt != ywVar.E0 && childAt != ywVar.Z) {
                                i18 += org.telegram.messenger.g0.L(48.0f);
                            }
                            if (ywVar.K && childAt == ywVar.X) {
                                i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                            }
                            rvVar = ywVar.E0;
                            if (childAt == rvVar && rvVar.getPremiumHint() != null) {
                                ywVar.E0.getPremiumHint().layout(i15, org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, ywVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2));
                            }
                            if (childAt == ywVar.X) {
                                i18 += org.telegram.messenger.g0.L(2.0f);
                            }
                        } else if (childAt == ywVar.C0) {
                            i18 = -org.telegram.messenger.g0.L(ywVar.a);
                        } else if (childAt instanceof ot) {
                            kVar3 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                            i18 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof xw) {
                            i18 = i19;
                        } else if (childAt == ywVar.K1 || childAt == ywVar.L1 || childAt == ywVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                            i18 = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight() + i18;
                        } else if (rvVar2 != null && rvVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != ywVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                    i18 = kVar.getMeasuredHeight();
                    if (childAt != ywVar.X) {
                        i18 += org.telegram.messenger.g0.L(48.0f);
                    }
                    if (ywVar.K) {
                        i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                    }
                    rvVar = ywVar.E0;
                    if (childAt == rvVar) {
                        ywVar.E0.getPremiumHint().layout(i15, org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, ywVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2));
                    }
                    if (childAt == ywVar.X) {
                    }
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                } else {
                    i13 = measuredWidth - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i22 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != ywVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                i18 = kVar.getMeasuredHeight();
                if (childAt != ywVar.X) {
                }
                if (ywVar.K) {
                }
                rvVar = ywVar.E0;
                if (childAt == rvVar) {
                }
                if (childAt == ywVar.X) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
            i20++;
            i19 = 0;
            rwVar = this;
        }
        hw hwVar = ywVar.C0;
        if (hwVar != null) {
            hwVar.setKeyboardHeight(Q);
        }
        R();
        ywVar.k5();
        ywVar.e5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        yw ywVar = this.n0;
        int i11 = ywVar.a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z9 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.r0 r0Var = ywVar.m0;
        if (r0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof ot) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof xw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (ywVar.G3.c()) {
                            if (ywVar.x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (ywVar.K) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i13 = L3 + ywVar.P;
                        if (ywVar.w3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i14 = ywVar.Z3 ? (int) (i13 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i14);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i13 + i14), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        hw hwVar = ywVar.C0;
                        if (childAt == hwVar) {
                            hwVar.setTranslationY(ywVar.I0);
                            ywVar.C0.r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11) + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                            ywVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i11) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            lv lvVar = ywVar.C1;
                            if (lvVar == null || !lvVar.t0(childAt)) {
                                if (childAt == ywVar.G3) {
                                    int size4 = View.MeasureSpec.getSize(i10);
                                    int i15 = ywVar.Z3 ? (int) (size4 * 0.05f) : 0;
                                    ywVar.G3.setTransitionPaddingBottom(i15);
                                    childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), size4 + i15), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i7, 0, i10, 0);
                                }
                            } else if (!org.telegram.messenger.g0.E) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (org.telegram.messenger.g0.Q1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                            }
                        }
                    }
                }
            }
        }
        if (z9 != this.l0) {
            post(new qw(this, 1));
            this.l0 = z9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x03ac, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r3 == 8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var;
        ow owVar;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z9;
        int i7;
        int i10;
        jh.f fVar;
        yw ywVar = this.n0;
        q4Var = ((org.telegram.ui.ActionBar.f2) ywVar).parentLayout;
        Object[] objArr = 0;
        if (q4Var != null && (owVar = ywVar.z0) != null && !owVar.n && !ywVar.k2 && !ywVar.G3.c()) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) ywVar).parentLayout;
            if (!((ActionBarLayout) q4Var2).i()) {
                q4Var3 = ((org.telegram.ui.ActionBar.f2) ywVar).parentLayout;
                if (!((ActionBarLayout) q4Var3).y()) {
                    q4Var4 = ((org.telegram.ui.ActionBar.f2) ywVar).parentLayout;
                    if (!((ActionBarLayout) q4Var4).n && (motionEvent == null || ywVar.n3 || (motionEvent.getY() > Y() + Z() && ((fVar = ywVar.z1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < ywVar.z1.getY())))) {
                        if (ywVar.S0 != 3) {
                            i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                            if (org.telegram.messenger.iz.m(i7) != 5) {
                                i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                if (org.telegram.messenger.iz.m(i10) == 2) {
                                    xw xwVar = ywVar.e0[0];
                                    if (xwVar != null) {
                                        int i11 = xwVar.d.h;
                                        if (i11 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            if (this.j0 == null) {
                                this.j0 = VelocityTracker.obtain();
                            }
                            this.j0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && X()) {
                            ywVar.n3 = true;
                            this.g0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.h0 = x10;
                            if (ywVar.j3) {
                                if (x10 < ywVar.e0[0].getTranslationX() + ywVar.e0[0].getMeasuredWidth()) {
                                    ywVar.k3 = ywVar.e0[0].getTranslationX();
                                } else {
                                    xw[] xwVarArr = ywVar.e0;
                                    xw xwVar2 = xwVarArr[0];
                                    xw xwVar3 = xwVarArr[1];
                                    xwVarArr[0] = xwVar3;
                                    xwVarArr[1] = xwVar2;
                                    ywVar.j3 = false;
                                    ywVar.k3 = xwVar3.getTranslationX();
                                    ywVar.z0.g(1.0f, ywVar.e0[0].h);
                                    ywVar.z0.g(ywVar.k3 / r10[0].getMeasuredWidth(), ywVar.e0[1].h);
                                    ywVar.d5(true);
                                    ywVar.e0[0].d.getClass();
                                    ywVar.e0[1].d.getClass();
                                }
                            } else if (x10 < ywVar.e0[1].getTranslationX() + ywVar.e0[1].getMeasuredWidth()) {
                                xw[] xwVarArr2 = ywVar.e0;
                                xw xwVar4 = xwVarArr2[0];
                                xw xwVar5 = xwVarArr2[1];
                                xwVarArr2[0] = xwVar5;
                                xwVarArr2[1] = xwVar4;
                                ywVar.j3 = true;
                                ywVar.k3 = xwVar5.getTranslationX();
                                ywVar.z0.g(1.0f, ywVar.e0[0].h);
                                ywVar.z0.g((-ywVar.k3) / r10[0].getMeasuredWidth(), ywVar.e0[1].h);
                                ywVar.d5(true);
                                ywVar.e0[0].d.getClass();
                                ywVar.e0[1].d.getClass();
                            } else {
                                ywVar.k3 = ywVar.e0[0].getTranslationX();
                            }
                            ywVar.h3.removeAllListeners();
                            ywVar.h3.cancel();
                            ywVar.i3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            ywVar.k3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !ywVar.n3 && !ywVar.o3 && ywVar.z0.getVisibility() == 0) {
                            this.g0 = motionEvent.getPointerId(0);
                            ywVar.o3 = true;
                            this.h0 = (int) motionEvent.getX();
                            this.i0 = (int) motionEvent.getY();
                            this.j0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
                            int x11 = (int) ((motionEvent.getX() - this.h0) + ywVar.k3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.i0);
                            if (ywVar.n3 && (((z9 = ywVar.j3) && x11 > 0) || (!z9 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    ywVar.o3 = true;
                                    ywVar.n3 = false;
                                    ywVar.e0[0].setTranslationX(0.0f);
                                    ywVar.e0[1].setTranslationX(ywVar.j3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    ywVar.z0.g(0.0f, ywVar.e0[1].h);
                                }
                            }
                            if (ywVar.o3 && !ywVar.n3) {
                                float a12 = org.telegram.messenger.g0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.h0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (ywVar.n3) {
                                ywVar.e0[0].setTranslationX(x11);
                                if (ywVar.j3) {
                                    ywVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    ywVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / ywVar.e0[0].getMeasuredWidth();
                                xw xwVar6 = ywVar.e0[1];
                                if (xwVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    ywVar.z0.i(ywVar.e0[1].h);
                                    org.telegram.messenger.g0.i3(new qw(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                ywVar.z0.g(abs2, xwVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.j0.computeCurrentVelocity(1000, ywVar.m3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.j0.getXVelocity();
                                f11 = this.j0.getYVelocity();
                                if (!ywVar.n3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    a0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (ywVar.n3) {
                                float x13 = ywVar.e0[0].getX();
                                ywVar.h3 = new AnimatorSet();
                                if (ywVar.e0[1].E) {
                                    ywVar.l3 = true;
                                } else if (ywVar.k3 == 0.0f) {
                                    ywVar.l3 = Math.abs(x13) < ((float) ywVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z10 = ywVar.j3 ? false : false;
                                    ywVar.l3 = z10;
                                } else if (ywVar.j3) {
                                    ywVar.l3 = ywVar.e0[1].getX() > ((float) (ywVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    ywVar.l3 = ywVar.e0[0].getX() < ((float) (ywVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z11 = ywVar.l3;
                                Property property = View.TRANSLATION_X;
                                if (z11) {
                                    measuredWidth = Math.abs(x13);
                                    if (ywVar.j3) {
                                        ywVar.h3.playTogether(ObjectAnimator.ofFloat(ywVar.e0[0], (Property<xw, Float>) property, 0.0f), ObjectAnimator.ofFloat(ywVar.e0[1], (Property<xw, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        ywVar.h3.playTogether(ObjectAnimator.ofFloat(ywVar.e0[0], (Property<xw, Float>) property, 0.0f), ObjectAnimator.ofFloat(ywVar.e0[1], (Property<xw, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = ywVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (ywVar.j3) {
                                        ywVar.h3.playTogether(ObjectAnimator.ofFloat(ywVar.e0[0], (Property<xw, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(ywVar.e0[1], (Property<xw, Float>) property, 0.0f));
                                    } else {
                                        ywVar.h3.playTogether(ObjectAnimator.ofFloat(ywVar.e0[0], (Property<xw, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(ywVar.e0[1], (Property<xw, Float>) property, 0.0f));
                                    }
                                }
                                ywVar.h3.setInterpolator(yw.A4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                ywVar.h3.setDuration(Math.max(org.telegram.messenger.qs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                ywVar.h3.addListener(new va(this, 26));
                                ywVar.h3.start();
                                ywVar.i3 = true;
                                ywVar.n3 = false;
                            } else {
                                ywVar.o3 = false;
                                kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                                kVar.setEnabled(true);
                                ywVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.j0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.j0 = null;
                            }
                        }
                        return ywVar.n3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        yw ywVar = this.n0;
        if (ywVar.o3 && !ywVar.n3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }
}
