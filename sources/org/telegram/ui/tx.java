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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tx extends org.telegram.ui.Components.uu0 {
    public final Paint f0;
    public int g0;
    public int h0;
    public int i0;
    public VelocityTracker j0;
    public final Rect k0;
    public boolean l0;
    public final ge.b m0;
    public final /* synthetic */ ay n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(Context context, ay ayVar) {
        super(context, null);
        this.n0 = ayVar;
        this.f0 = new Paint(1);
        this.k0 = new Rect();
        this.m0 = new ge.b(new e(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = org.telegram.messenger.zs.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = org.telegram.messenger.zs.t3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.t6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.uu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.tz.f()) {
            ay ayVar = this.n0;
            if (ayVar.k4 != null) {
                i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                p6Var = ((org.telegram.ui.ActionBar.k2) ayVar).resourceProvider;
                if (w7.b9.c(i10, p6Var)) {
                    p6Var2 = ((org.telegram.ui.ActionBar.k2) ayVar).resourceProvider;
                    if (p6Var2 != null) {
                        p6Var3 = ((org.telegram.ui.ActionBar.k2) ayVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    ayVar.k4.e(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(i11);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override // org.telegram.ui.Components.uu0
    public final void J(Canvas canvas, ArrayList arrayList) {
        kx kxVar;
        org.telegram.ui.Components.tk0 p5;
        ay ayVar = this.n0;
        if (ayVar.q3 && (kxVar = ayVar.C0) != null && kxVar.getVisibility() == 0) {
            kx kxVar2 = ayVar.C0;
            View[] viewArr = kxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.w71.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < org.telegram.messenger.i0.L(100.0f) + org.telegram.messenger.i0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + kxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uu0
    public final void L() {
        ei.r rVar;
        org.telegram.messenger.tz.f();
        rVar = ((org.telegram.ui.ActionBar.k2) this.n0).glassEngine;
        rVar.g();
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        ay ayVar = this.n0;
        if (!ayVar.h3) {
            return false;
        }
        if (!ayVar.k3) {
            if (Math.abs(ayVar.e0[1].getTranslationX()) < 1.0f) {
                ayVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (ayVar.i3 ? -1 : 1));
                ayVar.e0[1].setTranslationX(0.0f);
                ay.i1(ayVar, true);
                animatorSet = ayVar.g3;
                if (animatorSet != null) {
                }
                ayVar.h3 = false;
            }
            return ayVar.h3;
        }
        if (Math.abs(ayVar.e0[0].getTranslationX()) < 1.0f) {
            ayVar.e0[0].setTranslationX(0.0f);
            ayVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (ayVar.i3 ? 1 : -1));
            ay.i1(ayVar, true);
            animatorSet = ayVar.g3;
            if (animatorSet != null) {
                animatorSet.cancel();
                ayVar.g3 = null;
            }
            ayVar.h3 = false;
        }
        return ayVar.h3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.l lVar;
        ay ayVar = this.n0;
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        float height = lVar.getHeight();
        xw xwVar = ayVar.F3;
        float f7 = (xwVar == null || !xwVar.c()) ? 0.0f : ayVar.F3.e;
        if (ayVar.K) {
            height = c3.i0.z(1.0f, ayVar.u3, (1.0f - f7) * (1.0f - ayVar.x1) * org.telegram.messenger.i0.L(81.0f), height);
        }
        return (int) c3.i0.z(1.0f, f7, (1.0f - ayVar.x1) * (1.0f - ayVar.u3) * org.telegram.messenger.i0.L(48.0f), height + ayVar.T);
    }

    public final int Z() {
        ay ayVar = this.n0;
        float f7 = ayVar.N;
        xw xwVar = ayVar.F3;
        return (int) c3.i0.z(1.0f, ayVar.x1, org.telegram.messenger.m5.A(1.0f, (xwVar == null || !xwVar.c()) ? 0.0f : ayVar.F3.e, 1.0f - ayVar.u3, f7), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        ay ayVar = this.n0;
        qx qxVar = ayVar.z0;
        int i10 = qxVar.j0.get(qxVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        ayVar.n3 = false;
        ayVar.m3 = true;
        this.h0 = (int) (motionEvent.getX() + ayVar.j3);
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        lVar.setEnabled(false);
        ayVar.z0.setEnabled(false);
        zx zxVar = ayVar.e0[1];
        zxVar.h = i10;
        zxVar.setVisibility(0);
        ayVar.i3 = z10;
        ay.i1(ayVar, false);
        ayVar.c5(true);
        if (z10) {
            ayVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        ayVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ei.r rVar;
        boolean z10;
        float f7;
        boolean z11;
        Canvas canvas2;
        xw xwVar;
        px pxVar;
        float f10;
        bi.t0 t0Var;
        float f11;
        px pxVar2;
        float f12;
        org.telegram.ui.ActionBar.l lVar;
        xw xwVar2;
        ay ayVar = this.n0;
        Paint paint = ayVar.f1;
        rVar = ((org.telegram.ui.ActionBar.k2) ayVar).glassEngine;
        rVar.g();
        if (ayVar.Q && (((xwVar2 = ayVar.F3) == null || !xwVar2.c()) && ayVar.u3 == 0.0f)) {
            ayVar.Q = false;
            int i10 = (ayVar.k4() && ayVar.e0[0].s == 0) ? 1 : 0;
            wx wxVar = ayVar.e0[0].a;
            if (ayVar.R) {
                if (!ayVar.b1) {
                    if (i10 == 0) {
                        ayVar.R = false;
                    }
                    if (ayVar.R) {
                        s4.c1 L = wxVar.L(0, false);
                        if (L == null) {
                            ayVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= wxVar.getPaddingTop() - org.telegram.messenger.i0.L(81.0f)) {
                                ayVar.R = false;
                            } else if (view.getTop() >= wxVar.getPaddingTop()) {
                                ayVar.R = false;
                            }
                        }
                        if (ayVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.c1 L2 = wxVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = wxVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -ayVar.e4();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    ayVar.N4(f13);
                } else {
                    ayVar.N4(0.0f);
                }
            } else {
                ayVar.N4(-ayVar.e4());
            }
        }
        int Y = Y();
        z10 = ((org.telegram.ui.ActionBar.k2) ayVar).inPreviewMode;
        int Z = z10 ? org.telegram.messenger.i0.m : Z();
        int i11 = Z + Y;
        ayVar.F3.setCurrentTop(i11);
        boolean z12 = ayVar.s3;
        Rect rect = this.k0;
        Paint paint2 = this.f0;
        if (z12) {
            float f15 = ayVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            } else if (f15 == 0.0f && (pxVar2 = ayVar.X) != null) {
                pxVar2.setTranslationY(ayVar.h4() + ayVar.N);
            }
            rect.set(0, Z, getMeasuredWidth(), i11 - org.telegram.messenger.i0.L(ayVar.x1 * 2.0f));
            float f16 = ayVar.x1;
            if (f16 < 0.0f) {
                if (f16 == 1.0f) {
                    paint = paint2;
                }
                f12 = 2.0f;
                f7 = 1.0f;
                H(canvas, 0.0f, this.k0, paint, true);
            } else {
                f12 = 2.0f;
                f7 = 1.0f;
            }
            float f17 = ayVar.x1;
            if (f17 > 0.0f && f17 < f7) {
                paint2.setColor(ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                if (!ayVar.q3 && ayVar.r3) {
                    rect.set(0, Z, getMeasuredWidth(), i11 - org.telegram.messenger.i0.L(ayVar.x1 * f12));
                    H(canvas, 0.0f, this.k0, paint2, true);
                }
                px pxVar3 = ayVar.X;
                if (pxVar3 != null) {
                    lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                    int height = lVar.getHeight();
                    pxVar3.setTranslationY(ayVar.h4() + (i11 - (height + (ayVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.k2) ayVar).inPreviewMode;
            if (!z11) {
                if (ayVar.u3 > 0.0f) {
                    paint2.setColor(ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i11 - org.telegram.messenger.i0.L(ayVar.x1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i11 - org.telegram.messenger.i0.L(ayVar.x1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint, true);
                }
                ayVar.x3 = 0.0f;
                ayVar.w3 = 0.0f;
                float min = ayVar.x3 - Math.min((org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(!ayVar.K ? 81.0f : 0.0f)) + ayVar.N, ayVar.u3 * (org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(!ayVar.K ? 81.0f : 0.0f)));
                ayVar.x3 = min;
                ayVar.w3 = min;
                xwVar = ayVar.F3;
                if (xwVar == null && xwVar.c()) {
                    float f18 = ayVar.F3.e;
                    float e42 = ayVar.x3 - ((ayVar.e4() + ayVar.N) * f18);
                    ayVar.x3 = e42;
                    ayVar.w3 = e42;
                    float i12 = ayVar.G0 ? f7 - Utilities.i(f18 / 0.5f, f7, 0.0f) : f7;
                    qx qxVar = ayVar.z0;
                    if (qxVar != null && qxVar.getVisibility() == 0) {
                        ayVar.x3 -= (f7 - ayVar.r.e) * ayVar.z0.getMeasuredHeight();
                    }
                    px pxVar4 = ayVar.X;
                    if (pxVar4 != null) {
                        pxVar4.setTranslationY(ayVar.h4() + org.telegram.messenger.i0.T1(ayVar.N + ayVar.x3, -org.telegram.messenger.i0.L(ayVar.K ? 81.0f : 0.0f), f18));
                    }
                    if (ayVar.D) {
                        float f19 = ayVar.E ? 0.0f : ayVar.N;
                        f11 = -org.telegram.messenger.i0.T1(-f19, f19, ayVar.F3.e);
                    } else {
                        f11 = 0.0f;
                    }
                    ayVar.e0[0].setTranslationY(f11 - (((ayVar.K ? org.telegram.messenger.i0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.i0.L(48.0f)) * ayVar.F3.e));
                    f10 = i12;
                } else {
                    pxVar = ayVar.X;
                    if (pxVar != null) {
                        pxVar.setTranslationY(org.telegram.messenger.i0.T1(((ayVar.N + ayVar.x3) + ayVar.T) - org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L((ayVar.K ? 81 : 0) + 48), ayVar.x1));
                    }
                    f10 = f7;
                }
                ayVar.d5();
                ay.W2(ayVar, f10);
                super.dispatchDraw(canvas);
                ay.X2(ayVar, canvas2, i11);
                t0Var = ayVar.K0;
                if (t0Var != null && t0Var.getVisibility() == 0) {
                    if (ayVar.K0.getAlpha() != f7) {
                        ayVar.K0.draw(canvas2);
                    } else if (ayVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(ayVar.K0.getLeft(), ayVar.K0.getTop(), ayVar.K0.getRight(), ayVar.K0.getBottom(), (int) (ayVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(ayVar.K0.getLeft(), ayVar.K0.getTop());
                        ayVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!ayVar.W && ayVar.Y2 == 0) {
                    org.telegram.messenger.i0.O(canvas2, this, ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6), ayVar.f4, f7);
                }
                ayVar.V = true;
            }
        }
        canvas2 = canvas;
        ayVar.x3 = 0.0f;
        ayVar.w3 = 0.0f;
        float min2 = ayVar.x3 - Math.min((org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(!ayVar.K ? 81.0f : 0.0f)) + ayVar.N, ayVar.u3 * (org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(!ayVar.K ? 81.0f : 0.0f)));
        ayVar.x3 = min2;
        ayVar.w3 = min2;
        xwVar = ayVar.F3;
        if (xwVar == null) {
        }
        pxVar = ayVar.X;
        if (pxVar != null) {
        }
        f10 = f7;
        ayVar.d5();
        ay.W2(ayVar, f10);
        super.dispatchDraw(canvas);
        ay.X2(ayVar, canvas2, i11);
        t0Var = ayVar.K0;
        if (t0Var != null) {
            if (ayVar.K0.getAlpha() != f7) {
            }
        }
        if (!ayVar.W) {
            org.telegram.messenger.i0.O(canvas2, this, ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6), ayVar.f4, f7);
        }
        ayVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.m0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ay ayVar = this.n0;
        if (view == ayVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.uu0.e0) {
            return super.drawChild(canvas, view, j10);
        }
        zx[] zxVarArr = ayVar.e0;
        if (view == zxVarArr[0] || ((zxVarArr.length > 1 && view == zxVarArr[1]) || view == ayVar.J1 || view == ayVar.z0)) {
            canvas.save();
            if (view != ayVar.J1 && view != ayVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = ayVar.W3;
            if (f7 != 1.0f) {
                if (ayVar.X3) {
                    canvas.translate((1.0f - ayVar.W3) * org.telegram.messenger.i0.L(40.0f) * (-1), 0.0f);
                } else {
                    float z10 = sc.e.z(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - ayVar.W3) * (-org.telegram.messenger.i0.L(4.0f)), 0.0f);
                    canvas.scale(z10, z10, 0.0f, (-getY()) + ayVar.N + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        if (view != lVar || ayVar.W3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (ayVar.X3) {
            canvas.translate((1.0f - ayVar.W3) * org.telegram.messenger.i0.L(40.0f) * (-1), 0.0f);
        } else {
            float z11 = sc.e.z(1.0f, ayVar.W3, 0.05f, 1.0f);
            canvas.translate((1.0f - ayVar.W3) * (-org.telegram.messenger.i0.L(4.0f)), 0.0f);
            lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            canvas.scale(z11, z11, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + (lVar2.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.d5 d5Var = this.n0.D3;
        if (d5Var != null) {
            d5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.d5 d5Var = this.n0.D3;
        if (d5Var != null) {
            d5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        qx qxVar;
        int actionMasked = motionEvent.getActionMasked();
        ay ayVar = this.n0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            if (lVar.u()) {
                ayVar.Y0 = true;
            }
        }
        return X() || ((qxVar = ayVar.z0) != null && qxVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ay ayVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar;
        uw uwVar;
        uw uwVar2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        tx txVar = this;
        int childCount = txVar.getChildCount();
        int Q = txVar.Q();
        int i20 = 0;
        txVar.setBottomClip(0);
        int measuredWidth = txVar.getMeasuredWidth();
        int measuredHeight = txVar.getMeasuredHeight();
        int i21 = 0;
        while (true) {
            ayVar = txVar.n0;
            if (i21 >= childCount) {
                break;
            }
            View childAt = txVar.getChildAt(i21);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.zs.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i14 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i19 = layoutParams.topMargin + txVar.getPaddingTop();
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != ayVar.X || childAt == ayVar.Z || childAt == (uwVar2 = ayVar.E0)) {
                            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                            i19 = lVar.getMeasuredHeight();
                            if (childAt != ayVar.X && childAt != ayVar.E0 && childAt != ayVar.Z) {
                                i19 += org.telegram.messenger.i0.L(48.0f);
                            }
                            if (ayVar.K && childAt == ayVar.X) {
                                i19 = org.telegram.messenger.i0.L(81.0f) + i19;
                            }
                            uwVar = ayVar.E0;
                            if (childAt == uwVar && uwVar.getPremiumHint() != null) {
                                ayVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.z20.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, ayVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.z20.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == ayVar.X) {
                                i19 += org.telegram.messenger.i0.L(2.0f);
                            }
                        } else if (childAt == ayVar.C0) {
                            i19 = -org.telegram.messenger.i0.L(ayVar.a);
                        } else if (childAt instanceof ou) {
                            lVar3 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                            i19 = lVar3.getMeasuredHeight();
                        } else if (childAt instanceof zx) {
                            i19 = i20;
                        } else if (childAt == ayVar.J1 || childAt == ayVar.K1 || childAt == ayVar.z0) {
                            lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                            i19 = org.telegram.messenger.i0.L(48.0f) + lVar2.getMeasuredHeight() + i19;
                        } else if (uwVar2 != null && uwVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != ayVar.X) {
                    }
                    lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                    i19 = lVar.getMeasuredHeight();
                    if (childAt != ayVar.X) {
                        i19 += org.telegram.messenger.i0.L(48.0f);
                    }
                    if (ayVar.K) {
                        i19 = org.telegram.messenger.i0.L(81.0f) + i19;
                    }
                    uwVar = ayVar.E0;
                    if (childAt == uwVar) {
                        ayVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.z20.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, ayVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.z20.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == ayVar.X) {
                    }
                    childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                } else {
                    i14 = measuredWidth - measuredWidth2;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i23 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != ayVar.X) {
                }
                lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                i19 = lVar.getMeasuredHeight();
                if (childAt != ayVar.X) {
                }
                if (ayVar.K) {
                }
                uwVar = ayVar.E0;
                if (childAt == uwVar) {
                }
                if (childAt == ayVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i21++;
            i20 = 0;
            txVar = this;
        }
        kx kxVar = ayVar.C0;
        if (kxVar != null) {
            kxVar.setKeyboardHeight(Q);
        }
        R();
        ayVar.j5();
        ayVar.d5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        ay ayVar = this.n0;
        int i12 = ayVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.t0 t0Var = ayVar.m0;
        if (t0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            layoutParams.topMargin = lVar5.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof ou) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int L = org.telegram.messenger.i0.L(10.0f);
                        int L2 = org.telegram.messenger.i0.L(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - lVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof zx) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.i0.L(2.0f) + size2;
                        if (ayVar.F3.c()) {
                            if (ayVar.x) {
                                L3 = org.telegram.messenger.i0.L(50.0f) + L3;
                            }
                            if (ayVar.K) {
                                L3 = org.telegram.messenger.i0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.i0.L(48.0f) + L3;
                        }
                        int i14 = L3 + ayVar.P;
                        if (ayVar.v3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = ayVar.Y3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        kx kxVar = ayVar.C0;
                        if (childAt == kxVar) {
                            kxVar.setTranslationY(ayVar.I0);
                            ayVar.C0.r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            ayVar.R3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.i0.Q;
                            lVar3 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                            rect.set(0, (org.telegram.messenger.i0.L(i12) + lVar3.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ow owVar = ayVar.B1;
                            if (owVar == null || !owVar.r0(childAt)) {
                                if (childAt == ayVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = ayVar.Y3 ? (int) (size4 * 0.05f) : 0;
                                    ayVar.F3.setTransitionPaddingBottom(i16);
                                    childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), size4 + i16), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                                }
                            } else if (!org.telegram.messenger.i0.E) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (org.telegram.messenger.i0.Q1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.i0.m)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.i0.m), TLObject.FLAG_30));
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.l0) {
            post(new sx(this, 1));
            this.l0 = z10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x03ad, code lost:
    
        r10 = true;
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
        org.telegram.ui.ActionBar.z4 z4Var;
        qx qxVar;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        org.telegram.ui.ActionBar.z4 z4Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        zg.e eVar;
        ay ayVar = this.n0;
        z4Var = ((org.telegram.ui.ActionBar.k2) ayVar).parentLayout;
        Object[] objArr = 0;
        if (z4Var != null && (qxVar = ayVar.z0) != null && !qxVar.n && !ayVar.j2 && !ayVar.F3.c()) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) ayVar).parentLayout;
            if (!((ActionBarLayout) z4Var2).i()) {
                z4Var3 = ((org.telegram.ui.ActionBar.k2) ayVar).parentLayout;
                if (!((ActionBarLayout) z4Var3).x()) {
                    z4Var4 = ((org.telegram.ui.ActionBar.k2) ayVar).parentLayout;
                    if (!((ActionBarLayout) z4Var4).n && (motionEvent == null || ayVar.m3 || (motionEvent.getY() > Y() + Z() && ((eVar = ayVar.y1) == null || eVar.getVisibility() != 0 || motionEvent.getY() < ayVar.y1.getY())))) {
                        if (ayVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                            if (org.telegram.messenger.tz.m(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                if (org.telegram.messenger.tz.m(i11) == 2) {
                                    zx zxVar = ayVar.e0[0];
                                    if (zxVar != null) {
                                        int i12 = zxVar.d.h;
                                        if (i12 != 7) {
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
                            ayVar.m3 = true;
                            this.g0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.h0 = x10;
                            if (ayVar.i3) {
                                if (x10 < ayVar.e0[0].getTranslationX() + ayVar.e0[0].getMeasuredWidth()) {
                                    ayVar.j3 = ayVar.e0[0].getTranslationX();
                                } else {
                                    zx[] zxVarArr = ayVar.e0;
                                    zx zxVar2 = zxVarArr[0];
                                    zx zxVar3 = zxVarArr[1];
                                    zxVarArr[0] = zxVar3;
                                    zxVarArr[1] = zxVar2;
                                    ayVar.i3 = false;
                                    ayVar.j3 = zxVar3.getTranslationX();
                                    ayVar.z0.g(1.0f, ayVar.e0[0].h);
                                    ayVar.z0.g(ayVar.j3 / r11[0].getMeasuredWidth(), ayVar.e0[1].h);
                                    ayVar.c5(true);
                                    ayVar.e0[0].d.getClass();
                                    ayVar.e0[1].d.getClass();
                                }
                            } else if (x10 < ayVar.e0[1].getTranslationX() + ayVar.e0[1].getMeasuredWidth()) {
                                zx[] zxVarArr2 = ayVar.e0;
                                zx zxVar4 = zxVarArr2[0];
                                zx zxVar5 = zxVarArr2[1];
                                zxVarArr2[0] = zxVar5;
                                zxVarArr2[1] = zxVar4;
                                ayVar.i3 = true;
                                ayVar.j3 = zxVar5.getTranslationX();
                                ayVar.z0.g(1.0f, ayVar.e0[0].h);
                                ayVar.z0.g((-ayVar.j3) / r11[0].getMeasuredWidth(), ayVar.e0[1].h);
                                ayVar.c5(true);
                                ayVar.e0[0].d.getClass();
                                ayVar.e0[1].d.getClass();
                            } else {
                                ayVar.j3 = ayVar.e0[0].getTranslationX();
                            }
                            ayVar.g3.removeAllListeners();
                            ayVar.g3.cancel();
                            ayVar.h3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            ayVar.j3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !ayVar.m3 && !ayVar.n3 && ayVar.z0.getVisibility() == 0) {
                            this.g0 = motionEvent.getPointerId(0);
                            ayVar.n3 = true;
                            this.h0 = (int) motionEvent.getX();
                            this.i0 = (int) motionEvent.getY();
                            this.j0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
                            int x11 = (int) ((motionEvent.getX() - this.h0) + ayVar.j3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.i0);
                            if (ayVar.m3 && (((z10 = ayVar.i3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    ayVar.n3 = true;
                                    ayVar.m3 = false;
                                    ayVar.e0[0].setTranslationX(0.0f);
                                    ayVar.e0[1].setTranslationX(ayVar.i3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    ayVar.z0.g(0.0f, ayVar.e0[1].h);
                                }
                            }
                            if (ayVar.n3 && !ayVar.m3) {
                                float a12 = org.telegram.messenger.i0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.h0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (ayVar.m3) {
                                ayVar.e0[0].setTranslationX(x11);
                                if (ayVar.i3) {
                                    ayVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    ayVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / ayVar.e0[0].getMeasuredWidth();
                                zx zxVar6 = ayVar.e0[1];
                                if (zxVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    ayVar.z0.i(ayVar.e0[1].h);
                                    org.telegram.messenger.i0.h3(new sx(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                ayVar.z0.g(abs2, zxVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.j0.computeCurrentVelocity(1000, ayVar.l3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.j0.getXVelocity();
                                f10 = this.j0.getYVelocity();
                                if (!ayVar.m3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    a0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (ayVar.m3) {
                                float x13 = ayVar.e0[0].getX();
                                ayVar.g3 = new AnimatorSet();
                                if (ayVar.e0[1].E) {
                                    ayVar.k3 = true;
                                } else if (ayVar.j3 == 0.0f) {
                                    ayVar.k3 = Math.abs(x13) < ((float) ayVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = ayVar.i3 ? false : false;
                                    ayVar.k3 = z11;
                                } else if (ayVar.i3) {
                                    ayVar.k3 = ayVar.e0[1].getX() > ((float) (ayVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    ayVar.k3 = ayVar.e0[0].getX() < ((float) (ayVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = ayVar.k3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (ayVar.i3) {
                                        ayVar.g3.playTogether(ObjectAnimator.ofFloat(ayVar.e0[0], (Property<zx, Float>) property, 0.0f), ObjectAnimator.ofFloat(ayVar.e0[1], (Property<zx, Float>) property, r13.getMeasuredWidth()));
                                    } else {
                                        ayVar.g3.playTogether(ObjectAnimator.ofFloat(ayVar.e0[0], (Property<zx, Float>) property, 0.0f), ObjectAnimator.ofFloat(ayVar.e0[1], (Property<zx, Float>) property, -r13.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = ayVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (ayVar.i3) {
                                        ayVar.g3.playTogether(ObjectAnimator.ofFloat(ayVar.e0[0], (Property<zx, Float>) property, -r12.getMeasuredWidth()), ObjectAnimator.ofFloat(ayVar.e0[1], (Property<zx, Float>) property, 0.0f));
                                    } else {
                                        ayVar.g3.playTogether(ObjectAnimator.ofFloat(ayVar.e0[0], (Property<zx, Float>) property, r12.getMeasuredWidth()), ObjectAnimator.ofFloat(ayVar.e0[1], (Property<zx, Float>) property, 0.0f));
                                    }
                                }
                                ayVar.g3.setInterpolator(ay.z4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                ayVar.g3.setDuration(Math.max(org.telegram.messenger.zs.g2, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(I / r7) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                ayVar.g3.addListener(new org.telegram.ui.Components.voip.h2(this, 7));
                                ayVar.g3.start();
                                ayVar.h3 = true;
                                ayVar.m3 = false;
                            } else {
                                ayVar.n3 = false;
                                lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                                lVar.setEnabled(true);
                                ayVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.j0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.j0 = null;
                            }
                        }
                        return ayVar.m3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ay ayVar = this.n0;
        if (ayVar.n3 && !ayVar.m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
