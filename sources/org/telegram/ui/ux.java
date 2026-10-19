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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ux extends org.telegram.ui.Components.kw0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final oe.b D0;
    public final /* synthetic */ cy E0;
    public final Paint w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(Context context, cy cyVar) {
        super(context, null);
        this.E0 = cyVar;
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
    
        if (org.telegram.ui.ActionBar.h6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.kw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            cy cyVar = this.E0;
            if (cyVar.m4 != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) cyVar).resourceProvider;
                if (fh.c.c(i10, d6Var)) {
                    d6Var2 = ((org.telegram.ui.ActionBar.n2) cyVar).resourceProvider;
                    if (d6Var2 != null) {
                        d6Var3 = ((org.telegram.ui.ActionBar.n2) cyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    cyVar.m4.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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

    @Override // org.telegram.ui.Components.kw0
    public final void L(Canvas canvas, ArrayList arrayList) {
        lx lxVar;
        org.telegram.ui.Components.im0 p5;
        cy cyVar = this.E0;
        if (cyVar.q3 && (lxVar = cyVar.C0) != null && lxVar.getVisibility() == 0) {
            lx lxVar2 = cyVar.C0;
            View[] viewArr = lxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.d91.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + lxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.kw0
    public final void M() {
        super.M();
        this.E0.j3();
    }

    @Override // org.telegram.ui.Components.kw0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        cy cyVar = this.E0;
        if (!cyVar.h3) {
            return false;
        }
        if (!cyVar.k3) {
            if (Math.abs(cyVar.e0[1].getTranslationX()) < 1.0f) {
                cyVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (cyVar.i3 ? -1 : 1));
                cyVar.e0[1].setTranslationX(0.0f);
                cy.c1(cyVar, true);
                animatorSet = cyVar.g3;
                if (animatorSet != null) {
                }
                cyVar.h3 = false;
            }
            return cyVar.h3;
        }
        if (Math.abs(cyVar.e0[0].getTranslationX()) < 1.0f) {
            cyVar.e0[0].setTranslationX(0.0f);
            cyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (cyVar.i3 ? 1 : -1));
            cy.c1(cyVar, true);
            animatorSet = cyVar.g3;
            if (animatorSet != null) {
                animatorSet.cancel();
                cyVar.g3 = null;
            }
            cyVar.h3 = false;
        }
        return cyVar.h3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        cy cyVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        float height = kVar.getHeight();
        ww wwVar = cyVar.G3;
        float f7 = (wwVar == null || !wwVar.c()) ? 0.0f : cyVar.G3.e;
        if (cyVar.K) {
            height = com.google.android.gms.internal.play_billing.k3.y(1.0f, cyVar.u3, (1.0f - f7) * (1.0f - cyVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, f7, (1.0f - cyVar.x1) * (1.0f - cyVar.u3) * AndroidUtilities.dp(48.0f), height + cyVar.T);
    }

    public final int b0() {
        cy cyVar = this.E0;
        float f7 = cyVar.N;
        ww wwVar = cyVar.G3;
        return (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, cyVar.x1, org.telegram.messenger.g0.z(1.0f, (wwVar == null || !wwVar.c()) ? 0.0f : cyVar.G3.e, 1.0f - cyVar.u3, f7), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        cy cyVar = this.E0;
        aw awVar = cyVar.z0;
        int i10 = awVar.j0.get(awVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        cyVar.n3 = false;
        cyVar.m3 = true;
        this.y0 = (int) (motionEvent.getX() + cyVar.j3);
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        kVar.setEnabled(false);
        cyVar.z0.setEnabled(false);
        ay ayVar = cyVar.e0[1];
        ayVar.h = i10;
        ayVar.setVisibility(0);
        cyVar.i3 = z10;
        cy.c1(cyVar, false);
        cyVar.P4(true);
        if (z10) {
            cyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        cyVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.kw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        Canvas canvas2;
        ww wwVar;
        rx rxVar;
        float f11;
        ai.ic icVar;
        float f12;
        rx rxVar2;
        org.telegram.ui.ActionBar.k kVar;
        ww wwVar2;
        cy cyVar = this.E0;
        Paint paint = cyVar.f1;
        if (Build.VERSION.SDK_INT >= 31 && cyVar.l4 != null) {
            cyVar.j3();
        }
        if (cyVar.Q && (((wwVar2 = cyVar.G3) == null || !wwVar2.c()) && cyVar.u3 == 0.0f)) {
            cyVar.Q = false;
            int i10 = (cyVar.X3() && cyVar.e0[0].s == 0) ? 1 : 0;
            xx xxVar = cyVar.e0[0].a;
            if (cyVar.R) {
                if (!cyVar.b1) {
                    if (i10 == 0) {
                        cyVar.R = false;
                    }
                    if (cyVar.R) {
                        s4.b1 L = xxVar.L(0, false);
                        if (L == null) {
                            cyVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= xxVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                cyVar.R = false;
                            } else if (view.getTop() >= xxVar.getPaddingTop()) {
                                cyVar.R = false;
                            }
                        }
                        if (cyVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.b1 L2 = xxVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = xxVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -cyVar.R3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    cyVar.A4(f13);
                } else {
                    cyVar.A4(0.0f);
                }
            } else {
                cyVar.A4(-cyVar.R3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.n2) cyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        cyVar.G3.setCurrentTop(i11);
        boolean z12 = cyVar.s3;
        Rect rect = this.B0;
        Paint paint2 = this.w0;
        if (z12) {
            float f15 = cyVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            } else if (f15 == 0.0f && (rxVar2 = cyVar.X) != null) {
                rxVar2.setTranslationY(cyVar.U3() + cyVar.N);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(cyVar.x1 * 2.0f));
            float f16 = cyVar.x1;
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
            float f17 = cyVar.x1;
            if (f17 > 0.0f && f17 < f10) {
                paint2.setColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (!cyVar.q3 && cyVar.r3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(cyVar.x1 * 2.0f));
                    J(canvas, 0.0f, this.B0, paint2, true);
                }
                rx rxVar3 = cyVar.X;
                if (rxVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                    int height = kVar.getHeight();
                    rxVar3.setTranslationY(cyVar.U3() + (i11 - (height + (cyVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 81.0f;
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.n2) cyVar).inPreviewMode;
            if (!z11) {
                if (cyVar.u3 > 0.0f) {
                    paint2.setColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(cyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(cyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint, true);
                }
                cyVar.x3 = 0.0f;
                cyVar.w3 = 0.0f;
                float min = cyVar.x3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!cyVar.K ? f7 : 0.0f)) + cyVar.N, cyVar.u3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!cyVar.K ? f7 : 0.0f)));
                cyVar.x3 = min;
                cyVar.w3 = min;
                wwVar = cyVar.G3;
                if (wwVar == null && wwVar.c()) {
                    float f18 = cyVar.G3.e;
                    float R3 = cyVar.x3 - ((cyVar.R3() + cyVar.N) * f18);
                    cyVar.x3 = R3;
                    cyVar.w3 = R3;
                    float clamp = cyVar.G0 ? f10 - Utilities.clamp(f18 / 0.5f, f10, 0.0f) : f10;
                    aw awVar = cyVar.z0;
                    if (awVar != null && awVar.getVisibility() == 0) {
                        cyVar.x3 -= (f10 - cyVar.r.e) * cyVar.z0.getMeasuredHeight();
                    }
                    rx rxVar4 = cyVar.X;
                    if (rxVar4 != null) {
                        rxVar4.setTranslationY(cyVar.U3() + AndroidUtilities.lerp(cyVar.N + cyVar.x3, -AndroidUtilities.dp(cyVar.K ? f7 : 0.0f), f18));
                    }
                    if (cyVar.y) {
                        boolean z13 = cyVar.E;
                        float f19 = z13 ? 0.0f : cyVar.N;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !cyVar.w) ? 0.0f : 50.0f), f19, cyVar.G3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    cyVar.e0[0].setTranslationY(f12 - (((cyVar.K ? AndroidUtilities.dp(f7) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * cyVar.G3.e));
                    f11 = clamp;
                } else {
                    rxVar = cyVar.X;
                    if (rxVar != null) {
                        rxVar.setTranslationY(AndroidUtilities.lerp(((cyVar.N + cyVar.x3) + cyVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((cyVar.K ? 81 : 0) + 48), cyVar.x1));
                    }
                    f11 = f10;
                }
                cyVar.Q4();
                cy.K2(cyVar, f11);
                super.dispatchDraw(canvas);
                cy.L2(cyVar, canvas2, i11);
                icVar = cyVar.K0;
                if (icVar != null && icVar.getVisibility() == 0) {
                    if (cyVar.K0.getAlpha() != f10) {
                        cyVar.K0.draw(canvas2);
                    } else if (cyVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(cyVar.K0.getLeft(), cyVar.K0.getTop(), cyVar.K0.getRight(), cyVar.K0.getBottom(), (int) (cyVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(cyVar.K0.getLeft(), cyVar.K0.getTop());
                        cyVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!cyVar.W && cyVar.Y2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6), cyVar.g4);
                }
                cyVar.V = true;
            }
        }
        canvas2 = canvas;
        cyVar.x3 = 0.0f;
        cyVar.w3 = 0.0f;
        float min2 = cyVar.x3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!cyVar.K ? f7 : 0.0f)) + cyVar.N, cyVar.u3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!cyVar.K ? f7 : 0.0f)));
        cyVar.x3 = min2;
        cyVar.w3 = min2;
        wwVar = cyVar.G3;
        if (wwVar == null) {
        }
        rxVar = cyVar.X;
        if (rxVar != null) {
        }
        f11 = f10;
        cyVar.Q4();
        cy.K2(cyVar, f11);
        super.dispatchDraw(canvas);
        cy.L2(cyVar, canvas2, i11);
        icVar = cyVar.K0;
        if (icVar != null) {
            if (cyVar.K0.getAlpha() != f10) {
            }
        }
        if (!cyVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6), cyVar.g4);
        }
        cyVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.D0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cy cyVar = this.E0;
        if (view == cyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.kw0.v0) {
            return super.drawChild(canvas, view, j10);
        }
        ay[] ayVarArr = cyVar.e0;
        if (view == ayVarArr[0] || ((ayVarArr.length > 1 && view == ayVarArr[1]) || view == cyVar.J1 || view == cyVar.z0)) {
            canvas.save();
            if (view != cyVar.J1 && view != cyVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = cyVar.X3;
            if (f7 != 1.0f) {
                if (cyVar.Y3) {
                    canvas.translate((1.0f - cyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - cyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(D, D, 0.0f, (-getY()) + cyVar.N + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        if (view != kVar || cyVar.X3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (cyVar.Y3) {
            canvas.translate((1.0f - cyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float D2 = com.google.android.gms.internal.play_billing.k3.D(1.0f, cyVar.X3, 0.05f, 1.0f);
            canvas.translate((1.0f - cyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
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

    @Override // org.telegram.ui.Components.kw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.p5 p5Var = this.E0.E3;
        if (p5Var != null) {
            p5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.kw0, android.view.ViewGroup, android.view.View
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
        aw awVar;
        int actionMasked = motionEvent.getActionMasked();
        cy cyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            if (kVar.t()) {
                cyVar.Y0 = true;
            }
        }
        return Z() || ((awVar = cyVar.z0) != null && awVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.kw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        cy cyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        tw twVar;
        tw twVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ux uxVar = this;
        int childCount = uxVar.getChildCount();
        int R = uxVar.R();
        int i20 = 0;
        uxVar.setBottomClip(0);
        int measuredWidth = uxVar.getMeasuredWidth();
        int measuredHeight = uxVar.getMeasuredHeight();
        int i21 = 0;
        while (true) {
            cyVar = uxVar.E0;
            if (i21 >= childCount) {
                break;
            }
            View childAt = uxVar.getChildAt(i21);
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
                            i19 = layoutParams.topMargin + uxVar.getPaddingTop();
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != cyVar.X || childAt == cyVar.Z || childAt == (twVar2 = cyVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != cyVar.X && childAt != cyVar.E0 && childAt != cyVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (cyVar.K && childAt == cyVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            twVar = cyVar.E0;
                            if (childAt == twVar && twVar.getPremiumHint() != null) {
                                cyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.kk.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, cyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.kk.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == cyVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == cyVar.C0) {
                            i19 = -AndroidUtilities.dp(cyVar.a);
                        } else if (childAt instanceof nu) {
                            kVar3 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof ay) {
                            i19 = i20;
                        } else if (childAt == cyVar.J1 || childAt == cyVar.K1 || childAt == cyVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (twVar2 != null && twVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != cyVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != cyVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (cyVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    twVar = cyVar.E0;
                    if (childAt == twVar) {
                        cyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.kk.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, cyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.kk.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == cyVar.X) {
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
                if (childAt != cyVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != cyVar.X) {
                }
                if (cyVar.K) {
                }
                twVar = cyVar.E0;
                if (childAt == twVar) {
                }
                if (childAt == cyVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i21++;
            i20 = 0;
            uxVar = this;
        }
        lx lxVar = cyVar.C0;
        if (lxVar != null) {
            lxVar.setKeyboardHeight(R);
        }
        S();
        cyVar.V4();
        cyVar.Q4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        cy cyVar = this.E0;
        int i12 = cyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.u0 u0Var = cyVar.m0;
        if (u0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof nu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof ay) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (cyVar.G3.c()) {
                            if (cyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (cyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + cyVar.P;
                        if (cyVar.v3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = cyVar.Z3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        lx lxVar = cyVar.C0;
                        if (childAt == lxVar) {
                            lxVar.setTranslationY(cyVar.I0);
                            cyVar.C0.p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            cyVar.E3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            mw mwVar = cyVar.B1;
                            if (mwVar == null || !mwVar.s0(childAt)) {
                                if (childAt == cyVar.G3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = cyVar.Z3 ? (int) (size4 * 0.05f) : 0;
                                    cyVar.G3.setTransitionPaddingBottom(i16);
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
            post(new tx(this, 1));
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
        org.telegram.ui.ActionBar.d5 d5Var;
        aw awVar;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        ih.f fVar;
        cy cyVar = this.E0;
        d5Var = ((org.telegram.ui.ActionBar.n2) cyVar).parentLayout;
        Object[] objArr = 0;
        if (d5Var != null && (awVar = cyVar.z0) != null && !awVar.n && !cyVar.j2 && !cyVar.G3.c()) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) cyVar).parentLayout;
            if (!((ActionBarLayout) d5Var2).j()) {
                d5Var3 = ((org.telegram.ui.ActionBar.n2) cyVar).parentLayout;
                if (!((ActionBarLayout) d5Var3).y()) {
                    d5Var4 = ((org.telegram.ui.ActionBar.n2) cyVar).parentLayout;
                    if (!((ActionBarLayout) d5Var4).n && (motionEvent == null || cyVar.m3 || (motionEvent.getY() > a0() + b0() && ((fVar = cyVar.y1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < cyVar.y1.getY())))) {
                        if (cyVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    ay ayVar = cyVar.e0[0];
                                    if (ayVar != null) {
                                        int i12 = ayVar.d.h;
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
                            cyVar.m3 = true;
                            this.x0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.y0 = x10;
                            if (cyVar.i3) {
                                if (x10 < cyVar.e0[0].getTranslationX() + cyVar.e0[0].getMeasuredWidth()) {
                                    cyVar.j3 = cyVar.e0[0].getTranslationX();
                                } else {
                                    ay[] ayVarArr = cyVar.e0;
                                    ay ayVar2 = ayVarArr[0];
                                    ay ayVar3 = ayVarArr[1];
                                    ayVarArr[0] = ayVar3;
                                    ayVarArr[1] = ayVar2;
                                    cyVar.i3 = false;
                                    cyVar.j3 = ayVar3.getTranslationX();
                                    cyVar.z0.g(1.0f, cyVar.e0[0].h);
                                    cyVar.z0.g(cyVar.j3 / r10[0].getMeasuredWidth(), cyVar.e0[1].h);
                                    cyVar.P4(true);
                                    cyVar.e0[0].d.getClass();
                                    cyVar.e0[1].d.getClass();
                                }
                            } else if (x10 < cyVar.e0[1].getTranslationX() + cyVar.e0[1].getMeasuredWidth()) {
                                ay[] ayVarArr2 = cyVar.e0;
                                ay ayVar4 = ayVarArr2[0];
                                ay ayVar5 = ayVarArr2[1];
                                ayVarArr2[0] = ayVar5;
                                ayVarArr2[1] = ayVar4;
                                cyVar.i3 = true;
                                cyVar.j3 = ayVar5.getTranslationX();
                                cyVar.z0.g(1.0f, cyVar.e0[0].h);
                                cyVar.z0.g((-cyVar.j3) / r10[0].getMeasuredWidth(), cyVar.e0[1].h);
                                cyVar.P4(true);
                                cyVar.e0[0].d.getClass();
                                cyVar.e0[1].d.getClass();
                            } else {
                                cyVar.j3 = cyVar.e0[0].getTranslationX();
                            }
                            cyVar.g3.removeAllListeners();
                            cyVar.g3.cancel();
                            cyVar.h3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            cyVar.j3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !cyVar.m3 && !cyVar.n3 && cyVar.z0.getVisibility() == 0) {
                            this.x0 = motionEvent.getPointerId(0);
                            cyVar.n3 = true;
                            this.y0 = (int) motionEvent.getX();
                            this.z0 = (int) motionEvent.getY();
                            this.A0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                            int x11 = (int) ((motionEvent.getX() - this.y0) + cyVar.j3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.z0);
                            if (cyVar.m3 && (((z10 = cyVar.i3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    cyVar.n3 = true;
                                    cyVar.m3 = false;
                                    cyVar.e0[0].setTranslationX(0.0f);
                                    cyVar.e0[1].setTranslationX(cyVar.i3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    cyVar.z0.g(0.0f, cyVar.e0[1].h);
                                }
                            }
                            if (cyVar.n3 && !cyVar.m3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.y0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (cyVar.m3) {
                                cyVar.e0[0].setTranslationX(x11);
                                if (cyVar.i3) {
                                    cyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    cyVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / cyVar.e0[0].getMeasuredWidth();
                                ay ayVar6 = cyVar.e0[1];
                                if (ayVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    cyVar.z0.i(cyVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new tx(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                cyVar.z0.g(abs2, ayVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.A0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, cyVar.l3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.A0.getXVelocity();
                                f10 = this.A0.getYVelocity();
                                if (!cyVar.m3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    c0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (cyVar.m3) {
                                float x13 = cyVar.e0[0].getX();
                                cyVar.g3 = new AnimatorSet();
                                if (cyVar.e0[1].E) {
                                    cyVar.k3 = true;
                                } else if (cyVar.j3 == 0.0f) {
                                    cyVar.k3 = Math.abs(x13) < ((float) cyVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = cyVar.i3 ? false : false;
                                    cyVar.k3 = z11;
                                } else if (cyVar.i3) {
                                    cyVar.k3 = cyVar.e0[1].getX() > ((float) (cyVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    cyVar.k3 = cyVar.e0[0].getX() < ((float) (cyVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = cyVar.k3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (cyVar.i3) {
                                        cyVar.g3.playTogether(ObjectAnimator.ofFloat(cyVar.e0[0], (Property<ay, Float>) property, 0.0f), ObjectAnimator.ofFloat(cyVar.e0[1], (Property<ay, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        cyVar.g3.playTogether(ObjectAnimator.ofFloat(cyVar.e0[0], (Property<ay, Float>) property, 0.0f), ObjectAnimator.ofFloat(cyVar.e0[1], (Property<ay, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = cyVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (cyVar.i3) {
                                        cyVar.g3.playTogether(ObjectAnimator.ofFloat(cyVar.e0[0], (Property<ay, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(cyVar.e0[1], (Property<ay, Float>) property, 0.0f));
                                    } else {
                                        cyVar.g3.playTogether(ObjectAnimator.ofFloat(cyVar.e0[0], (Property<ay, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(cyVar.e0[1], (Property<ay, Float>) property, 0.0f));
                                    }
                                }
                                cyVar.g3.setInterpolator(cy.z4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                cyVar.g3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                cyVar.g3.addListener(new org.telegram.ui.Components.o31(this, 24));
                                cyVar.g3.start();
                                cyVar.h3 = true;
                                cyVar.m3 = false;
                            } else {
                                cyVar.n3 = false;
                                kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                                kVar.setEnabled(true);
                                cyVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.A0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.A0 = null;
                            }
                        }
                        return cyVar.m3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        cy cyVar = this.E0;
        if (cyVar.n3 && !cyVar.m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
