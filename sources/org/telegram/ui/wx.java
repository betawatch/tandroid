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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class wx extends org.telegram.ui.Components.ow0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final oe.b D0;
    public final /* synthetic */ ey E0;
    public final Paint w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(Context context, ey eyVar) {
        super(context, null);
        this.E0 = eyVar;
        this.w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new oe.b(new f(this, 15));
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
    
        if (org.telegram.ui.ActionBar.k6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.ow0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            ey eyVar = this.E0;
            if (eyVar.m4 != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
                if (fh.c.c(i10, g6Var)) {
                    g6Var2 = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
                    if (g6Var2 != null) {
                        g6Var3 = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    eyVar.m4.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
    public final void K(Canvas canvas, ArrayList arrayList) {
        nx nxVar;
        org.telegram.ui.Components.mm0 p5;
        ey eyVar = this.E0;
        if (eyVar.q3 && (nxVar = eyVar.C0) != null && nxVar.getVisibility() == 0) {
            nx nxVar2 = eyVar.C0;
            View[] viewArr = nxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.l91.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + nxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public final void L() {
        super.L();
        this.E0.i3();
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y() {
        AnimatorSet animatorSet;
        ey eyVar = this.E0;
        if (!eyVar.h3) {
            return false;
        }
        if (!eyVar.k3) {
            if (Math.abs(eyVar.e0[1].getTranslationX()) < 1.0f) {
                eyVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (eyVar.i3 ? -1 : 1));
                eyVar.e0[1].setTranslationX(0.0f);
                ey.b1(eyVar, true);
                animatorSet = eyVar.g3;
                if (animatorSet != null) {
                }
                eyVar.h3 = false;
            }
            return eyVar.h3;
        }
        if (Math.abs(eyVar.e0[0].getTranslationX()) < 1.0f) {
            eyVar.e0[0].setTranslationX(0.0f);
            eyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (eyVar.i3 ? 1 : -1));
            ey.b1(eyVar, true);
            animatorSet = eyVar.g3;
            if (animatorSet != null) {
                animatorSet.cancel();
                eyVar.g3 = null;
            }
            eyVar.h3 = false;
        }
        return eyVar.h3;
    }

    public final int Z() {
        org.telegram.ui.ActionBar.k kVar;
        ey eyVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        float height = kVar.getHeight();
        yw ywVar = eyVar.G3;
        float f7 = (ywVar == null || !ywVar.c()) ? 0.0f : eyVar.G3.e;
        if (eyVar.K) {
            height = com.google.android.gms.internal.play_billing.k3.y(1.0f, eyVar.u3, (1.0f - f7) * (1.0f - eyVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, f7, (1.0f - eyVar.x1) * (1.0f - eyVar.u3) * AndroidUtilities.dp(48.0f), height + eyVar.T);
    }

    public final int a0() {
        ey eyVar = this.E0;
        float f7 = eyVar.N;
        yw ywVar = eyVar.G3;
        return (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, eyVar.x1, org.telegram.messenger.v0.A(1.0f, (ywVar == null || !ywVar.c()) ? 0.0f : eyVar.G3.e, 1.0f - eyVar.u3, f7), -getY());
    }

    public final boolean b0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        ey eyVar = this.E0;
        cw cwVar = eyVar.z0;
        int i10 = cwVar.j0.get(cwVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        eyVar.n3 = false;
        eyVar.m3 = true;
        this.y0 = (int) (motionEvent.getX() + eyVar.j3);
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        kVar.setEnabled(false);
        eyVar.z0.setEnabled(false);
        dy dyVar = eyVar.e0[1];
        dyVar.h = i10;
        dyVar.setVisibility(0);
        eyVar.i3 = z10;
        ey.b1(eyVar, false);
        eyVar.P4(true);
        if (z10) {
            eyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        eyVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
        yw ywVar;
        tx txVar;
        float f11;
        ai.jc jcVar;
        float f12;
        tx txVar2;
        org.telegram.ui.ActionBar.k kVar;
        yw ywVar2;
        ey eyVar = this.E0;
        Paint paint = eyVar.f1;
        if (Build.VERSION.SDK_INT >= 31 && eyVar.l4 != null) {
            eyVar.i3();
        }
        if (eyVar.Q && (((ywVar2 = eyVar.G3) == null || !ywVar2.c()) && eyVar.u3 == 0.0f)) {
            eyVar.Q = false;
            int i10 = (eyVar.X3() && eyVar.e0[0].s == 0) ? 1 : 0;
            zx zxVar = eyVar.e0[0].a;
            if (eyVar.R) {
                if (!eyVar.b1) {
                    if (i10 == 0) {
                        eyVar.R = false;
                    }
                    if (eyVar.R) {
                        s4.b1 L = zxVar.L(0, false);
                        if (L == null) {
                            eyVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= zxVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                eyVar.R = false;
                            } else if (view.getTop() >= zxVar.getPaddingTop()) {
                                eyVar.R = false;
                            }
                        }
                        if (eyVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.b1 L2 = zxVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = zxVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -eyVar.R3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    eyVar.A4(f13);
                } else {
                    eyVar.A4(0.0f);
                }
            } else {
                eyVar.A4(-eyVar.R3());
            }
        }
        int Z = Z();
        z10 = ((org.telegram.ui.ActionBar.o2) eyVar).inPreviewMode;
        int a02 = z10 ? AndroidUtilities.statusBarHeight : a0();
        int i11 = a02 + Z;
        eyVar.G3.setCurrentTop(i11);
        boolean z12 = eyVar.s3;
        Rect rect = this.B0;
        Paint paint2 = this.w0;
        if (z12) {
            float f15 = eyVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            } else if (f15 == 0.0f && (txVar2 = eyVar.X) != null) {
                txVar2.setTranslationY(eyVar.U3() + eyVar.N);
            }
            rect.set(0, a02, getMeasuredWidth(), i11 - AndroidUtilities.dp(eyVar.x1 * 2.0f));
            float f16 = eyVar.x1;
            if (f16 < 0.0f) {
                if (f16 == 1.0f) {
                    paint = paint2;
                }
                f7 = 81.0f;
                f10 = 1.0f;
                I(canvas, 0.0f, this.B0, paint, true);
            } else {
                f7 = 81.0f;
                f10 = 1.0f;
            }
            float f17 = eyVar.x1;
            if (f17 > 0.0f && f17 < f10) {
                paint2.setColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (!eyVar.q3 && eyVar.r3) {
                    rect.set(0, a02, getMeasuredWidth(), i11 - AndroidUtilities.dp(eyVar.x1 * 2.0f));
                    I(canvas, 0.0f, this.B0, paint2, true);
                }
                tx txVar3 = eyVar.X;
                if (txVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                    int height = kVar.getHeight();
                    txVar3.setTranslationY(eyVar.U3() + (i11 - (height + (eyVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 81.0f;
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.o2) eyVar).inPreviewMode;
            if (!z11) {
                if (eyVar.u3 > 0.0f) {
                    paint2.setColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    rect.set(0, Math.max(0, a02), getMeasuredWidth(), i11 - AndroidUtilities.dp(eyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    I(canvas2, 0.0f, this.B0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, a02), getMeasuredWidth(), i11 - AndroidUtilities.dp(eyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    I(canvas2, 0.0f, this.B0, paint, true);
                }
                eyVar.x3 = 0.0f;
                eyVar.w3 = 0.0f;
                float min = eyVar.x3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!eyVar.K ? f7 : 0.0f)) + eyVar.N, eyVar.u3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!eyVar.K ? f7 : 0.0f)));
                eyVar.x3 = min;
                eyVar.w3 = min;
                ywVar = eyVar.G3;
                if (ywVar == null && ywVar.c()) {
                    float f18 = eyVar.G3.e;
                    float R3 = eyVar.x3 - ((eyVar.R3() + eyVar.N) * f18);
                    eyVar.x3 = R3;
                    eyVar.w3 = R3;
                    float clamp = eyVar.G0 ? f10 - Utilities.clamp(f18 / 0.5f, f10, 0.0f) : f10;
                    cw cwVar = eyVar.z0;
                    if (cwVar != null && cwVar.getVisibility() == 0) {
                        eyVar.x3 -= (f10 - eyVar.r.e) * eyVar.z0.getMeasuredHeight();
                    }
                    tx txVar4 = eyVar.X;
                    if (txVar4 != null) {
                        txVar4.setTranslationY(eyVar.U3() + AndroidUtilities.lerp(eyVar.N + eyVar.x3, -AndroidUtilities.dp(eyVar.K ? f7 : 0.0f), f18));
                    }
                    if (eyVar.y) {
                        boolean z13 = eyVar.E;
                        float f19 = z13 ? 0.0f : eyVar.N;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !eyVar.w) ? 0.0f : 50.0f), f19, eyVar.G3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    eyVar.e0[0].setTranslationY(f12 - (((eyVar.K ? AndroidUtilities.dp(f7) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * eyVar.G3.e));
                    f11 = clamp;
                } else {
                    txVar = eyVar.X;
                    if (txVar != null) {
                        txVar.setTranslationY(AndroidUtilities.lerp(((eyVar.N + eyVar.x3) + eyVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((eyVar.K ? 81 : 0) + 48), eyVar.x1));
                    }
                    f11 = f10;
                }
                eyVar.Q4();
                ey.J2(eyVar, f11);
                super.dispatchDraw(canvas);
                ey.K2(eyVar, canvas2, i11);
                jcVar = eyVar.K0;
                if (jcVar != null && jcVar.getVisibility() == 0) {
                    if (eyVar.K0.getAlpha() != f10) {
                        eyVar.K0.draw(canvas2);
                    } else if (eyVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(eyVar.K0.getLeft(), eyVar.K0.getTop(), eyVar.K0.getRight(), eyVar.K0.getBottom(), (int) (eyVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(eyVar.K0.getLeft(), eyVar.K0.getTop());
                        eyVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!eyVar.W && eyVar.Y2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6), eyVar.g4);
                }
                eyVar.V = true;
            }
        }
        canvas2 = canvas;
        eyVar.x3 = 0.0f;
        eyVar.w3 = 0.0f;
        float min2 = eyVar.x3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!eyVar.K ? f7 : 0.0f)) + eyVar.N, eyVar.u3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!eyVar.K ? f7 : 0.0f)));
        eyVar.x3 = min2;
        eyVar.w3 = min2;
        ywVar = eyVar.G3;
        if (ywVar == null) {
        }
        txVar = eyVar.X;
        if (txVar != null) {
        }
        f11 = f10;
        eyVar.Q4();
        ey.J2(eyVar, f11);
        super.dispatchDraw(canvas);
        ey.K2(eyVar, canvas2, i11);
        jcVar = eyVar.K0;
        if (jcVar != null) {
            if (eyVar.K0.getAlpha() != f10) {
            }
        }
        if (!eyVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6), eyVar.g4);
        }
        eyVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.D0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ey eyVar = this.E0;
        if (view == eyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.ow0.v0) {
            return super.drawChild(canvas, view, j10);
        }
        dy[] dyVarArr = eyVar.e0;
        if (view == dyVarArr[0] || ((dyVarArr.length > 1 && view == dyVarArr[1]) || view == eyVar.J1 || view == eyVar.z0)) {
            canvas.save();
            if (view != eyVar.J1 && view != eyVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + a0() + Z(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = eyVar.X3;
            if (f7 != 1.0f) {
                if (eyVar.Y3) {
                    canvas.translate((1.0f - eyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - eyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(D, D, 0.0f, (-getY()) + eyVar.N + Z());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        if (view != kVar || eyVar.X3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (eyVar.Y3) {
            canvas.translate((1.0f - eyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float D2 = com.google.android.gms.internal.play_billing.k3.D(1.0f, eyVar.X3, 0.05f, 1.0f);
            canvas.translate((1.0f - eyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
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
        org.telegram.ui.Components.p5 p5Var = this.E0.E3;
        if (p5Var != null) {
            p5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p5 p5Var = this.E0.E3;
        if (p5Var != null) {
            p5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        cw cwVar;
        int actionMasked = motionEvent.getActionMasked();
        ey eyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            if (kVar.s()) {
                eyVar.Y0 = true;
            }
        }
        return Y() || ((cwVar = eyVar.z0) != null && cwVar.O) || onTouchEvent(motionEvent);
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
        ey eyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        vw vwVar;
        vw vwVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        wx wxVar = this;
        int childCount = wxVar.getChildCount();
        int Q = wxVar.Q();
        int i20 = 0;
        wxVar.setBottomClip(0);
        int measuredWidth = wxVar.getMeasuredWidth();
        int measuredHeight = wxVar.getMeasuredHeight();
        int i21 = 0;
        while (true) {
            eyVar = wxVar.E0;
            if (i21 >= childCount) {
                break;
            }
            View childAt = wxVar.getChildAt(i21);
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
                            i19 = layoutParams.topMargin + wxVar.getPaddingTop();
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != eyVar.X || childAt == eyVar.Z || childAt == (vwVar2 = eyVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != eyVar.X && childAt != eyVar.E0 && childAt != eyVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (eyVar.K && childAt == eyVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            vwVar = eyVar.E0;
                            if (childAt == vwVar && vwVar.getPremiumHint() != null) {
                                eyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.sl.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, eyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.sl.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == eyVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == eyVar.C0) {
                            i19 = -AndroidUtilities.dp(eyVar.a);
                        } else if (childAt instanceof qu) {
                            kVar3 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof dy) {
                            i19 = i20;
                        } else if (childAt == eyVar.J1 || childAt == eyVar.K1 || childAt == eyVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (vwVar2 != null && vwVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != eyVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != eyVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (eyVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    vwVar = eyVar.E0;
                    if (childAt == vwVar) {
                        eyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.sl.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, eyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.sl.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == eyVar.X) {
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
                if (childAt != eyVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != eyVar.X) {
                }
                if (eyVar.K) {
                }
                vwVar = eyVar.E0;
                if (childAt == vwVar) {
                }
                if (childAt == eyVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i21++;
            i20 = 0;
            wxVar = this;
        }
        nx nxVar = eyVar.C0;
        if (nxVar != null) {
            nxVar.setKeyboardHeight(Q);
        }
        R();
        eyVar.W4();
        eyVar.Q4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        ey eyVar = this.E0;
        int i12 = eyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.u0 u0Var = eyVar.m0;
        if (u0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof qu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof dy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (eyVar.G3.c()) {
                            if (eyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (eyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + eyVar.P;
                        if (eyVar.v3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = eyVar.Z3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        nx nxVar = eyVar.C0;
                        if (childAt == nxVar) {
                            nxVar.setTranslationY(eyVar.I0);
                            eyVar.C0.p0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            eyVar.E3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ow owVar = eyVar.B1;
                            if (owVar == null || !owVar.r0(childAt)) {
                                if (childAt == eyVar.G3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = eyVar.Z3 ? (int) (size4 * 0.05f) : 0;
                                    eyVar.G3.setTransitionPaddingBottom(i16);
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
            post(new vx(this, 1));
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
        org.telegram.ui.ActionBar.h5 h5Var;
        cw cwVar;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.h5 h5Var3;
        org.telegram.ui.ActionBar.h5 h5Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        ih.f fVar;
        ey eyVar = this.E0;
        h5Var = ((org.telegram.ui.ActionBar.o2) eyVar).parentLayout;
        Object[] objArr = 0;
        if (h5Var != null && (cwVar = eyVar.z0) != null && !cwVar.n && !eyVar.j2 && !eyVar.G3.c()) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) eyVar).parentLayout;
            if (!((ActionBarLayout) h5Var2).i()) {
                h5Var3 = ((org.telegram.ui.ActionBar.o2) eyVar).parentLayout;
                if (!((ActionBarLayout) h5Var3).x()) {
                    h5Var4 = ((org.telegram.ui.ActionBar.o2) eyVar).parentLayout;
                    if (!((ActionBarLayout) h5Var4).n && (motionEvent == null || eyVar.m3 || (motionEvent.getY() > Z() + a0() && ((fVar = eyVar.y1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < eyVar.y1.getY())))) {
                        if (eyVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    dy dyVar = eyVar.e0[0];
                                    if (dyVar != null) {
                                        int i12 = dyVar.d.h;
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
                        if (motionEvent != null && motionEvent.getAction() == 0 && Y()) {
                            eyVar.m3 = true;
                            this.x0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.y0 = x10;
                            if (eyVar.i3) {
                                if (x10 < eyVar.e0[0].getTranslationX() + eyVar.e0[0].getMeasuredWidth()) {
                                    eyVar.j3 = eyVar.e0[0].getTranslationX();
                                } else {
                                    dy[] dyVarArr = eyVar.e0;
                                    dy dyVar2 = dyVarArr[0];
                                    dy dyVar3 = dyVarArr[1];
                                    dyVarArr[0] = dyVar3;
                                    dyVarArr[1] = dyVar2;
                                    eyVar.i3 = false;
                                    eyVar.j3 = dyVar3.getTranslationX();
                                    eyVar.z0.g(1.0f, eyVar.e0[0].h);
                                    eyVar.z0.g(eyVar.j3 / r10[0].getMeasuredWidth(), eyVar.e0[1].h);
                                    eyVar.P4(true);
                                    eyVar.e0[0].d.getClass();
                                    eyVar.e0[1].d.getClass();
                                }
                            } else if (x10 < eyVar.e0[1].getTranslationX() + eyVar.e0[1].getMeasuredWidth()) {
                                dy[] dyVarArr2 = eyVar.e0;
                                dy dyVar4 = dyVarArr2[0];
                                dy dyVar5 = dyVarArr2[1];
                                dyVarArr2[0] = dyVar5;
                                dyVarArr2[1] = dyVar4;
                                eyVar.i3 = true;
                                eyVar.j3 = dyVar5.getTranslationX();
                                eyVar.z0.g(1.0f, eyVar.e0[0].h);
                                eyVar.z0.g((-eyVar.j3) / r10[0].getMeasuredWidth(), eyVar.e0[1].h);
                                eyVar.P4(true);
                                eyVar.e0[0].d.getClass();
                                eyVar.e0[1].d.getClass();
                            } else {
                                eyVar.j3 = eyVar.e0[0].getTranslationX();
                            }
                            eyVar.g3.removeAllListeners();
                            eyVar.g3.cancel();
                            eyVar.h3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            eyVar.j3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !eyVar.m3 && !eyVar.n3 && eyVar.z0.getVisibility() == 0) {
                            this.x0 = motionEvent.getPointerId(0);
                            eyVar.n3 = true;
                            this.y0 = (int) motionEvent.getX();
                            this.z0 = (int) motionEvent.getY();
                            this.A0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                            int x11 = (int) ((motionEvent.getX() - this.y0) + eyVar.j3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.z0);
                            if (eyVar.m3 && (((z10 = eyVar.i3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!b0(motionEvent, x11 < 0)) {
                                    eyVar.n3 = true;
                                    eyVar.m3 = false;
                                    eyVar.e0[0].setTranslationX(0.0f);
                                    eyVar.e0[1].setTranslationX(eyVar.i3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    eyVar.z0.g(0.0f, eyVar.e0[1].h);
                                }
                            }
                            if (eyVar.n3 && !eyVar.m3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.y0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    b0(motionEvent, x11 < 0);
                                }
                            } else if (eyVar.m3) {
                                eyVar.e0[0].setTranslationX(x11);
                                if (eyVar.i3) {
                                    eyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    eyVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / eyVar.e0[0].getMeasuredWidth();
                                dy dyVar6 = eyVar.e0[1];
                                if (dyVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    eyVar.z0.i(eyVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new vx(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                eyVar.z0.g(abs2, dyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.A0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, eyVar.l3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.A0.getXVelocity();
                                f10 = this.A0.getYVelocity();
                                if (!eyVar.m3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    b0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (eyVar.m3) {
                                float x13 = eyVar.e0[0].getX();
                                eyVar.g3 = new AnimatorSet();
                                if (eyVar.e0[1].E) {
                                    eyVar.k3 = true;
                                } else if (eyVar.j3 == 0.0f) {
                                    eyVar.k3 = Math.abs(x13) < ((float) eyVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = eyVar.i3 ? false : false;
                                    eyVar.k3 = z11;
                                } else if (eyVar.i3) {
                                    eyVar.k3 = eyVar.e0[1].getX() > ((float) (eyVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    eyVar.k3 = eyVar.e0[0].getX() < ((float) (eyVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = eyVar.k3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (eyVar.i3) {
                                        eyVar.g3.playTogether(ObjectAnimator.ofFloat(eyVar.e0[0], (Property<dy, Float>) property, 0.0f), ObjectAnimator.ofFloat(eyVar.e0[1], (Property<dy, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        eyVar.g3.playTogether(ObjectAnimator.ofFloat(eyVar.e0[0], (Property<dy, Float>) property, 0.0f), ObjectAnimator.ofFloat(eyVar.e0[1], (Property<dy, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = eyVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (eyVar.i3) {
                                        eyVar.g3.playTogether(ObjectAnimator.ofFloat(eyVar.e0[0], (Property<dy, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(eyVar.e0[1], (Property<dy, Float>) property, 0.0f));
                                    } else {
                                        eyVar.g3.playTogether(ObjectAnimator.ofFloat(eyVar.e0[0], (Property<dy, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(eyVar.e0[1], (Property<dy, Float>) property, 0.0f));
                                    }
                                }
                                eyVar.g3.setInterpolator(ey.B4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                eyVar.g3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                eyVar.g3.addListener(new org.telegram.ui.Components.p31(this, 25));
                                eyVar.g3.start();
                                eyVar.h3 = true;
                                eyVar.m3 = false;
                            } else {
                                eyVar.n3 = false;
                                kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                                kVar.setEnabled(true);
                                eyVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.A0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.A0 = null;
                            }
                        }
                        return eyVar.m3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ey eyVar = this.E0;
        if (eyVar.n3 && !eyVar.m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
