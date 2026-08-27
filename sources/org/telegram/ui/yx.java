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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yx extends org.telegram.ui.Components.zu0 {
    public final /* synthetic */ gy A0;
    public final Paint s0;
    public int t0;
    public int u0;
    public int v0;
    public VelocityTracker w0;
    public final Rect x0;
    public boolean y0;
    public final vd.b z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(Context context, gy gyVar) {
        super(context, null);
        this.A0 = gyVar;
        this.s0 = new Paint(1);
        this.x0 = new Rect();
        this.z0 = new vd.b(new g(this, 15));
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
    
        if (org.telegram.ui.ActionBar.g6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.zu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            gy gyVar = this.A0;
            if (gyVar.i4 != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider;
                if (ng.c.c(i10, c6Var)) {
                    c6Var2 = ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider;
                    if (c6Var2 != null) {
                        c6Var3 = ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    gyVar.i4.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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

    @Override // org.telegram.ui.Components.zu0
    public final void L(Canvas canvas, ArrayList arrayList) {
        px pxVar;
        org.telegram.ui.Components.zk0 p6;
        gy gyVar = this.A0;
        if (gyVar.l3 && (pxVar = gyVar.y0) != null && pxVar.getVisibility() == 0) {
            px pxVar2 = gyVar.y0;
            View[] viewArr = pxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p6 = org.telegram.ui.Components.p71.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p6.getChildCount(); i11++) {
                        View childAt = p6.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p6.getY() + viewArr[i10].getY() + pxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void M() {
        super.M();
        this.A0.m3();
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        gy gyVar = this.A0;
        if (!gyVar.c3) {
            return false;
        }
        if (!gyVar.f3) {
            if (Math.abs(gyVar.a0[1].getTranslationX()) < 1.0f) {
                gyVar.a0[0].setTranslationX(r1.getMeasuredWidth() * (gyVar.d3 ? -1 : 1));
                gyVar.a0[1].setTranslationX(0.0f);
                gy.f1(gyVar, true);
                animatorSet = gyVar.b3;
                if (animatorSet != null) {
                }
                gyVar.c3 = false;
            }
            return gyVar.c3;
        }
        if (Math.abs(gyVar.a0[0].getTranslationX()) < 1.0f) {
            gyVar.a0[0].setTranslationX(0.0f);
            gyVar.a0[1].setTranslationX(r1[0].getMeasuredWidth() * (gyVar.d3 ? 1 : -1));
            gy.f1(gyVar, true);
            animatorSet = gyVar.b3;
            if (animatorSet != null) {
                animatorSet.cancel();
                gyVar.b3 = null;
            }
            gyVar.c3 = false;
        }
        return gyVar.c3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        gy gyVar = this.A0;
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        float height = kVar.getHeight();
        bx bxVar = gyVar.B3;
        float f10 = (bxVar == null || !bxVar.c()) ? 0.0f : gyVar.B3.e;
        if (gyVar.G) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, gyVar.p3, (1.0f - f10) * (1.0f - gyVar.t1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, (1.0f - gyVar.t1) * (1.0f - gyVar.p3) * AndroidUtilities.dp(48.0f), height + gyVar.P);
    }

    public final int b0() {
        gy gyVar = this.A0;
        float f10 = gyVar.J;
        bx bxVar = gyVar.B3;
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, gyVar.t1, org.telegram.messenger.y1.z(1.0f, (bxVar == null || !bxVar.c()) ? 0.0f : gyVar.B3.e, 1.0f - gyVar.p3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        gy gyVar = this.A0;
        fw fwVar = gyVar.v0;
        int i10 = fwVar.f0.get(fwVar.G + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        gyVar.i3 = false;
        gyVar.h3 = true;
        this.u0 = (int) (motionEvent.getX() + gyVar.e3);
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        kVar.setEnabled(false);
        gyVar.v0.setEnabled(false);
        fy fyVar = gyVar.a0[1];
        fyVar.h = i10;
        fyVar.setVisibility(0);
        gyVar.d3 = z10;
        gy.f1(gyVar, false);
        gyVar.R4(true);
        if (z10) {
            gyVar.a0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        gyVar.a0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        Canvas canvas2;
        bx bxVar;
        vx vxVar;
        float f12;
        ag.s0 s0Var;
        float f13;
        vx vxVar2;
        org.telegram.ui.ActionBar.k kVar;
        bx bxVar2;
        gy gyVar = this.A0;
        Paint paint = gyVar.b1;
        if (Build.VERSION.SDK_INT >= 31 && gyVar.h4 != null) {
            gyVar.m3();
        }
        if (gyVar.M && (((bxVar2 = gyVar.B3) == null || !bxVar2.c()) && gyVar.p3 == 0.0f)) {
            gyVar.M = false;
            int i10 = (gyVar.Z3() && gyVar.a0[0].s == 0) ? 1 : 0;
            cy cyVar = gyVar.a0[0].a;
            if (gyVar.N) {
                if (!gyVar.X0) {
                    if (i10 == 0) {
                        gyVar.N = false;
                    }
                    if (gyVar.N) {
                        f2.o1 L = cyVar.L(0, false);
                        if (L == null) {
                            gyVar.N = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= cyVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                gyVar.N = false;
                            } else if (view.getTop() >= cyVar.getPaddingTop()) {
                                gyVar.N = false;
                            }
                        }
                        if (gyVar.N) {
                        }
                    }
                }
                i10 = 0;
            }
            f2.o1 L2 = cyVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = cyVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -gyVar.T3();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    gyVar.C4(f14);
                } else {
                    gyVar.C4(0.0f);
                }
            } else {
                gyVar.C4(-gyVar.T3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.n2) gyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        gyVar.B3.setCurrentTop(i11);
        boolean z12 = gyVar.n3;
        Rect rect = this.x0;
        Paint paint2 = this.s0;
        if (z12) {
            float f16 = gyVar.t1;
            if (f16 == 1.0f) {
                paint2.setColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            } else if (f16 == 0.0f && (vxVar2 = gyVar.T) != null) {
                vxVar2.setTranslationY(gyVar.W3() + gyVar.J);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(gyVar.t1 * 2.0f));
            float f17 = gyVar.t1;
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
            float f18 = gyVar.t1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (!gyVar.l3 && gyVar.m3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(gyVar.t1 * 2.0f));
                    J(canvas, 0.0f, this.x0, paint2, true);
                }
                vx vxVar3 = gyVar.T;
                if (vxVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                    int height = kVar.getHeight();
                    vxVar3.setTranslationY(gyVar.W3() + (i11 - (height + (gyVar.v0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            f11 = 81.0f;
            z11 = ((org.telegram.ui.ActionBar.n2) gyVar).inPreviewMode;
            if (!z11) {
                if (gyVar.p3 > 0.0f) {
                    paint2.setColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(gyVar.t1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.x0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(gyVar.t1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.x0, paint, true);
                }
                gyVar.s3 = 0.0f;
                gyVar.r3 = 0.0f;
                float min = gyVar.s3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!gyVar.G ? 81.0f : 0.0f)) + gyVar.J, gyVar.p3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!gyVar.G ? 81.0f : 0.0f)));
                gyVar.s3 = min;
                gyVar.r3 = min;
                bxVar = gyVar.B3;
                if (bxVar == null && bxVar.c()) {
                    float f19 = gyVar.B3.e;
                    float T3 = gyVar.s3 - ((gyVar.T3() + gyVar.J) * f19);
                    gyVar.s3 = T3;
                    gyVar.r3 = T3;
                    float clamp = gyVar.C0 ? f10 - Utilities.clamp(f19 / 0.5f, f10, 0.0f) : 1.0f;
                    fw fwVar = gyVar.v0;
                    if (fwVar != null && fwVar.getVisibility() == 0) {
                        gyVar.s3 -= (f10 - gyVar.r.e) * gyVar.v0.getMeasuredHeight();
                    }
                    vx vxVar4 = gyVar.T;
                    if (vxVar4 != null) {
                        vxVar4.setTranslationY(gyVar.W3() + AndroidUtilities.lerp(gyVar.J + gyVar.s3, -AndroidUtilities.dp(gyVar.G ? 81.0f : 0.0f), f19));
                    }
                    if (gyVar.y) {
                        boolean z13 = gyVar.A;
                        float f20 = z13 ? 0.0f : gyVar.J;
                        f13 = -AndroidUtilities.lerp((-f20) + AndroidUtilities.dp((z13 || !gyVar.w) ? 0.0f : 50.0f), f20, gyVar.B3.e);
                    } else {
                        f13 = 0.0f;
                    }
                    gyVar.a0[0].setTranslationY(f13 - (((gyVar.G ? AndroidUtilities.dp(f11) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * gyVar.B3.e));
                    f12 = clamp;
                } else {
                    vxVar = gyVar.T;
                    if (vxVar != null) {
                        vxVar.setTranslationY(AndroidUtilities.lerp(((gyVar.J + gyVar.s3) + gyVar.P) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((gyVar.G ? 81 : 0) + 48), gyVar.t1));
                    }
                    f12 = 1.0f;
                }
                gyVar.S4();
                gy.N2(gyVar, f12);
                super.dispatchDraw(canvas);
                gy.O2(gyVar, canvas2, i11);
                s0Var = gyVar.G0;
                if (s0Var != null && s0Var.getVisibility() == 0) {
                    if (gyVar.G0.getAlpha() != f10) {
                        gyVar.G0.draw(canvas2);
                    } else if (gyVar.G0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(gyVar.G0.getLeft(), gyVar.G0.getTop(), gyVar.G0.getRight(), gyVar.G0.getBottom(), (int) (gyVar.G0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(gyVar.G0.getLeft(), gyVar.G0.getTop());
                        gyVar.G0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!gyVar.S && gyVar.T2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6), gyVar.c4);
                }
                gyVar.R = true;
            }
        }
        canvas2 = canvas;
        gyVar.s3 = 0.0f;
        gyVar.r3 = 0.0f;
        float min2 = gyVar.s3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!gyVar.G ? 81.0f : 0.0f)) + gyVar.J, gyVar.p3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!gyVar.G ? 81.0f : 0.0f)));
        gyVar.s3 = min2;
        gyVar.r3 = min2;
        bxVar = gyVar.B3;
        if (bxVar == null) {
        }
        vxVar = gyVar.T;
        if (vxVar != null) {
        }
        f12 = 1.0f;
        gyVar.S4();
        gy.N2(gyVar, f12);
        super.dispatchDraw(canvas);
        gy.O2(gyVar, canvas2, i11);
        s0Var = gyVar.G0;
        if (s0Var != null) {
            if (gyVar.G0.getAlpha() != f10) {
            }
        }
        if (!gyVar.S) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6), gyVar.c4);
        }
        gyVar.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.z0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        gy gyVar = this.A0;
        if (view == gyVar.G0) {
            return true;
        }
        if (org.telegram.ui.Components.zu0.r0) {
            return super.drawChild(canvas, view, j10);
        }
        fy[] fyVarArr = gyVar.a0;
        if (view == fyVarArr[0] || ((fyVarArr.length > 1 && view == fyVarArr[1]) || view == gyVar.F1 || view == gyVar.v0)) {
            canvas.save();
            if (view != gyVar.F1 && view != gyVar.v0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = gyVar.T3;
            if (f10 != 1.0f) {
                if (gyVar.U3) {
                    canvas.translate((1.0f - gyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = org.telegram.ui.Cells.pa.b(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - gyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(b10, b10, 0.0f, (-getY()) + gyVar.J + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        if (view != kVar || gyVar.T3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (gyVar.U3) {
            canvas.translate((1.0f - gyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float b11 = org.telegram.ui.Cells.pa.b(1.0f, gyVar.T3, 0.05f, 1.0f);
            canvas.translate((1.0f - gyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            canvas.scale(b11, b11, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.i5 i5Var = this.A0.z3;
        if (i5Var != null) {
            i5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
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
        fw fwVar;
        int actionMasked = motionEvent.getActionMasked();
        gy gyVar = this.A0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            if (kVar.t()) {
                gyVar.U0 = true;
            }
        }
        return Z() || ((fwVar = gyVar.v0) != null && fwVar.K) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gy gyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        yw ywVar;
        yw ywVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        yx yxVar = this;
        int childCount = yxVar.getChildCount();
        int R = yxVar.R();
        yxVar.setBottomClip(0);
        int measuredWidth = yxVar.getMeasuredWidth();
        int measuredHeight = yxVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            gyVar = yxVar.A0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = yxVar.getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 112;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i14 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i19 = layoutParams.topMargin + yxVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != gyVar.T || childAt == gyVar.V || childAt == (ywVar2 = gyVar.A0)) {
                            kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != gyVar.T && childAt != gyVar.A0 && childAt != gyVar.V) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (gyVar.G && childAt == gyVar.T) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            ywVar = gyVar.A0;
                            if (childAt == ywVar && ywVar.getPremiumHint() != null) {
                                gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == gyVar.T) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == gyVar.y0) {
                            i19 = -AndroidUtilities.dp(gyVar.a);
                        } else if (childAt instanceof tu) {
                            kVar3 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof fy) {
                            i19 = 0;
                        } else if (childAt == gyVar.F1 || childAt == gyVar.G1 || childAt == gyVar.v0) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (ywVar2 != null && ywVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != gyVar.T) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != gyVar.T) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (gyVar.G) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    ywVar = gyVar.A0;
                    if (childAt == ywVar) {
                        gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == gyVar.T) {
                    }
                    childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                } else {
                    i14 = measuredWidth - measuredWidth2;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != gyVar.T) {
                }
                kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != gyVar.T) {
                }
                if (gyVar.G) {
                }
                ywVar = gyVar.A0;
                if (childAt == ywVar) {
                }
                if (childAt == gyVar.T) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            yxVar = this;
        }
        px pxVar = gyVar.y0;
        if (pxVar != null) {
            pxVar.setKeyboardHeight(R);
        }
        S();
        gyVar.X4();
        gyVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        gy gyVar = this.A0;
        int i12 = gyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.v0 v0Var = gyVar.i0;
        if (v0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof tu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof fy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (gyVar.B3.c()) {
                            if (gyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (gyVar.G) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + gyVar.L;
                        if (gyVar.q3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = gyVar.V3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        px pxVar = gyVar.y0;
                        if (childAt == pxVar) {
                            pxVar.setTranslationY(gyVar.E0);
                            gyVar.y0.l0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            gyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            rw rwVar = gyVar.x1;
                            if (rwVar == null || !rwVar.u0(childAt)) {
                                if (childAt == gyVar.B3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = gyVar.V3 ? (int) (size4 * 0.05f) : 0;
                                    gyVar.B3.setTransitionPaddingBottom(i16);
                                    childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size4 + i16), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i10, 0, i11, 0);
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
            post(new xx(this, 1));
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
        fw fwVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        qg.g gVar;
        gy gyVar = this.A0;
        b5Var = ((org.telegram.ui.ActionBar.n2) gyVar).parentLayout;
        Object[] objArr = 0;
        if (b5Var != null && (fwVar = gyVar.v0) != null && !fwVar.n && !gyVar.f2 && !gyVar.B3.c()) {
            b5Var2 = ((org.telegram.ui.ActionBar.n2) gyVar).parentLayout;
            if (!((ActionBarLayout) b5Var2).j()) {
                b5Var3 = ((org.telegram.ui.ActionBar.n2) gyVar).parentLayout;
                if (!((ActionBarLayout) b5Var3).y()) {
                    b5Var4 = ((org.telegram.ui.ActionBar.n2) gyVar).parentLayout;
                    if (!((ActionBarLayout) b5Var4).n && (motionEvent == null || gyVar.h3 || (motionEvent.getY() > a0() + b0() && ((gVar = gyVar.u1) == null || gVar.getVisibility() != 0 || motionEvent.getY() < gyVar.u1.getY())))) {
                        if (gyVar.N0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    fy fyVar = gyVar.a0[0];
                                    if (fyVar != null) {
                                        int i12 = fyVar.d.h;
                                        if (i12 != 7) {
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
                            gyVar.h3 = true;
                            this.t0 = motionEvent.getPointerId(0);
                            int x8 = (int) motionEvent.getX();
                            this.u0 = x8;
                            if (gyVar.d3) {
                                if (x8 < gyVar.a0[0].getTranslationX() + gyVar.a0[0].getMeasuredWidth()) {
                                    gyVar.e3 = gyVar.a0[0].getTranslationX();
                                } else {
                                    fy[] fyVarArr = gyVar.a0;
                                    fy fyVar2 = fyVarArr[0];
                                    fy fyVar3 = fyVarArr[1];
                                    fyVarArr[0] = fyVar3;
                                    fyVarArr[1] = fyVar2;
                                    gyVar.d3 = false;
                                    gyVar.e3 = fyVar3.getTranslationX();
                                    gyVar.v0.g(1.0f, gyVar.a0[0].h);
                                    gyVar.v0.g(gyVar.e3 / r10[0].getMeasuredWidth(), gyVar.a0[1].h);
                                    gyVar.R4(true);
                                    gyVar.a0[0].d.getClass();
                                    gyVar.a0[1].d.getClass();
                                }
                            } else if (x8 < gyVar.a0[1].getTranslationX() + gyVar.a0[1].getMeasuredWidth()) {
                                fy[] fyVarArr2 = gyVar.a0;
                                fy fyVar4 = fyVarArr2[0];
                                fy fyVar5 = fyVarArr2[1];
                                fyVarArr2[0] = fyVar5;
                                fyVarArr2[1] = fyVar4;
                                gyVar.d3 = true;
                                gyVar.e3 = fyVar5.getTranslationX();
                                gyVar.v0.g(1.0f, gyVar.a0[0].h);
                                gyVar.v0.g((-gyVar.e3) / r10[0].getMeasuredWidth(), gyVar.a0[1].h);
                                gyVar.R4(true);
                                gyVar.a0[0].d.getClass();
                                gyVar.a0[1].d.getClass();
                            } else {
                                gyVar.e3 = gyVar.a0[0].getTranslationX();
                            }
                            gyVar.b3.removeAllListeners();
                            gyVar.b3.cancel();
                            gyVar.c3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            gyVar.e3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !gyVar.h3 && !gyVar.i3 && gyVar.v0.getVisibility() == 0) {
                            this.t0 = motionEvent.getPointerId(0);
                            gyVar.i3 = true;
                            this.u0 = (int) motionEvent.getX();
                            this.v0 = (int) motionEvent.getY();
                            this.w0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.t0) {
                            int x10 = (int) ((motionEvent.getX() - this.u0) + gyVar.e3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.v0);
                            if (gyVar.h3 && (((z10 = gyVar.d3) && x10 > 0) || (!z10 && x10 < 0))) {
                                if (!c0(motionEvent, x10 < 0)) {
                                    gyVar.i3 = true;
                                    gyVar.h3 = false;
                                    gyVar.a0[0].setTranslationX(0.0f);
                                    gyVar.a0[1].setTranslationX(gyVar.d3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    gyVar.v0.g(0.0f, gyVar.a0[1].h);
                                }
                            }
                            if (gyVar.i3 && !gyVar.h3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x11 = (int) (motionEvent.getX() - this.u0);
                                if (Math.abs(x11) >= pixelsInCM && Math.abs(x11) > abs) {
                                    c0(motionEvent, x10 < 0);
                                }
                            } else if (gyVar.h3) {
                                gyVar.a0[0].setTranslationX(x10);
                                if (gyVar.d3) {
                                    gyVar.a0[1].setTranslationX(r1[0].getMeasuredWidth() + x10);
                                } else {
                                    gyVar.a0[1].setTranslationX(x10 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x10) / gyVar.a0[0].getMeasuredWidth();
                                fy fyVar6 = gyVar.a0[1];
                                if (fyVar6.A && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    gyVar.v0.i(gyVar.a0[1].h);
                                    AndroidUtilities.runOnUIThread(new xx(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                gyVar.v0.g(abs2, fyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.w0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, gyVar.g3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.w0.getXVelocity();
                                f11 = this.w0.getYVelocity();
                                if (!gyVar.h3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    c0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (gyVar.h3) {
                                float x12 = gyVar.a0[0].getX();
                                gyVar.b3 = new AnimatorSet();
                                if (gyVar.a0[1].A) {
                                    gyVar.f3 = true;
                                } else if (gyVar.e3 == 0.0f) {
                                    gyVar.f3 = Math.abs(x12) < ((float) gyVar.a0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z11 = gyVar.d3 ? false : false;
                                    gyVar.f3 = z11;
                                } else if (gyVar.d3) {
                                    gyVar.f3 = gyVar.a0[1].getX() > ((float) (gyVar.a0[0].getMeasuredWidth() >> 1));
                                } else {
                                    gyVar.f3 = gyVar.a0[0].getX() < ((float) (gyVar.a0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = gyVar.f3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x12);
                                    if (gyVar.d3) {
                                        gyVar.b3.playTogether(ObjectAnimator.ofFloat(gyVar.a0[0], (Property<fy, Float>) property, 0.0f), ObjectAnimator.ofFloat(gyVar.a0[1], (Property<fy, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        gyVar.b3.playTogether(ObjectAnimator.ofFloat(gyVar.a0[0], (Property<fy, Float>) property, 0.0f), ObjectAnimator.ofFloat(gyVar.a0[1], (Property<fy, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = gyVar.a0[0].getMeasuredWidth() - Math.abs(x12);
                                    if (gyVar.d3) {
                                        gyVar.b3.playTogether(ObjectAnimator.ofFloat(gyVar.a0[0], (Property<fy, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(gyVar.a0[1], (Property<fy, Float>) property, 0.0f));
                                    } else {
                                        gyVar.b3.playTogether(ObjectAnimator.ofFloat(gyVar.a0[0], (Property<fy, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(gyVar.a0[1], (Property<fy, Float>) property, 0.0f));
                                    }
                                }
                                gyVar.b3.setInterpolator(gy.v4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                gyVar.b3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                gyVar.b3.addListener(new org.telegram.ui.Components.f11(this, 26));
                                gyVar.b3.start();
                                gyVar.c3 = true;
                                gyVar.h3 = false;
                            } else {
                                gyVar.i3 = false;
                                kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                                kVar.setEnabled(true);
                                gyVar.v0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.w0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.w0 = null;
                            }
                        }
                        return gyVar.h3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        gy gyVar = this.A0;
        if (gyVar.i3 && !gyVar.h3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
