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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class uw extends org.telegram.ui.Components.cu0 {
    public final Paint g0;
    public int h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public final Rect l0;
    public boolean m0;
    public final org.telegram.ui.Cells.l9 n0;
    public final /* synthetic */ bx o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(Context context, bx bxVar) {
        super(context, null);
        this.o0 = bxVar;
        this.g0 = new Paint(1);
        this.l0 = new Rect();
        this.n0 = new org.telegram.ui.Cells.l9(new f(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.b() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = org.telegram.messenger.ks.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = org.telegram.messenger.ks.t3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.n6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.cu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.bz.f()) {
            bx bxVar = this.o0;
            if (bxVar.p4 != null) {
                i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                i6Var = ((org.telegram.ui.ActionBar.g2) bxVar).resourceProvider;
                if (c8.j0.d(i7, i6Var)) {
                    i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar).resourceProvider;
                    if (i6Var2 != null) {
                        i6Var3 = ((org.telegram.ui.ActionBar.g2) bxVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    bxVar.p4.z(rect.left, rect.top + f10, rect.right, rect.bottom + f10, canvas);
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

    @Override // org.telegram.ui.Components.cu0
    public final void J(Canvas canvas, ArrayList arrayList) {
        jw jwVar;
        org.telegram.ui.Components.ek0 m10;
        bx bxVar = this.o0;
        if (bxVar.s3 && (jwVar = bxVar.D0) != null && jwVar.getVisibility() == 0) {
            jw jwVar2 = bxVar.D0;
            View[] viewArr = jwVar2.e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (m10 = org.telegram.ui.Components.k71.m(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < m10.getChildCount(); i10++) {
                        View childAt = m10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + m10.getY() + viewArr[i7].getY() + jwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.cu0
    public final void K() {
        ri.q qVar;
        org.telegram.messenger.bz.f();
        qVar = ((org.telegram.ui.ActionBar.g2) this.o0).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.Components.cu0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        bx bxVar = this.o0;
        if (!bxVar.j3) {
            return false;
        }
        if (!bxVar.m3) {
            if (Math.abs(bxVar.f0[1].getTranslationX()) < 1.0f) {
                bxVar.f0[0].setTranslationX(r1.getMeasuredWidth() * (bxVar.k3 ? -1 : 1));
                bxVar.f0[1].setTranslationX(0.0f);
                bx.i1(bxVar, true);
                animatorSet = bxVar.i3;
                if (animatorSet != null) {
                }
                bxVar.j3 = false;
            }
            return bxVar.j3;
        }
        if (Math.abs(bxVar.f0[0].getTranslationX()) < 1.0f) {
            bxVar.f0[0].setTranslationX(0.0f);
            bxVar.f0[1].setTranslationX(r1[0].getMeasuredWidth() * (bxVar.k3 ? 1 : -1));
            bx.i1(bxVar, true);
            animatorSet = bxVar.i3;
            if (animatorSet != null) {
                animatorSet.cancel();
                bxVar.i3 = null;
            }
            bxVar.j3 = false;
        }
        return bxVar.j3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        bx bxVar = this.o0;
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        float height = kVar.getHeight();
        wv wvVar = bxVar.H3;
        float f10 = (wvVar == null || !wvVar.c()) ? 0.0f : bxVar.H3.e;
        if (bxVar.L) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, bxVar.w3, (1.0f - f10) * (1.0f - bxVar.z1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f10, (1.0f - bxVar.z1) * (1.0f - bxVar.w3) * org.telegram.messenger.g0.L(48.0f), height + bxVar.U);
    }

    public final int Z() {
        bx bxVar = this.o0;
        float f10 = bxVar.O;
        wv wvVar = bxVar.H3;
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, bxVar.z1, org.telegram.messenger.f3.A(1.0f, (wvVar == null || !wvVar.c()) ? 0.0f : bxVar.H3.e, 1.0f - bxVar.w3, f10), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        bx bxVar = this.o0;
        qw qwVar = bxVar.A0;
        int i7 = qwVar.k0.get(qwVar.L + (z10 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        bxVar.p3 = false;
        bxVar.o3 = true;
        this.i0 = (int) (motionEvent.getX() + bxVar.l3);
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        kVar.setEnabled(false);
        bxVar.A0.setEnabled(false);
        ax axVar = bxVar.f0[1];
        axVar.h = i7;
        axVar.setVisibility(0);
        bxVar.k3 = z10;
        bx.i1(bxVar, false);
        bxVar.l5(true);
        if (z10) {
            bxVar.f0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        bxVar.f0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ri.q qVar;
        boolean z10;
        float f10;
        boolean z11;
        Canvas canvas2;
        wv wvVar;
        pw pwVar;
        float f11;
        tv tvVar;
        float f12;
        pw pwVar2;
        float f13;
        org.telegram.ui.ActionBar.k kVar;
        wv wvVar2;
        bx bxVar = this.o0;
        Paint paint = bxVar.h1;
        qVar = ((org.telegram.ui.ActionBar.g2) bxVar).glassEngine;
        qVar.g();
        if (bxVar.R && (((wvVar2 = bxVar.H3) == null || !wvVar2.c()) && bxVar.w3 == 0.0f)) {
            bxVar.R = false;
            int i7 = (bxVar.n4() && bxVar.f0[0].s == 0) ? 1 : 0;
            xw xwVar = bxVar.f0[0].a;
            if (bxVar.S) {
                if (!bxVar.d1) {
                    if (i7 == 0) {
                        bxVar.S = false;
                    }
                    if (bxVar.S) {
                        v4.f1 L = xwVar.L(0, false);
                        if (L == null) {
                            bxVar.S = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= xwVar.getPaddingTop() - org.telegram.messenger.g0.L(81.0f)) {
                                bxVar.S = false;
                            } else if (view.getTop() >= xwVar.getPaddingTop()) {
                                bxVar.S = false;
                            }
                        }
                        if (bxVar.S) {
                        }
                    }
                }
                i7 = 0;
            }
            v4.f1 L2 = xwVar.L(i7, false);
            if (L2 != null) {
                float paddingTop = xwVar.getPaddingTop() - L2.a.getTop();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -bxVar.f4();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    bxVar.W4(f14);
                } else {
                    bxVar.W4(0.0f);
                }
            } else {
                bxVar.W4(-bxVar.f4());
            }
        }
        int Y = Y();
        z10 = ((org.telegram.ui.ActionBar.g2) bxVar).inPreviewMode;
        int Z = z10 ? org.telegram.messenger.g0.m : Z();
        int i10 = Z + Y;
        bxVar.H3.setCurrentTop(i10);
        boolean z12 = bxVar.u3;
        Rect rect = this.l0;
        Paint paint2 = this.g0;
        if (z12) {
            float f16 = bxVar.z1;
            if (f16 == 1.0f) {
                paint2.setColor(bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            } else if (f16 == 0.0f && (pwVar2 = bxVar.Y) != null) {
                pwVar2.setTranslationY(bxVar.j4() + bxVar.O);
            }
            rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(bxVar.z1 * 2.0f));
            float f17 = bxVar.z1;
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
            float f18 = bxVar.z1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                if (!bxVar.s3 && bxVar.t3) {
                    rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(bxVar.z1 * f13));
                    H(canvas, 0.0f, this.l0, paint2, true);
                }
                pw pwVar3 = bxVar.Y;
                if (pwVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                    int height = kVar.getHeight();
                    pwVar3.setTranslationY(bxVar.j4() + (i10 - (height + (bxVar.A0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.g2) bxVar).inPreviewMode;
            if (!z11) {
                if (bxVar.w3 > 0.0f) {
                    paint2.setColor(bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(bxVar.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(bxVar.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint, true);
                }
                bxVar.z3 = 0.0f;
                bxVar.y3 = 0.0f;
                float min = bxVar.z3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!bxVar.L ? 81.0f : 0.0f)) + bxVar.O, bxVar.w3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!bxVar.L ? 81.0f : 0.0f)));
                bxVar.z3 = min;
                bxVar.y3 = min;
                wvVar = bxVar.H3;
                if (wvVar == null && wvVar.c()) {
                    float f19 = bxVar.H3.e;
                    float f42 = bxVar.z3 - ((bxVar.f4() + bxVar.O) * f19);
                    bxVar.z3 = f42;
                    bxVar.y3 = f42;
                    float i11 = bxVar.H0 ? f10 - Utilities.i(f19 / 0.5f, f10, 0.0f) : f10;
                    qw qwVar = bxVar.A0;
                    if (qwVar != null && qwVar.getVisibility() == 0) {
                        bxVar.z3 -= (f10 - bxVar.r.e) * bxVar.A0.getMeasuredHeight();
                    }
                    pw pwVar4 = bxVar.Y;
                    if (pwVar4 != null) {
                        pwVar4.setTranslationY(bxVar.j4() + org.telegram.messenger.g0.T1(bxVar.O + bxVar.z3, -org.telegram.messenger.g0.L(bxVar.L ? 81.0f : 0.0f), f19));
                    }
                    if (bxVar.E) {
                        float f20 = bxVar.F ? 0.0f : bxVar.O;
                        f12 = -org.telegram.messenger.g0.T1(-f20, f20, bxVar.H3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    bxVar.f0[0].setTranslationY(f12 - (((bxVar.L ? org.telegram.messenger.g0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f)) * bxVar.H3.e));
                    f11 = i11;
                } else {
                    pwVar = bxVar.Y;
                    if (pwVar != null) {
                        pwVar.setTranslationY(org.telegram.messenger.g0.T1(((bxVar.O + bxVar.z3) + bxVar.U) - org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L((bxVar.L ? 81 : 0) + 48), bxVar.z1));
                    }
                    f11 = f10;
                }
                bxVar.m5();
                bx.X2(bxVar, f11);
                super.dispatchDraw(canvas);
                bx.Y2(bxVar, canvas2, i10);
                tvVar = bxVar.L0;
                if (tvVar != null && tvVar.getVisibility() == 0) {
                    if (bxVar.L0.getAlpha() != f10) {
                        bxVar.L0.draw(canvas2);
                    } else if (bxVar.L0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(bxVar.L0.getLeft(), bxVar.L0.getTop(), bxVar.L0.getRight(), bxVar.L0.getBottom(), (int) (bxVar.L0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(bxVar.L0.getLeft(), bxVar.L0.getTop());
                        bxVar.L0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!bxVar.X && bxVar.a3 == 0) {
                    org.telegram.messenger.g0.O(canvas2, this, bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6), bxVar.k4, f10);
                }
                bxVar.W = true;
            }
        }
        canvas2 = canvas;
        bxVar.z3 = 0.0f;
        bxVar.y3 = 0.0f;
        float min2 = bxVar.z3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!bxVar.L ? 81.0f : 0.0f)) + bxVar.O, bxVar.w3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!bxVar.L ? 81.0f : 0.0f)));
        bxVar.z3 = min2;
        bxVar.y3 = min2;
        wvVar = bxVar.H3;
        if (wvVar == null) {
        }
        pwVar = bxVar.Y;
        if (pwVar != null) {
        }
        f11 = f10;
        bxVar.m5();
        bx.X2(bxVar, f11);
        super.dispatchDraw(canvas);
        bx.Y2(bxVar, canvas2, i10);
        tvVar = bxVar.L0;
        if (tvVar != null) {
            if (bxVar.L0.getAlpha() != f10) {
            }
        }
        if (!bxVar.X) {
            org.telegram.messenger.g0.O(canvas2, this, bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6), bxVar.k4, f10);
        }
        bxVar.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.n0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bx bxVar = this.o0;
        if (view == bxVar.L0) {
            return true;
        }
        if (org.telegram.ui.Components.cu0.f0) {
            return super.drawChild(canvas, view, j3);
        }
        ax[] axVarArr = bxVar.f0;
        if (view == axVarArr[0] || ((axVarArr.length > 1 && view == axVarArr[1]) || view == bxVar.L1 || view == bxVar.A0)) {
            canvas.save();
            if (view != bxVar.L1 && view != bxVar.A0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = bxVar.b4;
            if (f10 != 1.0f) {
                if (bxVar.c4) {
                    canvas.translate((1.0f - bxVar.b4) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - bxVar.b4) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    canvas.scale(t6, t6, 0.0f, (-getY()) + bxVar.O + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        if (view != kVar || bxVar.b4 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (bxVar.c4) {
            canvas.translate((1.0f - bxVar.b4) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
        } else {
            float t10 = com.google.android.gms.internal.vision.e2.t(1.0f, bxVar.b4, 0.05f, 1.0f);
            canvas.translate((1.0f - bxVar.b4) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
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

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.m5 m5Var = this.o0.F3;
        if (m5Var != null) {
            m5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.m5 m5Var = this.o0.F3;
        if (m5Var != null) {
            m5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        qw qwVar;
        int actionMasked = motionEvent.getActionMasked();
        bx bxVar = this.o0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            if (kVar.x()) {
                bxVar.a1 = true;
            }
        }
        return X() || ((qwVar = bxVar.A0) != null && qwVar.P) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.cu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        bx bxVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        sv svVar;
        sv svVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        uw uwVar = this;
        int childCount = uwVar.getChildCount();
        int Q = uwVar.Q();
        int i19 = 0;
        uwVar.setBottomClip(0);
        int measuredWidth = uwVar.getMeasuredWidth();
        int measuredHeight = uwVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            bxVar = uwVar.o0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = uwVar.getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & org.telegram.messenger.ks.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + uwVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = measuredHeight - measuredHeight2;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != bxVar.Y || childAt == bxVar.a0 || childAt == (svVar2 = bxVar.F0)) {
                            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                            i18 = kVar.getMeasuredHeight();
                            if (childAt != bxVar.Y && childAt != bxVar.F0 && childAt != bxVar.a0) {
                                i18 += org.telegram.messenger.g0.L(48.0f);
                            }
                            if (bxVar.L && childAt == bxVar.Y) {
                                i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                            }
                            svVar = bxVar.F0;
                            if (childAt == svVar && svVar.getPremiumHint() != null) {
                                bxVar.F0.getPremiumHint().layout(i15, org.telegram.ui.Cells.c0.i(54.0f, i18, measuredHeight2), i15 + measuredWidth2, bxVar.F0.getPremiumHint().getMeasuredHeight() + org.telegram.ui.Cells.c0.i(54.0f, i18, measuredHeight2));
                            }
                            if (childAt == bxVar.Y) {
                                i18 += org.telegram.messenger.g0.L(2.0f);
                            }
                        } else if (childAt == bxVar.D0) {
                            i18 = -org.telegram.messenger.g0.L(bxVar.a);
                        } else if (childAt instanceof qt) {
                            kVar3 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                            i18 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof ax) {
                            i18 = i19;
                        } else if (childAt == bxVar.L1 || childAt == bxVar.M1 || childAt == bxVar.A0) {
                            kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                            i18 = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight() + i18;
                        } else if (svVar2 != null && svVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != bxVar.Y) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                    i18 = kVar.getMeasuredHeight();
                    if (childAt != bxVar.Y) {
                        i18 += org.telegram.messenger.g0.L(48.0f);
                    }
                    if (bxVar.L) {
                        i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                    }
                    svVar = bxVar.F0;
                    if (childAt == svVar) {
                        bxVar.F0.getPremiumHint().layout(i15, org.telegram.ui.Cells.c0.i(54.0f, i18, measuredHeight2), i15 + measuredWidth2, bxVar.F0.getPremiumHint().getMeasuredHeight() + org.telegram.ui.Cells.c0.i(54.0f, i18, measuredHeight2));
                    }
                    if (childAt == bxVar.Y) {
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
                if (childAt != bxVar.Y) {
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                i18 = kVar.getMeasuredHeight();
                if (childAt != bxVar.Y) {
                }
                if (bxVar.L) {
                }
                svVar = bxVar.F0;
                if (childAt == svVar) {
                }
                if (childAt == bxVar.Y) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
            i20++;
            i19 = 0;
            uwVar = this;
        }
        jw jwVar = bxVar.D0;
        if (jwVar != null) {
            jwVar.setKeyboardHeight(Q);
        }
        R();
        bxVar.s5();
        bxVar.m5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        bx bxVar = this.o0;
        int i11 = bxVar.a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.q0 q0Var = bxVar.n0;
        if (q0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof qt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof ax) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (bxVar.H3.c()) {
                            if (bxVar.x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (bxVar.L) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i13 = L3 + bxVar.Q;
                        if (bxVar.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i14 = bxVar.d4 ? (int) (i13 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i14);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i13 + i14), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        jw jwVar = bxVar.D0;
                        if (childAt == jwVar) {
                            jwVar.setTranslationY(bxVar.J0);
                            bxVar.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11) + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                            bxVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i11) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            mv mvVar = bxVar.D1;
                            if (mvVar == null || !mvVar.U0(childAt)) {
                                if (childAt == bxVar.H3) {
                                    int size4 = View.MeasureSpec.getSize(i10);
                                    int i15 = bxVar.d4 ? (int) (size4 * 0.05f) : 0;
                                    bxVar.H3.setTransitionPaddingBottom(i15);
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
            post(new tw(this, 1));
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
        qw qwVar;
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
        bx bxVar = this.o0;
        r4Var = ((org.telegram.ui.ActionBar.g2) bxVar).parentLayout;
        Object[] objArr = 0;
        if (r4Var != null && (qwVar = bxVar.A0) != null && !qwVar.n && !bxVar.l2 && !bxVar.H3.c()) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) bxVar).parentLayout;
            if (!((ActionBarLayout) r4Var2).i()) {
                r4Var3 = ((org.telegram.ui.ActionBar.g2) bxVar).parentLayout;
                if (!((ActionBarLayout) r4Var3).y()) {
                    r4Var4 = ((org.telegram.ui.ActionBar.g2) bxVar).parentLayout;
                    if (!((ActionBarLayout) r4Var4).n && (motionEvent == null || bxVar.o3 || (motionEvent.getY() > Y() + Z() && ((fVar = bxVar.A1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < bxVar.A1.getY())))) {
                        if (bxVar.T0 != 3) {
                            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                            if (org.telegram.messenger.bz.m(i7) != 5) {
                                i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                if (org.telegram.messenger.bz.m(i10) == 2) {
                                    ax axVar = bxVar.f0[0];
                                    if (axVar != null) {
                                        int i11 = axVar.d.h;
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
                            bxVar.o3 = true;
                            this.h0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.i0 = x10;
                            if (bxVar.k3) {
                                if (x10 < bxVar.f0[0].getTranslationX() + bxVar.f0[0].getMeasuredWidth()) {
                                    bxVar.l3 = bxVar.f0[0].getTranslationX();
                                } else {
                                    ax[] axVarArr = bxVar.f0;
                                    ax axVar2 = axVarArr[0];
                                    ax axVar3 = axVarArr[1];
                                    axVarArr[0] = axVar3;
                                    axVarArr[1] = axVar2;
                                    bxVar.k3 = false;
                                    bxVar.l3 = axVar3.getTranslationX();
                                    bxVar.A0.h(1.0f, bxVar.f0[0].h);
                                    bxVar.A0.h(bxVar.l3 / r10[0].getMeasuredWidth(), bxVar.f0[1].h);
                                    bxVar.l5(true);
                                    bxVar.f0[0].d.getClass();
                                    bxVar.f0[1].d.getClass();
                                }
                            } else if (x10 < bxVar.f0[1].getTranslationX() + bxVar.f0[1].getMeasuredWidth()) {
                                ax[] axVarArr2 = bxVar.f0;
                                ax axVar4 = axVarArr2[0];
                                ax axVar5 = axVarArr2[1];
                                axVarArr2[0] = axVar5;
                                axVarArr2[1] = axVar4;
                                bxVar.k3 = true;
                                bxVar.l3 = axVar5.getTranslationX();
                                bxVar.A0.h(1.0f, bxVar.f0[0].h);
                                bxVar.A0.h((-bxVar.l3) / r10[0].getMeasuredWidth(), bxVar.f0[1].h);
                                bxVar.l5(true);
                                bxVar.f0[0].d.getClass();
                                bxVar.f0[1].d.getClass();
                            } else {
                                bxVar.l3 = bxVar.f0[0].getTranslationX();
                            }
                            bxVar.i3.removeAllListeners();
                            bxVar.i3.cancel();
                            bxVar.j3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            bxVar.l3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !bxVar.o3 && !bxVar.p3 && bxVar.A0.getVisibility() == 0) {
                            this.h0 = motionEvent.getPointerId(0);
                            bxVar.p3 = true;
                            this.i0 = (int) motionEvent.getX();
                            this.j0 = (int) motionEvent.getY();
                            this.k0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.h0) {
                            int x11 = (int) ((motionEvent.getX() - this.i0) + bxVar.l3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.j0);
                            if (bxVar.o3 && (((z10 = bxVar.k3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    bxVar.p3 = true;
                                    bxVar.o3 = false;
                                    bxVar.f0[0].setTranslationX(0.0f);
                                    bxVar.f0[1].setTranslationX(bxVar.k3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    bxVar.A0.h(0.0f, bxVar.f0[1].h);
                                }
                            }
                            if (bxVar.p3 && !bxVar.o3) {
                                float a12 = org.telegram.messenger.g0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.i0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (bxVar.o3) {
                                bxVar.f0[0].setTranslationX(x11);
                                if (bxVar.k3) {
                                    bxVar.f0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    bxVar.f0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / bxVar.f0[0].getMeasuredWidth();
                                ax axVar6 = bxVar.f0[1];
                                if (axVar6.F && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    bxVar.A0.l(bxVar.f0[1].h);
                                    org.telegram.messenger.g0.h3(new tw(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                bxVar.A0.h(abs2, axVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.h0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.k0.computeCurrentVelocity(1000, bxVar.n3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.k0.getXVelocity();
                                f11 = this.k0.getYVelocity();
                                if (!bxVar.o3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    a0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (bxVar.o3) {
                                float x13 = bxVar.f0[0].getX();
                                bxVar.i3 = new AnimatorSet();
                                if (bxVar.f0[1].F) {
                                    bxVar.m3 = true;
                                } else if (bxVar.l3 == 0.0f) {
                                    bxVar.m3 = Math.abs(x13) < ((float) bxVar.f0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z11 = bxVar.k3 ? false : false;
                                    bxVar.m3 = z11;
                                } else if (bxVar.k3) {
                                    bxVar.m3 = bxVar.f0[1].getX() > ((float) (bxVar.f0[0].getMeasuredWidth() >> 1));
                                } else {
                                    bxVar.m3 = bxVar.f0[0].getX() < ((float) (bxVar.f0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = bxVar.m3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (bxVar.k3) {
                                        bxVar.i3.playTogether(ObjectAnimator.ofFloat(bxVar.f0[0], (Property<ax, Float>) property, 0.0f), ObjectAnimator.ofFloat(bxVar.f0[1], (Property<ax, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        bxVar.i3.playTogether(ObjectAnimator.ofFloat(bxVar.f0[0], (Property<ax, Float>) property, 0.0f), ObjectAnimator.ofFloat(bxVar.f0[1], (Property<ax, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = bxVar.f0[0].getMeasuredWidth() - Math.abs(x13);
                                    bxVar.C5(bxVar.f0[1].h, true);
                                    if (bxVar.k3) {
                                        bxVar.i3.playTogether(ObjectAnimator.ofFloat(bxVar.f0[0], (Property<ax, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(bxVar.f0[1], (Property<ax, Float>) property, 0.0f));
                                    } else {
                                        bxVar.i3.playTogether(ObjectAnimator.ofFloat(bxVar.f0[0], (Property<ax, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(bxVar.f0[1], (Property<ax, Float>) property, 0.0f));
                                    }
                                }
                                bxVar.i3.setInterpolator(bx.E4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                bxVar.i3.setDuration(Math.max(org.telegram.messenger.ks.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                bxVar.i3.addListener(new org.telegram.ui.Cells.x9(this, 27));
                                bxVar.i3.start();
                                bxVar.j3 = true;
                                bxVar.o3 = false;
                            } else {
                                bxVar.p3 = false;
                                kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                                kVar.setEnabled(true);
                                bxVar.A0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.k0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.k0 = null;
                            }
                        }
                        return bxVar.o3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        bx bxVar = this.o0;
        if (bxVar.p3 && !bxVar.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
