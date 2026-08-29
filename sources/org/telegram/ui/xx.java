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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xx extends org.telegram.ui.Components.hv0 {
    public final /* synthetic */ fy A0;
    public final Paint s0;
    public int t0;
    public int u0;
    public int v0;
    public VelocityTracker w0;
    public final Rect x0;
    public boolean y0;
    public final wd.b z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(Context context, fy fyVar) {
        super(context, null);
        this.A0 = fyVar;
        this.s0 = new Paint(1);
        this.x0 = new Rect();
        this.z0 = new wd.b(new h(this, 15));
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
    @Override // org.telegram.ui.Components.hv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            fy fyVar = this.A0;
            if (fyVar.i4 != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.o2) fyVar).resourceProvider;
                if (pg.a.c(i10, c6Var)) {
                    c6Var2 = ((org.telegram.ui.ActionBar.o2) fyVar).resourceProvider;
                    if (c6Var2 != null) {
                        c6Var3 = ((org.telegram.ui.ActionBar.o2) fyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f9);
                    fyVar.i4.E0(canvas, rect.left, rect.top + f9, rect.right, rect.bottom + f9);
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

    @Override // org.telegram.ui.Components.hv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        ox oxVar;
        org.telegram.ui.Components.jl0 p10;
        fy fyVar = this.A0;
        if (fyVar.l3 && (oxVar = fyVar.y0) != null && oxVar.getVisibility() == 0) {
            ox oxVar2 = fyVar.y0;
            View[] viewArr = oxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.z71.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p10.getChildCount(); i11++) {
                        View childAt = p10.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p10.getY() + viewArr[i10].getY() + oxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public final void M() {
        super.M();
        this.A0.m3();
    }

    @Override // org.telegram.ui.Components.hv0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        fy fyVar = this.A0;
        if (!fyVar.c3) {
            return false;
        }
        if (!fyVar.f3) {
            if (Math.abs(fyVar.a0[1].getTranslationX()) < 1.0f) {
                fyVar.a0[0].setTranslationX(r1.getMeasuredWidth() * (fyVar.d3 ? -1 : 1));
                fyVar.a0[1].setTranslationX(0.0f);
                fy.f1(fyVar, true);
                animatorSet = fyVar.b3;
                if (animatorSet != null) {
                }
                fyVar.c3 = false;
            }
            return fyVar.c3;
        }
        if (Math.abs(fyVar.a0[0].getTranslationX()) < 1.0f) {
            fyVar.a0[0].setTranslationX(0.0f);
            fyVar.a0[1].setTranslationX(r1[0].getMeasuredWidth() * (fyVar.d3 ? 1 : -1));
            fy.f1(fyVar, true);
            animatorSet = fyVar.b3;
            if (animatorSet != null) {
                animatorSet.cancel();
                fyVar.b3 = null;
            }
            fyVar.c3 = false;
        }
        return fyVar.c3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.l lVar;
        fy fyVar = this.A0;
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        float height = lVar.getHeight();
        ax axVar = fyVar.B3;
        float f9 = (axVar == null || !axVar.c()) ? 0.0f : fyVar.B3.e;
        if (fyVar.G) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, fyVar.p3, (1.0f - f9) * (1.0f - fyVar.t1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f9, (1.0f - fyVar.t1) * (1.0f - fyVar.p3) * AndroidUtilities.dp(48.0f), height + fyVar.P);
    }

    public final int b0() {
        fy fyVar = this.A0;
        float f9 = fyVar.J;
        ax axVar = fyVar.B3;
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, fyVar.t1, org.telegram.messenger.x3.y(1.0f, (axVar == null || !axVar.c()) ? 0.0f : fyVar.B3.e, 1.0f - fyVar.p3, f9), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        fy fyVar = this.A0;
        ew ewVar = fyVar.v0;
        int i10 = ewVar.f0.get(ewVar.G + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        fyVar.i3 = false;
        fyVar.h3 = true;
        this.u0 = (int) (motionEvent.getX() + fyVar.e3);
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        lVar.setEnabled(false);
        fyVar.v0.setEnabled(false);
        ey eyVar = fyVar.a0[1];
        eyVar.h = i10;
        eyVar.setVisibility(0);
        fyVar.d3 = z10;
        fy.f1(fyVar, false);
        fyVar.R4(true);
        if (z10) {
            fyVar.a0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        fyVar.a0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f9;
        float f10;
        boolean z11;
        Canvas canvas2;
        ax axVar;
        ux uxVar;
        float f11;
        cg.h0 h0Var;
        float f12;
        ux uxVar2;
        org.telegram.ui.ActionBar.l lVar;
        ax axVar2;
        fy fyVar = this.A0;
        Paint paint = fyVar.b1;
        if (Build.VERSION.SDK_INT >= 31 && fyVar.h4 != null) {
            fyVar.m3();
        }
        if (fyVar.M && (((axVar2 = fyVar.B3) == null || !axVar2.c()) && fyVar.p3 == 0.0f)) {
            fyVar.M = false;
            int i10 = (fyVar.Z3() && fyVar.a0[0].s == 0) ? 1 : 0;
            ay ayVar = fyVar.a0[0].a;
            if (fyVar.N) {
                if (!fyVar.X0) {
                    if (i10 == 0) {
                        fyVar.N = false;
                    }
                    if (fyVar.N) {
                        f2.n1 L = ayVar.L(0, false);
                        if (L == null) {
                            fyVar.N = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= ayVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                fyVar.N = false;
                            } else if (view.getTop() >= ayVar.getPaddingTop()) {
                                fyVar.N = false;
                            }
                        }
                        if (fyVar.N) {
                        }
                    }
                }
                i10 = 0;
            }
            f2.n1 L2 = ayVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = ayVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -fyVar.T3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    fyVar.C4(f13);
                } else {
                    fyVar.C4(0.0f);
                }
            } else {
                fyVar.C4(-fyVar.T3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.o2) fyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        fyVar.B3.setCurrentTop(i11);
        boolean z12 = fyVar.n3;
        Rect rect = this.x0;
        Paint paint2 = this.s0;
        if (z12) {
            float f15 = fyVar.t1;
            if (f15 == 1.0f) {
                paint2.setColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            } else if (f15 == 0.0f && (uxVar2 = fyVar.T) != null) {
                uxVar2.setTranslationY(fyVar.W3() + fyVar.J);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(fyVar.t1 * 2.0f));
            float f16 = fyVar.t1;
            if (f16 < 0.0f) {
                if (f16 == 1.0f) {
                    paint = paint2;
                }
                f9 = 1.0f;
                f10 = 81.0f;
                J(canvas, 0.0f, this.x0, paint, true);
            } else {
                f9 = 1.0f;
                f10 = 81.0f;
            }
            float f17 = fyVar.t1;
            if (f17 > 0.0f && f17 < f9) {
                paint2.setColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (!fyVar.l3 && fyVar.m3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(fyVar.t1 * 2.0f));
                    J(canvas, 0.0f, this.x0, paint2, true);
                }
                ux uxVar3 = fyVar.T;
                if (uxVar3 != null) {
                    lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                    int height = lVar.getHeight();
                    uxVar3.setTranslationY(fyVar.W3() + (i11 - (height + (fyVar.v0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f9 = 1.0f;
            f10 = 81.0f;
            z11 = ((org.telegram.ui.ActionBar.o2) fyVar).inPreviewMode;
            if (!z11) {
                if (fyVar.p3 > 0.0f) {
                    paint2.setColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(fyVar.t1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.x0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(fyVar.t1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.x0, paint, true);
                }
                fyVar.s3 = 0.0f;
                fyVar.r3 = 0.0f;
                float min = fyVar.s3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!fyVar.G ? 81.0f : 0.0f)) + fyVar.J, fyVar.p3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!fyVar.G ? 81.0f : 0.0f)));
                fyVar.s3 = min;
                fyVar.r3 = min;
                axVar = fyVar.B3;
                if (axVar == null && axVar.c()) {
                    float f18 = fyVar.B3.e;
                    float T3 = fyVar.s3 - ((fyVar.T3() + fyVar.J) * f18);
                    fyVar.s3 = T3;
                    fyVar.r3 = T3;
                    float clamp = fyVar.C0 ? f9 - Utilities.clamp(f18 / 0.5f, f9, 0.0f) : 1.0f;
                    ew ewVar = fyVar.v0;
                    if (ewVar != null && ewVar.getVisibility() == 0) {
                        fyVar.s3 -= (f9 - fyVar.r.e) * fyVar.v0.getMeasuredHeight();
                    }
                    ux uxVar4 = fyVar.T;
                    if (uxVar4 != null) {
                        uxVar4.setTranslationY(fyVar.W3() + AndroidUtilities.lerp(fyVar.J + fyVar.s3, -AndroidUtilities.dp(fyVar.G ? 81.0f : 0.0f), f18));
                    }
                    if (fyVar.y) {
                        boolean z13 = fyVar.A;
                        float f19 = z13 ? 0.0f : fyVar.J;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !fyVar.w) ? 0.0f : 50.0f), f19, fyVar.B3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    fyVar.a0[0].setTranslationY(f12 - (((fyVar.G ? AndroidUtilities.dp(f10) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * fyVar.B3.e));
                    f11 = clamp;
                } else {
                    uxVar = fyVar.T;
                    if (uxVar != null) {
                        uxVar.setTranslationY(AndroidUtilities.lerp(((fyVar.J + fyVar.s3) + fyVar.P) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((fyVar.G ? 81 : 0) + 48), fyVar.t1));
                    }
                    f11 = 1.0f;
                }
                fyVar.S4();
                fy.N2(fyVar, f11);
                super.dispatchDraw(canvas);
                fy.O2(fyVar, canvas2, i11);
                h0Var = fyVar.G0;
                if (h0Var != null && h0Var.getVisibility() == 0) {
                    if (fyVar.G0.getAlpha() != f9) {
                        fyVar.G0.draw(canvas2);
                    } else if (fyVar.G0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(fyVar.G0.getLeft(), fyVar.G0.getTop(), fyVar.G0.getRight(), fyVar.G0.getBottom(), (int) (fyVar.G0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(fyVar.G0.getLeft(), fyVar.G0.getTop());
                        fyVar.G0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!fyVar.S && fyVar.T2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6), fyVar.c4);
                }
                fyVar.R = true;
            }
        }
        canvas2 = canvas;
        fyVar.s3 = 0.0f;
        fyVar.r3 = 0.0f;
        float min2 = fyVar.s3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!fyVar.G ? 81.0f : 0.0f)) + fyVar.J, fyVar.p3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!fyVar.G ? 81.0f : 0.0f)));
        fyVar.s3 = min2;
        fyVar.r3 = min2;
        axVar = fyVar.B3;
        if (axVar == null) {
        }
        uxVar = fyVar.T;
        if (uxVar != null) {
        }
        f11 = 1.0f;
        fyVar.S4();
        fy.N2(fyVar, f11);
        super.dispatchDraw(canvas);
        fy.O2(fyVar, canvas2, i11);
        h0Var = fyVar.G0;
        if (h0Var != null) {
            if (fyVar.G0.getAlpha() != f9) {
            }
        }
        if (!fyVar.S) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6), fyVar.c4);
        }
        fyVar.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.z0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        fy fyVar = this.A0;
        if (view == fyVar.G0) {
            return true;
        }
        if (org.telegram.ui.Components.hv0.r0) {
            return super.drawChild(canvas, view, j10);
        }
        ey[] eyVarArr = fyVar.a0;
        if (view == eyVarArr[0] || ((eyVarArr.length > 1 && view == eyVarArr[1]) || view == fyVar.F1 || view == fyVar.v0)) {
            canvas.save();
            if (view != fyVar.F1 && view != fyVar.v0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f9 = fyVar.T3;
            if (f9 != 1.0f) {
                if (fyVar.U3) {
                    canvas.translate((1.0f - fyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = th.b(1.0f, f9, 0.05f, 1.0f);
                    canvas.translate((1.0f - fyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(b10, b10, 0.0f, (-getY()) + fyVar.J + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (view != lVar || fyVar.T3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (fyVar.U3) {
            canvas.translate((1.0f - fyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float b11 = th.b(1.0f, fyVar.T3, 0.05f, 1.0f);
            canvas.translate((1.0f - fyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            canvas.scale(b11, b11, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + (lVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.n5 n5Var = this.A0.z3;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n5 n5Var = this.A0.z3;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        ew ewVar;
        int actionMasked = motionEvent.getActionMasked();
        fy fyVar = this.A0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (lVar.s()) {
                fyVar.U0 = true;
            }
        }
        return Z() || ((ewVar = fyVar.v0) != null && ewVar.K) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        fy fyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar;
        xw xwVar;
        xw xwVar2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        xx xxVar = this;
        int childCount = xxVar.getChildCount();
        int R = xxVar.R();
        xxVar.setBottomClip(0);
        int measuredWidth = xxVar.getMeasuredWidth();
        int measuredHeight = xxVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            fyVar = xxVar.A0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = xxVar.getChildAt(i20);
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
                            i19 = layoutParams.topMargin + xxVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != fyVar.T || childAt == fyVar.V || childAt == (xwVar2 = fyVar.A0)) {
                            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                            i19 = lVar.getMeasuredHeight();
                            if (childAt != fyVar.T && childAt != fyVar.A0 && childAt != fyVar.V) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (fyVar.G && childAt == fyVar.T) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            xwVar = fyVar.A0;
                            if (childAt == xwVar && xwVar.getPremiumHint() != null) {
                                fyVar.A0.getPremiumHint().layout(i16, b.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, fyVar.A0.getPremiumHint().getMeasuredHeight() + b.C(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == fyVar.T) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == fyVar.y0) {
                            i19 = -AndroidUtilities.dp(fyVar.a);
                        } else if (childAt instanceof ru) {
                            lVar3 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                            i19 = lVar3.getMeasuredHeight();
                        } else if (childAt instanceof ey) {
                            i19 = 0;
                        } else if (childAt == fyVar.F1 || childAt == fyVar.G1 || childAt == fyVar.v0) {
                            lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + lVar2.getMeasuredHeight() + i19;
                        } else if (xwVar2 != null && xwVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != fyVar.T) {
                    }
                    lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                    i19 = lVar.getMeasuredHeight();
                    if (childAt != fyVar.T) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (fyVar.G) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    xwVar = fyVar.A0;
                    if (childAt == xwVar) {
                        fyVar.A0.getPremiumHint().layout(i16, b.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, fyVar.A0.getPremiumHint().getMeasuredHeight() + b.C(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == fyVar.T) {
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
                if (childAt != fyVar.T) {
                }
                lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                i19 = lVar.getMeasuredHeight();
                if (childAt != fyVar.T) {
                }
                if (fyVar.G) {
                }
                xwVar = fyVar.A0;
                if (childAt == xwVar) {
                }
                if (childAt == fyVar.T) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            xxVar = this;
        }
        ox oxVar = fyVar.y0;
        if (oxVar != null) {
            oxVar.setKeyboardHeight(R);
        }
        S();
        fyVar.X4();
        fyVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        fy fyVar = this.A0;
        int i12 = fyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = fyVar.i0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            layoutParams.topMargin = lVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof ru) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - lVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof ey) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (fyVar.B3.c()) {
                            if (fyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (fyVar.G) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + fyVar.L;
                        if (fyVar.q3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = fyVar.V3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        ox oxVar = fyVar.y0;
                        if (childAt == oxVar) {
                            oxVar.setTranslationY(fyVar.E0);
                            fyVar.y0.l0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            fyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            lVar3 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + lVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            qw qwVar = fyVar.x1;
                            if (qwVar == null || !qwVar.u0(childAt)) {
                                if (childAt == fyVar.B3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = fyVar.V3 ? (int) (size4 * 0.05f) : 0;
                                    fyVar.B3.setTransitionPaddingBottom(i16);
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
            post(new wx(this, 1));
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
        ew ewVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        float f9;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        sg.f fVar;
        fy fyVar = this.A0;
        b5Var = ((org.telegram.ui.ActionBar.o2) fyVar).parentLayout;
        Object[] objArr = 0;
        if (b5Var != null && (ewVar = fyVar.v0) != null && !ewVar.n && !fyVar.f2 && !fyVar.B3.c()) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) fyVar).parentLayout;
            if (!((ActionBarLayout) b5Var2).j()) {
                b5Var3 = ((org.telegram.ui.ActionBar.o2) fyVar).parentLayout;
                if (!((ActionBarLayout) b5Var3).y()) {
                    b5Var4 = ((org.telegram.ui.ActionBar.o2) fyVar).parentLayout;
                    if (!((ActionBarLayout) b5Var4).n && (motionEvent == null || fyVar.h3 || (motionEvent.getY() > a0() + b0() && ((fVar = fyVar.u1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < fyVar.u1.getY())))) {
                        if (fyVar.N0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    ey eyVar = fyVar.a0[0];
                                    if (eyVar != null) {
                                        int i12 = eyVar.d.h;
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
                            fyVar.h3 = true;
                            this.t0 = motionEvent.getPointerId(0);
                            int x4 = (int) motionEvent.getX();
                            this.u0 = x4;
                            if (fyVar.d3) {
                                if (x4 < fyVar.a0[0].getTranslationX() + fyVar.a0[0].getMeasuredWidth()) {
                                    fyVar.e3 = fyVar.a0[0].getTranslationX();
                                } else {
                                    ey[] eyVarArr = fyVar.a0;
                                    ey eyVar2 = eyVarArr[0];
                                    ey eyVar3 = eyVarArr[1];
                                    eyVarArr[0] = eyVar3;
                                    eyVarArr[1] = eyVar2;
                                    fyVar.d3 = false;
                                    fyVar.e3 = eyVar3.getTranslationX();
                                    fyVar.v0.g(1.0f, fyVar.a0[0].h);
                                    fyVar.v0.g(fyVar.e3 / r10[0].getMeasuredWidth(), fyVar.a0[1].h);
                                    fyVar.R4(true);
                                    fyVar.a0[0].d.getClass();
                                    fyVar.a0[1].d.getClass();
                                }
                            } else if (x4 < fyVar.a0[1].getTranslationX() + fyVar.a0[1].getMeasuredWidth()) {
                                ey[] eyVarArr2 = fyVar.a0;
                                ey eyVar4 = eyVarArr2[0];
                                ey eyVar5 = eyVarArr2[1];
                                eyVarArr2[0] = eyVar5;
                                eyVarArr2[1] = eyVar4;
                                fyVar.d3 = true;
                                fyVar.e3 = eyVar5.getTranslationX();
                                fyVar.v0.g(1.0f, fyVar.a0[0].h);
                                fyVar.v0.g((-fyVar.e3) / r10[0].getMeasuredWidth(), fyVar.a0[1].h);
                                fyVar.R4(true);
                                fyVar.a0[0].d.getClass();
                                fyVar.a0[1].d.getClass();
                            } else {
                                fyVar.e3 = fyVar.a0[0].getTranslationX();
                            }
                            fyVar.b3.removeAllListeners();
                            fyVar.b3.cancel();
                            fyVar.c3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            fyVar.e3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !fyVar.h3 && !fyVar.i3 && fyVar.v0.getVisibility() == 0) {
                            this.t0 = motionEvent.getPointerId(0);
                            fyVar.i3 = true;
                            this.u0 = (int) motionEvent.getX();
                            this.v0 = (int) motionEvent.getY();
                            this.w0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.t0) {
                            int x10 = (int) ((motionEvent.getX() - this.u0) + fyVar.e3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.v0);
                            if (fyVar.h3 && (((z10 = fyVar.d3) && x10 > 0) || (!z10 && x10 < 0))) {
                                if (!c0(motionEvent, x10 < 0)) {
                                    fyVar.i3 = true;
                                    fyVar.h3 = false;
                                    fyVar.a0[0].setTranslationX(0.0f);
                                    fyVar.a0[1].setTranslationX(fyVar.d3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    fyVar.v0.g(0.0f, fyVar.a0[1].h);
                                }
                            }
                            if (fyVar.i3 && !fyVar.h3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x11 = (int) (motionEvent.getX() - this.u0);
                                if (Math.abs(x11) >= pixelsInCM && Math.abs(x11) > abs) {
                                    c0(motionEvent, x10 < 0);
                                }
                            } else if (fyVar.h3) {
                                fyVar.a0[0].setTranslationX(x10);
                                if (fyVar.d3) {
                                    fyVar.a0[1].setTranslationX(r1[0].getMeasuredWidth() + x10);
                                } else {
                                    fyVar.a0[1].setTranslationX(x10 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x10) / fyVar.a0[0].getMeasuredWidth();
                                ey eyVar6 = fyVar.a0[1];
                                if (eyVar6.A && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    fyVar.v0.i(fyVar.a0[1].h);
                                    AndroidUtilities.runOnUIThread(new wx(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                fyVar.v0.g(abs2, eyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.w0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, fyVar.g3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f9 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f9 = this.w0.getXVelocity();
                                f10 = this.w0.getYVelocity();
                                if (!fyVar.h3 && Math.abs(f9) >= 3000.0f && Math.abs(f9) > Math.abs(f10)) {
                                    c0(motionEvent, f9 < 0.0f);
                                }
                            }
                            if (fyVar.h3) {
                                float x12 = fyVar.a0[0].getX();
                                fyVar.b3 = new AnimatorSet();
                                if (fyVar.a0[1].A) {
                                    fyVar.f3 = true;
                                } else if (fyVar.e3 == 0.0f) {
                                    fyVar.f3 = Math.abs(x12) < ((float) fyVar.a0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f9) < 3500.0f || Math.abs(f9) < Math.abs(f10));
                                } else if (Math.abs(f9) > 1500.0f) {
                                    boolean z11 = fyVar.d3 ? false : false;
                                    fyVar.f3 = z11;
                                } else if (fyVar.d3) {
                                    fyVar.f3 = fyVar.a0[1].getX() > ((float) (fyVar.a0[0].getMeasuredWidth() >> 1));
                                } else {
                                    fyVar.f3 = fyVar.a0[0].getX() < ((float) (fyVar.a0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = fyVar.f3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x12);
                                    if (fyVar.d3) {
                                        fyVar.b3.playTogether(ObjectAnimator.ofFloat(fyVar.a0[0], (Property<ey, Float>) property, 0.0f), ObjectAnimator.ofFloat(fyVar.a0[1], (Property<ey, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        fyVar.b3.playTogether(ObjectAnimator.ofFloat(fyVar.a0[0], (Property<ey, Float>) property, 0.0f), ObjectAnimator.ofFloat(fyVar.a0[1], (Property<ey, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = fyVar.a0[0].getMeasuredWidth() - Math.abs(x12);
                                    if (fyVar.d3) {
                                        fyVar.b3.playTogether(ObjectAnimator.ofFloat(fyVar.a0[0], (Property<ey, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(fyVar.a0[1], (Property<ey, Float>) property, 0.0f));
                                    } else {
                                        fyVar.b3.playTogether(ObjectAnimator.ofFloat(fyVar.a0[0], (Property<ey, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(fyVar.a0[1], (Property<ey, Float>) property, 0.0f));
                                    }
                                }
                                fyVar.b3.setInterpolator(fy.v4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                fyVar.b3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f9) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                fyVar.b3.addListener(new org.telegram.ui.Components.p11(this, 26));
                                fyVar.b3.start();
                                fyVar.c3 = true;
                                fyVar.h3 = false;
                            } else {
                                fyVar.i3 = false;
                                lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                                lVar.setEnabled(true);
                                fyVar.v0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.w0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.w0 = null;
                            }
                        }
                        return fyVar.h3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        fy fyVar = this.A0;
        if (fyVar.i3 && !fyVar.h3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
