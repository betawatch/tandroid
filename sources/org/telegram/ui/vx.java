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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vx extends org.telegram.ui.Components.xu0 {
    public final /* synthetic */ dy A0;
    public final Paint s0;
    public int t0;
    public int u0;
    public int v0;
    public VelocityTracker w0;
    public final Rect x0;
    public boolean y0;
    public final ud.b z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(Context context, dy dyVar) {
        super(context, null);
        this.A0 = dyVar;
        this.s0 = new Paint(1);
        this.x0 = new Rect();
        this.z0 = new ud.b(new g(this, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = 178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = 216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.f6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.xu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            dy dyVar = this.A0;
            if (dyVar.i4 != null) {
                i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                b6Var = ((org.telegram.ui.ActionBar.o2) dyVar).resourceProvider;
                if (mg.c.c(i9, b6Var)) {
                    b6Var2 = ((org.telegram.ui.ActionBar.o2) dyVar).resourceProvider;
                    if (b6Var2 != null) {
                        b6Var3 = ((org.telegram.ui.ActionBar.o2) dyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    dyVar.i4.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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

    @Override // org.telegram.ui.Components.xu0
    public final void L(Canvas canvas, ArrayList arrayList) {
        mx mxVar;
        org.telegram.ui.Components.wk0 p6;
        dy dyVar = this.A0;
        if (dyVar.l3 && (mxVar = dyVar.y0) != null && mxVar.getVisibility() == 0) {
            mx mxVar2 = dyVar.y0;
            View[] viewArr = mxVar2.e;
            for (int i9 = 0; i9 < viewArr.length; i9++) {
                View view = viewArr[i9];
                if (view != null && view.getVisibility() == 0 && (p6 = org.telegram.ui.Components.n71.p(viewArr[i9])) != null) {
                    for (int i10 = 0; i10 < p6.getChildCount(); i10++) {
                        View childAt = p6.getChildAt(i10);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i9].getX(), childAt.getY() + p6.getY() + viewArr[i9].getY() + mxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public final void M() {
        super.M();
        this.A0.m3();
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        dy dyVar = this.A0;
        if (!dyVar.c3) {
            return false;
        }
        if (!dyVar.f3) {
            if (Math.abs(dyVar.a0[1].getTranslationX()) < 1.0f) {
                dyVar.a0[0].setTranslationX(r1.getMeasuredWidth() * (dyVar.d3 ? -1 : 1));
                dyVar.a0[1].setTranslationX(0.0f);
                dy.f1(dyVar, true);
                animatorSet = dyVar.b3;
                if (animatorSet != null) {
                }
                dyVar.c3 = false;
            }
            return dyVar.c3;
        }
        if (Math.abs(dyVar.a0[0].getTranslationX()) < 1.0f) {
            dyVar.a0[0].setTranslationX(0.0f);
            dyVar.a0[1].setTranslationX(r1[0].getMeasuredWidth() * (dyVar.d3 ? 1 : -1));
            dy.f1(dyVar, true);
            animatorSet = dyVar.b3;
            if (animatorSet != null) {
                animatorSet.cancel();
                dyVar.b3 = null;
            }
            dyVar.c3 = false;
        }
        return dyVar.c3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        dy dyVar = this.A0;
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        float height = kVar.getHeight();
        yw ywVar = dyVar.B3;
        float f10 = (ywVar == null || !ywVar.c()) ? 0.0f : dyVar.B3.e;
        if (dyVar.G) {
            height = e2.c.z(1.0f, dyVar.p3, (1.0f - f10) * (1.0f - dyVar.t1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) e2.c.z(1.0f, f10, (1.0f - dyVar.t1) * (1.0f - dyVar.p3) * AndroidUtilities.dp(48.0f), height + dyVar.P);
    }

    public final int b0() {
        dy dyVar = this.A0;
        float f10 = dyVar.J;
        yw ywVar = dyVar.B3;
        return (int) e2.c.z(1.0f, dyVar.t1, org.telegram.messenger.l0.y(1.0f, (ywVar == null || !ywVar.c()) ? 0.0f : dyVar.B3.e, 1.0f - dyVar.p3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        dy dyVar = this.A0;
        cw cwVar = dyVar.v0;
        int i9 = cwVar.f0.get(cwVar.G + (z10 ? 1 : -1), -1);
        if (i9 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        dyVar.i3 = false;
        dyVar.h3 = true;
        this.u0 = (int) (motionEvent.getX() + dyVar.e3);
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        kVar.setEnabled(false);
        dyVar.v0.setEnabled(false);
        cy cyVar = dyVar.a0[1];
        cyVar.h = i9;
        cyVar.setVisibility(0);
        dyVar.d3 = z10;
        dy.f1(dyVar, false);
        dyVar.R4(true);
        if (z10) {
            dyVar.a0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        dyVar.a0[1].setTranslationX(-r7[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r1 == 1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0210  */
    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        Canvas canvas2;
        yw ywVar;
        sx sxVar;
        float f12;
        fh.l2 l2Var;
        float f13;
        sx sxVar2;
        org.telegram.ui.ActionBar.k kVar;
        yw ywVar2;
        dy dyVar = this.A0;
        Paint paint = dyVar.b1;
        if (Build.VERSION.SDK_INT >= 31 && dyVar.h4 != null) {
            dyVar.m3();
        }
        if (dyVar.M && (((ywVar2 = dyVar.B3) == null || !ywVar2.c()) && dyVar.p3 == 0.0f)) {
            dyVar.M = false;
            int i9 = (dyVar.Z3() && dyVar.a0[0].s == 0) ? 1 : 0;
            yx yxVar = dyVar.a0[0].a;
            if (dyVar.N) {
                if (!dyVar.X0) {
                    if (i9 == 0) {
                        dyVar.N = false;
                    }
                    if (dyVar.N) {
                        f2.q1 L = yxVar.L(0, false);
                        if (L == null) {
                            dyVar.N = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= yxVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                dyVar.N = false;
                            } else if (view.getTop() >= yxVar.getPaddingTop()) {
                                dyVar.N = false;
                            }
                        }
                        if (dyVar.N) {
                        }
                    }
                }
                i9 = 0;
            }
            f2.q1 L2 = yxVar.L(i9, false);
            if (L2 != null) {
                float paddingTop = yxVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -dyVar.T3();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    dyVar.C4(f14);
                } else {
                    dyVar.C4(0.0f);
                }
            } else {
                dyVar.C4(-dyVar.T3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.o2) dyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i10 = b02 + a02;
        dyVar.B3.setCurrentTop(i10);
        boolean z12 = dyVar.n3;
        Rect rect = this.x0;
        Paint paint2 = this.s0;
        if (z12) {
            float f16 = dyVar.t1;
            if (f16 == 1.0f) {
                paint2.setColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            } else if (f16 == 0.0f && (sxVar2 = dyVar.T) != null) {
                sxVar2.setTranslationY(dyVar.W3() + dyVar.J);
            }
            rect.set(0, b02, getMeasuredWidth(), i10 - AndroidUtilities.dp(dyVar.t1 * 2.0f));
            float f17 = dyVar.t1;
            if (f17 < 0.0f) {
                if (f17 == 1.0f) {
                    paint = paint2;
                }
                f10 = 1.0f;
                f11 = 81.0f;
                J(canvas, 0.0f, this.x0, paint, true);
            } else {
                f10 = 1.0f;
                f11 = 81.0f;
            }
            float f18 = dyVar.t1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                if (!dyVar.l3 && dyVar.m3) {
                    rect.set(0, b02, getMeasuredWidth(), i10 - AndroidUtilities.dp(dyVar.t1 * 2.0f));
                    J(canvas, 0.0f, this.x0, paint2, true);
                }
                sx sxVar3 = dyVar.T;
                if (sxVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                    int height = kVar.getHeight();
                    sxVar3.setTranslationY(dyVar.W3() + (i10 - (height + (dyVar.v0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            f11 = 81.0f;
            z11 = ((org.telegram.ui.ActionBar.o2) dyVar).inPreviewMode;
            if (!z11) {
                if (dyVar.p3 > 0.0f) {
                    paint2.setColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i10 - AndroidUtilities.dp(dyVar.t1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.x0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i10 - AndroidUtilities.dp(dyVar.t1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.x0, paint, true);
                }
                dyVar.s3 = 0.0f;
                dyVar.r3 = 0.0f;
                float min = dyVar.s3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!dyVar.G ? 81.0f : 0.0f)) + dyVar.J, dyVar.p3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!dyVar.G ? 81.0f : 0.0f)));
                dyVar.s3 = min;
                dyVar.r3 = min;
                ywVar = dyVar.B3;
                if (ywVar == null && ywVar.c()) {
                    float f19 = dyVar.B3.e;
                    float T3 = dyVar.s3 - ((dyVar.T3() + dyVar.J) * f19);
                    dyVar.s3 = T3;
                    dyVar.r3 = T3;
                    float clamp = dyVar.C0 ? f10 - Utilities.clamp(f19 / 0.5f, f10, 0.0f) : 1.0f;
                    cw cwVar = dyVar.v0;
                    if (cwVar != null && cwVar.getVisibility() == 0) {
                        dyVar.s3 -= (f10 - dyVar.r.e) * dyVar.v0.getMeasuredHeight();
                    }
                    sx sxVar4 = dyVar.T;
                    if (sxVar4 != null) {
                        sxVar4.setTranslationY(dyVar.W3() + AndroidUtilities.lerp(dyVar.J + dyVar.s3, -AndroidUtilities.dp(dyVar.G ? 81.0f : 0.0f), f19));
                    }
                    if (dyVar.y) {
                        boolean z13 = dyVar.A;
                        float f20 = z13 ? 0.0f : dyVar.J;
                        f13 = -AndroidUtilities.lerp((-f20) + AndroidUtilities.dp((z13 || !dyVar.w) ? 0.0f : 50.0f), f20, dyVar.B3.e);
                    } else {
                        f13 = 0.0f;
                    }
                    dyVar.a0[0].setTranslationY(f13 - (((dyVar.G ? AndroidUtilities.dp(f11) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * dyVar.B3.e));
                    f12 = clamp;
                } else {
                    sxVar = dyVar.T;
                    if (sxVar != null) {
                        sxVar.setTranslationY(AndroidUtilities.lerp(((dyVar.J + dyVar.s3) + dyVar.P) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((dyVar.G ? 81 : 0) + 48), dyVar.t1));
                    }
                    f12 = 1.0f;
                }
                dyVar.S4();
                dy.N2(dyVar, f12);
                super.dispatchDraw(canvas);
                dy.O2(dyVar, canvas2, i10);
                l2Var = dyVar.G0;
                if (l2Var != null && l2Var.getVisibility() == 0) {
                    if (dyVar.G0.getAlpha() != f10) {
                        dyVar.G0.draw(canvas2);
                    } else if (dyVar.G0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(dyVar.G0.getLeft(), dyVar.G0.getTop(), dyVar.G0.getRight(), dyVar.G0.getBottom(), (int) (dyVar.G0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(dyVar.G0.getLeft(), dyVar.G0.getTop());
                        dyVar.G0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!dyVar.S && dyVar.T2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6), dyVar.c4);
                }
                dyVar.R = true;
            }
        }
        canvas2 = canvas;
        dyVar.s3 = 0.0f;
        dyVar.r3 = 0.0f;
        float min2 = dyVar.s3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!dyVar.G ? 81.0f : 0.0f)) + dyVar.J, dyVar.p3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!dyVar.G ? 81.0f : 0.0f)));
        dyVar.s3 = min2;
        dyVar.r3 = min2;
        ywVar = dyVar.B3;
        if (ywVar == null) {
        }
        sxVar = dyVar.T;
        if (sxVar != null) {
        }
        f12 = 1.0f;
        dyVar.S4();
        dy.N2(dyVar, f12);
        super.dispatchDraw(canvas);
        dy.O2(dyVar, canvas2, i10);
        l2Var = dyVar.G0;
        if (l2Var != null) {
            if (dyVar.G0.getAlpha() != f10) {
            }
        }
        if (!dyVar.S) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6), dyVar.c4);
        }
        dyVar.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.z0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        dy dyVar = this.A0;
        if (view == dyVar.G0) {
            return true;
        }
        if (org.telegram.ui.Components.xu0.r0) {
            return super.drawChild(canvas, view, j10);
        }
        cy[] cyVarArr = dyVar.a0;
        if (view == cyVarArr[0] || ((cyVarArr.length > 1 && view == cyVarArr[1]) || view == dyVar.F1 || view == dyVar.v0)) {
            canvas.save();
            if (view != dyVar.F1 && view != dyVar.v0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = dyVar.T3;
            if (f10 != 1.0f) {
                if (dyVar.U3) {
                    canvas.translate((1.0f - dyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float C = j3.r0.C(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - dyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(C, C, 0.0f, (-getY()) + dyVar.J + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (view != kVar || dyVar.T3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (dyVar.U3) {
            canvas.translate((1.0f - dyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float C2 = j3.r0.C(1.0f, dyVar.T3, 0.05f, 1.0f);
            canvas.translate((1.0f - dyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            canvas.scale(C2, C2, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.i5 i5Var = this.A0.z3;
        if (i5Var != null) {
            i5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.i5 i5Var = this.A0.z3;
        if (i5Var != null) {
            i5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        cw cwVar;
        int actionMasked = motionEvent.getActionMasked();
        dy dyVar = this.A0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (kVar.s()) {
                dyVar.U0 = true;
            }
        }
        return Z() || ((cwVar = dyVar.v0) != null && cwVar.K) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        dy dyVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        vw vwVar;
        vw vwVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        vx vxVar = this;
        int childCount = vxVar.getChildCount();
        int R = vxVar.R();
        vxVar.setBottomClip(0);
        int measuredWidth = vxVar.getMeasuredWidth();
        int measuredHeight = vxVar.getMeasuredHeight();
        int i19 = 0;
        while (true) {
            dyVar = vxVar.A0;
            if (i19 >= childCount) {
                break;
            }
            View childAt = vxVar.getChildAt(i19);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 112;
                int i22 = i20 & 7;
                if (i22 == 1) {
                    i13 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i21 == 16) {
                        if (i21 == 48) {
                            i18 = layoutParams.topMargin + vxVar.getPaddingTop();
                        } else if (i21 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = measuredHeight - measuredHeight2;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != dyVar.T || childAt == dyVar.V || childAt == (vwVar2 = dyVar.A0)) {
                            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                            i18 = kVar.getMeasuredHeight();
                            if (childAt != dyVar.T && childAt != dyVar.A0 && childAt != dyVar.V) {
                                i18 += AndroidUtilities.dp(48.0f);
                            }
                            if (dyVar.G && childAt == dyVar.T) {
                                i18 = AndroidUtilities.dp(81.0f) + i18;
                            }
                            vwVar = dyVar.A0;
                            if (childAt == vwVar && vwVar.getPremiumHint() != null) {
                                dyVar.A0.getPremiumHint().layout(i15, org.telegram.messenger.ll.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, dyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.ll.D(54.0f, i18, measuredHeight2));
                            }
                            if (childAt == dyVar.T) {
                                i18 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == dyVar.y0) {
                            i18 = -AndroidUtilities.dp(dyVar.a);
                        } else if (childAt instanceof qu) {
                            kVar3 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                            i18 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof cy) {
                            i18 = 0;
                        } else if (childAt == dyVar.F1 || childAt == dyVar.G1 || childAt == dyVar.v0) {
                            kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                            i18 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i18;
                        } else if (vwVar2 != null && vwVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != dyVar.T) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                    i18 = kVar.getMeasuredHeight();
                    if (childAt != dyVar.T) {
                        i18 += AndroidUtilities.dp(48.0f);
                    }
                    if (dyVar.G) {
                        i18 = AndroidUtilities.dp(81.0f) + i18;
                    }
                    vwVar = dyVar.A0;
                    if (childAt == vwVar) {
                        dyVar.A0.getPremiumHint().layout(i15, org.telegram.messenger.ll.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, dyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.ll.D(54.0f, i18, measuredHeight2));
                    }
                    if (childAt == dyVar.T) {
                    }
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                } else {
                    i13 = measuredWidth - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != dyVar.T) {
                }
                kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                i18 = kVar.getMeasuredHeight();
                if (childAt != dyVar.T) {
                }
                if (dyVar.G) {
                }
                vwVar = dyVar.A0;
                if (childAt == vwVar) {
                }
                if (childAt == dyVar.T) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
            i19++;
            vxVar = this;
        }
        mx mxVar = dyVar.y0;
        if (mxVar != null) {
            mxVar.setKeyboardHeight(R);
        }
        S();
        dyVar.X4();
        dyVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        dy dyVar = this.A0;
        int i11 = dyVar.a;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = dyVar.i0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        measureChildWithMargins(kVar, i9, 0, i10, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof qu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof cy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (dyVar.B3.c()) {
                            if (dyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (dyVar.G) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i13 = dp3 + dyVar.L;
                        if (dyVar.q3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i14 = dyVar.V3 ? (int) (i13 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i14);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i13 + i14), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        mx mxVar = dyVar.y0;
                        if (childAt == mxVar) {
                            mxVar.setTranslationY(dyVar.E0);
                            dyVar.y0.l0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i11) + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                            dyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i11) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ow owVar = dyVar.x1;
                            if (owVar == null || !owVar.t0(childAt)) {
                                if (childAt == dyVar.B3) {
                                    int size4 = View.MeasureSpec.getSize(i10);
                                    int i15 = dyVar.V3 ? (int) (size4 * 0.05f) : 0;
                                    dyVar.B3.setTransitionPaddingBottom(i15);
                                    childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size4 + i15), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i9, 0, i10, 0);
                                }
                            } else if (!AndroidUtilities.isInMultiwindow) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.y0) {
            post(new ux(this, 1));
            this.y0 = z10;
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
        org.telegram.ui.ActionBar.b5 b5Var;
        cw cwVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i9;
        int i10;
        pg.f fVar;
        dy dyVar = this.A0;
        b5Var = ((org.telegram.ui.ActionBar.o2) dyVar).parentLayout;
        Object[] objArr = 0;
        if (b5Var != null && (cwVar = dyVar.v0) != null && !cwVar.n && !dyVar.f2 && !dyVar.B3.c()) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) dyVar).parentLayout;
            if (!((ActionBarLayout) b5Var2).j()) {
                b5Var3 = ((org.telegram.ui.ActionBar.o2) dyVar).parentLayout;
                if (!((ActionBarLayout) b5Var3).y()) {
                    b5Var4 = ((org.telegram.ui.ActionBar.o2) dyVar).parentLayout;
                    if (!((ActionBarLayout) b5Var4).n && (motionEvent == null || dyVar.h3 || (motionEvent.getY() > a0() + b0() && ((fVar = dyVar.u1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < dyVar.u1.getY())))) {
                        if (dyVar.N0 != 3) {
                            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i9) != 5) {
                                i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i10) == 2) {
                                    cy cyVar = dyVar.a0[0];
                                    if (cyVar != null) {
                                        int i11 = cyVar.d.h;
                                        if (i11 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            if (this.w0 == null) {
                                this.w0 = VelocityTracker.obtain();
                            }
                            this.w0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && Z()) {
                            dyVar.h3 = true;
                            this.t0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.u0 = x10;
                            if (dyVar.d3) {
                                if (x10 < dyVar.a0[0].getTranslationX() + dyVar.a0[0].getMeasuredWidth()) {
                                    dyVar.e3 = dyVar.a0[0].getTranslationX();
                                } else {
                                    cy[] cyVarArr = dyVar.a0;
                                    cy cyVar2 = cyVarArr[0];
                                    cy cyVar3 = cyVarArr[1];
                                    cyVarArr[0] = cyVar3;
                                    cyVarArr[1] = cyVar2;
                                    dyVar.d3 = false;
                                    dyVar.e3 = cyVar3.getTranslationX();
                                    dyVar.v0.g(1.0f, dyVar.a0[0].h);
                                    dyVar.v0.g(dyVar.e3 / r10[0].getMeasuredWidth(), dyVar.a0[1].h);
                                    dyVar.R4(true);
                                    dyVar.a0[0].d.getClass();
                                    dyVar.a0[1].d.getClass();
                                }
                            } else if (x10 < dyVar.a0[1].getTranslationX() + dyVar.a0[1].getMeasuredWidth()) {
                                cy[] cyVarArr2 = dyVar.a0;
                                cy cyVar4 = cyVarArr2[0];
                                cy cyVar5 = cyVarArr2[1];
                                cyVarArr2[0] = cyVar5;
                                cyVarArr2[1] = cyVar4;
                                dyVar.d3 = true;
                                dyVar.e3 = cyVar5.getTranslationX();
                                dyVar.v0.g(1.0f, dyVar.a0[0].h);
                                dyVar.v0.g((-dyVar.e3) / r10[0].getMeasuredWidth(), dyVar.a0[1].h);
                                dyVar.R4(true);
                                dyVar.a0[0].d.getClass();
                                dyVar.a0[1].d.getClass();
                            } else {
                                dyVar.e3 = dyVar.a0[0].getTranslationX();
                            }
                            dyVar.b3.removeAllListeners();
                            dyVar.b3.cancel();
                            dyVar.c3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            dyVar.e3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !dyVar.h3 && !dyVar.i3 && dyVar.v0.getVisibility() == 0) {
                            this.t0 = motionEvent.getPointerId(0);
                            dyVar.i3 = true;
                            this.u0 = (int) motionEvent.getX();
                            this.v0 = (int) motionEvent.getY();
                            this.w0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.t0) {
                            int x11 = (int) ((motionEvent.getX() - this.u0) + dyVar.e3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.v0);
                            if (dyVar.h3 && (((z10 = dyVar.d3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    dyVar.i3 = true;
                                    dyVar.h3 = false;
                                    dyVar.a0[0].setTranslationX(0.0f);
                                    dyVar.a0[1].setTranslationX(dyVar.d3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    dyVar.v0.g(0.0f, dyVar.a0[1].h);
                                }
                            }
                            if (dyVar.i3 && !dyVar.h3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.u0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (dyVar.h3) {
                                dyVar.a0[0].setTranslationX(x11);
                                if (dyVar.d3) {
                                    dyVar.a0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    dyVar.a0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / dyVar.a0[0].getMeasuredWidth();
                                cy cyVar6 = dyVar.a0[1];
                                if (cyVar6.A && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    dyVar.v0.i(dyVar.a0[1].h);
                                    AndroidUtilities.runOnUIThread(new ux(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                dyVar.v0.g(abs2, cyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.w0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, dyVar.g3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.w0.getXVelocity();
                                f11 = this.w0.getYVelocity();
                                if (!dyVar.h3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    c0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (dyVar.h3) {
                                float x13 = dyVar.a0[0].getX();
                                dyVar.b3 = new AnimatorSet();
                                if (dyVar.a0[1].A) {
                                    dyVar.f3 = true;
                                } else if (dyVar.e3 == 0.0f) {
                                    dyVar.f3 = Math.abs(x13) < ((float) dyVar.a0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z11 = dyVar.d3 ? false : false;
                                    dyVar.f3 = z11;
                                } else if (dyVar.d3) {
                                    dyVar.f3 = dyVar.a0[1].getX() > ((float) (dyVar.a0[0].getMeasuredWidth() >> 1));
                                } else {
                                    dyVar.f3 = dyVar.a0[0].getX() < ((float) (dyVar.a0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = dyVar.f3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (dyVar.d3) {
                                        dyVar.b3.playTogether(ObjectAnimator.ofFloat(dyVar.a0[0], (Property<cy, Float>) property, 0.0f), ObjectAnimator.ofFloat(dyVar.a0[1], (Property<cy, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        dyVar.b3.playTogether(ObjectAnimator.ofFloat(dyVar.a0[0], (Property<cy, Float>) property, 0.0f), ObjectAnimator.ofFloat(dyVar.a0[1], (Property<cy, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = dyVar.a0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (dyVar.d3) {
                                        dyVar.b3.playTogether(ObjectAnimator.ofFloat(dyVar.a0[0], (Property<cy, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(dyVar.a0[1], (Property<cy, Float>) property, 0.0f));
                                    } else {
                                        dyVar.b3.playTogether(ObjectAnimator.ofFloat(dyVar.a0[0], (Property<cy, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(dyVar.a0[1], (Property<cy, Float>) property, 0.0f));
                                    }
                                }
                                dyVar.b3.setInterpolator(dy.v4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                dyVar.b3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                dyVar.b3.addListener(new org.telegram.ui.Components.y11(this, 24));
                                dyVar.b3.start();
                                dyVar.c3 = true;
                                dyVar.h3 = false;
                            } else {
                                dyVar.i3 = false;
                                kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                                kVar.setEnabled(true);
                                dyVar.v0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.w0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.w0 = null;
                            }
                        }
                        return dyVar.h3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        dy dyVar = this.A0;
        if (dyVar.i3 && !dyVar.h3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
