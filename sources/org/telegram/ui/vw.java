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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vw extends org.telegram.ui.Components.du0 {
    public final Paint g0;
    public int h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public final Rect l0;
    public boolean m0;
    public final org.telegram.ui.Cells.m9 n0;
    public final /* synthetic */ cx o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(Context context, cx cxVar) {
        super(context, null);
        this.o0 = cxVar;
        this.g0 = new Paint(1);
        this.l0 = new Rect();
        this.n0 = new org.telegram.ui.Cells.m9(new f(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.d() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = org.telegram.messenger.ls.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = org.telegram.messenger.ls.t3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.m6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.du0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.cz.f()) {
            cx cxVar = this.o0;
            if (cxVar.p4 != null) {
                i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                h6Var = ((org.telegram.ui.ActionBar.g2) cxVar).resourceProvider;
                if (c8.i0.d(i7, h6Var)) {
                    h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar).resourceProvider;
                    if (h6Var2 != null) {
                        h6Var3 = ((org.telegram.ui.ActionBar.g2) cxVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    cxVar.p4.o(rect.left, rect.top + f10, rect.right, rect.bottom + f10, canvas);
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

    @Override // org.telegram.ui.Components.du0
    public final void J(Canvas canvas, ArrayList arrayList) {
        kw kwVar;
        org.telegram.ui.Components.ek0 k10;
        cx cxVar = this.o0;
        if (cxVar.s3 && (kwVar = cxVar.D0) != null && kwVar.getVisibility() == 0) {
            kw kwVar2 = cxVar.D0;
            View[] viewArr = kwVar2.e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (k10 = org.telegram.ui.Components.j71.k(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < k10.getChildCount(); i10++) {
                        View childAt = k10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + k10.getY() + viewArr[i7].getY() + kwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.du0
    public final void K() {
        ri.q qVar;
        org.telegram.messenger.cz.f();
        qVar = ((org.telegram.ui.ActionBar.g2) this.o0).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.Components.du0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        cx cxVar = this.o0;
        if (!cxVar.j3) {
            return false;
        }
        if (!cxVar.m3) {
            if (Math.abs(cxVar.f0[1].getTranslationX()) < 1.0f) {
                cxVar.f0[0].setTranslationX(r1.getMeasuredWidth() * (cxVar.k3 ? -1 : 1));
                cxVar.f0[1].setTranslationX(0.0f);
                cx.i1(cxVar, true);
                animatorSet = cxVar.i3;
                if (animatorSet != null) {
                }
                cxVar.j3 = false;
            }
            return cxVar.j3;
        }
        if (Math.abs(cxVar.f0[0].getTranslationX()) < 1.0f) {
            cxVar.f0[0].setTranslationX(0.0f);
            cxVar.f0[1].setTranslationX(r1[0].getMeasuredWidth() * (cxVar.k3 ? 1 : -1));
            cx.i1(cxVar, true);
            animatorSet = cxVar.i3;
            if (animatorSet != null) {
                animatorSet.cancel();
                cxVar.i3 = null;
            }
            cxVar.j3 = false;
        }
        return cxVar.j3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        cx cxVar = this.o0;
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        float height = kVar.getHeight();
        xv xvVar = cxVar.H3;
        float f10 = (xvVar == null || !xvVar.c()) ? 0.0f : cxVar.H3.e;
        if (cxVar.L) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, cxVar.w3, (1.0f - f10) * (1.0f - cxVar.z1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f10, (1.0f - cxVar.z1) * (1.0f - cxVar.w3) * org.telegram.messenger.g0.L(48.0f), height + cxVar.U);
    }

    public final int Z() {
        cx cxVar = this.o0;
        float f10 = cxVar.O;
        xv xvVar = cxVar.H3;
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, cxVar.z1, org.telegram.messenger.f3.A(1.0f, (xvVar == null || !xvVar.c()) ? 0.0f : cxVar.H3.e, 1.0f - cxVar.w3, f10), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        cx cxVar = this.o0;
        rw rwVar = cxVar.A0;
        int i7 = rwVar.k0.get(rwVar.L + (z10 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        cxVar.p3 = false;
        cxVar.o3 = true;
        this.i0 = (int) (motionEvent.getX() + cxVar.l3);
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        kVar.setEnabled(false);
        cxVar.A0.setEnabled(false);
        bx bxVar = cxVar.f0[1];
        bxVar.h = i7;
        bxVar.setVisibility(0);
        cxVar.k3 = z10;
        cx.i1(cxVar, false);
        cxVar.l5(true);
        if (z10) {
            cxVar.f0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        cxVar.f0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ri.q qVar;
        boolean z10;
        float f10;
        boolean z11;
        Canvas canvas2;
        xv xvVar;
        qw qwVar;
        float f11;
        uv uvVar;
        float f12;
        qw qwVar2;
        float f13;
        org.telegram.ui.ActionBar.k kVar;
        xv xvVar2;
        cx cxVar = this.o0;
        Paint paint = cxVar.h1;
        qVar = ((org.telegram.ui.ActionBar.g2) cxVar).glassEngine;
        qVar.g();
        if (cxVar.R && (((xvVar2 = cxVar.H3) == null || !xvVar2.c()) && cxVar.w3 == 0.0f)) {
            cxVar.R = false;
            int i7 = (cxVar.n4() && cxVar.f0[0].s == 0) ? 1 : 0;
            yw ywVar = cxVar.f0[0].a;
            if (cxVar.S) {
                if (!cxVar.d1) {
                    if (i7 == 0) {
                        cxVar.S = false;
                    }
                    if (cxVar.S) {
                        v4.f1 L = ywVar.L(0, false);
                        if (L == null) {
                            cxVar.S = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= ywVar.getPaddingTop() - org.telegram.messenger.g0.L(81.0f)) {
                                cxVar.S = false;
                            } else if (view.getTop() >= ywVar.getPaddingTop()) {
                                cxVar.S = false;
                            }
                        }
                        if (cxVar.S) {
                        }
                    }
                }
                i7 = 0;
            }
            v4.f1 L2 = ywVar.L(i7, false);
            if (L2 != null) {
                float paddingTop = ywVar.getPaddingTop() - L2.a.getTop();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -cxVar.f4();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    cxVar.W4(f14);
                } else {
                    cxVar.W4(0.0f);
                }
            } else {
                cxVar.W4(-cxVar.f4());
            }
        }
        int Y = Y();
        z10 = ((org.telegram.ui.ActionBar.g2) cxVar).inPreviewMode;
        int Z = z10 ? org.telegram.messenger.g0.m : Z();
        int i10 = Z + Y;
        cxVar.H3.setCurrentTop(i10);
        boolean z12 = cxVar.u3;
        Rect rect = this.l0;
        Paint paint2 = this.g0;
        if (z12) {
            float f16 = cxVar.z1;
            if (f16 == 1.0f) {
                paint2.setColor(cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            } else if (f16 == 0.0f && (qwVar2 = cxVar.Y) != null) {
                qwVar2.setTranslationY(cxVar.j4() + cxVar.O);
            }
            rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(cxVar.z1 * 2.0f));
            float f17 = cxVar.z1;
            if (f17 < 0.0f) {
                if (f17 == 1.0f) {
                    paint = paint2;
                }
                f13 = 2.0f;
                f10 = 1.0f;
                H(canvas, 0.0f, this.l0, paint, true);
            } else {
                f13 = 2.0f;
                f10 = 1.0f;
            }
            float f18 = cxVar.z1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                if (!cxVar.s3 && cxVar.t3) {
                    rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(cxVar.z1 * f13));
                    H(canvas, 0.0f, this.l0, paint2, true);
                }
                qw qwVar3 = cxVar.Y;
                if (qwVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                    int height = kVar.getHeight();
                    qwVar3.setTranslationY(cxVar.j4() + (i10 - (height + (cxVar.A0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.g2) cxVar).inPreviewMode;
            if (!z11) {
                if (cxVar.w3 > 0.0f) {
                    paint2.setColor(cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(cxVar.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(cxVar.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint, true);
                }
                cxVar.z3 = 0.0f;
                cxVar.y3 = 0.0f;
                float min = cxVar.z3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!cxVar.L ? 81.0f : 0.0f)) + cxVar.O, cxVar.w3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!cxVar.L ? 81.0f : 0.0f)));
                cxVar.z3 = min;
                cxVar.y3 = min;
                xvVar = cxVar.H3;
                if (xvVar == null && xvVar.c()) {
                    float f19 = cxVar.H3.e;
                    float f42 = cxVar.z3 - ((cxVar.f4() + cxVar.O) * f19);
                    cxVar.z3 = f42;
                    cxVar.y3 = f42;
                    float i11 = cxVar.H0 ? f10 - Utilities.i(f19 / 0.5f, f10, 0.0f) : f10;
                    rw rwVar = cxVar.A0;
                    if (rwVar != null && rwVar.getVisibility() == 0) {
                        cxVar.z3 -= (f10 - cxVar.r.e) * cxVar.A0.getMeasuredHeight();
                    }
                    qw qwVar4 = cxVar.Y;
                    if (qwVar4 != null) {
                        qwVar4.setTranslationY(cxVar.j4() + org.telegram.messenger.g0.T1(cxVar.O + cxVar.z3, -org.telegram.messenger.g0.L(cxVar.L ? 81.0f : 0.0f), f19));
                    }
                    if (cxVar.E) {
                        float f20 = cxVar.F ? 0.0f : cxVar.O;
                        f12 = -org.telegram.messenger.g0.T1(-f20, f20, cxVar.H3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    cxVar.f0[0].setTranslationY(f12 - (((cxVar.L ? org.telegram.messenger.g0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f)) * cxVar.H3.e));
                    f11 = i11;
                } else {
                    qwVar = cxVar.Y;
                    if (qwVar != null) {
                        qwVar.setTranslationY(org.telegram.messenger.g0.T1(((cxVar.O + cxVar.z3) + cxVar.U) - org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L((cxVar.L ? 81 : 0) + 48), cxVar.z1));
                    }
                    f11 = f10;
                }
                cxVar.m5();
                cx.X2(cxVar, f11);
                super.dispatchDraw(canvas);
                cx.Y2(cxVar, canvas2, i10);
                uvVar = cxVar.L0;
                if (uvVar != null && uvVar.getVisibility() == 0) {
                    if (cxVar.L0.getAlpha() != f10) {
                        cxVar.L0.draw(canvas2);
                    } else if (cxVar.L0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(cxVar.L0.getLeft(), cxVar.L0.getTop(), cxVar.L0.getRight(), cxVar.L0.getBottom(), (int) (cxVar.L0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(cxVar.L0.getLeft(), cxVar.L0.getTop());
                        cxVar.L0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!cxVar.X && cxVar.a3 == 0) {
                    org.telegram.messenger.g0.O(canvas2, this, cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6), cxVar.k4, f10);
                }
                cxVar.W = true;
            }
        }
        canvas2 = canvas;
        cxVar.z3 = 0.0f;
        cxVar.y3 = 0.0f;
        float min2 = cxVar.z3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!cxVar.L ? 81.0f : 0.0f)) + cxVar.O, cxVar.w3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!cxVar.L ? 81.0f : 0.0f)));
        cxVar.z3 = min2;
        cxVar.y3 = min2;
        xvVar = cxVar.H3;
        if (xvVar == null) {
        }
        qwVar = cxVar.Y;
        if (qwVar != null) {
        }
        f11 = f10;
        cxVar.m5();
        cx.X2(cxVar, f11);
        super.dispatchDraw(canvas);
        cx.Y2(cxVar, canvas2, i10);
        uvVar = cxVar.L0;
        if (uvVar != null) {
            if (cxVar.L0.getAlpha() != f10) {
            }
        }
        if (!cxVar.X) {
            org.telegram.messenger.g0.O(canvas2, this, cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6), cxVar.k4, f10);
        }
        cxVar.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.n0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cx cxVar = this.o0;
        if (view == cxVar.L0) {
            return true;
        }
        if (org.telegram.ui.Components.du0.f0) {
            return super.drawChild(canvas, view, j3);
        }
        bx[] bxVarArr = cxVar.f0;
        if (view == bxVarArr[0] || ((bxVarArr.length > 1 && view == bxVarArr[1]) || view == cxVar.L1 || view == cxVar.A0)) {
            canvas.save();
            if (view != cxVar.L1 && view != cxVar.A0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = cxVar.b4;
            if (f10 != 1.0f) {
                if (cxVar.c4) {
                    canvas.translate((1.0f - cxVar.b4) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - cxVar.b4) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    canvas.scale(t6, t6, 0.0f, (-getY()) + cxVar.O + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        if (view != kVar || cxVar.b4 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (cxVar.c4) {
            canvas.translate((1.0f - cxVar.b4) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
        } else {
            float t10 = com.google.android.gms.internal.vision.e2.t(1.0f, cxVar.b4, 0.05f, 1.0f);
            canvas.translate((1.0f - cxVar.b4) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            canvas.scale(t10, t10, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.n5 n5Var = this.o0.F3;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n5 n5Var = this.o0.F3;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        rw rwVar;
        int actionMasked = motionEvent.getActionMasked();
        cx cxVar = this.o0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            if (kVar.x()) {
                cxVar.a1 = true;
            }
        }
        return X() || ((rwVar = cxVar.A0) != null && rwVar.P) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        cx cxVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        tv tvVar;
        tv tvVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        vw vwVar = this;
        int childCount = vwVar.getChildCount();
        int Q = vwVar.Q();
        int i19 = 0;
        vwVar.setBottomClip(0);
        int measuredWidth = vwVar.getMeasuredWidth();
        int measuredHeight = vwVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            cxVar = vwVar.o0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = vwVar.getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & org.telegram.messenger.ls.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + vwVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = measuredHeight - measuredHeight2;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != cxVar.Y || childAt == cxVar.a0 || childAt == (tvVar2 = cxVar.F0)) {
                            kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                            i18 = kVar.getMeasuredHeight();
                            if (childAt != cxVar.Y && childAt != cxVar.F0 && childAt != cxVar.a0) {
                                i18 += org.telegram.messenger.g0.L(48.0f);
                            }
                            if (cxVar.L && childAt == cxVar.Y) {
                                i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                            }
                            tvVar = cxVar.F0;
                            if (childAt == tvVar && tvVar.getPremiumHint() != null) {
                                cxVar.F0.getPremiumHint().layout(i15, org.telegram.ui.Cells.c0.i(54.0f, i18, measuredHeight2), i15 + measuredWidth2, cxVar.F0.getPremiumHint().getMeasuredHeight() + org.telegram.ui.Cells.c0.i(54.0f, i18, measuredHeight2));
                            }
                            if (childAt == cxVar.Y) {
                                i18 += org.telegram.messenger.g0.L(2.0f);
                            }
                        } else if (childAt == cxVar.D0) {
                            i18 = -org.telegram.messenger.g0.L(cxVar.a);
                        } else if (childAt instanceof rt) {
                            kVar3 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                            i18 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof bx) {
                            i18 = i19;
                        } else if (childAt == cxVar.L1 || childAt == cxVar.M1 || childAt == cxVar.A0) {
                            kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                            i18 = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight() + i18;
                        } else if (tvVar2 != null && tvVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != cxVar.Y) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                    i18 = kVar.getMeasuredHeight();
                    if (childAt != cxVar.Y) {
                        i18 += org.telegram.messenger.g0.L(48.0f);
                    }
                    if (cxVar.L) {
                        i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                    }
                    tvVar = cxVar.F0;
                    if (childAt == tvVar) {
                        cxVar.F0.getPremiumHint().layout(i15, org.telegram.ui.Cells.c0.i(54.0f, i18, measuredHeight2), i15 + measuredWidth2, cxVar.F0.getPremiumHint().getMeasuredHeight() + org.telegram.ui.Cells.c0.i(54.0f, i18, measuredHeight2));
                    }
                    if (childAt == cxVar.Y) {
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
                if (childAt != cxVar.Y) {
                }
                kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                i18 = kVar.getMeasuredHeight();
                if (childAt != cxVar.Y) {
                }
                if (cxVar.L) {
                }
                tvVar = cxVar.F0;
                if (childAt == tvVar) {
                }
                if (childAt == cxVar.Y) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
            i20++;
            i19 = 0;
            vwVar = this;
        }
        kw kwVar = cxVar.D0;
        if (kwVar != null) {
            kwVar.setKeyboardHeight(Q);
        }
        R();
        cxVar.s5();
        cxVar.m5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        cx cxVar = this.o0;
        int i11 = cxVar.a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.q0 q0Var = cxVar.n0;
        if (q0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof rt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof bx) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (cxVar.H3.c()) {
                            if (cxVar.x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (cxVar.L) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i13 = L3 + cxVar.Q;
                        if (cxVar.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i14 = cxVar.d4 ? (int) (i13 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i14);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i13 + i14), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        kw kwVar = cxVar.D0;
                        if (childAt == kwVar) {
                            kwVar.setTranslationY(cxVar.J0);
                            cxVar.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11) + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                            cxVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i11) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            nv nvVar = cxVar.D1;
                            if (nvVar == null || !nvVar.T0(childAt)) {
                                if (childAt == cxVar.H3) {
                                    int size4 = View.MeasureSpec.getSize(i10);
                                    int i15 = cxVar.d4 ? (int) (size4 * 0.05f) : 0;
                                    cxVar.H3.setTransitionPaddingBottom(i15);
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
        if (z10 != this.m0) {
            post(new uw(this, 1));
            this.m0 = z10;
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
        org.telegram.ui.ActionBar.r4 r4Var;
        rw rwVar;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i7;
        int i10;
        jh.f fVar;
        cx cxVar = this.o0;
        r4Var = ((org.telegram.ui.ActionBar.g2) cxVar).parentLayout;
        Object[] objArr = 0;
        if (r4Var != null && (rwVar = cxVar.A0) != null && !rwVar.n && !cxVar.l2 && !cxVar.H3.c()) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) cxVar).parentLayout;
            if (!((ActionBarLayout) r4Var2).i()) {
                r4Var3 = ((org.telegram.ui.ActionBar.g2) cxVar).parentLayout;
                if (!((ActionBarLayout) r4Var3).y()) {
                    r4Var4 = ((org.telegram.ui.ActionBar.g2) cxVar).parentLayout;
                    if (!((ActionBarLayout) r4Var4).n && (motionEvent == null || cxVar.o3 || (motionEvent.getY() > Y() + Z() && ((fVar = cxVar.A1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < cxVar.A1.getY())))) {
                        if (cxVar.T0 != 3) {
                            i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                            if (org.telegram.messenger.cz.m(i7) != 5) {
                                i10 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                                if (org.telegram.messenger.cz.m(i10) == 2) {
                                    bx bxVar = cxVar.f0[0];
                                    if (bxVar != null) {
                                        int i11 = bxVar.d.h;
                                        if (i11 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            if (this.k0 == null) {
                                this.k0 = VelocityTracker.obtain();
                            }
                            this.k0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && X()) {
                            cxVar.o3 = true;
                            this.h0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.i0 = x10;
                            if (cxVar.k3) {
                                if (x10 < cxVar.f0[0].getTranslationX() + cxVar.f0[0].getMeasuredWidth()) {
                                    cxVar.l3 = cxVar.f0[0].getTranslationX();
                                } else {
                                    bx[] bxVarArr = cxVar.f0;
                                    bx bxVar2 = bxVarArr[0];
                                    bx bxVar3 = bxVarArr[1];
                                    bxVarArr[0] = bxVar3;
                                    bxVarArr[1] = bxVar2;
                                    cxVar.k3 = false;
                                    cxVar.l3 = bxVar3.getTranslationX();
                                    cxVar.A0.h(1.0f, cxVar.f0[0].h);
                                    cxVar.A0.h(cxVar.l3 / r10[0].getMeasuredWidth(), cxVar.f0[1].h);
                                    cxVar.l5(true);
                                    cxVar.f0[0].d.getClass();
                                    cxVar.f0[1].d.getClass();
                                }
                            } else if (x10 < cxVar.f0[1].getTranslationX() + cxVar.f0[1].getMeasuredWidth()) {
                                bx[] bxVarArr2 = cxVar.f0;
                                bx bxVar4 = bxVarArr2[0];
                                bx bxVar5 = bxVarArr2[1];
                                bxVarArr2[0] = bxVar5;
                                bxVarArr2[1] = bxVar4;
                                cxVar.k3 = true;
                                cxVar.l3 = bxVar5.getTranslationX();
                                cxVar.A0.h(1.0f, cxVar.f0[0].h);
                                cxVar.A0.h((-cxVar.l3) / r10[0].getMeasuredWidth(), cxVar.f0[1].h);
                                cxVar.l5(true);
                                cxVar.f0[0].d.getClass();
                                cxVar.f0[1].d.getClass();
                            } else {
                                cxVar.l3 = cxVar.f0[0].getTranslationX();
                            }
                            cxVar.i3.removeAllListeners();
                            cxVar.i3.cancel();
                            cxVar.j3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            cxVar.l3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !cxVar.o3 && !cxVar.p3 && cxVar.A0.getVisibility() == 0) {
                            this.h0 = motionEvent.getPointerId(0);
                            cxVar.p3 = true;
                            this.i0 = (int) motionEvent.getX();
                            this.j0 = (int) motionEvent.getY();
                            this.k0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.h0) {
                            int x11 = (int) ((motionEvent.getX() - this.i0) + cxVar.l3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.j0);
                            if (cxVar.o3 && (((z10 = cxVar.k3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    cxVar.p3 = true;
                                    cxVar.o3 = false;
                                    cxVar.f0[0].setTranslationX(0.0f);
                                    cxVar.f0[1].setTranslationX(cxVar.k3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    cxVar.A0.h(0.0f, cxVar.f0[1].h);
                                }
                            }
                            if (cxVar.p3 && !cxVar.o3) {
                                float a12 = org.telegram.messenger.g0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.i0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (cxVar.o3) {
                                cxVar.f0[0].setTranslationX(x11);
                                if (cxVar.k3) {
                                    cxVar.f0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    cxVar.f0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / cxVar.f0[0].getMeasuredWidth();
                                bx bxVar6 = cxVar.f0[1];
                                if (bxVar6.F && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    cxVar.A0.l(cxVar.f0[1].h);
                                    org.telegram.messenger.g0.h3(new uw(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                cxVar.A0.h(abs2, bxVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.h0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.k0.computeCurrentVelocity(1000, cxVar.n3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.k0.getXVelocity();
                                f11 = this.k0.getYVelocity();
                                if (!cxVar.o3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    a0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (cxVar.o3) {
                                float x13 = cxVar.f0[0].getX();
                                cxVar.i3 = new AnimatorSet();
                                if (cxVar.f0[1].F) {
                                    cxVar.m3 = true;
                                } else if (cxVar.l3 == 0.0f) {
                                    cxVar.m3 = Math.abs(x13) < ((float) cxVar.f0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z11 = cxVar.k3 ? false : false;
                                    cxVar.m3 = z11;
                                } else if (cxVar.k3) {
                                    cxVar.m3 = cxVar.f0[1].getX() > ((float) (cxVar.f0[0].getMeasuredWidth() >> 1));
                                } else {
                                    cxVar.m3 = cxVar.f0[0].getX() < ((float) (cxVar.f0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = cxVar.m3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (cxVar.k3) {
                                        cxVar.i3.playTogether(ObjectAnimator.ofFloat(cxVar.f0[0], (Property<bx, Float>) property, 0.0f), ObjectAnimator.ofFloat(cxVar.f0[1], (Property<bx, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        cxVar.i3.playTogether(ObjectAnimator.ofFloat(cxVar.f0[0], (Property<bx, Float>) property, 0.0f), ObjectAnimator.ofFloat(cxVar.f0[1], (Property<bx, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = cxVar.f0[0].getMeasuredWidth() - Math.abs(x13);
                                    cxVar.C5(cxVar.f0[1].h, true);
                                    if (cxVar.k3) {
                                        cxVar.i3.playTogether(ObjectAnimator.ofFloat(cxVar.f0[0], (Property<bx, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(cxVar.f0[1], (Property<bx, Float>) property, 0.0f));
                                    } else {
                                        cxVar.i3.playTogether(ObjectAnimator.ofFloat(cxVar.f0[0], (Property<bx, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(cxVar.f0[1], (Property<bx, Float>) property, 0.0f));
                                    }
                                }
                                cxVar.i3.setInterpolator(cx.E4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                cxVar.i3.setDuration(Math.max(org.telegram.messenger.ls.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                cxVar.i3.addListener(new org.telegram.ui.Cells.y9(this, 27));
                                cxVar.i3.start();
                                cxVar.j3 = true;
                                cxVar.o3 = false;
                            } else {
                                cxVar.p3 = false;
                                kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                                kVar.setEnabled(true);
                                cxVar.A0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.k0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.k0 = null;
                            }
                        }
                        return cxVar.o3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        cx cxVar = this.o0;
        if (cxVar.p3 && !cxVar.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
