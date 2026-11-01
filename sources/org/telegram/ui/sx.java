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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sx extends org.telegram.ui.Components.vu0 {
    public final Paint f0;
    public int g0;
    public int h0;
    public int i0;
    public VelocityTracker j0;
    public final Rect k0;
    public boolean l0;
    public final ge.b m0;
    public final /* synthetic */ zx n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(Context context, zx zxVar) {
        super(context, null);
        this.n0 = zxVar;
        this.f0 = new Paint(1);
        this.k0 = new Rect();
        this.m0 = new ge.b(new e(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = org.telegram.messenger.at.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = org.telegram.messenger.at.t3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.t6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.vu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.uz.f()) {
            zx zxVar = this.n0;
            if (zxVar.k4 != null) {
                i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                p6Var = ((org.telegram.ui.ActionBar.k2) zxVar).resourceProvider;
                if (w7.b9.c(i10, p6Var)) {
                    p6Var2 = ((org.telegram.ui.ActionBar.k2) zxVar).resourceProvider;
                    if (p6Var2 != null) {
                        p6Var3 = ((org.telegram.ui.ActionBar.k2) zxVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    zxVar.k4.e(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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

    @Override // org.telegram.ui.Components.vu0
    public final void J(Canvas canvas, ArrayList arrayList) {
        jx jxVar;
        org.telegram.ui.Components.uk0 p5;
        zx zxVar = this.n0;
        if (zxVar.q3 && (jxVar = zxVar.C0) != null && jxVar.getVisibility() == 0) {
            jx jxVar2 = zxVar.C0;
            View[] viewArr = jxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.x71.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < org.telegram.messenger.i0.L(100.0f) + org.telegram.messenger.i0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + jxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vu0
    public final void K() {
        ei.r rVar;
        org.telegram.messenger.uz.f();
        rVar = ((org.telegram.ui.ActionBar.k2) this.n0).glassEngine;
        rVar.g();
    }

    @Override // org.telegram.ui.Components.vu0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        zx zxVar = this.n0;
        if (!zxVar.h3) {
            return false;
        }
        if (!zxVar.k3) {
            if (Math.abs(zxVar.e0[1].getTranslationX()) < 1.0f) {
                zxVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (zxVar.i3 ? -1 : 1));
                zxVar.e0[1].setTranslationX(0.0f);
                zx.j1(zxVar, true);
                animatorSet = zxVar.g3;
                if (animatorSet != null) {
                }
                zxVar.h3 = false;
            }
            return zxVar.h3;
        }
        if (Math.abs(zxVar.e0[0].getTranslationX()) < 1.0f) {
            zxVar.e0[0].setTranslationX(0.0f);
            zxVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (zxVar.i3 ? 1 : -1));
            zx.j1(zxVar, true);
            animatorSet = zxVar.g3;
            if (animatorSet != null) {
                animatorSet.cancel();
                zxVar.g3 = null;
            }
            zxVar.h3 = false;
        }
        return zxVar.h3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.l lVar;
        zx zxVar = this.n0;
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        float height = lVar.getHeight();
        ww wwVar = zxVar.F3;
        float f7 = (wwVar == null || !wwVar.c()) ? 0.0f : zxVar.F3.e;
        if (zxVar.K) {
            height = c3.i0.z(1.0f, zxVar.u3, (1.0f - f7) * (1.0f - zxVar.x1) * org.telegram.messenger.i0.L(81.0f), height);
        }
        return (int) c3.i0.z(1.0f, f7, (1.0f - zxVar.x1) * (1.0f - zxVar.u3) * org.telegram.messenger.i0.L(48.0f), height + zxVar.T);
    }

    public final int Z() {
        zx zxVar = this.n0;
        float f7 = zxVar.N;
        ww wwVar = zxVar.F3;
        return (int) c3.i0.z(1.0f, zxVar.x1, org.telegram.messenger.m5.A(1.0f, (wwVar == null || !wwVar.c()) ? 0.0f : zxVar.F3.e, 1.0f - zxVar.u3, f7), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        zx zxVar = this.n0;
        px pxVar = zxVar.z0;
        int i10 = pxVar.j0.get(pxVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        zxVar.n3 = false;
        zxVar.m3 = true;
        this.h0 = (int) (motionEvent.getX() + zxVar.j3);
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        lVar.setEnabled(false);
        zxVar.z0.setEnabled(false);
        yx yxVar = zxVar.e0[1];
        yxVar.h = i10;
        yxVar.setVisibility(0);
        zxVar.i3 = z10;
        zx.j1(zxVar, false);
        zxVar.d5(true);
        if (z10) {
            zxVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        zxVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.vu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ei.r rVar;
        boolean z10;
        float f7;
        boolean z11;
        Canvas canvas2;
        ww wwVar;
        ox oxVar;
        float f10;
        bi.t0 t0Var;
        float f11;
        ox oxVar2;
        float f12;
        org.telegram.ui.ActionBar.l lVar;
        ww wwVar2;
        zx zxVar = this.n0;
        Paint paint = zxVar.f1;
        rVar = ((org.telegram.ui.ActionBar.k2) zxVar).glassEngine;
        rVar.g();
        if (zxVar.Q && (((wwVar2 = zxVar.F3) == null || !wwVar2.c()) && zxVar.u3 == 0.0f)) {
            zxVar.Q = false;
            int i10 = (zxVar.l4() && zxVar.e0[0].s == 0) ? 1 : 0;
            vx vxVar = zxVar.e0[0].a;
            if (zxVar.R) {
                if (!zxVar.b1) {
                    if (i10 == 0) {
                        zxVar.R = false;
                    }
                    if (zxVar.R) {
                        s4.c1 L = vxVar.L(0, false);
                        if (L == null) {
                            zxVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= vxVar.getPaddingTop() - org.telegram.messenger.i0.L(81.0f)) {
                                zxVar.R = false;
                            } else if (view.getTop() >= vxVar.getPaddingTop()) {
                                zxVar.R = false;
                            }
                        }
                        if (zxVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.c1 L2 = vxVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = vxVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -zxVar.f4();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    zxVar.O4(f13);
                } else {
                    zxVar.O4(0.0f);
                }
            } else {
                zxVar.O4(-zxVar.f4());
            }
        }
        int Y = Y();
        z10 = ((org.telegram.ui.ActionBar.k2) zxVar).inPreviewMode;
        int Z = z10 ? org.telegram.messenger.i0.m : Z();
        int i11 = Z + Y;
        zxVar.F3.setCurrentTop(i11);
        boolean z12 = zxVar.s3;
        Rect rect = this.k0;
        Paint paint2 = this.f0;
        if (z12) {
            float f15 = zxVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            } else if (f15 == 0.0f && (oxVar2 = zxVar.X) != null) {
                oxVar2.setTranslationY(zxVar.i4() + zxVar.N);
            }
            rect.set(0, Z, getMeasuredWidth(), i11 - org.telegram.messenger.i0.L(zxVar.x1 * 2.0f));
            float f16 = zxVar.x1;
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
            float f17 = zxVar.x1;
            if (f17 > 0.0f && f17 < f7) {
                paint2.setColor(zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                if (!zxVar.q3 && zxVar.r3) {
                    rect.set(0, Z, getMeasuredWidth(), i11 - org.telegram.messenger.i0.L(zxVar.x1 * f12));
                    H(canvas, 0.0f, this.k0, paint2, true);
                }
                ox oxVar3 = zxVar.X;
                if (oxVar3 != null) {
                    lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                    int height = lVar.getHeight();
                    oxVar3.setTranslationY(zxVar.i4() + (i11 - (height + (zxVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.k2) zxVar).inPreviewMode;
            if (!z11) {
                if (zxVar.u3 > 0.0f) {
                    paint2.setColor(zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i11 - org.telegram.messenger.i0.L(zxVar.x1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i11 - org.telegram.messenger.i0.L(zxVar.x1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint, true);
                }
                zxVar.x3 = 0.0f;
                zxVar.w3 = 0.0f;
                float min = zxVar.x3 - Math.min((org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(!zxVar.K ? 81.0f : 0.0f)) + zxVar.N, zxVar.u3 * (org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(!zxVar.K ? 81.0f : 0.0f)));
                zxVar.x3 = min;
                zxVar.w3 = min;
                wwVar = zxVar.F3;
                if (wwVar == null && wwVar.c()) {
                    float f18 = zxVar.F3.e;
                    float f42 = zxVar.x3 - ((zxVar.f4() + zxVar.N) * f18);
                    zxVar.x3 = f42;
                    zxVar.w3 = f42;
                    float i12 = zxVar.G0 ? f7 - Utilities.i(f18 / 0.5f, f7, 0.0f) : f7;
                    px pxVar = zxVar.z0;
                    if (pxVar != null && pxVar.getVisibility() == 0) {
                        zxVar.x3 -= (f7 - zxVar.r.e) * zxVar.z0.getMeasuredHeight();
                    }
                    ox oxVar4 = zxVar.X;
                    if (oxVar4 != null) {
                        oxVar4.setTranslationY(zxVar.i4() + org.telegram.messenger.i0.T1(zxVar.N + zxVar.x3, -org.telegram.messenger.i0.L(zxVar.K ? 81.0f : 0.0f), f18));
                    }
                    if (zxVar.D) {
                        float f19 = zxVar.E ? 0.0f : zxVar.N;
                        f11 = -org.telegram.messenger.i0.T1(-f19, f19, zxVar.F3.e);
                    } else {
                        f11 = 0.0f;
                    }
                    zxVar.e0[0].setTranslationY(f11 - (((zxVar.K ? org.telegram.messenger.i0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.i0.L(48.0f)) * zxVar.F3.e));
                    f10 = i12;
                } else {
                    oxVar = zxVar.X;
                    if (oxVar != null) {
                        oxVar.setTranslationY(org.telegram.messenger.i0.T1(((zxVar.N + zxVar.x3) + zxVar.T) - org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L((zxVar.K ? 81 : 0) + 48), zxVar.x1));
                    }
                    f10 = f7;
                }
                zxVar.e5();
                zx.X2(zxVar, f10);
                super.dispatchDraw(canvas);
                zx.Y2(zxVar, canvas2, i11);
                t0Var = zxVar.K0;
                if (t0Var != null && t0Var.getVisibility() == 0) {
                    if (zxVar.K0.getAlpha() != f7) {
                        zxVar.K0.draw(canvas2);
                    } else if (zxVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(zxVar.K0.getLeft(), zxVar.K0.getTop(), zxVar.K0.getRight(), zxVar.K0.getBottom(), (int) (zxVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(zxVar.K0.getLeft(), zxVar.K0.getTop());
                        zxVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!zxVar.W && zxVar.Y2 == 0) {
                    org.telegram.messenger.i0.O(canvas2, this, zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6), zxVar.f4, f7);
                }
                zxVar.V = true;
            }
        }
        canvas2 = canvas;
        zxVar.x3 = 0.0f;
        zxVar.w3 = 0.0f;
        float min2 = zxVar.x3 - Math.min((org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(!zxVar.K ? 81.0f : 0.0f)) + zxVar.N, zxVar.u3 * (org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(!zxVar.K ? 81.0f : 0.0f)));
        zxVar.x3 = min2;
        zxVar.w3 = min2;
        wwVar = zxVar.F3;
        if (wwVar == null) {
        }
        oxVar = zxVar.X;
        if (oxVar != null) {
        }
        f10 = f7;
        zxVar.e5();
        zx.X2(zxVar, f10);
        super.dispatchDraw(canvas);
        zx.Y2(zxVar, canvas2, i11);
        t0Var = zxVar.K0;
        if (t0Var != null) {
            if (zxVar.K0.getAlpha() != f7) {
            }
        }
        if (!zxVar.W) {
            org.telegram.messenger.i0.O(canvas2, this, zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6), zxVar.f4, f7);
        }
        zxVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.m0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        zx zxVar = this.n0;
        if (view == zxVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.vu0.e0) {
            return super.drawChild(canvas, view, j10);
        }
        yx[] yxVarArr = zxVar.e0;
        if (view == yxVarArr[0] || ((yxVarArr.length > 1 && view == yxVarArr[1]) || view == zxVar.J1 || view == zxVar.z0)) {
            canvas.save();
            if (view != zxVar.J1 && view != zxVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = zxVar.W3;
            if (f7 != 1.0f) {
                if (zxVar.X3) {
                    canvas.translate((1.0f - zxVar.W3) * org.telegram.messenger.i0.L(40.0f) * (-1), 0.0f);
                } else {
                    float z10 = sc.e.z(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - zxVar.W3) * (-org.telegram.messenger.i0.L(4.0f)), 0.0f);
                    canvas.scale(z10, z10, 0.0f, (-getY()) + zxVar.N + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        if (view != lVar || zxVar.W3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (zxVar.X3) {
            canvas.translate((1.0f - zxVar.W3) * org.telegram.messenger.i0.L(40.0f) * (-1), 0.0f);
        } else {
            float z11 = sc.e.z(1.0f, zxVar.W3, 0.05f, 1.0f);
            canvas.translate((1.0f - zxVar.W3) * (-org.telegram.messenger.i0.L(4.0f)), 0.0f);
            lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
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

    @Override // org.telegram.ui.Components.vu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.d5 d5Var = this.n0.D3;
        if (d5Var != null) {
            d5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.vu0, android.view.ViewGroup, android.view.View
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
        px pxVar;
        int actionMasked = motionEvent.getActionMasked();
        zx zxVar = this.n0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            if (lVar.u()) {
                zxVar.Y0 = true;
            }
        }
        return X() || ((pxVar = zxVar.z0) != null && pxVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.vu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        zx zxVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar;
        tw twVar;
        tw twVar2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        sx sxVar = this;
        int childCount = sxVar.getChildCount();
        int Q = sxVar.Q();
        int i20 = 0;
        sxVar.setBottomClip(0);
        int measuredWidth = sxVar.getMeasuredWidth();
        int measuredHeight = sxVar.getMeasuredHeight();
        int i21 = 0;
        while (true) {
            zxVar = sxVar.n0;
            if (i21 >= childCount) {
                break;
            }
            View childAt = sxVar.getChildAt(i21);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.at.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i14 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i19 = layoutParams.topMargin + sxVar.getPaddingTop();
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != zxVar.X || childAt == zxVar.Z || childAt == (twVar2 = zxVar.E0)) {
                            lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                            i19 = lVar.getMeasuredHeight();
                            if (childAt != zxVar.X && childAt != zxVar.E0 && childAt != zxVar.Z) {
                                i19 += org.telegram.messenger.i0.L(48.0f);
                            }
                            if (zxVar.K && childAt == zxVar.X) {
                                i19 = org.telegram.messenger.i0.L(81.0f) + i19;
                            }
                            twVar = zxVar.E0;
                            if (childAt == twVar && twVar.getPremiumHint() != null) {
                                zxVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.a30.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, zxVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.a30.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == zxVar.X) {
                                i19 += org.telegram.messenger.i0.L(2.0f);
                            }
                        } else if (childAt == zxVar.C0) {
                            i19 = -org.telegram.messenger.i0.L(zxVar.a);
                        } else if (childAt instanceof nu) {
                            lVar3 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                            i19 = lVar3.getMeasuredHeight();
                        } else if (childAt instanceof yx) {
                            i19 = i20;
                        } else if (childAt == zxVar.J1 || childAt == zxVar.K1 || childAt == zxVar.z0) {
                            lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                            i19 = org.telegram.messenger.i0.L(48.0f) + lVar2.getMeasuredHeight() + i19;
                        } else if (twVar2 != null && twVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != zxVar.X) {
                    }
                    lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                    i19 = lVar.getMeasuredHeight();
                    if (childAt != zxVar.X) {
                        i19 += org.telegram.messenger.i0.L(48.0f);
                    }
                    if (zxVar.K) {
                        i19 = org.telegram.messenger.i0.L(81.0f) + i19;
                    }
                    twVar = zxVar.E0;
                    if (childAt == twVar) {
                        zxVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.a30.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, zxVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.a30.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == zxVar.X) {
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
                if (childAt != zxVar.X) {
                }
                lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                i19 = lVar.getMeasuredHeight();
                if (childAt != zxVar.X) {
                }
                if (zxVar.K) {
                }
                twVar = zxVar.E0;
                if (childAt == twVar) {
                }
                if (childAt == zxVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i21++;
            i20 = 0;
            sxVar = this;
        }
        jx jxVar = zxVar.C0;
        if (jxVar != null) {
            jxVar.setKeyboardHeight(Q);
        }
        R();
        zxVar.k5();
        zxVar.e5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        zx zxVar = this.n0;
        int i12 = zxVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.t0 t0Var = zxVar.m0;
        if (t0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            layoutParams.topMargin = lVar5.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof nu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int L = org.telegram.messenger.i0.L(10.0f);
                        int L2 = org.telegram.messenger.i0.L(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - lVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof yx) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.i0.L(2.0f) + size2;
                        if (zxVar.F3.c()) {
                            if (zxVar.x) {
                                L3 = org.telegram.messenger.i0.L(50.0f) + L3;
                            }
                            if (zxVar.K) {
                                L3 = org.telegram.messenger.i0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.i0.L(48.0f) + L3;
                        }
                        int i14 = L3 + zxVar.P;
                        if (zxVar.v3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = zxVar.Y3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        jx jxVar = zxVar.C0;
                        if (childAt == jxVar) {
                            jxVar.setTranslationY(zxVar.I0);
                            zxVar.C0.r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            zxVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.i0.Q;
                            lVar3 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                            rect.set(0, (org.telegram.messenger.i0.L(i12) + lVar3.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            nw nwVar = zxVar.B1;
                            if (nwVar == null || !nwVar.r0(childAt)) {
                                if (childAt == zxVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = zxVar.Y3 ? (int) (size4 * 0.05f) : 0;
                                    zxVar.F3.setTransitionPaddingBottom(i16);
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
            post(new rx(this, 1));
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
        px pxVar;
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
        zx zxVar = this.n0;
        z4Var = ((org.telegram.ui.ActionBar.k2) zxVar).parentLayout;
        Object[] objArr = 0;
        if (z4Var != null && (pxVar = zxVar.z0) != null && !pxVar.n && !zxVar.j2 && !zxVar.F3.c()) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) zxVar).parentLayout;
            if (!((ActionBarLayout) z4Var2).i()) {
                z4Var3 = ((org.telegram.ui.ActionBar.k2) zxVar).parentLayout;
                if (!((ActionBarLayout) z4Var3).x()) {
                    z4Var4 = ((org.telegram.ui.ActionBar.k2) zxVar).parentLayout;
                    if (!((ActionBarLayout) z4Var4).n && (motionEvent == null || zxVar.m3 || (motionEvent.getY() > Y() + Z() && ((eVar = zxVar.y1) == null || eVar.getVisibility() != 0 || motionEvent.getY() < zxVar.y1.getY())))) {
                        if (zxVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                            if (org.telegram.messenger.uz.m(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                if (org.telegram.messenger.uz.m(i11) == 2) {
                                    yx yxVar = zxVar.e0[0];
                                    if (yxVar != null) {
                                        int i12 = yxVar.d.h;
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
                            zxVar.m3 = true;
                            this.g0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.h0 = x10;
                            if (zxVar.i3) {
                                if (x10 < zxVar.e0[0].getTranslationX() + zxVar.e0[0].getMeasuredWidth()) {
                                    zxVar.j3 = zxVar.e0[0].getTranslationX();
                                } else {
                                    yx[] yxVarArr = zxVar.e0;
                                    yx yxVar2 = yxVarArr[0];
                                    yx yxVar3 = yxVarArr[1];
                                    yxVarArr[0] = yxVar3;
                                    yxVarArr[1] = yxVar2;
                                    zxVar.i3 = false;
                                    zxVar.j3 = yxVar3.getTranslationX();
                                    zxVar.z0.g(1.0f, zxVar.e0[0].h);
                                    zxVar.z0.g(zxVar.j3 / r11[0].getMeasuredWidth(), zxVar.e0[1].h);
                                    zxVar.d5(true);
                                    zxVar.e0[0].d.getClass();
                                    zxVar.e0[1].d.getClass();
                                }
                            } else if (x10 < zxVar.e0[1].getTranslationX() + zxVar.e0[1].getMeasuredWidth()) {
                                yx[] yxVarArr2 = zxVar.e0;
                                yx yxVar4 = yxVarArr2[0];
                                yx yxVar5 = yxVarArr2[1];
                                yxVarArr2[0] = yxVar5;
                                yxVarArr2[1] = yxVar4;
                                zxVar.i3 = true;
                                zxVar.j3 = yxVar5.getTranslationX();
                                zxVar.z0.g(1.0f, zxVar.e0[0].h);
                                zxVar.z0.g((-zxVar.j3) / r11[0].getMeasuredWidth(), zxVar.e0[1].h);
                                zxVar.d5(true);
                                zxVar.e0[0].d.getClass();
                                zxVar.e0[1].d.getClass();
                            } else {
                                zxVar.j3 = zxVar.e0[0].getTranslationX();
                            }
                            zxVar.g3.removeAllListeners();
                            zxVar.g3.cancel();
                            zxVar.h3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            zxVar.j3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !zxVar.m3 && !zxVar.n3 && zxVar.z0.getVisibility() == 0) {
                            this.g0 = motionEvent.getPointerId(0);
                            zxVar.n3 = true;
                            this.h0 = (int) motionEvent.getX();
                            this.i0 = (int) motionEvent.getY();
                            this.j0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
                            int x11 = (int) ((motionEvent.getX() - this.h0) + zxVar.j3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.i0);
                            if (zxVar.m3 && (((z10 = zxVar.i3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    zxVar.n3 = true;
                                    zxVar.m3 = false;
                                    zxVar.e0[0].setTranslationX(0.0f);
                                    zxVar.e0[1].setTranslationX(zxVar.i3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    zxVar.z0.g(0.0f, zxVar.e0[1].h);
                                }
                            }
                            if (zxVar.n3 && !zxVar.m3) {
                                float a12 = org.telegram.messenger.i0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.h0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (zxVar.m3) {
                                zxVar.e0[0].setTranslationX(x11);
                                if (zxVar.i3) {
                                    zxVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    zxVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / zxVar.e0[0].getMeasuredWidth();
                                yx yxVar6 = zxVar.e0[1];
                                if (yxVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    zxVar.z0.i(zxVar.e0[1].h);
                                    org.telegram.messenger.i0.h3(new rx(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                zxVar.z0.g(abs2, yxVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.j0.computeCurrentVelocity(1000, zxVar.l3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.j0.getXVelocity();
                                f10 = this.j0.getYVelocity();
                                if (!zxVar.m3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    a0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (zxVar.m3) {
                                float x13 = zxVar.e0[0].getX();
                                zxVar.g3 = new AnimatorSet();
                                if (zxVar.e0[1].E) {
                                    zxVar.k3 = true;
                                } else if (zxVar.j3 == 0.0f) {
                                    zxVar.k3 = Math.abs(x13) < ((float) zxVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = zxVar.i3 ? false : false;
                                    zxVar.k3 = z11;
                                } else if (zxVar.i3) {
                                    zxVar.k3 = zxVar.e0[1].getX() > ((float) (zxVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    zxVar.k3 = zxVar.e0[0].getX() < ((float) (zxVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = zxVar.k3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (zxVar.i3) {
                                        zxVar.g3.playTogether(ObjectAnimator.ofFloat(zxVar.e0[0], (Property<yx, Float>) property, 0.0f), ObjectAnimator.ofFloat(zxVar.e0[1], (Property<yx, Float>) property, r13.getMeasuredWidth()));
                                    } else {
                                        zxVar.g3.playTogether(ObjectAnimator.ofFloat(zxVar.e0[0], (Property<yx, Float>) property, 0.0f), ObjectAnimator.ofFloat(zxVar.e0[1], (Property<yx, Float>) property, -r13.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = zxVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (zxVar.i3) {
                                        zxVar.g3.playTogether(ObjectAnimator.ofFloat(zxVar.e0[0], (Property<yx, Float>) property, -r12.getMeasuredWidth()), ObjectAnimator.ofFloat(zxVar.e0[1], (Property<yx, Float>) property, 0.0f));
                                    } else {
                                        zxVar.g3.playTogether(ObjectAnimator.ofFloat(zxVar.e0[0], (Property<yx, Float>) property, r12.getMeasuredWidth()), ObjectAnimator.ofFloat(zxVar.e0[1], (Property<yx, Float>) property, 0.0f));
                                    }
                                }
                                zxVar.g3.setInterpolator(zx.z4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                zxVar.g3.setDuration(Math.max(org.telegram.messenger.at.g2, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(I / r7) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                zxVar.g3.addListener(new org.telegram.ui.Components.voip.i2(this, 7));
                                zxVar.g3.start();
                                zxVar.h3 = true;
                                zxVar.m3 = false;
                            } else {
                                zxVar.n3 = false;
                                lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                                lVar.setEnabled(true);
                                zxVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.j0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.j0 = null;
                            }
                        }
                        return zxVar.m3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        zx zxVar = this.n0;
        if (zxVar.n3 && !zxVar.m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
