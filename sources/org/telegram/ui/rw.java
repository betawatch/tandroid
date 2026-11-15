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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rw extends org.telegram.ui.Components.st0 {
    public final Paint g0;
    public int h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public final Rect l0;
    public boolean m0;
    public final org.telegram.ui.Cells.k9 n0;
    public final /* synthetic */ yw o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(Context context, yw ywVar) {
        super(context, null);
        this.o0 = ywVar;
        this.g0 = new Paint(1);
        this.l0 = new Rect();
        this.n0 = new org.telegram.ui.Cells.k9(new f(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = org.telegram.messenger.ns.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = org.telegram.messenger.ns.t3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.j6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.st0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.gz.f()) {
            yw ywVar = this.o0;
            if (ywVar.m4 != null) {
                i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
                if (c8.g0.c(i7, e6Var)) {
                    e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
                    if (e6Var2 != null) {
                        e6Var3 = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    ywVar.m4.b0(rect.left, rect.top + f10, rect.right, rect.bottom + f10, canvas);
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
        hw hwVar;
        org.telegram.ui.Components.uj0 m10;
        yw ywVar = this.o0;
        if (ywVar.s3 && (hwVar = ywVar.D0) != null && hwVar.getVisibility() == 0) {
            hw hwVar2 = ywVar.D0;
            View[] viewArr = hwVar2.e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (m10 = org.telegram.ui.Components.w61.m(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < m10.getChildCount(); i10++) {
                        View childAt = m10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + m10.getY() + viewArr[i7].getY() + hwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.st0
    public final void K() {
        ri.q qVar;
        org.telegram.messenger.gz.f();
        qVar = ((org.telegram.ui.ActionBar.e2) this.o0).glassEngine;
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
        yw ywVar = this.o0;
        if (!ywVar.j3) {
            return false;
        }
        if (!ywVar.m3) {
            if (Math.abs(ywVar.f0[1].getTranslationX()) < 1.0f) {
                ywVar.f0[0].setTranslationX(r1.getMeasuredWidth() * (ywVar.k3 ? -1 : 1));
                ywVar.f0[1].setTranslationX(0.0f);
                yw.j1(ywVar, true);
                animatorSet = ywVar.i3;
                if (animatorSet != null) {
                }
                ywVar.j3 = false;
            }
            return ywVar.j3;
        }
        if (Math.abs(ywVar.f0[0].getTranslationX()) < 1.0f) {
            ywVar.f0[0].setTranslationX(0.0f);
            ywVar.f0[1].setTranslationX(r1[0].getMeasuredWidth() * (ywVar.k3 ? 1 : -1));
            yw.j1(ywVar, true);
            animatorSet = ywVar.i3;
            if (animatorSet != null) {
                animatorSet.cancel();
                ywVar.i3 = null;
            }
            ywVar.j3 = false;
        }
        return ywVar.j3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        yw ywVar = this.o0;
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        float height = kVar.getHeight();
        uv uvVar = ywVar.H3;
        float f10 = (uvVar == null || !uvVar.c()) ? 0.0f : ywVar.H3.e;
        if (ywVar.L) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, ywVar.w3, (1.0f - f10) * (1.0f - ywVar.z1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f10, (1.0f - ywVar.z1) * (1.0f - ywVar.w3) * org.telegram.messenger.g0.L(48.0f), height + ywVar.U);
    }

    public final int Z() {
        yw ywVar = this.o0;
        float f10 = ywVar.O;
        uv uvVar = ywVar.H3;
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, ywVar.z1, org.telegram.messenger.k5.A(1.0f, (uvVar == null || !uvVar.c()) ? 0.0f : ywVar.H3.e, 1.0f - ywVar.w3, f10), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        yw ywVar = this.o0;
        ow owVar = ywVar.A0;
        int i7 = owVar.k0.get(owVar.L + (z10 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        ywVar.p3 = false;
        ywVar.o3 = true;
        this.i0 = (int) (motionEvent.getX() + ywVar.l3);
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        kVar.setEnabled(false);
        ywVar.A0.setEnabled(false);
        xw xwVar = ywVar.f0[1];
        xwVar.h = i7;
        xwVar.setVisibility(0);
        ywVar.k3 = z10;
        yw.j1(ywVar, false);
        ywVar.d5(true);
        if (z10) {
            ywVar.f0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        ywVar.f0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
        ri.q qVar;
        boolean z10;
        float f10;
        boolean z11;
        Canvas canvas2;
        uv uvVar;
        nw nwVar;
        float f11;
        rv rvVar;
        float f12;
        nw nwVar2;
        float f13;
        org.telegram.ui.ActionBar.k kVar;
        uv uvVar2;
        yw ywVar = this.o0;
        Paint paint = ywVar.h1;
        qVar = ((org.telegram.ui.ActionBar.e2) ywVar).glassEngine;
        qVar.g();
        if (ywVar.R && (((uvVar2 = ywVar.H3) == null || !uvVar2.c()) && ywVar.w3 == 0.0f)) {
            ywVar.R = false;
            int i7 = (ywVar.l4() && ywVar.f0[0].s == 0) ? 1 : 0;
            uw uwVar = ywVar.f0[0].a;
            if (ywVar.S) {
                if (!ywVar.d1) {
                    if (i7 == 0) {
                        ywVar.S = false;
                    }
                    if (ywVar.S) {
                        v4.e1 L = uwVar.L(0, false);
                        if (L == null) {
                            ywVar.S = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= uwVar.getPaddingTop() - org.telegram.messenger.g0.L(81.0f)) {
                                ywVar.S = false;
                            } else if (view.getTop() >= uwVar.getPaddingTop()) {
                                ywVar.S = false;
                            }
                        }
                        if (ywVar.S) {
                        }
                    }
                }
                i7 = 0;
            }
            v4.e1 L2 = uwVar.L(i7, false);
            if (L2 != null) {
                float paddingTop = uwVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -ywVar.f4();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    ywVar.O4(f14);
                } else {
                    ywVar.O4(0.0f);
                }
            } else {
                ywVar.O4(-ywVar.f4());
            }
        }
        int Y = Y();
        z10 = ((org.telegram.ui.ActionBar.e2) ywVar).inPreviewMode;
        int Z = z10 ? org.telegram.messenger.g0.m : Z();
        int i10 = Z + Y;
        ywVar.H3.setCurrentTop(i10);
        boolean z12 = ywVar.u3;
        Rect rect = this.l0;
        Paint paint2 = this.g0;
        if (z12) {
            float f16 = ywVar.z1;
            if (f16 == 1.0f) {
                paint2.setColor(ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            } else if (f16 == 0.0f && (nwVar2 = ywVar.Y) != null) {
                nwVar2.setTranslationY(ywVar.i4() + ywVar.O);
            }
            rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(ywVar.z1 * 2.0f));
            float f17 = ywVar.z1;
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
            float f18 = ywVar.z1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (!ywVar.s3 && ywVar.t3) {
                    rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(ywVar.z1 * f13));
                    H(canvas, 0.0f, this.l0, paint2, true);
                }
                nw nwVar3 = ywVar.Y;
                if (nwVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                    int height = kVar.getHeight();
                    nwVar3.setTranslationY(ywVar.i4() + (i10 - (height + (ywVar.A0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.e2) ywVar).inPreviewMode;
            if (!z11) {
                if (ywVar.w3 > 0.0f) {
                    paint2.setColor(ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(ywVar.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(ywVar.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint, true);
                }
                ywVar.z3 = 0.0f;
                ywVar.y3 = 0.0f;
                float min = ywVar.z3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!ywVar.L ? 81.0f : 0.0f)) + ywVar.O, ywVar.w3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!ywVar.L ? 81.0f : 0.0f)));
                ywVar.z3 = min;
                ywVar.y3 = min;
                uvVar = ywVar.H3;
                if (uvVar == null && uvVar.c()) {
                    float f19 = ywVar.H3.e;
                    float f42 = ywVar.z3 - ((ywVar.f4() + ywVar.O) * f19);
                    ywVar.z3 = f42;
                    ywVar.y3 = f42;
                    float i11 = ywVar.H0 ? f10 - Utilities.i(f19 / 0.5f, f10, 0.0f) : f10;
                    ow owVar = ywVar.A0;
                    if (owVar != null && owVar.getVisibility() == 0) {
                        ywVar.z3 -= (f10 - ywVar.r.e) * ywVar.A0.getMeasuredHeight();
                    }
                    nw nwVar4 = ywVar.Y;
                    if (nwVar4 != null) {
                        nwVar4.setTranslationY(ywVar.i4() + org.telegram.messenger.g0.T1(ywVar.O + ywVar.z3, -org.telegram.messenger.g0.L(ywVar.L ? 81.0f : 0.0f), f19));
                    }
                    if (ywVar.E) {
                        float f20 = ywVar.F ? 0.0f : ywVar.O;
                        f12 = -org.telegram.messenger.g0.T1(-f20, f20, ywVar.H3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    ywVar.f0[0].setTranslationY(f12 - (((ywVar.L ? org.telegram.messenger.g0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f)) * ywVar.H3.e));
                    f11 = i11;
                } else {
                    nwVar = ywVar.Y;
                    if (nwVar != null) {
                        nwVar.setTranslationY(org.telegram.messenger.g0.T1(((ywVar.O + ywVar.z3) + ywVar.U) - org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L((ywVar.L ? 81 : 0) + 48), ywVar.z1));
                    }
                    f11 = f10;
                }
                ywVar.e5();
                yw.X2(ywVar, f11);
                super.dispatchDraw(canvas);
                yw.Y2(ywVar, canvas2, i10);
                rvVar = ywVar.L0;
                if (rvVar != null && rvVar.getVisibility() == 0) {
                    if (ywVar.L0.getAlpha() != f10) {
                        ywVar.L0.draw(canvas2);
                    } else if (ywVar.L0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(ywVar.L0.getLeft(), ywVar.L0.getTop(), ywVar.L0.getRight(), ywVar.L0.getBottom(), (int) (ywVar.L0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(ywVar.L0.getLeft(), ywVar.L0.getTop());
                        ywVar.L0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!ywVar.X && ywVar.a3 == 0) {
                    org.telegram.messenger.g0.O(canvas2, this, ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), ywVar.h4, f10);
                }
                ywVar.W = true;
            }
        }
        canvas2 = canvas;
        ywVar.z3 = 0.0f;
        ywVar.y3 = 0.0f;
        float min2 = ywVar.z3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!ywVar.L ? 81.0f : 0.0f)) + ywVar.O, ywVar.w3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!ywVar.L ? 81.0f : 0.0f)));
        ywVar.z3 = min2;
        ywVar.y3 = min2;
        uvVar = ywVar.H3;
        if (uvVar == null) {
        }
        nwVar = ywVar.Y;
        if (nwVar != null) {
        }
        f11 = f10;
        ywVar.e5();
        yw.X2(ywVar, f11);
        super.dispatchDraw(canvas);
        yw.Y2(ywVar, canvas2, i10);
        rvVar = ywVar.L0;
        if (rvVar != null) {
            if (ywVar.L0.getAlpha() != f10) {
            }
        }
        if (!ywVar.X) {
            org.telegram.messenger.g0.O(canvas2, this, ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), ywVar.h4, f10);
        }
        ywVar.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.n0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar = this.o0;
        if (view == ywVar.L0) {
            return true;
        }
        if (org.telegram.ui.Components.st0.f0) {
            return super.drawChild(canvas, view, j3);
        }
        xw[] xwVarArr = ywVar.f0;
        if (view == xwVarArr[0] || ((xwVarArr.length > 1 && view == xwVarArr[1]) || view == ywVar.L1 || view == ywVar.A0)) {
            canvas.save();
            if (view != ywVar.L1 && view != ywVar.A0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = ywVar.Y3;
            if (f10 != 1.0f) {
                if (ywVar.Z3) {
                    canvas.translate((1.0f - ywVar.Y3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - ywVar.Y3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    canvas.scale(t6, t6, 0.0f, (-getY()) + ywVar.O + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        if (view != kVar || ywVar.Y3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (ywVar.Z3) {
            canvas.translate((1.0f - ywVar.Y3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
        } else {
            float t10 = com.google.android.gms.internal.vision.e2.t(1.0f, ywVar.Y3, 0.05f, 1.0f);
            canvas.translate((1.0f - ywVar.Y3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
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

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.e5 e5Var = this.o0.F3;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e5 e5Var = this.o0.F3;
        if (e5Var != null) {
            e5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        ow owVar;
        int actionMasked = motionEvent.getActionMasked();
        yw ywVar = this.o0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            if (kVar.x()) {
                ywVar.a1 = true;
            }
        }
        return X() || ((owVar = ywVar.A0) != null && owVar.P) || onTouchEvent(motionEvent);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        yw ywVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        qv qvVar;
        qv qvVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        rw rwVar = this;
        int childCount = rwVar.getChildCount();
        int Q = rwVar.Q();
        int i19 = 0;
        rwVar.setBottomClip(0);
        int measuredWidth = rwVar.getMeasuredWidth();
        int measuredHeight = rwVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            ywVar = rwVar.o0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = rwVar.getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & org.telegram.messenger.ns.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + rwVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = measuredHeight - measuredHeight2;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != ywVar.Y || childAt == ywVar.a0 || childAt == (qvVar2 = ywVar.F0)) {
                            kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                            i18 = kVar.getMeasuredHeight();
                            if (childAt != ywVar.Y && childAt != ywVar.F0 && childAt != ywVar.a0) {
                                i18 += org.telegram.messenger.g0.L(48.0f);
                            }
                            if (ywVar.L && childAt == ywVar.Y) {
                                i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                            }
                            qvVar = ywVar.F0;
                            if (childAt == qvVar && qvVar.getPremiumHint() != null) {
                                ywVar.F0.getPremiumHint().layout(i15, org.telegram.messenger.i20.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, ywVar.F0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.i20.D(54.0f, i18, measuredHeight2));
                            }
                            if (childAt == ywVar.Y) {
                                i18 += org.telegram.messenger.g0.L(2.0f);
                            }
                        } else if (childAt == ywVar.D0) {
                            i18 = -org.telegram.messenger.g0.L(ywVar.a);
                        } else if (childAt instanceof pt) {
                            kVar3 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                            i18 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof xw) {
                            i18 = i19;
                        } else if (childAt == ywVar.L1 || childAt == ywVar.M1 || childAt == ywVar.A0) {
                            kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                            i18 = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight() + i18;
                        } else if (qvVar2 != null && qvVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != ywVar.Y) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                    i18 = kVar.getMeasuredHeight();
                    if (childAt != ywVar.Y) {
                        i18 += org.telegram.messenger.g0.L(48.0f);
                    }
                    if (ywVar.L) {
                        i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                    }
                    qvVar = ywVar.F0;
                    if (childAt == qvVar) {
                        ywVar.F0.getPremiumHint().layout(i15, org.telegram.messenger.i20.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, ywVar.F0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.i20.D(54.0f, i18, measuredHeight2));
                    }
                    if (childAt == ywVar.Y) {
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
                if (childAt != ywVar.Y) {
                }
                kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                i18 = kVar.getMeasuredHeight();
                if (childAt != ywVar.Y) {
                }
                if (ywVar.L) {
                }
                qvVar = ywVar.F0;
                if (childAt == qvVar) {
                }
                if (childAt == ywVar.Y) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
            i20++;
            i19 = 0;
            rwVar = this;
        }
        hw hwVar = ywVar.D0;
        if (hwVar != null) {
            hwVar.setKeyboardHeight(Q);
        }
        R();
        ywVar.k5();
        ywVar.e5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        yw ywVar = this.o0;
        int i11 = ywVar.a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.q0 q0Var = ywVar.n0;
        if (q0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof pt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof xw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (ywVar.H3.c()) {
                            if (ywVar.x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (ywVar.L) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i13 = L3 + ywVar.Q;
                        if (ywVar.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i14 = ywVar.a4 ? (int) (i13 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i14);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i13 + i14), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        hw hwVar = ywVar.D0;
                        if (childAt == hwVar) {
                            hwVar.setTranslationY(ywVar.J0);
                            ywVar.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11) + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                            ywVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i11) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            kv kvVar = ywVar.D1;
                            if (kvVar == null || !kvVar.H0(childAt)) {
                                if (childAt == ywVar.H3) {
                                    int size4 = View.MeasureSpec.getSize(i10);
                                    int i15 = ywVar.a4 ? (int) (size4 * 0.05f) : 0;
                                    ywVar.H3.setTransitionPaddingBottom(i15);
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
            post(new qw(this, 1));
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
        org.telegram.ui.ActionBar.o4 o4Var;
        ow owVar;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.ActionBar.o4 o4Var3;
        org.telegram.ui.ActionBar.o4 o4Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i7;
        int i10;
        jh.f fVar;
        yw ywVar = this.o0;
        o4Var = ((org.telegram.ui.ActionBar.e2) ywVar).parentLayout;
        Object[] objArr = 0;
        if (o4Var != null && (owVar = ywVar.A0) != null && !owVar.n && !ywVar.l2 && !ywVar.H3.c()) {
            o4Var2 = ((org.telegram.ui.ActionBar.e2) ywVar).parentLayout;
            if (!((ActionBarLayout) o4Var2).i()) {
                o4Var3 = ((org.telegram.ui.ActionBar.e2) ywVar).parentLayout;
                if (!((ActionBarLayout) o4Var3).y()) {
                    o4Var4 = ((org.telegram.ui.ActionBar.e2) ywVar).parentLayout;
                    if (!((ActionBarLayout) o4Var4).n && (motionEvent == null || ywVar.o3 || (motionEvent.getY() > Y() + Z() && ((fVar = ywVar.A1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < ywVar.A1.getY())))) {
                        if (ywVar.T0 != 3) {
                            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                            if (org.telegram.messenger.gz.m(i7) != 5) {
                                i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                if (org.telegram.messenger.gz.m(i10) == 2) {
                                    xw xwVar = ywVar.f0[0];
                                    if (xwVar != null) {
                                        int i11 = xwVar.d.h;
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
                            ywVar.o3 = true;
                            this.h0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.i0 = x10;
                            if (ywVar.k3) {
                                if (x10 < ywVar.f0[0].getTranslationX() + ywVar.f0[0].getMeasuredWidth()) {
                                    ywVar.l3 = ywVar.f0[0].getTranslationX();
                                } else {
                                    xw[] xwVarArr = ywVar.f0;
                                    xw xwVar2 = xwVarArr[0];
                                    xw xwVar3 = xwVarArr[1];
                                    xwVarArr[0] = xwVar3;
                                    xwVarArr[1] = xwVar2;
                                    ywVar.k3 = false;
                                    ywVar.l3 = xwVar3.getTranslationX();
                                    ywVar.A0.g(1.0f, ywVar.f0[0].h);
                                    ywVar.A0.g(ywVar.l3 / r10[0].getMeasuredWidth(), ywVar.f0[1].h);
                                    ywVar.d5(true);
                                    ywVar.f0[0].d.getClass();
                                    ywVar.f0[1].d.getClass();
                                }
                            } else if (x10 < ywVar.f0[1].getTranslationX() + ywVar.f0[1].getMeasuredWidth()) {
                                xw[] xwVarArr2 = ywVar.f0;
                                xw xwVar4 = xwVarArr2[0];
                                xw xwVar5 = xwVarArr2[1];
                                xwVarArr2[0] = xwVar5;
                                xwVarArr2[1] = xwVar4;
                                ywVar.k3 = true;
                                ywVar.l3 = xwVar5.getTranslationX();
                                ywVar.A0.g(1.0f, ywVar.f0[0].h);
                                ywVar.A0.g((-ywVar.l3) / r10[0].getMeasuredWidth(), ywVar.f0[1].h);
                                ywVar.d5(true);
                                ywVar.f0[0].d.getClass();
                                ywVar.f0[1].d.getClass();
                            } else {
                                ywVar.l3 = ywVar.f0[0].getTranslationX();
                            }
                            ywVar.i3.removeAllListeners();
                            ywVar.i3.cancel();
                            ywVar.j3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            ywVar.l3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !ywVar.o3 && !ywVar.p3 && ywVar.A0.getVisibility() == 0) {
                            this.h0 = motionEvent.getPointerId(0);
                            ywVar.p3 = true;
                            this.i0 = (int) motionEvent.getX();
                            this.j0 = (int) motionEvent.getY();
                            this.k0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.h0) {
                            int x11 = (int) ((motionEvent.getX() - this.i0) + ywVar.l3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.j0);
                            if (ywVar.o3 && (((z10 = ywVar.k3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    ywVar.p3 = true;
                                    ywVar.o3 = false;
                                    ywVar.f0[0].setTranslationX(0.0f);
                                    ywVar.f0[1].setTranslationX(ywVar.k3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    ywVar.A0.g(0.0f, ywVar.f0[1].h);
                                }
                            }
                            if (ywVar.p3 && !ywVar.o3) {
                                float a12 = org.telegram.messenger.g0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.i0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (ywVar.o3) {
                                ywVar.f0[0].setTranslationX(x11);
                                if (ywVar.k3) {
                                    ywVar.f0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    ywVar.f0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / ywVar.f0[0].getMeasuredWidth();
                                xw xwVar6 = ywVar.f0[1];
                                if (xwVar6.F && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    ywVar.A0.i(ywVar.f0[1].h);
                                    org.telegram.messenger.g0.i3(new qw(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                ywVar.A0.g(abs2, xwVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.h0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.k0.computeCurrentVelocity(1000, ywVar.n3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.k0.getXVelocity();
                                f11 = this.k0.getYVelocity();
                                if (!ywVar.o3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    a0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (ywVar.o3) {
                                float x13 = ywVar.f0[0].getX();
                                ywVar.i3 = new AnimatorSet();
                                if (ywVar.f0[1].F) {
                                    ywVar.m3 = true;
                                } else if (ywVar.l3 == 0.0f) {
                                    ywVar.m3 = Math.abs(x13) < ((float) ywVar.f0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z11 = ywVar.k3 ? false : false;
                                    ywVar.m3 = z11;
                                } else if (ywVar.k3) {
                                    ywVar.m3 = ywVar.f0[1].getX() > ((float) (ywVar.f0[0].getMeasuredWidth() >> 1));
                                } else {
                                    ywVar.m3 = ywVar.f0[0].getX() < ((float) (ywVar.f0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = ywVar.m3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (ywVar.k3) {
                                        ywVar.i3.playTogether(ObjectAnimator.ofFloat(ywVar.f0[0], (Property<xw, Float>) property, 0.0f), ObjectAnimator.ofFloat(ywVar.f0[1], (Property<xw, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        ywVar.i3.playTogether(ObjectAnimator.ofFloat(ywVar.f0[0], (Property<xw, Float>) property, 0.0f), ObjectAnimator.ofFloat(ywVar.f0[1], (Property<xw, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = ywVar.f0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (ywVar.k3) {
                                        ywVar.i3.playTogether(ObjectAnimator.ofFloat(ywVar.f0[0], (Property<xw, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(ywVar.f0[1], (Property<xw, Float>) property, 0.0f));
                                    } else {
                                        ywVar.i3.playTogether(ObjectAnimator.ofFloat(ywVar.f0[0], (Property<xw, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(ywVar.f0[1], (Property<xw, Float>) property, 0.0f));
                                    }
                                }
                                ywVar.i3.setInterpolator(yw.B4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                ywVar.i3.setDuration(Math.max(org.telegram.messenger.ns.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                ywVar.i3.addListener(new org.telegram.ui.Cells.w9(this, 27));
                                ywVar.i3.start();
                                ywVar.j3 = true;
                                ywVar.o3 = false;
                            } else {
                                ywVar.p3 = false;
                                kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                                kVar.setEnabled(true);
                                ywVar.A0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.k0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.k0 = null;
                            }
                        }
                        return ywVar.o3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        yw ywVar = this.o0;
        if (ywVar.p3 && !ywVar.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
