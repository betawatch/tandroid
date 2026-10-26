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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tx extends org.telegram.ui.Components.vw0 {
    public final Paint l0;
    public int m0;
    public int n0;
    public int o0;
    public VelocityTracker p0;
    public final Rect q0;
    public boolean r0;
    public final pe.b s0;
    public final /* synthetic */ cy t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(Context context, cy cyVar) {
        super(context, null);
        this.t0 = cyVar;
        this.l0 = new Paint(1);
        this.q0 = new Rect();
        this.s0 = new pe.b(new f(this, 15));
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
    
        if (org.telegram.ui.ActionBar.y6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.vw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            cy cyVar = this.t0;
            if (cyVar.l4 != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.r2) cyVar).resourceProvider;
                if (gh.c.c(i10, u6Var)) {
                    u6Var2 = ((org.telegram.ui.ActionBar.r2) cyVar).resourceProvider;
                    if (u6Var2 != null) {
                        u6Var3 = ((org.telegram.ui.ActionBar.r2) cyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    cyVar.l4.w(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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

    @Override // org.telegram.ui.Components.vw0
    public final void K(Canvas canvas, ArrayList arrayList) {
        jx jxVar;
        org.telegram.ui.Components.mm0 p10;
        cy cyVar = this.t0;
        if (cyVar.q3 && (jxVar = cyVar.C0) != null && jxVar.getVisibility() == 0) {
            jx jxVar2 = cyVar.C0;
            View[] viewArr = jxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.u91.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p10.getChildCount(); i11++) {
                        View childAt = p10.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p10.getY() + viewArr[i10].getY() + jxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vw0
    public final void L() {
        oi.q qVar;
        super.L();
        qVar = ((org.telegram.ui.ActionBar.r2) this.t0).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        cy cyVar = this.t0;
        if (!cyVar.h3) {
            return false;
        }
        if (!cyVar.k3) {
            if (Math.abs(cyVar.e0[1].getTranslationX()) < 1.0f) {
                cyVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (cyVar.i3 ? -1 : 1));
                cyVar.e0[1].setTranslationX(0.0f);
                cy.g1(cyVar, true);
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
            cy.g1(cyVar, true);
            animatorSet = cyVar.g3;
            if (animatorSet != null) {
                animatorSet.cancel();
                cyVar.g3 = null;
            }
            cyVar.h3 = false;
        }
        return cyVar.h3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        cy cyVar = this.t0;
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        float height = kVar.getHeight();
        tw twVar = cyVar.G3;
        float f7 = (twVar == null || !twVar.c()) ? 0.0f : cyVar.G3.e;
        if (cyVar.K) {
            height = c3.h0.z(1.0f, cyVar.u3, (1.0f - f7) * (1.0f - cyVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) c3.h0.z(1.0f, f7, (1.0f - cyVar.x1) * (1.0f - cyVar.u3) * AndroidUtilities.dp(48.0f), height + cyVar.T);
    }

    public final int Z() {
        cy cyVar = this.t0;
        float f7 = cyVar.N;
        tw twVar = cyVar.G3;
        return (int) c3.h0.z(1.0f, cyVar.x1, org.telegram.messenger.t.A(1.0f, (twVar == null || !twVar.c()) ? 0.0f : cyVar.G3.e, 1.0f - cyVar.u3, f7), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        cy cyVar = this.t0;
        qx qxVar = cyVar.z0;
        int i10 = qxVar.j0.get(qxVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        cyVar.n3 = false;
        cyVar.m3 = true;
        this.n0 = (int) (motionEvent.getX() + cyVar.j3);
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        kVar.setEnabled(false);
        cyVar.z0.setEnabled(false);
        ay ayVar = cyVar.e0[1];
        ayVar.h = i10;
        ayVar.setVisibility(0);
        cyVar.i3 = z10;
        cy.g1(cyVar, false);
        cyVar.Z4(true);
        if (z10) {
            cyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        cyVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r1 == 1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0202  */
    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        oi.q qVar;
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        Canvas canvas2;
        tw twVar;
        ox oxVar;
        float f11;
        bi.cc ccVar;
        float f12;
        ox oxVar2;
        org.telegram.ui.ActionBar.k kVar;
        tw twVar2;
        cy cyVar = this.t0;
        Paint paint = cyVar.f1;
        qVar = ((org.telegram.ui.ActionBar.r2) cyVar).glassEngine;
        qVar.g();
        if (cyVar.Q && (((twVar2 = cyVar.G3) == null || !twVar2.c()) && cyVar.u3 == 0.0f)) {
            cyVar.Q = false;
            int i10 = (cyVar.h4() && cyVar.e0[0].s == 0) ? 1 : 0;
            wx wxVar = cyVar.e0[0].a;
            if (cyVar.R) {
                if (!cyVar.b1) {
                    if (i10 == 0) {
                        cyVar.R = false;
                    }
                    if (cyVar.R) {
                        s4.e1 L = wxVar.L(0, false);
                        if (L == null) {
                            cyVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= wxVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                cyVar.R = false;
                            } else if (view.getTop() >= wxVar.getPaddingTop()) {
                                cyVar.R = false;
                            }
                        }
                        if (cyVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.e1 L2 = wxVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = wxVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -cyVar.b4();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    cyVar.K4(f13);
                } else {
                    cyVar.K4(0.0f);
                }
            } else {
                cyVar.K4(-cyVar.b4());
            }
        }
        int Y = Y();
        z10 = ((org.telegram.ui.ActionBar.r2) cyVar).inPreviewMode;
        int Z = z10 ? AndroidUtilities.statusBarHeight : Z();
        int i11 = Z + Y;
        cyVar.G3.setCurrentTop(i11);
        boolean z12 = cyVar.s3;
        Rect rect = this.q0;
        Paint paint2 = this.l0;
        if (z12) {
            float f15 = cyVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            } else if (f15 == 0.0f && (oxVar2 = cyVar.X) != null) {
                oxVar2.setTranslationY(cyVar.e4() + cyVar.N);
            }
            rect.set(0, Z, getMeasuredWidth(), i11 - AndroidUtilities.dp(cyVar.x1 * 2.0f));
            float f16 = cyVar.x1;
            if (f16 < 0.0f) {
                if (f16 == 1.0f) {
                    paint = paint2;
                }
                f7 = 81.0f;
                f10 = 1.0f;
                H(canvas, 0.0f, this.q0, paint, true);
            } else {
                f7 = 81.0f;
                f10 = 1.0f;
            }
            float f17 = cyVar.x1;
            if (f17 > 0.0f && f17 < f10) {
                paint2.setColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                if (!cyVar.q3 && cyVar.r3) {
                    rect.set(0, Z, getMeasuredWidth(), i11 - AndroidUtilities.dp(cyVar.x1 * 2.0f));
                    H(canvas, 0.0f, this.q0, paint2, true);
                }
                ox oxVar3 = cyVar.X;
                if (oxVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                    int height = kVar.getHeight();
                    oxVar3.setTranslationY(cyVar.e4() + (i11 - (height + (cyVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 81.0f;
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.r2) cyVar).inPreviewMode;
            if (!z11) {
                if (cyVar.u3 > 0.0f) {
                    paint2.setColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i11 - AndroidUtilities.dp(cyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.q0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i11 - AndroidUtilities.dp(cyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.q0, paint, true);
                }
                cyVar.x3 = 0.0f;
                cyVar.w3 = 0.0f;
                float min = cyVar.x3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!cyVar.K ? f7 : 0.0f)) + cyVar.N, cyVar.u3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!cyVar.K ? f7 : 0.0f)));
                cyVar.x3 = min;
                cyVar.w3 = min;
                twVar = cyVar.G3;
                if (twVar == null && twVar.c()) {
                    float f18 = cyVar.G3.e;
                    float b42 = cyVar.x3 - ((cyVar.b4() + cyVar.N) * f18);
                    cyVar.x3 = b42;
                    cyVar.w3 = b42;
                    float clamp = cyVar.G0 ? f10 - Utilities.clamp(f18 / 0.5f, f10, 0.0f) : f10;
                    qx qxVar = cyVar.z0;
                    if (qxVar != null && qxVar.getVisibility() == 0) {
                        cyVar.x3 -= (f10 - cyVar.r.e) * cyVar.z0.getMeasuredHeight();
                    }
                    ox oxVar4 = cyVar.X;
                    if (oxVar4 != null) {
                        oxVar4.setTranslationY(cyVar.e4() + AndroidUtilities.lerp(cyVar.N + cyVar.x3, -AndroidUtilities.dp(cyVar.K ? f7 : 0.0f), f18));
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
                    oxVar = cyVar.X;
                    if (oxVar != null) {
                        oxVar.setTranslationY(AndroidUtilities.lerp(((cyVar.N + cyVar.x3) + cyVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((cyVar.K ? 81 : 0) + 48), cyVar.x1));
                    }
                    f11 = f10;
                }
                cyVar.a5();
                cy.U2(cyVar, f11);
                super.dispatchDraw(canvas);
                cy.V2(cyVar, canvas2, i11);
                ccVar = cyVar.K0;
                if (ccVar != null && ccVar.getVisibility() == 0) {
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
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6), cyVar.g4);
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
        twVar = cyVar.G3;
        if (twVar == null) {
        }
        oxVar = cyVar.X;
        if (oxVar != null) {
        }
        f11 = f10;
        cyVar.a5();
        cy.U2(cyVar, f11);
        super.dispatchDraw(canvas);
        cy.V2(cyVar, canvas2, i11);
        ccVar = cyVar.K0;
        if (ccVar != null) {
            if (cyVar.K0.getAlpha() != f10) {
            }
        }
        if (!cyVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6), cyVar.g4);
        }
        cyVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.s0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cy cyVar = this.t0;
        if (view == cyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.vw0.k0) {
            return super.drawChild(canvas, view, j10);
        }
        ay[] ayVarArr = cyVar.e0;
        if (view == ayVarArr[0] || ((ayVarArr.length > 1 && view == ayVarArr[1]) || view == cyVar.J1 || view == cyVar.z0)) {
            canvas.save();
            if (view != cyVar.J1 && view != cyVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = cyVar.X3;
            if (f7 != 1.0f) {
                if (cyVar.Y3) {
                    canvas.translate((1.0f - cyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float d = ic.a.d(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - cyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(d, d, 0.0f, (-getY()) + cyVar.N + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        if (view != kVar || cyVar.X3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (cyVar.Y3) {
            canvas.translate((1.0f - cyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float d10 = ic.a.d(1.0f, cyVar.X3, 0.05f, 1.0f);
            canvas.translate((1.0f - cyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            canvas.scale(d10, d10, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.r5 r5Var = this.t0.E3;
        if (r5Var != null) {
            r5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r5 r5Var = this.t0.E3;
        if (r5Var != null) {
            r5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        qx qxVar;
        int actionMasked = motionEvent.getActionMasked();
        cy cyVar = this.t0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            if (kVar.q()) {
                cyVar.Y0 = true;
            }
        }
        return X() || ((qxVar = cyVar.z0) != null && qxVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.vw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        qw qwVar;
        qw qwVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        tx txVar = this;
        int childCount = txVar.getChildCount();
        int Q = txVar.Q();
        int i20 = 0;
        txVar.setBottomClip(0);
        int measuredWidth = txVar.getMeasuredWidth();
        int measuredHeight = txVar.getMeasuredHeight();
        int i21 = 0;
        while (true) {
            cyVar = txVar.t0;
            if (i21 >= childCount) {
                break;
            }
            View childAt = txVar.getChildAt(i21);
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
                            i19 = layoutParams.topMargin + txVar.getPaddingTop();
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != cyVar.X || childAt == cyVar.Z || childAt == (qwVar2 = cyVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != cyVar.X && childAt != cyVar.E0 && childAt != cyVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (cyVar.K && childAt == cyVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            qwVar = cyVar.E0;
                            if (childAt == qwVar && qwVar.getPremiumHint() != null) {
                                cyVar.E0.getPremiumHint().layout(i16, d3.w(54.0f, i19, measuredHeight2), i16 + measuredWidth2, cyVar.E0.getPremiumHint().getMeasuredHeight() + d3.w(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == cyVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == cyVar.C0) {
                            i19 = -AndroidUtilities.dp(cyVar.a);
                        } else if (childAt instanceof nu) {
                            kVar3 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof ay) {
                            i19 = i20;
                        } else if (childAt == cyVar.J1 || childAt == cyVar.K1 || childAt == cyVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (qwVar2 != null && qwVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != cyVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != cyVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (cyVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    qwVar = cyVar.E0;
                    if (childAt == qwVar) {
                        cyVar.E0.getPremiumHint().layout(i16, d3.w(54.0f, i19, measuredHeight2), i16 + measuredWidth2, cyVar.E0.getPremiumHint().getMeasuredHeight() + d3.w(54.0f, i19, measuredHeight2));
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
                kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != cyVar.X) {
                }
                if (cyVar.K) {
                }
                qwVar = cyVar.E0;
                if (childAt == qwVar) {
                }
                if (childAt == cyVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i21++;
            i20 = 0;
            txVar = this;
        }
        jx jxVar = cyVar.C0;
        if (jxVar != null) {
            jxVar.setKeyboardHeight(Q);
        }
        R();
        cyVar.g5();
        cyVar.a5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        cy cyVar = this.t0;
        int i12 = cyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = cyVar.m0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof nu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
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
                        jx jxVar = cyVar.C0;
                        if (childAt == jxVar) {
                            jxVar.setTranslationY(cyVar.I0);
                            cyVar.C0.r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            cyVar.O3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            jw jwVar = cyVar.B1;
                            if (jwVar == null || !jwVar.r0(childAt)) {
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
        if (z10 != this.r0) {
            post(new sx(this, 1));
            this.r0 = z10;
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
        org.telegram.ui.ActionBar.j5 j5Var;
        qx qxVar;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.j5 j5Var3;
        org.telegram.ui.ActionBar.j5 j5Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        jh.f fVar;
        cy cyVar = this.t0;
        j5Var = ((org.telegram.ui.ActionBar.r2) cyVar).parentLayout;
        Object[] objArr = 0;
        if (j5Var != null && (qxVar = cyVar.z0) != null && !qxVar.n && !cyVar.j2 && !cyVar.G3.c()) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) cyVar).parentLayout;
            if (!((ActionBarLayout) j5Var2).i()) {
                j5Var3 = ((org.telegram.ui.ActionBar.r2) cyVar).parentLayout;
                if (!((ActionBarLayout) j5Var3).x()) {
                    j5Var4 = ((org.telegram.ui.ActionBar.r2) cyVar).parentLayout;
                    if (!((ActionBarLayout) j5Var4).n && (motionEvent == null || cyVar.m3 || (motionEvent.getY() > Y() + Z() && ((fVar = cyVar.y1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < cyVar.y1.getY())))) {
                        if (cyVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
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
                            if (this.p0 == null) {
                                this.p0 = VelocityTracker.obtain();
                            }
                            this.p0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && X()) {
                            cyVar.m3 = true;
                            this.m0 = motionEvent.getPointerId(0);
                            int x9 = (int) motionEvent.getX();
                            this.n0 = x9;
                            if (cyVar.i3) {
                                if (x9 < cyVar.e0[0].getTranslationX() + cyVar.e0[0].getMeasuredWidth()) {
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
                                    cyVar.Z4(true);
                                    cyVar.e0[0].d.getClass();
                                    cyVar.e0[1].d.getClass();
                                }
                            } else if (x9 < cyVar.e0[1].getTranslationX() + cyVar.e0[1].getMeasuredWidth()) {
                                ay[] ayVarArr2 = cyVar.e0;
                                ay ayVar4 = ayVarArr2[0];
                                ay ayVar5 = ayVarArr2[1];
                                ayVarArr2[0] = ayVar5;
                                ayVarArr2[1] = ayVar4;
                                cyVar.i3 = true;
                                cyVar.j3 = ayVar5.getTranslationX();
                                cyVar.z0.g(1.0f, cyVar.e0[0].h);
                                cyVar.z0.g((-cyVar.j3) / r10[0].getMeasuredWidth(), cyVar.e0[1].h);
                                cyVar.Z4(true);
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
                            this.m0 = motionEvent.getPointerId(0);
                            cyVar.n3 = true;
                            this.n0 = (int) motionEvent.getX();
                            this.o0 = (int) motionEvent.getY();
                            this.p0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.m0) {
                            int x10 = (int) ((motionEvent.getX() - this.n0) + cyVar.j3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.o0);
                            if (cyVar.m3 && (((z10 = cyVar.i3) && x10 > 0) || (!z10 && x10 < 0))) {
                                if (!a0(motionEvent, x10 < 0)) {
                                    cyVar.n3 = true;
                                    cyVar.m3 = false;
                                    cyVar.e0[0].setTranslationX(0.0f);
                                    cyVar.e0[1].setTranslationX(cyVar.i3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    cyVar.z0.g(0.0f, cyVar.e0[1].h);
                                }
                            }
                            if (cyVar.n3 && !cyVar.m3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x11 = (int) (motionEvent.getX() - this.n0);
                                if (Math.abs(x11) >= pixelsInCM && Math.abs(x11) > abs) {
                                    a0(motionEvent, x10 < 0);
                                }
                            } else if (cyVar.m3) {
                                cyVar.e0[0].setTranslationX(x10);
                                if (cyVar.i3) {
                                    cyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x10);
                                } else {
                                    cyVar.e0[1].setTranslationX(x10 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x10) / cyVar.e0[0].getMeasuredWidth();
                                ay ayVar6 = cyVar.e0[1];
                                if (ayVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    cyVar.z0.i(cyVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new sx(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                cyVar.z0.g(abs2, ayVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.m0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.p0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, cyVar.l3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.p0.getXVelocity();
                                f10 = this.p0.getYVelocity();
                                if (!cyVar.m3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    a0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (cyVar.m3) {
                                float x12 = cyVar.e0[0].getX();
                                cyVar.g3 = new AnimatorSet();
                                if (cyVar.e0[1].E) {
                                    cyVar.k3 = true;
                                } else if (cyVar.j3 == 0.0f) {
                                    cyVar.k3 = Math.abs(x12) < ((float) cyVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
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
                                    measuredWidth = Math.abs(x12);
                                    if (cyVar.i3) {
                                        cyVar.g3.playTogether(ObjectAnimator.ofFloat(cyVar.e0[0], (Property<ay, Float>) property, 0.0f), ObjectAnimator.ofFloat(cyVar.e0[1], (Property<ay, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        cyVar.g3.playTogether(ObjectAnimator.ofFloat(cyVar.e0[0], (Property<ay, Float>) property, 0.0f), ObjectAnimator.ofFloat(cyVar.e0[1], (Property<ay, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = cyVar.e0[0].getMeasuredWidth() - Math.abs(x12);
                                    if (cyVar.i3) {
                                        cyVar.g3.playTogether(ObjectAnimator.ofFloat(cyVar.e0[0], (Property<ay, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(cyVar.e0[1], (Property<ay, Float>) property, 0.0f));
                                    } else {
                                        cyVar.g3.playTogether(ObjectAnimator.ofFloat(cyVar.e0[0], (Property<ay, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(cyVar.e0[1], (Property<ay, Float>) property, 0.0f));
                                    }
                                }
                                cyVar.g3.setInterpolator(cy.A4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                cyVar.g3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                cyVar.g3.addListener(new org.telegram.ui.Components.h31(this, 26));
                                cyVar.g3.start();
                                cyVar.h3 = true;
                                cyVar.m3 = false;
                            } else {
                                cyVar.n3 = false;
                                kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                                kVar.setEnabled(true);
                                cyVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.p0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.p0 = null;
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
        cy cyVar = this.t0;
        if (cyVar.n3 && !cyVar.m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
