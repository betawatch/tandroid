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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sw extends org.telegram.ui.Components.st0 {
    public final Paint f0;
    public int g0;
    public int h0;
    public int i0;
    public VelocityTracker j0;
    public final Rect k0;
    public boolean l0;
    public final org.telegram.ui.Cells.l9 m0;
    public final /* synthetic */ zw n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(Context context, zw zwVar) {
        super(context, null);
        this.n0 = zwVar;
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
    
        if (org.telegram.ui.ActionBar.m6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.st0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.iz.f()) {
            zw zwVar = this.n0;
            if (zwVar.l4 != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                h6Var = ((org.telegram.ui.ActionBar.f2) zwVar).resourceProvider;
                if (c8.g0.c(i7, h6Var)) {
                    h6Var2 = ((org.telegram.ui.ActionBar.f2) zwVar).resourceProvider;
                    if (h6Var2 != null) {
                        h6Var3 = ((org.telegram.ui.ActionBar.f2) zwVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    zwVar.l4.e(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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

    @Override // org.telegram.ui.Components.st0
    public final void J(Canvas canvas, ArrayList arrayList) {
        iw iwVar;
        org.telegram.ui.Components.pj0 p10;
        zw zwVar = this.n0;
        if (zwVar.r3 && (iwVar = zwVar.C0) != null && iwVar.getVisibility() == 0) {
            iw iwVar2 = zwVar.C0;
            View[] viewArr = iwVar2.e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.v61.p(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < p10.getChildCount(); i10++) {
                        View childAt = p10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + p10.getY() + viewArr[i7].getY() + iwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.st0
    public final void L() {
        oi.q qVar;
        org.telegram.messenger.iz.f();
        qVar = ((org.telegram.ui.ActionBar.f2) this.n0).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        zw zwVar = this.n0;
        if (!zwVar.i3) {
            return false;
        }
        if (!zwVar.l3) {
            if (Math.abs(zwVar.e0[1].getTranslationX()) < 1.0f) {
                zwVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (zwVar.j3 ? -1 : 1));
                zwVar.e0[1].setTranslationX(0.0f);
                zw.j1(zwVar, true);
                animatorSet = zwVar.h3;
                if (animatorSet != null) {
                }
                zwVar.i3 = false;
            }
            return zwVar.i3;
        }
        if (Math.abs(zwVar.e0[0].getTranslationX()) < 1.0f) {
            zwVar.e0[0].setTranslationX(0.0f);
            zwVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (zwVar.j3 ? 1 : -1));
            zw.j1(zwVar, true);
            animatorSet = zwVar.h3;
            if (animatorSet != null) {
                animatorSet.cancel();
                zwVar.h3 = null;
            }
            zwVar.i3 = false;
        }
        return zwVar.i3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.l lVar;
        zw zwVar = this.n0;
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        float height = lVar.getHeight();
        vv vvVar = zwVar.G3;
        float f10 = (vvVar == null || !vvVar.c()) ? 0.0f : zwVar.G3.e;
        if (zwVar.K) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, zwVar.v3, (1.0f - f10) * (1.0f - zwVar.y1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, (1.0f - zwVar.y1) * (1.0f - zwVar.v3) * org.telegram.messenger.g0.L(48.0f), height + zwVar.T);
    }

    public final int Z() {
        zw zwVar = this.n0;
        float f10 = zwVar.N;
        vv vvVar = zwVar.G3;
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, zwVar.y1, org.telegram.messenger.k5.A(1.0f, (vvVar == null || !vvVar.c()) ? 0.0f : zwVar.G3.e, 1.0f - zwVar.v3, f10), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z9) {
        org.telegram.ui.ActionBar.l lVar;
        zw zwVar = this.n0;
        pw pwVar = zwVar.z0;
        int i7 = pwVar.j0.get(pwVar.K + (z9 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        zwVar.o3 = false;
        zwVar.n3 = true;
        this.h0 = (int) (motionEvent.getX() + zwVar.k3);
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        lVar.setEnabled(false);
        zwVar.z0.setEnabled(false);
        yw ywVar = zwVar.e0[1];
        ywVar.h = i7;
        ywVar.setVisibility(0);
        zwVar.j3 = z9;
        zw.j1(zwVar, false);
        zwVar.d5(true);
        if (z9) {
            zwVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        zwVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        oi.q qVar;
        boolean z9;
        float f10;
        boolean z10;
        Canvas canvas2;
        vv vvVar;
        ow owVar;
        float f11;
        bi.ec ecVar;
        float f12;
        ow owVar2;
        float f13;
        org.telegram.ui.ActionBar.l lVar;
        vv vvVar2;
        zw zwVar = this.n0;
        Paint paint = zwVar.g1;
        qVar = ((org.telegram.ui.ActionBar.f2) zwVar).glassEngine;
        qVar.g();
        if (zwVar.Q && (((vvVar2 = zwVar.G3) == null || !vvVar2.c()) && zwVar.v3 == 0.0f)) {
            zwVar.Q = false;
            int i7 = (zwVar.l4() && zwVar.e0[0].s == 0) ? 1 : 0;
            vw vwVar = zwVar.e0[0].a;
            if (zwVar.R) {
                if (!zwVar.c1) {
                    if (i7 == 0) {
                        zwVar.R = false;
                    }
                    if (zwVar.R) {
                        v4.d1 L = vwVar.L(0, false);
                        if (L == null) {
                            zwVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= vwVar.getPaddingTop() - org.telegram.messenger.g0.L(81.0f)) {
                                zwVar.R = false;
                            } else if (view.getTop() >= vwVar.getPaddingTop()) {
                                zwVar.R = false;
                            }
                        }
                        if (zwVar.R) {
                        }
                    }
                }
                i7 = 0;
            }
            v4.d1 L2 = vwVar.L(i7, false);
            if (L2 != null) {
                float paddingTop = vwVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -zwVar.f4();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    zwVar.O4(f14);
                } else {
                    zwVar.O4(0.0f);
                }
            } else {
                zwVar.O4(-zwVar.f4());
            }
        }
        int Y = Y();
        z9 = ((org.telegram.ui.ActionBar.f2) zwVar).inPreviewMode;
        int Z = z9 ? org.telegram.messenger.g0.m : Z();
        int i10 = Z + Y;
        zwVar.G3.setCurrentTop(i10);
        boolean z11 = zwVar.t3;
        Rect rect = this.k0;
        Paint paint2 = this.f0;
        if (z11) {
            float f16 = zwVar.y1;
            if (f16 == 1.0f) {
                paint2.setColor(zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            } else if (f16 == 0.0f && (owVar2 = zwVar.X) != null) {
                owVar2.setTranslationY(zwVar.i4() + zwVar.N);
            }
            rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(zwVar.y1 * 2.0f));
            float f17 = zwVar.y1;
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
            float f18 = zwVar.y1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                if (!zwVar.r3 && zwVar.s3) {
                    rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(zwVar.y1 * f13));
                    H(canvas, 0.0f, this.k0, paint2, true);
                }
                ow owVar3 = zwVar.X;
                if (owVar3 != null) {
                    lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                    int height = lVar.getHeight();
                    owVar3.setTranslationY(zwVar.i4() + (i10 - (height + (zwVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            z10 = ((org.telegram.ui.ActionBar.f2) zwVar).inPreviewMode;
            if (!z10) {
                if (zwVar.v3 > 0.0f) {
                    paint2.setColor(zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(zwVar.y1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(zwVar.y1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint, true);
                }
                zwVar.y3 = 0.0f;
                zwVar.x3 = 0.0f;
                float min = zwVar.y3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!zwVar.K ? 81.0f : 0.0f)) + zwVar.N, zwVar.v3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!zwVar.K ? 81.0f : 0.0f)));
                zwVar.y3 = min;
                zwVar.x3 = min;
                vvVar = zwVar.G3;
                if (vvVar == null && vvVar.c()) {
                    float f19 = zwVar.G3.e;
                    float f42 = zwVar.y3 - ((zwVar.f4() + zwVar.N) * f19);
                    zwVar.y3 = f42;
                    zwVar.x3 = f42;
                    float i11 = zwVar.G0 ? f10 - Utilities.i(f19 / 0.5f, f10, 0.0f) : f10;
                    pw pwVar = zwVar.z0;
                    if (pwVar != null && pwVar.getVisibility() == 0) {
                        zwVar.y3 -= (f10 - zwVar.r.e) * zwVar.z0.getMeasuredHeight();
                    }
                    ow owVar4 = zwVar.X;
                    if (owVar4 != null) {
                        owVar4.setTranslationY(zwVar.i4() + org.telegram.messenger.g0.T1(zwVar.N + zwVar.y3, -org.telegram.messenger.g0.L(zwVar.K ? 81.0f : 0.0f), f19));
                    }
                    if (zwVar.D) {
                        float f20 = zwVar.E ? 0.0f : zwVar.N;
                        f12 = -org.telegram.messenger.g0.T1(-f20, f20, zwVar.G3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    zwVar.e0[0].setTranslationY(f12 - (((zwVar.K ? org.telegram.messenger.g0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f)) * zwVar.G3.e));
                    f11 = i11;
                } else {
                    owVar = zwVar.X;
                    if (owVar != null) {
                        owVar.setTranslationY(org.telegram.messenger.g0.T1(((zwVar.N + zwVar.y3) + zwVar.T) - org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L((zwVar.K ? 81 : 0) + 48), zwVar.y1));
                    }
                    f11 = f10;
                }
                zwVar.e5();
                zw.X2(zwVar, f11);
                super.dispatchDraw(canvas);
                zw.Y2(zwVar, canvas2, i10);
                ecVar = zwVar.K0;
                if (ecVar != null && ecVar.getVisibility() == 0) {
                    if (zwVar.K0.getAlpha() != f10) {
                        zwVar.K0.draw(canvas2);
                    } else if (zwVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(zwVar.K0.getLeft(), zwVar.K0.getTop(), zwVar.K0.getRight(), zwVar.K0.getBottom(), (int) (zwVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(zwVar.K0.getLeft(), zwVar.K0.getTop());
                        zwVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!zwVar.W && zwVar.Z2 == 0) {
                    org.telegram.messenger.g0.O(canvas2, this, zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6), zwVar.g4, f10);
                }
                zwVar.V = true;
            }
        }
        canvas2 = canvas;
        zwVar.y3 = 0.0f;
        zwVar.x3 = 0.0f;
        float min2 = zwVar.y3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!zwVar.K ? 81.0f : 0.0f)) + zwVar.N, zwVar.v3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!zwVar.K ? 81.0f : 0.0f)));
        zwVar.y3 = min2;
        zwVar.x3 = min2;
        vvVar = zwVar.G3;
        if (vvVar == null) {
        }
        owVar = zwVar.X;
        if (owVar != null) {
        }
        f11 = f10;
        zwVar.e5();
        zw.X2(zwVar, f11);
        super.dispatchDraw(canvas);
        zw.Y2(zwVar, canvas2, i10);
        ecVar = zwVar.K0;
        if (ecVar != null) {
            if (zwVar.K0.getAlpha() != f10) {
            }
        }
        if (!zwVar.W) {
            org.telegram.messenger.g0.O(canvas2, this, zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6), zwVar.g4, f10);
        }
        zwVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.m0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        zw zwVar = this.n0;
        if (view == zwVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.st0.e0) {
            return super.drawChild(canvas, view, j3);
        }
        yw[] ywVarArr = zwVar.e0;
        if (view == ywVarArr[0] || ((ywVarArr.length > 1 && view == ywVarArr[1]) || view == zwVar.K1 || view == zwVar.z0)) {
            canvas.save();
            if (view != zwVar.K1 && view != zwVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = zwVar.X3;
            if (f10 != 1.0f) {
                if (zwVar.Y3) {
                    canvas.translate((1.0f - zwVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float v = com.google.android.recaptcha.internal.a.v(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - zwVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    canvas.scale(v, v, 0.0f, (-getY()) + zwVar.N + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        if (view != lVar || zwVar.X3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (zwVar.Y3) {
            canvas.translate((1.0f - zwVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
        } else {
            float v10 = com.google.android.recaptcha.internal.a.v(1.0f, zwVar.X3, 0.05f, 1.0f);
            canvas.translate((1.0f - zwVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
            lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            canvas.scale(v10, v10, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + (lVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.f5 f5Var = this.n0.E3;
        if (f5Var != null) {
            f5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.f5 f5Var = this.n0.E3;
        if (f5Var != null) {
            f5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        pw pwVar;
        int actionMasked = motionEvent.getActionMasked();
        zw zwVar = this.n0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (lVar.x()) {
                zwVar.Z0 = true;
            }
        }
        return X() || ((pwVar = zwVar.z0) != null && pwVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        zw zwVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.l lVar;
        sv svVar;
        sv svVar2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        sw swVar = this;
        int childCount = swVar.getChildCount();
        int Q = swVar.Q();
        int i19 = 0;
        swVar.setBottomClip(0);
        int measuredWidth = swVar.getMeasuredWidth();
        int measuredHeight = swVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            zwVar = swVar.n0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = swVar.getChildAt(i20);
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
                            i18 = layoutParams.topMargin + swVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = measuredHeight - measuredHeight2;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != zwVar.X || childAt == zwVar.Z || childAt == (svVar2 = zwVar.E0)) {
                            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                            i18 = lVar.getMeasuredHeight();
                            if (childAt != zwVar.X && childAt != zwVar.E0 && childAt != zwVar.Z) {
                                i18 += org.telegram.messenger.g0.L(48.0f);
                            }
                            if (zwVar.K && childAt == zwVar.X) {
                                i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                            }
                            svVar = zwVar.E0;
                            if (childAt == svVar && svVar.getPremiumHint() != null) {
                                zwVar.E0.getPremiumHint().layout(i15, org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, zwVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2));
                            }
                            if (childAt == zwVar.X) {
                                i18 += org.telegram.messenger.g0.L(2.0f);
                            }
                        } else if (childAt == zwVar.C0) {
                            i18 = -org.telegram.messenger.g0.L(zwVar.a);
                        } else if (childAt instanceof pt) {
                            lVar3 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                            i18 = lVar3.getMeasuredHeight();
                        } else if (childAt instanceof yw) {
                            i18 = i19;
                        } else if (childAt == zwVar.K1 || childAt == zwVar.L1 || childAt == zwVar.z0) {
                            lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                            i18 = org.telegram.messenger.g0.L(48.0f) + lVar2.getMeasuredHeight() + i18;
                        } else if (svVar2 != null && svVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != zwVar.X) {
                    }
                    lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                    i18 = lVar.getMeasuredHeight();
                    if (childAt != zwVar.X) {
                        i18 += org.telegram.messenger.g0.L(48.0f);
                    }
                    if (zwVar.K) {
                        i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                    }
                    svVar = zwVar.E0;
                    if (childAt == svVar) {
                        zwVar.E0.getPremiumHint().layout(i15, org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, zwVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2));
                    }
                    if (childAt == zwVar.X) {
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
                if (childAt != zwVar.X) {
                }
                lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                i18 = lVar.getMeasuredHeight();
                if (childAt != zwVar.X) {
                }
                if (zwVar.K) {
                }
                svVar = zwVar.E0;
                if (childAt == svVar) {
                }
                if (childAt == zwVar.X) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
            i20++;
            i19 = 0;
            swVar = this;
        }
        iw iwVar = zwVar.C0;
        if (iwVar != null) {
            iwVar.setKeyboardHeight(Q);
        }
        R();
        zwVar.k5();
        zwVar.e5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        zw zwVar = this.n0;
        int i11 = zwVar.a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z9 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.r0 r0Var = zwVar.m0;
        if (r0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            layoutParams.topMargin = lVar5.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        measureChildWithMargins(lVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof pt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - lVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof yw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (zwVar.G3.c()) {
                            if (zwVar.x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (zwVar.K) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i13 = L3 + zwVar.P;
                        if (zwVar.w3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i14 = zwVar.Z3 ? (int) (i13 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i14);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i13 + i14), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        iw iwVar = zwVar.C0;
                        if (childAt == iwVar) {
                            iwVar.setTranslationY(zwVar.I0);
                            zwVar.C0.r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11) + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                            zwVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            lVar3 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i11) + lVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            mv mvVar = zwVar.C1;
                            if (mvVar == null || !mvVar.t0(childAt)) {
                                if (childAt == zwVar.G3) {
                                    int size4 = View.MeasureSpec.getSize(i10);
                                    int i15 = zwVar.Z3 ? (int) (size4 * 0.05f) : 0;
                                    zwVar.G3.setTransitionPaddingBottom(i15);
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
            post(new rw(this, 1));
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
        org.telegram.ui.ActionBar.r4 r4Var;
        pw pwVar;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.l lVar;
        float measuredWidth;
        boolean z9;
        int i7;
        int i10;
        jh.f fVar;
        zw zwVar = this.n0;
        r4Var = ((org.telegram.ui.ActionBar.f2) zwVar).parentLayout;
        Object[] objArr = 0;
        if (r4Var != null && (pwVar = zwVar.z0) != null && !pwVar.n && !zwVar.k2 && !zwVar.G3.c()) {
            r4Var2 = ((org.telegram.ui.ActionBar.f2) zwVar).parentLayout;
            if (!((ActionBarLayout) r4Var2).i()) {
                r4Var3 = ((org.telegram.ui.ActionBar.f2) zwVar).parentLayout;
                if (!((ActionBarLayout) r4Var3).y()) {
                    r4Var4 = ((org.telegram.ui.ActionBar.f2) zwVar).parentLayout;
                    if (!((ActionBarLayout) r4Var4).n && (motionEvent == null || zwVar.n3 || (motionEvent.getY() > Y() + Z() && ((fVar = zwVar.z1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < zwVar.z1.getY())))) {
                        if (zwVar.S0 != 3) {
                            i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                            if (org.telegram.messenger.iz.m(i7) != 5) {
                                i10 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                                if (org.telegram.messenger.iz.m(i10) == 2) {
                                    yw ywVar = zwVar.e0[0];
                                    if (ywVar != null) {
                                        int i11 = ywVar.d.h;
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
                            zwVar.n3 = true;
                            this.g0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.h0 = x10;
                            if (zwVar.j3) {
                                if (x10 < zwVar.e0[0].getTranslationX() + zwVar.e0[0].getMeasuredWidth()) {
                                    zwVar.k3 = zwVar.e0[0].getTranslationX();
                                } else {
                                    yw[] ywVarArr = zwVar.e0;
                                    yw ywVar2 = ywVarArr[0];
                                    yw ywVar3 = ywVarArr[1];
                                    ywVarArr[0] = ywVar3;
                                    ywVarArr[1] = ywVar2;
                                    zwVar.j3 = false;
                                    zwVar.k3 = ywVar3.getTranslationX();
                                    zwVar.z0.g(1.0f, zwVar.e0[0].h);
                                    zwVar.z0.g(zwVar.k3 / r10[0].getMeasuredWidth(), zwVar.e0[1].h);
                                    zwVar.d5(true);
                                    zwVar.e0[0].d.getClass();
                                    zwVar.e0[1].d.getClass();
                                }
                            } else if (x10 < zwVar.e0[1].getTranslationX() + zwVar.e0[1].getMeasuredWidth()) {
                                yw[] ywVarArr2 = zwVar.e0;
                                yw ywVar4 = ywVarArr2[0];
                                yw ywVar5 = ywVarArr2[1];
                                ywVarArr2[0] = ywVar5;
                                ywVarArr2[1] = ywVar4;
                                zwVar.j3 = true;
                                zwVar.k3 = ywVar5.getTranslationX();
                                zwVar.z0.g(1.0f, zwVar.e0[0].h);
                                zwVar.z0.g((-zwVar.k3) / r10[0].getMeasuredWidth(), zwVar.e0[1].h);
                                zwVar.d5(true);
                                zwVar.e0[0].d.getClass();
                                zwVar.e0[1].d.getClass();
                            } else {
                                zwVar.k3 = zwVar.e0[0].getTranslationX();
                            }
                            zwVar.h3.removeAllListeners();
                            zwVar.h3.cancel();
                            zwVar.i3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            zwVar.k3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !zwVar.n3 && !zwVar.o3 && zwVar.z0.getVisibility() == 0) {
                            this.g0 = motionEvent.getPointerId(0);
                            zwVar.o3 = true;
                            this.h0 = (int) motionEvent.getX();
                            this.i0 = (int) motionEvent.getY();
                            this.j0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
                            int x11 = (int) ((motionEvent.getX() - this.h0) + zwVar.k3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.i0);
                            if (zwVar.n3 && (((z9 = zwVar.j3) && x11 > 0) || (!z9 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    zwVar.o3 = true;
                                    zwVar.n3 = false;
                                    zwVar.e0[0].setTranslationX(0.0f);
                                    zwVar.e0[1].setTranslationX(zwVar.j3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    zwVar.z0.g(0.0f, zwVar.e0[1].h);
                                }
                            }
                            if (zwVar.o3 && !zwVar.n3) {
                                float a12 = org.telegram.messenger.g0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.h0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (zwVar.n3) {
                                zwVar.e0[0].setTranslationX(x11);
                                if (zwVar.j3) {
                                    zwVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    zwVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / zwVar.e0[0].getMeasuredWidth();
                                yw ywVar6 = zwVar.e0[1];
                                if (ywVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    zwVar.z0.i(zwVar.e0[1].h);
                                    org.telegram.messenger.g0.i3(new rw(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                zwVar.z0.g(abs2, ywVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.j0.computeCurrentVelocity(1000, zwVar.m3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.j0.getXVelocity();
                                f11 = this.j0.getYVelocity();
                                if (!zwVar.n3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    a0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (zwVar.n3) {
                                float x13 = zwVar.e0[0].getX();
                                zwVar.h3 = new AnimatorSet();
                                if (zwVar.e0[1].E) {
                                    zwVar.l3 = true;
                                } else if (zwVar.k3 == 0.0f) {
                                    zwVar.l3 = Math.abs(x13) < ((float) zwVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z10 = zwVar.j3 ? false : false;
                                    zwVar.l3 = z10;
                                } else if (zwVar.j3) {
                                    zwVar.l3 = zwVar.e0[1].getX() > ((float) (zwVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    zwVar.l3 = zwVar.e0[0].getX() < ((float) (zwVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z11 = zwVar.l3;
                                Property property = View.TRANSLATION_X;
                                if (z11) {
                                    measuredWidth = Math.abs(x13);
                                    if (zwVar.j3) {
                                        zwVar.h3.playTogether(ObjectAnimator.ofFloat(zwVar.e0[0], (Property<yw, Float>) property, 0.0f), ObjectAnimator.ofFloat(zwVar.e0[1], (Property<yw, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        zwVar.h3.playTogether(ObjectAnimator.ofFloat(zwVar.e0[0], (Property<yw, Float>) property, 0.0f), ObjectAnimator.ofFloat(zwVar.e0[1], (Property<yw, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = zwVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (zwVar.j3) {
                                        zwVar.h3.playTogether(ObjectAnimator.ofFloat(zwVar.e0[0], (Property<yw, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(zwVar.e0[1], (Property<yw, Float>) property, 0.0f));
                                    } else {
                                        zwVar.h3.playTogether(ObjectAnimator.ofFloat(zwVar.e0[0], (Property<yw, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(zwVar.e0[1], (Property<yw, Float>) property, 0.0f));
                                    }
                                }
                                zwVar.h3.setInterpolator(zw.A4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                zwVar.h3.setDuration(Math.max(org.telegram.messenger.qs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                zwVar.h3.addListener(new va(this, 26));
                                zwVar.h3.start();
                                zwVar.i3 = true;
                                zwVar.n3 = false;
                            } else {
                                zwVar.o3 = false;
                                lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                                lVar.setEnabled(true);
                                zwVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.j0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.j0 = null;
                            }
                        }
                        return zwVar.n3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        zw zwVar = this.n0;
        if (zwVar.o3 && !zwVar.n3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }
}
