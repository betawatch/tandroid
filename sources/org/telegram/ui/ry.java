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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ry extends org.telegram.ui.Components.ow0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final oe.b D0;
    public final /* synthetic */ yy E0;
    public final Paint w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(Context context, yy yyVar) {
        super(context, null);
        this.E0 = yyVar;
        this.w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new oe.b(new g(this, 15));
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
    @Override // org.telegram.ui.Components.ow0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            yy yyVar = this.E0;
            if (yyVar.l4 != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
                if (fh.b.c(i10, c6Var)) {
                    c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
                    if (c6Var2 != null) {
                        c6Var3 = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    yyVar.l4.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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

    @Override // org.telegram.ui.Components.ow0
    public final void L(Canvas canvas, ArrayList arrayList) {
        iy iyVar;
        org.telegram.ui.Components.mm0 p5;
        yy yyVar = this.E0;
        if (yyVar.p3 && (iyVar = yyVar.C0) != null && iyVar.getVisibility() == 0) {
            iy iyVar2 = yyVar.C0;
            View[] viewArr = iyVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.k91.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + iyVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public final void M() {
        super.M();
        this.E0.j3();
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        yy yyVar = this.E0;
        if (!yyVar.g3) {
            return false;
        }
        if (!yyVar.j3) {
            if (Math.abs(yyVar.e0[1].getTranslationX()) < 1.0f) {
                yyVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (yyVar.h3 ? -1 : 1));
                yyVar.e0[1].setTranslationX(0.0f);
                yy.c1(yyVar, true);
                animatorSet = yyVar.f3;
                if (animatorSet != null) {
                }
                yyVar.g3 = false;
            }
            return yyVar.g3;
        }
        if (Math.abs(yyVar.e0[0].getTranslationX()) < 1.0f) {
            yyVar.e0[0].setTranslationX(0.0f);
            yyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (yyVar.h3 ? 1 : -1));
            yy.c1(yyVar, true);
            animatorSet = yyVar.f3;
            if (animatorSet != null) {
                animatorSet.cancel();
                yyVar.f3 = null;
            }
            yyVar.g3 = false;
        }
        return yyVar.g3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        yy yyVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        float height = kVar.getHeight();
        sx sxVar = yyVar.F3;
        float f7 = (sxVar == null || !sxVar.c()) ? 0.0f : yyVar.F3.e;
        if (yyVar.K) {
            height = com.google.android.gms.internal.play_billing.k3.y(1.0f, yyVar.t3, (1.0f - f7) * (1.0f - yyVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, f7, (1.0f - yyVar.x1) * (1.0f - yyVar.t3) * AndroidUtilities.dp(48.0f), height + yyVar.T);
    }

    public final int b0() {
        yy yyVar = this.E0;
        float f7 = yyVar.N;
        sx sxVar = yyVar.F3;
        return (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, yyVar.x1, org.telegram.messenger.q.B(1.0f, (sxVar == null || !sxVar.c()) ? 0.0f : yyVar.F3.e, 1.0f - yyVar.t3, f7), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        yy yyVar = this.E0;
        ww wwVar = yyVar.z0;
        int i10 = wwVar.j0.get(wwVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        yyVar.m3 = false;
        yyVar.l3 = true;
        this.y0 = (int) (motionEvent.getX() + yyVar.i3);
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        kVar.setEnabled(false);
        yyVar.z0.setEnabled(false);
        xy xyVar = yyVar.e0[1];
        xyVar.h = i10;
        xyVar.setVisibility(0);
        yyVar.h3 = z10;
        yy.c1(yyVar, false);
        yyVar.O4(true);
        if (z10) {
            yyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        yyVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r1 == 1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208  */
    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        Canvas canvas2;
        sx sxVar;
        oy oyVar;
        float f11;
        di.ab abVar;
        float f12;
        oy oyVar2;
        org.telegram.ui.ActionBar.k kVar;
        sx sxVar2;
        yy yyVar = this.E0;
        Paint paint = yyVar.f1;
        if (Build.VERSION.SDK_INT >= 31 && yyVar.k4 != null) {
            yyVar.j3();
        }
        if (yyVar.Q && (((sxVar2 = yyVar.F3) == null || !sxVar2.c()) && yyVar.t3 == 0.0f)) {
            yyVar.Q = false;
            int i10 = (yyVar.W3() && yyVar.e0[0].s == 0) ? 1 : 0;
            uy uyVar = yyVar.e0[0].a;
            if (yyVar.R) {
                if (!yyVar.b1) {
                    if (i10 == 0) {
                        yyVar.R = false;
                    }
                    if (yyVar.R) {
                        s4.b1 L = uyVar.L(0, false);
                        if (L == null) {
                            yyVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= uyVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                yyVar.R = false;
                            } else if (view.getTop() >= uyVar.getPaddingTop()) {
                                yyVar.R = false;
                            }
                        }
                        if (yyVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.b1 L2 = uyVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = uyVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -yyVar.Q3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    yyVar.z4(f13);
                } else {
                    yyVar.z4(0.0f);
                }
            } else {
                yyVar.z4(-yyVar.Q3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.m2) yyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        yyVar.F3.setCurrentTop(i11);
        boolean z12 = yyVar.r3;
        Rect rect = this.B0;
        Paint paint2 = this.w0;
        if (z12) {
            float f15 = yyVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            } else if (f15 == 0.0f && (oyVar2 = yyVar.X) != null) {
                oyVar2.setTranslationY(yyVar.T3() + yyVar.N);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(yyVar.x1 * 2.0f));
            float f16 = yyVar.x1;
            if (f16 < 0.0f) {
                if (f16 == 1.0f) {
                    paint = paint2;
                }
                f7 = 81.0f;
                f10 = 1.0f;
                J(canvas, 0.0f, this.B0, paint, true);
            } else {
                f7 = 81.0f;
                f10 = 1.0f;
            }
            float f17 = yyVar.x1;
            if (f17 > 0.0f && f17 < f10) {
                paint2.setColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (!yyVar.p3 && yyVar.q3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(yyVar.x1 * 2.0f));
                    J(canvas, 0.0f, this.B0, paint2, true);
                }
                oy oyVar3 = yyVar.X;
                if (oyVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                    int height = kVar.getHeight();
                    oyVar3.setTranslationY(yyVar.T3() + (i11 - (height + (yyVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 81.0f;
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.m2) yyVar).inPreviewMode;
            if (!z11) {
                if (yyVar.t3 > 0.0f) {
                    paint2.setColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(yyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(yyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint, true);
                }
                yyVar.w3 = 0.0f;
                yyVar.v3 = 0.0f;
                float min = yyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!yyVar.K ? f7 : 0.0f)) + yyVar.N, yyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!yyVar.K ? f7 : 0.0f)));
                yyVar.w3 = min;
                yyVar.v3 = min;
                sxVar = yyVar.F3;
                if (sxVar == null && sxVar.c()) {
                    float f18 = yyVar.F3.e;
                    float Q3 = yyVar.w3 - ((yyVar.Q3() + yyVar.N) * f18);
                    yyVar.w3 = Q3;
                    yyVar.v3 = Q3;
                    float clamp = yyVar.G0 ? f10 - Utilities.clamp(f18 / 0.5f, f10, 0.0f) : f10;
                    ww wwVar = yyVar.z0;
                    if (wwVar != null && wwVar.getVisibility() == 0) {
                        yyVar.w3 -= (f10 - yyVar.r.e) * yyVar.z0.getMeasuredHeight();
                    }
                    oy oyVar4 = yyVar.X;
                    if (oyVar4 != null) {
                        oyVar4.setTranslationY(yyVar.T3() + AndroidUtilities.lerp(yyVar.N + yyVar.w3, -AndroidUtilities.dp(yyVar.K ? f7 : 0.0f), f18));
                    }
                    if (yyVar.y) {
                        boolean z13 = yyVar.E;
                        float f19 = z13 ? 0.0f : yyVar.N;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !yyVar.w) ? 0.0f : 50.0f), f19, yyVar.F3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    yyVar.e0[0].setTranslationY(f12 - (((yyVar.K ? AndroidUtilities.dp(f7) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * yyVar.F3.e));
                    f11 = clamp;
                } else {
                    oyVar = yyVar.X;
                    if (oyVar != null) {
                        oyVar.setTranslationY(AndroidUtilities.lerp(((yyVar.N + yyVar.w3) + yyVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((yyVar.K ? 81 : 0) + 48), yyVar.x1));
                    }
                    f11 = f10;
                }
                yyVar.P4();
                yy.K2(yyVar, f11);
                super.dispatchDraw(canvas);
                yy.L2(yyVar, canvas2, i11);
                abVar = yyVar.K0;
                if (abVar != null && abVar.getVisibility() == 0) {
                    if (yyVar.K0.getAlpha() != f10) {
                        yyVar.K0.draw(canvas2);
                    } else if (yyVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(yyVar.K0.getLeft(), yyVar.K0.getTop(), yyVar.K0.getRight(), yyVar.K0.getBottom(), (int) (yyVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(yyVar.K0.getLeft(), yyVar.K0.getTop());
                        yyVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!yyVar.W && yyVar.X2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6), yyVar.f4);
                }
                yyVar.V = true;
            }
        }
        canvas2 = canvas;
        yyVar.w3 = 0.0f;
        yyVar.v3 = 0.0f;
        float min2 = yyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!yyVar.K ? f7 : 0.0f)) + yyVar.N, yyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!yyVar.K ? f7 : 0.0f)));
        yyVar.w3 = min2;
        yyVar.v3 = min2;
        sxVar = yyVar.F3;
        if (sxVar == null) {
        }
        oyVar = yyVar.X;
        if (oyVar != null) {
        }
        f11 = f10;
        yyVar.P4();
        yy.K2(yyVar, f11);
        super.dispatchDraw(canvas);
        yy.L2(yyVar, canvas2, i11);
        abVar = yyVar.K0;
        if (abVar != null) {
            if (yyVar.K0.getAlpha() != f10) {
            }
        }
        if (!yyVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6), yyVar.f4);
        }
        yyVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.D0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yy yyVar = this.E0;
        if (view == yyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.ow0.v0) {
            return super.drawChild(canvas, view, j10);
        }
        xy[] xyVarArr = yyVar.e0;
        if (view == xyVarArr[0] || ((xyVarArr.length > 1 && view == xyVarArr[1]) || view == yyVar.J1 || view == yyVar.z0)) {
            canvas.save();
            if (view != yyVar.J1 && view != yyVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = yyVar.W3;
            if (f7 != 1.0f) {
                if (yyVar.X3) {
                    canvas.translate((1.0f - yyVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - yyVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(D, D, 0.0f, (-getY()) + yyVar.N + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (view != kVar || yyVar.W3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (yyVar.X3) {
            canvas.translate((1.0f - yyVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float D2 = com.google.android.gms.internal.play_billing.k3.D(1.0f, yyVar.W3, 0.05f, 1.0f);
            canvas.translate((1.0f - yyVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            canvas.scale(D2, D2, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.q5 q5Var = this.E0.D3;
        if (q5Var != null) {
            q5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q5 q5Var = this.E0.D3;
        if (q5Var != null) {
            q5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        ww wwVar;
        int actionMasked = motionEvent.getActionMasked();
        yy yyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            if (kVar.t()) {
                yyVar.Y0 = true;
            }
        }
        return Z() || ((wwVar = yyVar.z0) != null && wwVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yy yyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        px pxVar;
        px pxVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ry ryVar = this;
        int childCount = ryVar.getChildCount();
        int R = ryVar.R();
        int i20 = 0;
        ryVar.setBottomClip(0);
        int measuredWidth = ryVar.getMeasuredWidth();
        int measuredHeight = ryVar.getMeasuredHeight();
        int i21 = 0;
        while (true) {
            yyVar = ryVar.E0;
            if (i21 >= childCount) {
                break;
            }
            View childAt = ryVar.getChildAt(i21);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & 112;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i14 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i19 = layoutParams.topMargin + ryVar.getPaddingTop();
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != yyVar.X || childAt == yyVar.Z || childAt == (pxVar2 = yyVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != yyVar.X && childAt != yyVar.E0 && childAt != yyVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (yyVar.K && childAt == yyVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            pxVar = yyVar.E0;
                            if (childAt == pxVar && pxVar.getPremiumHint() != null) {
                                yyVar.E0.getPremiumHint().layout(i16, org.telegram.ui.Cells.d0.b(54.0f, i19, measuredHeight2), i16 + measuredWidth2, yyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.ui.Cells.d0.b(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == yyVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == yyVar.C0) {
                            i19 = -AndroidUtilities.dp(yyVar.a);
                        } else if (childAt instanceof gv) {
                            kVar3 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof xy) {
                            i19 = i20;
                        } else if (childAt == yyVar.J1 || childAt == yyVar.K1 || childAt == yyVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (pxVar2 != null && pxVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != yyVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != yyVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (yyVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    pxVar = yyVar.E0;
                    if (childAt == pxVar) {
                        yyVar.E0.getPremiumHint().layout(i16, org.telegram.ui.Cells.d0.b(54.0f, i19, measuredHeight2), i16 + measuredWidth2, yyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.ui.Cells.d0.b(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == yyVar.X) {
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
                if (childAt != yyVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != yyVar.X) {
                }
                if (yyVar.K) {
                }
                pxVar = yyVar.E0;
                if (childAt == pxVar) {
                }
                if (childAt == yyVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i21++;
            i20 = 0;
            ryVar = this;
        }
        iy iyVar = yyVar.C0;
        if (iyVar != null) {
            iyVar.setKeyboardHeight(R);
        }
        S();
        yyVar.U4();
        yyVar.P4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        yy yyVar = this.E0;
        int i12 = yyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.u0 u0Var = yyVar.m0;
        if (u0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof gv) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof xy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (yyVar.F3.c()) {
                            if (yyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (yyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + yyVar.P;
                        if (yyVar.u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = yyVar.Y3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        iy iyVar = yyVar.C0;
                        if (childAt == iyVar) {
                            iyVar.setTranslationY(yyVar.I0);
                            yyVar.C0.p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            yyVar.D3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ix ixVar = yyVar.B1;
                            if (ixVar == null || !ixVar.s0(childAt)) {
                                if (childAt == yyVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = yyVar.Y3 ? (int) (size4 * 0.05f) : 0;
                                    yyVar.F3.setTransitionPaddingBottom(i16);
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
        if (z10 != this.C0) {
            post(new qy(this, 1));
            this.C0 = z10;
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
        ww wwVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        ih.f fVar;
        yy yyVar = this.E0;
        b5Var = ((org.telegram.ui.ActionBar.m2) yyVar).parentLayout;
        Object[] objArr = 0;
        if (b5Var != null && (wwVar = yyVar.z0) != null && !wwVar.n && !yyVar.j2 && !yyVar.F3.c()) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) yyVar).parentLayout;
            if (!((ActionBarLayout) b5Var2).j()) {
                b5Var3 = ((org.telegram.ui.ActionBar.m2) yyVar).parentLayout;
                if (!((ActionBarLayout) b5Var3).y()) {
                    b5Var4 = ((org.telegram.ui.ActionBar.m2) yyVar).parentLayout;
                    if (!((ActionBarLayout) b5Var4).n && (motionEvent == null || yyVar.l3 || (motionEvent.getY() > a0() + b0() && ((fVar = yyVar.y1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < yyVar.y1.getY())))) {
                        if (yyVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    xy xyVar = yyVar.e0[0];
                                    if (xyVar != null) {
                                        int i12 = xyVar.d.h;
                                        if (i12 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            if (this.A0 == null) {
                                this.A0 = VelocityTracker.obtain();
                            }
                            this.A0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && Z()) {
                            yyVar.l3 = true;
                            this.x0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.y0 = x10;
                            if (yyVar.h3) {
                                if (x10 < yyVar.e0[0].getTranslationX() + yyVar.e0[0].getMeasuredWidth()) {
                                    yyVar.i3 = yyVar.e0[0].getTranslationX();
                                } else {
                                    xy[] xyVarArr = yyVar.e0;
                                    xy xyVar2 = xyVarArr[0];
                                    xy xyVar3 = xyVarArr[1];
                                    xyVarArr[0] = xyVar3;
                                    xyVarArr[1] = xyVar2;
                                    yyVar.h3 = false;
                                    yyVar.i3 = xyVar3.getTranslationX();
                                    yyVar.z0.g(1.0f, yyVar.e0[0].h);
                                    yyVar.z0.g(yyVar.i3 / r10[0].getMeasuredWidth(), yyVar.e0[1].h);
                                    yyVar.O4(true);
                                    yyVar.e0[0].d.getClass();
                                    yyVar.e0[1].d.getClass();
                                }
                            } else if (x10 < yyVar.e0[1].getTranslationX() + yyVar.e0[1].getMeasuredWidth()) {
                                xy[] xyVarArr2 = yyVar.e0;
                                xy xyVar4 = xyVarArr2[0];
                                xy xyVar5 = xyVarArr2[1];
                                xyVarArr2[0] = xyVar5;
                                xyVarArr2[1] = xyVar4;
                                yyVar.h3 = true;
                                yyVar.i3 = xyVar5.getTranslationX();
                                yyVar.z0.g(1.0f, yyVar.e0[0].h);
                                yyVar.z0.g((-yyVar.i3) / r10[0].getMeasuredWidth(), yyVar.e0[1].h);
                                yyVar.O4(true);
                                yyVar.e0[0].d.getClass();
                                yyVar.e0[1].d.getClass();
                            } else {
                                yyVar.i3 = yyVar.e0[0].getTranslationX();
                            }
                            yyVar.f3.removeAllListeners();
                            yyVar.f3.cancel();
                            yyVar.g3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            yyVar.i3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !yyVar.l3 && !yyVar.m3 && yyVar.z0.getVisibility() == 0) {
                            this.x0 = motionEvent.getPointerId(0);
                            yyVar.m3 = true;
                            this.y0 = (int) motionEvent.getX();
                            this.z0 = (int) motionEvent.getY();
                            this.A0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                            int x11 = (int) ((motionEvent.getX() - this.y0) + yyVar.i3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.z0);
                            if (yyVar.l3 && (((z10 = yyVar.h3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    yyVar.m3 = true;
                                    yyVar.l3 = false;
                                    yyVar.e0[0].setTranslationX(0.0f);
                                    yyVar.e0[1].setTranslationX(yyVar.h3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    yyVar.z0.g(0.0f, yyVar.e0[1].h);
                                }
                            }
                            if (yyVar.m3 && !yyVar.l3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.y0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (yyVar.l3) {
                                yyVar.e0[0].setTranslationX(x11);
                                if (yyVar.h3) {
                                    yyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    yyVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / yyVar.e0[0].getMeasuredWidth();
                                xy xyVar6 = yyVar.e0[1];
                                if (xyVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    yyVar.z0.i(yyVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new qy(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                yyVar.z0.g(abs2, xyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.A0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, yyVar.k3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.A0.getXVelocity();
                                f10 = this.A0.getYVelocity();
                                if (!yyVar.l3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    c0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (yyVar.l3) {
                                float x13 = yyVar.e0[0].getX();
                                yyVar.f3 = new AnimatorSet();
                                if (yyVar.e0[1].E) {
                                    yyVar.j3 = true;
                                } else if (yyVar.i3 == 0.0f) {
                                    yyVar.j3 = Math.abs(x13) < ((float) yyVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = yyVar.h3 ? false : false;
                                    yyVar.j3 = z11;
                                } else if (yyVar.h3) {
                                    yyVar.j3 = yyVar.e0[1].getX() > ((float) (yyVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    yyVar.j3 = yyVar.e0[0].getX() < ((float) (yyVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = yyVar.j3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (yyVar.h3) {
                                        yyVar.f3.playTogether(ObjectAnimator.ofFloat(yyVar.e0[0], (Property<xy, Float>) property, 0.0f), ObjectAnimator.ofFloat(yyVar.e0[1], (Property<xy, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        yyVar.f3.playTogether(ObjectAnimator.ofFloat(yyVar.e0[0], (Property<xy, Float>) property, 0.0f), ObjectAnimator.ofFloat(yyVar.e0[1], (Property<xy, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = yyVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (yyVar.h3) {
                                        yyVar.f3.playTogether(ObjectAnimator.ofFloat(yyVar.e0[0], (Property<xy, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(yyVar.e0[1], (Property<xy, Float>) property, 0.0f));
                                    } else {
                                        yyVar.f3.playTogether(ObjectAnimator.ofFloat(yyVar.e0[0], (Property<xy, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(yyVar.e0[1], (Property<xy, Float>) property, 0.0f));
                                    }
                                }
                                yyVar.f3.setInterpolator(yy.y4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                yyVar.f3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                yyVar.f3.addListener(new org.telegram.ui.Components.u61(this, 22));
                                yyVar.f3.start();
                                yyVar.g3 = true;
                                yyVar.l3 = false;
                            } else {
                                yyVar.m3 = false;
                                kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                                kVar.setEnabled(true);
                                yyVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.A0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.A0 = null;
                            }
                        }
                        return yyVar.l3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        yy yyVar = this.E0;
        if (yyVar.m3 && !yyVar.l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
