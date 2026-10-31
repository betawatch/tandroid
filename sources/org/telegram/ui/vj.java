package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vj extends om {
    public final o1.j A3;
    public boolean B3;
    public final Path C3;
    public boolean D3;
    public int E3;
    public final /* synthetic */ un F3;
    public int f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public int l3;
    public int m3;
    public int n3;
    public long o3;
    public float p3;
    public float q3;
    public boolean r3;
    public final float s3;
    public final Paint t3;
    public final Paint u3;
    public final o1.i v3;
    public final o1.j w3;
    public final o1.i x3;
    public final o1.j y3;
    public final o1.i z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(un unVar, Context context, sn snVar) {
        super(unVar, context, snVar);
        this.F3 = unVar;
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList(10);
        this.s3 = 2000.0f;
        Paint paint = new Paint(1);
        this.t3 = paint;
        Paint paint2 = new Paint(1);
        this.u3 = paint2;
        o1.i iVar = new o1.i(0.0f);
        this.v3 = iVar;
        o1.j jVar = new o1.j(iVar);
        jVar.h = 0.0f;
        jVar.g = 2000.0f;
        jVar.m = org.telegram.ui.Cells.f1.p(0.0f, 1500.0f, 1.0f);
        final int i10 = 0;
        jVar.b(new o1.g(this) { // from class: org.telegram.ui.tj
            public final /* synthetic */ vj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.j jVar2, float f7, float f10) {
                switch (i10) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.w3 = jVar;
        o1.i iVar2 = new o1.i(0.0f);
        this.x3 = iVar2;
        o1.j jVar2 = new o1.j(iVar2);
        jVar2.h = 0.0f;
        jVar2.m = org.telegram.ui.Cells.f1.p(0.0f, 400.0f, 0.5f);
        final int i11 = 1;
        jVar2.b(new o1.g(this) { // from class: org.telegram.ui.tj
            public final /* synthetic */ vj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.j jVar22, float f7, float f10) {
                switch (i11) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.y3 = jVar2;
        o1.i iVar3 = new o1.i(0.0f);
        this.z3 = iVar3;
        o1.j jVar3 = new o1.j(iVar3);
        jVar3.h = 0.0f;
        jVar3.m = org.telegram.ui.Cells.f1.p(0.0f, 200.0f, 1.0f);
        final int i12 = 2;
        jVar3.b(new o1.g(this) { // from class: org.telegram.ui.tj
            public final /* synthetic */ vj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.j jVar22, float f7, float f10) {
                switch (i12) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.A3 = jVar3;
        this.C3 = new Path();
        this.E3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1(Canvas canvas, RectF rectF) {
        float f7;
        ArrayList arrayList;
        ArrayList arrayList2 = this.g3;
        int size = arrayList2.size();
        un unVar = this.F3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i10);
                if (!un.k2(unVar, q1Var, rectF)) {
                    canvas.save();
                    canvas.translate(q1Var.P1(false) + q1Var.getLeft(), q1Var.getY() + q1Var.getPaddingTop());
                    q1Var.v1(q1Var.a() ? q1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.h3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i11);
                if (!un.k2(unVar, q1Var2, rectF)) {
                    float P1 = q1Var2.P1(false) + q1Var2.getLeft();
                    float y3 = q1Var2.getY() + q1Var2.getPaddingTop();
                    float alpha = q1Var2.a() ? q1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(P1, y3);
                    q1Var2.setInvalidatesParent(true);
                    q1Var2.f1(canvas, alpha);
                    q1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.i3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList4.get(i12);
                if (un.k2(unVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z12 = (q1Var3.getCurrentPosition() == null || (q1Var3.getCurrentPosition().l & z10) != 0) ? z11 : z10;
                    float alpha2 = q1Var3.a() ? q1Var3.getAlpha() : 1.0f;
                    float P12 = q1Var3.P1(z11) + q1Var3.getLeft();
                    float y10 = q1Var3.getY() + q1Var3.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.ej currentMessagesGroup = q1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        org.telegram.messenger.dj djVar = currentMessagesGroup.m;
                        if (djVar.j) {
                            float P13 = q1Var3.P1(z10);
                            float f10 = djVar.a + P13 + djVar.e;
                            arrayList = arrayList4;
                            float f11 = djVar.b + djVar.f;
                            float f12 = djVar.c + P13 + djVar.g;
                            float f13 = djVar.d + djVar.h;
                            if (!djVar.j) {
                                f11 += q1Var3.getTranslationY();
                                f13 += q1Var3.getTranslationY();
                            }
                            canvas.clipRect(f10 + org.telegram.messenger.i0.L(8.0f), f11 + org.telegram.messenger.i0.L(8.0f), f12 - org.telegram.messenger.i0.L(8.0f), f13 - org.telegram.messenger.i0.L(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (q1Var3.getTransitionParams().w0) {
                        canvas.translate(P12, y10);
                        q1Var3.setInvalidatesParent(true);
                        q1Var3.O0(alpha2, canvas, z12);
                        q1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z10 = 1;
                z11 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.j3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList5.get(i13);
                if (!un.k2(unVar, q1Var4, rectF)) {
                    boolean z13 = q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().l & 1) == 0;
                    float alpha3 = q1Var4.a() ? q1Var4.getAlpha() : 1.0f;
                    float P14 = q1Var4.P1(false) + q1Var4.getLeft();
                    float y11 = q1Var4.getY() + q1Var4.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.ej currentMessagesGroup2 = q1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        org.telegram.messenger.dj djVar2 = currentMessagesGroup2.m;
                        if (djVar2.j) {
                            float P15 = q1Var4.P1(true);
                            float f14 = djVar2.a + P15 + djVar2.e;
                            float f15 = djVar2.b + djVar2.f;
                            float f16 = djVar2.c + P15 + djVar2.g;
                            float f17 = djVar2.d + djVar2.h;
                            if (!djVar2.j) {
                                f15 += q1Var4.getTranslationY();
                                f17 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f14 + org.telegram.messenger.i0.L(f7), f15 + org.telegram.messenger.i0.L(f7), f16 - org.telegram.messenger.i0.L(f7), f17 - org.telegram.messenger.i0.L(f7));
                        }
                    }
                    if (!z13 && q1Var4.getTransitionParams().w0) {
                        canvas.translate(P14, y11);
                        q1Var4.setInvalidatesParent(true);
                        q1Var4.m1(canvas, alpha3, null);
                        q1Var4.T0(canvas, alpha3);
                        q1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void B1(boolean z10) {
        float f7;
        VelocityTracker velocityTracker;
        un unVar = this.F3;
        if (!z10 || (velocityTracker = unVar.x9) == null) {
            f7 = 0.0f;
        } else {
            velocityTracker.computeCurrentVelocity(1000);
            f7 = unVar.x9.getXVelocity();
        }
        VelocityTracker velocityTracker2 = unVar.x9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            unVar.x9 = null;
        }
        unVar.u9 = false;
        unVar.B0.R = true;
        org.telegram.ui.Components.t11 t11Var = unVar.m0;
        if (t11Var != null) {
            t11Var.settle(f7);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        org.telegram.messenger.ej L8;
        org.telegram.messenger.jj jjVar;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z11;
        un unVar = this.F3;
        if (motionEvent != null) {
            unVar.P4 = true;
        }
        if (unVar.U9() && unVar.r9 == null) {
            if (motionEvent == null) {
                if (unVar.u9) {
                    B1(false);
                }
                unVar.t9 = false;
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                z11 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
                unVar.t9 = (z11 || unVar.o9()) ? false : true;
                unVar.u9 = false;
                unVar.v9 = motionEvent.getX();
                unVar.w9 = motionEvent.getY();
                VelocityTracker velocityTracker = unVar.x9;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                VelocityTracker obtain = VelocityTracker.obtain();
                unVar.x9 = obtain;
                obtain.addMovement(motionEvent);
                return;
            }
            if (actionMasked != 2) {
                if (actionMasked == 1 || actionMasked == 3) {
                    if (unVar.u9) {
                        VelocityTracker velocityTracker2 = unVar.x9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        B1(actionMasked == 1);
                    }
                    unVar.t9 = false;
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker3 = unVar.x9;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - unVar.v9;
            float abs = Math.abs(motionEvent.getY() - unVar.w9);
            if (!unVar.t9 || unVar.u9 || getScrollState() != 0 || x10 > (-org.telegram.messenger.i0.a1(true, 0.4f)) || Math.abs(x10) / 3.0f <= abs || unVar.r8() == null) {
                if (unVar.u9) {
                    unVar.m0.setProgress((-(motionEvent.getX() - unVar.v9)) / org.telegram.messenger.i0.L(288.0f));
                    return;
                }
                return;
            }
            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            super.onInterceptTouchEvent(obtain2);
            obtain2.recycle();
            unVar.B0.R = false;
            unVar.t9 = false;
            unVar.u9 = true;
            unVar.v9 = motionEvent.getX();
            org.telegram.ui.Components.t11 t11Var = unVar.m0;
            ValueAnimator valueAnimator = t11Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                t11Var.I = null;
            }
            org.telegram.messenger.i0.v1(unVar.l1);
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !unVar.y9 && !unVar.s9 && unVar.r9 == null) {
            z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (!(pressedChildView instanceof org.telegram.ui.Cells.s0)) {
                        return;
                    }
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) pressedChildView;
                    float x11 = motionEvent.getX() - pressedChildView.getX();
                    float y3 = motionEvent.getY() - pressedChildView.getY();
                    if (!s0Var.T()) {
                        return;
                    }
                    org.telegram.ui.Wallet.d4 d4Var = s0Var.I0;
                    float f7 = (x11 - s0Var.K0) - (s0Var.j0 / 2.0f);
                    float paddingTop = (y3 - s0Var.L0) - s0Var.getPaddingTop();
                    org.telegram.ui.Wallet.c4 c4Var = d4Var.m;
                    if (c4Var != null && c4Var.n && d4Var.w.contains((int) f7, (int) paddingTop)) {
                        return;
                    }
                }
                if (unVar.r9 != null) {
                    un.c2(unVar, 0.0f);
                }
                unVar.r9 = pressedChildView;
                org.telegram.messenger.jj Y1 = un.Y1(unVar);
                boolean N6 = unVar.N6(Y1);
                int i10 = unVar.f4;
                if ((i10 != 0 && i10 != 5 && i10 != 8 && (i10 != 3 || unVar.r4 != unVar.getUserConfig().e())) || (((arrayList = unVar.o4) != null && arrayList.contains(Y1)) || ((unVar.R8(Y1) == 1 && (org.telegram.messenger.jj.B0(Y1.k) == unVar.b7 || Y1.m5())) || ((unVar.h == null && Y1.f1() < 0) || (((chat2 = unVar.e) != null && org.telegram.messenger.w3.c0(chat2) && !N6) || unVar.o9() || (org.telegram.messenger.jj.c3(Y1.k) && Y1.N3())))))) {
                    un.c2(unVar, 0.0f);
                    unVar.r9 = null;
                    return;
                } else {
                    this.n3 = motionEvent.getPointerId(0);
                    unVar.s9 = true;
                    this.l3 = (int) motionEvent.getX();
                    this.m3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (unVar.r9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n3) {
            int max = Math.max(org.telegram.messenger.i0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.l3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.m3);
            if (getScrollState() == 0 && unVar.s9 && !unVar.y9 && max <= (-org.telegram.messenger.i0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                unVar.r9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                unVar.B0.R = false;
                unVar.s9 = false;
                unVar.y9 = true;
                this.l3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (unVar.y9) {
                if (Math.abs(max) < org.telegram.messenger.i0.L(50.0f)) {
                    this.r3 = false;
                } else if (!this.r3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.r3 = true;
                }
                float f10 = max;
                un.c2(unVar, f10);
                org.telegram.messenger.jj Y12 = un.Y1(unVar);
                if (Y12 != null && (Y12.h4() || org.telegram.messenger.jj.L4(Y12.k))) {
                    unVar.hd(false, false);
                }
                View view = unVar.r9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f10);
                }
                invalidate();
                return;
            }
            return;
        }
        if (unVar.r9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.n3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = unVar.r9;
                if (Math.abs(view2 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view2).P1(false) : view2 instanceof org.telegram.ui.Cells.s0 ? ((org.telegram.ui.Cells.s0) view2).getWalletSlidingOffset() : 0.0f) >= org.telegram.messenger.i0.L(50.0f)) {
                    org.telegram.messenger.jj Y13 = un.Y1(unVar);
                    boolean N62 = unVar.N6(Y13);
                    qk qkVar = unVar.c1;
                    if ((qkVar == null || qkVar.getVisibility() != 0 || ((unVar.W0 && N62) || Y13.V1)) && ((chat = unVar.e) == null || ((!org.telegram.messenger.w3.r0(chat) || unVar.T9()) && ((!org.telegram.messenger.w3.T(unVar.e) || org.telegram.messenger.w3.w(5, unVar.e) || unVar.e.megagroup) && org.telegram.messenger.w3.n(unVar.e))))) {
                        unVar.Ub(un.Y1(unVar));
                    } else {
                        if (Y13.d1() != 0 && (L8 = unVar.L8(Y13.d1())) != null && (jjVar = L8.h) != null) {
                            Y13 = jjVar;
                        }
                        unVar.D5 = Y13;
                        Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
                        j10.putBoolean("quote", true);
                        j10.putBoolean("reply_to", true);
                        long o10 = org.telegram.messenger.o5.o(Y13.b1());
                        if (o10 != 0 && o10 != unVar.a() && o10 != unVar.getUserConfig().e() && o10 > 0) {
                            j10.putLong("reply_to_author", o10);
                        }
                        j10.putInt("messagesCount", 1);
                        j10.putBoolean("canSelectTopics", true);
                        ay ayVar = new ay(j10);
                        ayVar.C2 = unVar;
                        unVar.presentFragment(ayVar);
                    }
                }
            }
            View view3 = unVar.r9;
            float slidingOffsetX = view3 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX() : view3 instanceof org.telegram.ui.Cells.s0 ? ((org.telegram.ui.Cells.s0) view3).getWalletSlidingOffset() : 0.0f;
            this.q3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                unVar.r9 = null;
            }
            this.o3 = System.currentTimeMillis();
            this.p3 = 0.0f;
            invalidate();
            unVar.s9 = false;
            unVar.y9 = false;
            unVar.B0.R = true;
        }
    }

    public final void D1(org.telegram.ui.Cells.q1 q1Var, float f7) {
        org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != q1Var && (childAt instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    q1Var2.setSlidingOffset(f7);
                    q1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.F3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        un unVar = this.F3;
        unVar.I8 = null;
        canvas.save();
        if (unVar.oa != null && unVar.ka) {
            boolean z10 = unVar.la;
        }
        this.E1.setEmpty();
        if (unVar.ga != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-unVar.ga) - (unVar.na != 0.0f ? (unVar.z0.getMeasuredHeight() - unVar.ga) * unVar.na : 0.0f);
            unVar.Sa = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.d7) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        boolean z10;
        float f7;
        int i10;
        int L;
        int i11;
        org.telegram.ui.ActionBar.c5 c5Var;
        float f10;
        org.telegram.ui.ActionBar.c5 c5Var2;
        boolean z11;
        in inVar;
        int i12;
        int i13;
        float f11;
        int L2;
        int i14;
        float f12;
        float f13;
        boolean z12;
        un unVar = this.F3;
        ArrayList arrayList2 = unVar.K6;
        ColorMatrix colorMatrix = unVar.h7;
        m.c3 c3Var = unVar.i7;
        org.telegram.ui.ActionBar.c5 c5Var3 = unVar.j7;
        Paint paint = unVar.r7;
        Paint paint2 = unVar.f7;
        ArrayList arrayList3 = unVar.e7;
        Paint paint3 = unVar.g7;
        long j10 = unVar.d7 != 0 ? 0L : 0L;
        if (!org.telegram.messenger.i0.Q1() && !unVar.u4 && unVar.f == null) {
            TLRPC.Chat chat = unVar.e;
            boolean z13 = (chat == null || org.telegram.messenger.w3.V(chat)) && unVar.f4 != 7;
            if (unVar.ga != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -unVar.ga);
            }
            int i15 = org.telegram.ui.ActionBar.t6.d6;
            org.telegram.ui.ActionBar.p6 p6Var = this.n2;
            boolean z14 = i0.b.h(org.telegram.ui.ActionBar.t6.w0(i15, p6Var)) <= 0.699999988079071d;
            int i16 = org.telegram.ui.ActionBar.t6.i6;
            boolean z15 = z13;
            int f14 = i0.b.f(z14 ? 0.9f : 0.5f, org.telegram.ui.ActionBar.t6.w0(i16, p6Var), Color.argb(z14 ? 33 : 3, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4));
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i16, p6Var), z14 ? 24 : un.ad);
            if (unVar.q7 != o10 || unVar.p7 != f14) {
                unVar.p7 = f14;
                unVar.q7 = o10;
                int L3 = org.telegram.messenger.i0.L(200.0f);
                unVar.l7 = L3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L3, 0.0f, new int[]{o10, f14, f14, o10}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                unVar.o7 = linearGradient;
                unVar.m7 = (-unVar.l7) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z14 ? 43 : 96, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, unVar.l7, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                unVar.t7 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.c5 c5Var4 = c5Var3;
            long j11 = unVar.k7;
            int i17 = 2;
            Matrix matrix = unVar.s7;
            m.c3 c3Var2 = c3Var;
            Matrix matrix2 = unVar.n7;
            long abs = Math.abs(j11 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j12 = abs < 4 ? j10 : abs;
            int width = getWidth();
            unVar.k7 = elapsedRealtime;
            int i18 = (int) (unVar.m7 + ((width * j12) / 400.0f));
            unVar.m7 = i18;
            if (i18 >= width * 2) {
                unVar.m7 = (-unVar.l7) * 2;
            }
            matrix2.setTranslate(unVar.m7, 0.0f);
            LinearGradient linearGradient3 = unVar.o7;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(unVar.m7, 0.0f);
            LinearGradient linearGradient4 = unVar.t7;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - unVar.Ua) - ((int) (unVar.j9(org.telegram.ui.Components.k21.c) + unVar.w.d()))) - org.telegram.messenger.i0.L(57.0f);
            int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i20 = 0; i20 < getChildCount(); i20++) {
                int top = getChildAt(i20).getTop();
                if (top < i19) {
                    i19 = top;
                }
            }
            if (unVar.d7 == j10 && i19 <= 0) {
                z12 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
                unVar.T6(z12);
            }
            Paint W0 = W0("paintChatActionBackground");
            if (paint3.getColor() != W0.getColor()) {
                paint3.setColor(W0.getColor());
            }
            if (paint3.getShader() != W0.getShader()) {
                paint3.setShader(W0.getShader());
                colorMatrix.setSaturation(un.bd);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i21 = 0;
            while (i21 < getChildCount()) {
                View childAt = getChildAt(i21);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + q1Var.J1(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        f12 = 1.0f;
                        f13 = r13.b + currentMessagesGroup.m.f;
                    } else {
                        f12 = 1.0f;
                        f13 = 0.0f;
                    }
                    int i22 = (int) (top2 + f13);
                    i14 = i21;
                    if (unVar.d7 == j10 && unVar.R9()) {
                        i22 = org.telegram.messenger.i0.W1(childAt.getAlpha(), height, i22);
                    } else if (childAt.getAlpha() != f12) {
                        i22 = height;
                    }
                    if (i22 < height) {
                        height = i22;
                    }
                } else {
                    i14 = i21;
                    if (childAt instanceof org.telegram.ui.Cells.s0) {
                        int W1 = (unVar.d7 == j10 && unVar.R9()) ? org.telegram.messenger.i0.W1(childAt.getAlpha(), height, childAt.getTop()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (W1 < height) {
                            height = W1;
                        }
                    }
                }
                i21 = i14 + 1;
            }
            if (unVar.R9()) {
                boolean z16 = org.telegram.messenger.tz.o() != 0 && org.telegram.ui.ActionBar.t6.d1();
                int i23 = org.telegram.ui.ActionBar.t6.d6;
                boolean z17 = i0.b.h(org.telegram.ui.ActionBar.t6.w0(i23, p6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.t6.d1();
                boolean z18 = i0.b.h(org.telegram.ui.ActionBar.t6.w0(i23, p6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.t6.d1();
                if (z16) {
                    org.telegram.ui.ActionBar.t6.r(0.0f, getY() - unVar.P9, getMeasuredWidth(), org.telegram.messenger.i0.q.y);
                }
                int alpha = org.telegram.ui.ActionBar.t6.h2.getAlpha();
                if (z18) {
                    org.telegram.ui.ActionBar.t6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (unVar.d7 != j10) {
                    z10 = z17;
                    f7 = 1.0f - ((System.currentTimeMillis() - unVar.d7) / 200.0f);
                } else {
                    z10 = z17;
                    f7 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                sn snVar = unVar.xa;
                float f15 = (snVar == null || !snVar.q || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f7 * f15));
                float f16 = alpha2;
                paint2.setAlpha((int) (f7 * f15 * f16));
                paint.setAlpha((int) (f7 * f16));
                int i24 = 0;
                while (height > unVar.Ta) {
                    int L4 = height - org.telegram.messenger.i0.L(3.0f);
                    if (i24 >= arrayList3.size()) {
                        inVar = new in();
                        c5Var2 = c5Var4;
                        TLRPC.Chat chat2 = unVar.e;
                        if (chat2 == null || !org.telegram.messenger.w3.V(chat2)) {
                            z11 = z16;
                            inVar.b = Utilities.c.nextInt(org.telegram.messenger.i0.L(64.0f)) + org.telegram.messenger.i0.L(64.0f);
                        } else {
                            z11 = z16;
                            inVar.b = Utilities.c.nextInt(org.telegram.messenger.i0.L(64.0f)) + org.telegram.messenger.i0.L(128.0f);
                        }
                        float width2 = unVar.z0.getWidth() * 0.8f;
                        if (z15) {
                            f11 = 42.0f;
                            L2 = 0;
                        } else {
                            f11 = 42.0f;
                            L2 = org.telegram.messenger.i0.L(42.0f);
                        }
                        inVar.a = (int) Math.min(width2 - L2, (((Utilities.c.nextFloat() * 0.35f) + 0.4f) * unVar.z0.getWidth()) + org.telegram.messenger.i0.L(f11));
                        arrayList3.add(inVar);
                    } else {
                        c5Var2 = c5Var4;
                        z11 = z16;
                        inVar = (in) arrayList3.get(i24);
                    }
                    boolean z19 = z10;
                    if (unVar.d7 != j10) {
                        i12 = i17;
                        i13 = arrayList2.size() <= i12 ? Math.min(inVar.c, L4) : inVar.c;
                    } else {
                        i12 = i17;
                        i13 = L4;
                    }
                    inVar.c = i13;
                    height = L4 - inVar.b;
                    i24++;
                    i17 = i12;
                    z16 = z11;
                    z10 = z19;
                    c5Var4 = c5Var2;
                }
                org.telegram.ui.ActionBar.c5 c5Var5 = c5Var4;
                boolean z20 = z16;
                boolean z21 = z10;
                if (arrayList3.isEmpty()) {
                    L = getHeight() - unVar.Ua;
                    i10 = 0;
                } else {
                    i10 = 0;
                    L = ((in) arrayList3.get(0)).c + org.telegram.messenger.i0.L(3.0f);
                }
                int L5 = org.telegram.messenger.i0.L(z15 ? 3.0f : 51.0f);
                if (unVar.P9()) {
                    L5 = org.telegram.messenger.i0.W1(unVar.d9(), L5, org.telegram.messenger.i0.L(71.0f));
                }
                while (i10 < arrayList3.size() && L > unVar.Ta) {
                    int L6 = L - org.telegram.messenger.i0.L(3.0f);
                    in inVar2 = (in) arrayList3.get(i10);
                    int i25 = inVar2.c;
                    ArrayList arrayList4 = arrayList3;
                    boolean z22 = z21;
                    org.telegram.ui.ActionBar.c5 c5Var6 = c5Var5;
                    c5Var6.setBounds(L5, i25 - inVar2.b, inVar2.a, i25);
                    m.c3 c3Var3 = c3Var2;
                    if (z20) {
                        c5Var6.e(canvas, c3Var3, paint3);
                    }
                    c5Var6.e(canvas, c3Var3, paint2);
                    if (z22) {
                        c5Var6.e(canvas, c3Var3, org.telegram.ui.ActionBar.t6.h2);
                    }
                    c5Var6.e(canvas, c3Var3, paint);
                    if (z15) {
                        c3Var2 = c3Var3;
                        i11 = L5;
                        c5Var = c5Var6;
                    } else {
                        if (z20) {
                            f10 = 27.0f;
                            c3Var2 = c3Var3;
                            i11 = L5;
                            canvas.drawCircle(org.telegram.messenger.i0.L(27.0f), i25 - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(21.0f), paint3);
                        } else {
                            c3Var2 = c3Var3;
                            i11 = L5;
                            f10 = 27.0f;
                        }
                        canvas.drawCircle(org.telegram.messenger.i0.L(f10), i25 - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(21.0f), paint2);
                        if (z22) {
                            c5Var = c5Var6;
                            canvas.drawCircle(org.telegram.messenger.i0.L(f10), i25 - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.ui.ActionBar.t6.h2);
                        } else {
                            c5Var = c5Var6;
                        }
                        canvas.drawCircle(org.telegram.messenger.i0.L(f10), i25 - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(21.0f), paint);
                    }
                    L = L6 - inVar2.b;
                    i10++;
                    arrayList3 = arrayList4;
                    z21 = z22;
                    L5 = i11;
                    c5Var5 = c5Var;
                }
                arrayList = arrayList3;
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.t6.h2.setAlpha(alpha);
                invalidate();
            } else {
                arrayList = arrayList3;
                if (System.currentTimeMillis() - unVar.d7 > 200) {
                    arrayList.clear();
                }
            }
            arrayList.size();
            arrayList2.size();
            if (unVar.ga != 0.0f) {
                canvas.restore();
            }
        }
        super.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        if ((r4 & 1) != 0) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v61, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Cells.r4] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Cells.r4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [org.telegram.ui.Cells.r4] */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.ui.Cells.s0 s0Var;
        int i10;
        org.telegram.messenger.ej ejVar;
        int i11;
        boolean z11;
        float f7;
        boolean z12;
        float f10;
        boolean z13;
        float f11;
        boolean z14;
        boolean z15;
        int paddingTop;
        float f12;
        float checkBoxTranslation;
        int i12;
        float f13;
        int b10;
        int b11;
        int i13;
        int i14;
        org.telegram.messenger.jj jjVar;
        un unVar = this.F3;
        if (unVar.R9()) {
            invalidate();
        }
        boolean z16 = view == unVar.X8;
        boolean z17 = view instanceof org.telegram.ui.Cells.q1;
        if (z17) {
            q1Var = (org.telegram.ui.Cells.q1) view;
            z10 = q1Var.gb.x0;
        } else {
            q1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.uu0.e0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z16 = true;
        }
        if (z17) {
            q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (unVar.D6.contains(q1Var2)) {
                z16 = true;
            }
            org.telegram.messenger.bj currentPosition = q1Var2.getCurrentPosition();
            ejVar = q1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i15 = currentPosition.e;
                int i16 = currentPosition.i;
                if (i15 != i16 && i16 == 1000 && currentPosition.m == null && ejVar.b) {
                    i10 = q1Var2.getBackgroundDrawableLeft();
                    i11 = 0;
                    i14 = q1Var2.K1;
                    if (i14 != 7) {
                    }
                    unVar.I8 = q1Var2;
                    if (!z16) {
                    }
                    if (z16) {
                    }
                    s0Var = null;
                } else if (currentPosition.m != null) {
                    i11 = view.getBottom() - org.telegram.messenger.i0.L((q1Var2.E2() ? 1 : 0) + 1);
                    i10 = 0;
                    i14 = q1Var2.K1;
                    if ((i14 != 7 || i14 == 4) && (jjVar = q1Var2.O5) != null && jjVar.D != 5 && MediaController.B().I(q1Var2.O5)) {
                        unVar.I8 = q1Var2;
                    }
                    if (!z16) {
                        View view2 = unVar.X8;
                        if (view2 instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) view2;
                            if (q1Var3.getCurrentMessagesGroup() != null && q1Var3.getCurrentMessagesGroup() == ejVar) {
                                z16 = true;
                            }
                        }
                    }
                    if (z16) {
                        q1Var2.getPhotoImage().getClass();
                    }
                    s0Var = null;
                }
            }
            i10 = 0;
            i11 = 0;
            i14 = q1Var2.K1;
            if (i14 != 7) {
            }
            unVar.I8 = q1Var2;
            if (!z16) {
            }
            if (z16) {
            }
            s0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.s0) {
                s0Var = (org.telegram.ui.Cells.s0) view;
                q1Var2 = null;
            } else {
                q1Var2 = null;
                s0Var = null;
            }
            i10 = 0;
            ejVar = null;
            i11 = 0;
        }
        if (i10 != 0) {
            canvas.save();
        } else if (i11 != 0) {
            canvas.save();
        }
        if (z16) {
            z16 = false;
        }
        if (z16) {
            z11 = true;
            f7 = 0.0f;
            z12 = false;
        } else {
            boolean z18 = (q1Var2 == null || q1Var2.gb.w1 || ejVar == null || !ejVar.m.j) ? false : true;
            if (z18) {
                canvas.save();
                float P1 = q1Var2.P1(true);
                org.telegram.messenger.dj djVar = ejVar.m;
                z11 = true;
                float f14 = djVar.c + P1;
                f7 = 0.0f;
                canvas.clipRect(djVar.a + P1 + djVar.e + org.telegram.messenger.i0.L(4.0f), djVar.b + djVar.f + org.telegram.messenger.i0.L(4.0f), (f14 + djVar.g) - org.telegram.messenger.i0.L(4.0f), (djVar.d + djVar.h) - org.telegram.messenger.i0.L(4.0f));
            } else {
                z11 = true;
                f7 = 0.0f;
            }
            if (q1Var2 != null) {
                org.telegram.ui.Cells.x1 x1Var = q1Var2.gb;
                if (x1Var.w1) {
                    canvas.save();
                    canvas.translate(q1Var2.getX(), q1Var2.getY());
                    q1Var2.b1(canvas);
                    canvas.restore();
                    z12 = x1Var.h;
                    if (z18) {
                        canvas.restore();
                    }
                    if (q1Var2 == null && q1Var2.h2()) {
                        canvas.save();
                        canvas.translate(q1Var2.getX(), q1Var2.getPaddingTopAnimated() + q1Var2.getY());
                        q1Var2.g1(canvas);
                        canvas.restore();
                    } else if (s0Var != null) {
                        canvas.save();
                        canvas.translate(s0Var.getX(), s0Var.getY());
                        s0Var.I(canvas);
                        canvas.restore();
                    }
                }
            }
            z12 = (q1Var2 == null || !z18) ? super.drawChild(canvas, view, j10) : super.drawChild(canvas, view, j10);
            if (z18) {
            }
            if (q1Var2 == null) {
            }
            if (s0Var != null) {
            }
        }
        if (i10 != 0 || i11 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f7) {
            canvas.save();
            f10 = f7;
            canvas.translate(f10, view.getTranslationY());
        } else {
            f10 = f7;
        }
        if (q1Var2 != null) {
            q1Var2.Q0(canvas);
        }
        if (view.getTranslationY() != f10) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            canvas.translate(f10, view.getTranslationY());
        }
        if (q1Var2 != null) {
            org.telegram.messenger.jj messageObject = q1Var2.getMessageObject();
            org.telegram.messenger.bj currentPosition2 = q1Var2.getCurrentPosition();
            if (!z16) {
                if (currentPosition2 != null || q1Var2.getTransitionParams().x0) {
                    if (currentPosition2 == null || currentPosition2.h || (currentPosition2.a == 0 && currentPosition2.c == 0)) {
                        if (currentPosition2 == null || currentPosition2.h) {
                            this.g3.add(q1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.a == 0 && currentPosition2.c == 0)) && q1Var2.g2()) {
                            this.h3.add(q1Var2);
                        }
                    }
                    if (currentPosition2 != null || q1Var2.getTransitionParams().D0 || q1Var2.getTransitionParams().x0) {
                        if (currentPosition2 == null || (currentPosition2.l & q1Var2.F()) != 0) {
                            this.i3.add(q1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i17 = currentPosition2.l;
                            if ((i17 & 8) != 0) {
                            }
                        }
                        this.j3.add(q1Var2);
                    }
                }
                if (unVar.H8 != null && ((messageObject.h4() || org.telegram.messenger.jj.L4(messageObject.k)) && !messageObject.T4() && MediaController.B().I(messageObject))) {
                    ImageReceiver photoImage = q1Var2.getPhotoImage();
                    float x10 = q1Var2.getX() + photoImage.K0;
                    float y3 = (unVar.z0.getY() + ((q1Var2.getY() + q1Var2.getPaddingTop()) + photoImage.L0)) - unVar.H8.getTop();
                    if (unVar.H8.getTranslationX() != x10 || unVar.H8.getTranslationY() != y3) {
                        unVar.H8.setTranslationX(x10);
                        unVar.H8.setTranslationY(y3);
                        unVar.fragmentView.invalidate();
                        unVar.H8.invalidate();
                    }
                }
            }
        }
        if (q1Var != null) {
            org.telegram.messenger.jj messageObject2 = q1Var.getMessageObject();
            org.telegram.messenger.bj currentPosition3 = q1Var.getCurrentPosition();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null && unVar.d9() < 1.0f) {
                org.telegram.messenger.ej k92 = unVar.k9(messageObject2);
                if (!q1Var.getMessageObject().Z) {
                    unVar.z0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z14 = z11;
                        z15 = (!unVar.z0.V1 || (k92 != null && k92.m.j)) ? z11 : false;
                        paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                        if (q1Var.l()) {
                            if (q1Var.xa) {
                                b11 = ((SparseArray) unVar.k9.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) unVar.k9.j).keyAt(b11);
                                }
                            } else {
                                b11 = unVar.z0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (k92 != null) {
                                    ArrayList arrayList = k92.e;
                                    if (currentPosition3 != null) {
                                        int indexOf = arrayList.indexOf(currentPosition3);
                                        f12 = 1.0f;
                                        int size = arrayList.size();
                                        if ((currentPosition3.l & 8) != 0) {
                                            i13 = (b11 - size) + indexOf;
                                        } else {
                                            i13 = b11 - 1;
                                            int i18 = indexOf + 1;
                                            while (i18 < size) {
                                                int i19 = i18;
                                                z13 = z12;
                                                if (((org.telegram.messenger.bj) arrayList.get(i18)).c > currentPosition3.d) {
                                                    break;
                                                }
                                                i13--;
                                                i18 = i19 + 1;
                                                z12 = z13;
                                            }
                                        }
                                        z13 = z12;
                                        if (q1Var.xa) {
                                            if (unVar.z0.K(i13) != null) {
                                                if (view.getTranslationY() != 0.0f) {
                                                    canvas.restore();
                                                }
                                                avatarImage.O0(false, false);
                                                return z13;
                                            }
                                        } else if (((View) ((SparseArray) unVar.k9.j).get(i13)) != null) {
                                            if (view.getTranslationY() != 0.0f) {
                                                canvas.restore();
                                            }
                                            avatarImage.O0(false, false);
                                            return z13;
                                        }
                                        checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                        int layoutHeight = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                                        int measuredHeight = unVar.z0.getMeasuredHeight() - unVar.z0.getPaddingBottom();
                                        boolean z19 = ((!q1Var.m1 || q1Var.n1) && checkBoxTranslation == 0.0f) ? z11 : false;
                                        if (!q1Var.G2() || q1Var.getTransitionParams().l2) {
                                            if (q1Var.getTransitionParams().l2) {
                                                float f15 = q1Var.getTransitionParams().L1;
                                                if (!q1Var.G2()) {
                                                    f15 = f12 - f15;
                                                }
                                                layoutHeight = (int) c3.i0.z(f12, f15, Math.min(layoutHeight, measuredHeight), layoutHeight * f15);
                                            }
                                        } else if (layoutHeight > measuredHeight) {
                                            layoutHeight = measuredHeight;
                                        }
                                        if (!z15 && view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        if (q1Var.g()) {
                                            if (q1Var.xa) {
                                                b10 = ((SparseArray) unVar.k9.j).indexOfValue(view);
                                                if (b10 >= 0) {
                                                    b10 = ((SparseArray) unVar.k9.j).keyAt(b10);
                                                }
                                            } else {
                                                b10 = unVar.z0.T(view).b();
                                            }
                                            if (b10 >= 0) {
                                                float f16 = checkBoxTranslation;
                                                ?? r11 = q1Var;
                                                int i20 = b10;
                                                int i21 = 0;
                                                while (i21 < 20) {
                                                    i21++;
                                                    if (k92 != null) {
                                                        ArrayList arrayList2 = k92.e;
                                                        if (currentPosition3 != null) {
                                                            int indexOf2 = arrayList2.indexOf(currentPosition3);
                                                            if (indexOf2 < 0) {
                                                                break;
                                                            }
                                                            arrayList2.size();
                                                            i12 = layoutHeight;
                                                            if ((currentPosition3.l & 4) != 0) {
                                                                i20 = i20 + indexOf2 + 1;
                                                            } else {
                                                                i20++;
                                                                int i22 = indexOf2 - 1;
                                                                while (i22 >= 0) {
                                                                    int i23 = i22;
                                                                    if (((org.telegram.messenger.bj) arrayList2.get(i22)).d < currentPosition3.c) {
                                                                        break;
                                                                    }
                                                                    i20++;
                                                                    i22 = i23 - 1;
                                                                }
                                                            }
                                                            if (!r11.k()) {
                                                                ?? r02 = (View) ((SparseArray) unVar.k9.j).get(i20);
                                                                if (r02 == 0) {
                                                                    break;
                                                                }
                                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                                if (!(r02 instanceof org.telegram.ui.Cells.r4)) {
                                                                    break;
                                                                }
                                                                r11 = (org.telegram.ui.Cells.r4) r02;
                                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                                if (z19 && checkBoxTranslation2 > 0.0f) {
                                                                    f16 = checkBoxTranslation2;
                                                                }
                                                                if (!r11.g()) {
                                                                    break;
                                                                }
                                                                layoutHeight = i12;
                                                                r11 = r11;
                                                            } else {
                                                                s4.c1 K = unVar.z0.K(i20);
                                                                if (K == null) {
                                                                    break;
                                                                }
                                                                ?? r03 = K.a;
                                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                                if (!(r03 instanceof org.telegram.ui.Cells.q1)) {
                                                                    break;
                                                                }
                                                                r11 = (org.telegram.ui.Cells.r4) r03;
                                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                                if (z19 && checkBoxTranslation3 > 0.0f) {
                                                                    f16 = checkBoxTranslation3;
                                                                }
                                                                if (!r11.g()) {
                                                                    break;
                                                                }
                                                                layoutHeight = i12;
                                                                r11 = r11;
                                                            }
                                                            int L = i12 - org.telegram.messenger.i0.L(48.0f) < paddingTop ? org.telegram.messenger.i0.L(48.0f) + paddingTop : i12;
                                                            if (!q1Var.l()) {
                                                                int bottom = z15 ? view.getBottom() : (int) (q1Var.getDeltaBottom() + q1Var.getY() + q1Var.getMeasuredHeight());
                                                                if (L > bottom) {
                                                                    L = bottom;
                                                                }
                                                            }
                                                            canvas.save();
                                                            if (checkBoxTranslation != 0.0f) {
                                                                canvas.translate(checkBoxTranslation, 0.0f);
                                                            }
                                                            if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                                                org.telegram.ui.Cells.q1 q1Var4 = q1Var;
                                                                if (q1Var4.getCurrentMessagesGroup() != null && q1Var4.getCurrentMessagesGroup().m.j) {
                                                                    L = (int) (L - q1Var4.getTranslationY());
                                                                }
                                                            }
                                                            if (z14) {
                                                                avatarImage.L0 = L - org.telegram.messenger.i0.L(44.0f);
                                                            }
                                                            if (q1Var.a()) {
                                                                avatarImage.setAlpha(q1Var.getAlpha() * (1.0f - unVar.d9()));
                                                                canvas.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX() + q1Var.getX(), q1Var.getY() + (q1Var.getHeight() >> 1));
                                                                f13 = 1.0f;
                                                            } else {
                                                                f13 = 1.0f;
                                                                avatarImage.setAlpha(1.0f - unVar.d9());
                                                            }
                                                            if (z14) {
                                                                avatarImage.O0(z11, false);
                                                            }
                                                            if (unVar.d9() > 0.0f) {
                                                                canvas.scale(f13 - unVar.d9(), f13 - unVar.d9(), avatarImage.y(), avatarImage.A());
                                                                f11 = 0.0f;
                                                                canvas.translate(unVar.d9() * org.telegram.messenger.i0.L(24.0f), 0.0f);
                                                            } else {
                                                                f11 = 0.0f;
                                                            }
                                                            avatarImage.h(canvas, null);
                                                            canvas.restore();
                                                            if (!z15 && view.getTranslationY() != f11) {
                                                                canvas.save();
                                                            }
                                                            if (view.getTranslationY() != f11) {
                                                                canvas.restore();
                                                            }
                                                            return z13;
                                                        }
                                                    }
                                                    i12 = layoutHeight;
                                                    i20++;
                                                    if (!r11.k()) {
                                                    }
                                                    if (i12 - org.telegram.messenger.i0.L(48.0f) < paddingTop) {
                                                    }
                                                    if (!q1Var.l()) {
                                                    }
                                                    canvas.save();
                                                    if (checkBoxTranslation != 0.0f) {
                                                    }
                                                    if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                                    }
                                                    if (z14) {
                                                    }
                                                    if (q1Var.a()) {
                                                    }
                                                    if (z14) {
                                                    }
                                                    if (unVar.d9() > 0.0f) {
                                                    }
                                                    avatarImage.h(canvas, null);
                                                    canvas.restore();
                                                    if (!z15) {
                                                        canvas.save();
                                                    }
                                                    if (view.getTranslationY() != f11) {
                                                    }
                                                    return z13;
                                                }
                                                i12 = layoutHeight;
                                                q1Var = r11;
                                                checkBoxTranslation = f16;
                                                if (i12 - org.telegram.messenger.i0.L(48.0f) < paddingTop) {
                                                }
                                                if (!q1Var.l()) {
                                                }
                                                canvas.save();
                                                if (checkBoxTranslation != 0.0f) {
                                                }
                                                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                                }
                                                if (z14) {
                                                }
                                                if (q1Var.a()) {
                                                }
                                                if (z14) {
                                                }
                                                if (unVar.d9() > 0.0f) {
                                                }
                                                avatarImage.h(canvas, null);
                                                canvas.restore();
                                                if (!z15) {
                                                }
                                                if (view.getTranslationY() != f11) {
                                                }
                                                return z13;
                                            }
                                        }
                                        i12 = layoutHeight;
                                        if (i12 - org.telegram.messenger.i0.L(48.0f) < paddingTop) {
                                        }
                                        if (!q1Var.l()) {
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                        }
                                        if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                        }
                                        if (z14) {
                                        }
                                        if (q1Var.a()) {
                                        }
                                        if (z14) {
                                        }
                                        if (unVar.d9() > 0.0f) {
                                        }
                                        avatarImage.h(canvas, null);
                                        canvas.restore();
                                        if (!z15) {
                                        }
                                        if (view.getTranslationY() != f11) {
                                        }
                                        return z13;
                                    }
                                }
                                z13 = z12;
                                f12 = 1.0f;
                                i13 = b11 - 1;
                                if (q1Var.xa) {
                                }
                                checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                int layoutHeight2 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                                int measuredHeight2 = unVar.z0.getMeasuredHeight() - unVar.z0.getPaddingBottom();
                                if (q1Var.m1) {
                                }
                                if (q1Var.G2()) {
                                }
                                if (q1Var.getTransitionParams().l2) {
                                }
                                if (!z15) {
                                    canvas.restore();
                                }
                                if (q1Var.g()) {
                                }
                                i12 = layoutHeight2;
                                if (i12 - org.telegram.messenger.i0.L(48.0f) < paddingTop) {
                                }
                                if (!q1Var.l()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                }
                                if (z14) {
                                }
                                if (q1Var.a()) {
                                }
                                if (z14) {
                                }
                                if (unVar.d9() > 0.0f) {
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                if (!z15) {
                                }
                                if (view.getTranslationY() != f11) {
                                }
                                return z13;
                            }
                        }
                        z13 = z12;
                        f12 = 1.0f;
                        checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                        int layoutHeight22 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                        int measuredHeight22 = unVar.z0.getMeasuredHeight() - unVar.z0.getPaddingBottom();
                        if (q1Var.m1) {
                        }
                        if (q1Var.G2()) {
                        }
                        if (q1Var.getTransitionParams().l2) {
                        }
                        if (!z15) {
                        }
                        if (q1Var.g()) {
                        }
                        i12 = layoutHeight22;
                        if (i12 - org.telegram.messenger.i0.L(48.0f) < paddingTop) {
                        }
                        if (!q1Var.l()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (q1Var instanceof org.telegram.ui.Cells.q1) {
                        }
                        if (z14) {
                        }
                        if (q1Var.a()) {
                        }
                        if (z14) {
                        }
                        if (unVar.d9() > 0.0f) {
                        }
                        avatarImage.h(canvas, null);
                        canvas.restore();
                        if (!z15) {
                        }
                        if (view.getTranslationY() != f11) {
                        }
                        return z13;
                    }
                }
                z14 = false;
                if (unVar.z0.V1) {
                }
                paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                if (q1Var.l()) {
                }
                z13 = z12;
                f12 = 1.0f;
                checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                int layoutHeight222 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                int measuredHeight222 = unVar.z0.getMeasuredHeight() - unVar.z0.getPaddingBottom();
                if (q1Var.m1) {
                }
                if (q1Var.G2()) {
                }
                if (q1Var.getTransitionParams().l2) {
                }
                if (!z15) {
                }
                if (q1Var.g()) {
                }
                i12 = layoutHeight222;
                if (i12 - org.telegram.messenger.i0.L(48.0f) < paddingTop) {
                }
                if (!q1Var.l()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                }
                if (z14) {
                }
                if (q1Var.a()) {
                }
                if (z14) {
                }
                if (unVar.d9() > 0.0f) {
                }
                avatarImage.h(canvas, null);
                canvas.restore();
                if (!z15) {
                }
                if (view.getTranslationY() != f11) {
                }
                return z13;
            }
        }
        z13 = z12;
        f11 = 0.0f;
        if (view.getTranslationY() != f11) {
        }
        return z13;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void j1(View view, float f7, float f10, boolean z10) {
        org.telegram.messenger.ej currentMessagesGroup;
        super.j1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
            if (messageObject.I3() || messageObject.U2() || (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && (childAt instanceof org.telegram.ui.Cells.q1)) {
                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        q1Var2.setPressed(z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        tp tpVar;
        int i10;
        float f11;
        int i11;
        String L0;
        String L02;
        String L03;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i13;
        View view;
        Paint paint;
        Paint paint2;
        int i14;
        float f12;
        float f13;
        float f14;
        float f15;
        Paint paint3;
        float f16;
        Paint paint4;
        Paint paint5;
        float f17;
        float f18;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i15;
        float f19;
        float f20;
        super.onDraw(canvas);
        un unVar = this.F3;
        View view2 = unVar.r9;
        if (view2 != null) {
            float slidingOffsetX = view2 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view2).getSlidingOffsetX() : view2 instanceof org.telegram.ui.Cells.s0 ? ((org.telegram.ui.Cells.s0) view2).getWalletSlidingOffset() : 0.0f;
            if (!unVar.s9 && !unVar.y9 && this.q3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f21 = ((currentTimeMillis - this.o3) / 180.0f) + this.p3;
                this.p3 = f21;
                if (f21 > 1.0f) {
                    this.p3 = 1.0f;
                }
                this.o3 = currentTimeMillis;
                float interpolation = (1.0f - org.telegram.messenger.i0.F.getInterpolation(this.p3)) * this.q3;
                if (interpolation == 0.0f) {
                    this.q3 = 0.0f;
                }
                View view3 = unVar.r9;
                if (view3 instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view3, interpolation);
                }
                un.c2(unVar, interpolation);
                org.telegram.messenger.jj Y1 = un.Y1(unVar);
                if (Y1 != null && (Y1.h4() || org.telegram.messenger.jj.L4(Y1.k))) {
                    unVar.hd(false, false);
                }
                float f22 = this.p3;
                if (f22 == 1.0f || f22 == 0.0f) {
                    un.c2(unVar, 0.0f);
                    unVar.r9 = null;
                }
                invalidate();
            }
            if (unVar.r9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint W0 = W0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.t6.h2;
                Paint paint7 = this.t3;
                if (paint7.getColor() != W0.getColor()) {
                    paint7.setColor(W0.getColor());
                }
                Paint paint8 = this.u3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != W0.getShader()) {
                    paint7.setShader(W0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                o1.i iVar = this.x3;
                float f23 = iVar.a;
                float f24 = this.s3;
                float f25 = f23 / f24;
                f7 = 255.0f;
                int color = paint8.getColor();
                if (f25 > 1.0f) {
                    this.B3 = true;
                }
                f10 = 2.0f;
                View view4 = unVar.r9;
                float P1 = view4 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view4).P1(false) : view4 instanceof org.telegram.ui.Cells.s0 ? ((org.telegram.ui.Cells.s0) view4).getWalletSlidingOffset() : 0.0f;
                o1.i iVar2 = this.v3;
                float f26 = iVar2.a;
                o1.i iVar3 = this.z3;
                o1.j jVar = this.A3;
                o1.j jVar2 = this.y3;
                if (f26 == 0.0f) {
                    jVar2.d();
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                    double d = 0.0f;
                    jVar2.m.i = d;
                    iVar.a = 0.0f;
                    jVar.d();
                    jVar.m.i = d;
                    iVar3.a = 0.0f;
                    this.B3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                }
                if (((float) jVar2.m.i) != f24) {
                    f12 = 1.0f;
                    f13 = w7.u.a(((-P1) - org.telegram.messenger.i0.L(20.0f)) / org.telegram.messenger.i0.L(30.0f), 0.0f, 1.0f);
                } else {
                    f12 = 1.0f;
                    f13 = 1.0f;
                }
                if (f13 == f12) {
                    o1.k kVar = jVar2.m;
                    f14 = 20.0f;
                    f15 = f25;
                    if (((float) kVar.i) != f24) {
                        double d10 = f24;
                        kVar.i = d10;
                        jVar2.h();
                        jVar.m.i = d10;
                        jVar.h();
                    }
                } else {
                    f14 = 20.0f;
                    f15 = f25;
                }
                float f27 = P1 <= ((float) (-org.telegram.messenger.i0.L(f14))) ? f24 : 0.0f;
                o1.j jVar3 = this.w3;
                o1.k kVar2 = jVar3.m;
                float f28 = f15;
                if (f27 != ((float) kVar2.i)) {
                    kVar2.i = f27;
                    if (!jVar3.f) {
                        jVar3.h();
                    }
                }
                float f29 = iVar2.a / f24;
                org.telegram.messenger.jj Y12 = un.Y1(unVar);
                float measuredWidth = (P1 * ((Y12 == null || !Y12.N3()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (unVar.r9.getMeasuredHeight() / 2.0f) + unVar.r9.getTop();
                boolean z10 = this.B3;
                float f30 = z10 ? f28 : f29;
                float f31 = z10 ? 0.0f : 1.0f - f28;
                int i16 = org.telegram.ui.ActionBar.t6.d6;
                org.telegram.ui.ActionBar.p6 p6Var2 = this.n2;
                boolean z11 = i0.b.h(org.telegram.ui.ActionBar.t6.w0(i16, p6Var2)) <= 0.5d;
                if (f29 != 0.0f) {
                    paint3 = paint8;
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (org.telegram.messenger.i0.L(16.0f) * f30))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (org.telegram.messenger.i0.L(16.0f) * f30))), (int) (((org.telegram.messenger.i0.L(16.0f) * f30) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((org.telegram.messenger.i0.L(16.0f) * f30) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.t6.r(0.0f, getY() + rectF.top, getMeasuredWidth(), org.telegram.messenger.i0.q.y);
                    if (f28 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        paint2.setAlpha((int) (alpha * f29));
                        float f32 = f13 * 360.0f;
                        f16 = f24;
                        paint4 = paint;
                        f17 = f13;
                        p6Var = p6Var2;
                        Paint paint9 = paint2;
                        f18 = measuredWidth;
                        canvas.drawArc(rectF, -90.0f, f32, false, paint9);
                        paint9.setAlpha(alpha);
                        if (unVar.xa.g()) {
                            int alpha2 = paint3.getAlpha();
                            paint3 = paint3;
                            if (z11) {
                                paint3.setColor(-1);
                            }
                            paint3.setAlpha((int) (alpha2 * f29));
                            paint5 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f32, false, paint3);
                        } else {
                            paint5 = paint9;
                            paint3 = paint3;
                            canvas2 = canvas;
                        }
                    } else {
                        canvas2 = canvas;
                        f16 = f24;
                        paint4 = paint;
                        paint5 = paint2;
                        f17 = f13;
                        f18 = measuredWidth;
                        p6Var = p6Var2;
                    }
                } else {
                    canvas2 = canvas;
                    paint3 = paint8;
                    f16 = f24;
                    paint4 = paint;
                    paint5 = paint2;
                    f17 = f13;
                    f18 = measuredWidth;
                    p6Var = p6Var2;
                }
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set((int) (f18 - (org.telegram.messenger.i0.L(16.0f) * f30)), (int) (measuredHeight - (org.telegram.messenger.i0.L(16.0f) * f30)), (int) ((org.telegram.messenger.i0.L(16.0f) * f30) + f18), (int) ((org.telegram.messenger.i0.L(16.0f) * f30) + measuredHeight));
                int measuredWidth2 = getMeasuredWidth();
                Point point = org.telegram.messenger.i0.q;
                org.telegram.ui.ActionBar.t6.r(0.0f, getY() + rectF2.top, measuredWidth2, point.y);
                Path path = this.C3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f) * f30, org.telegram.messenger.i0.L(16.0f) * f30, direction);
                int alpha3 = W0.getAlpha();
                float f33 = 0.6f * f29 * f17;
                W0.setAlpha((int) (alpha3 * f33));
                canvas2.drawPath(path, W0);
                W0.setAlpha(alpha3);
                if (unVar.xa.g()) {
                    int alpha4 = org.telegram.ui.ActionBar.t6.h2.getAlpha();
                    if (z11) {
                        f20 = f33;
                        org.telegram.ui.ActionBar.t6.h2.setColor(-1);
                    } else {
                        f20 = f33;
                    }
                    org.telegram.ui.ActionBar.t6.h2.setAlpha((int) (alpha4 * f20));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.t6.h2);
                    org.telegram.ui.ActionBar.t6.h2.setAlpha(alpha4);
                }
                int i17 = (f31 > 0.0f ? 1 : (f31 == 0.0f ? 0 : -1));
                if (i17 != 0) {
                    i15 = i17;
                    f19 = measuredHeight;
                    rectF2.set((int) (f18 - (org.telegram.messenger.i0.L(16.0f) * f31)), (int) (measuredHeight - (org.telegram.messenger.i0.L(16.0f) * f31)), (int) ((org.telegram.messenger.i0.L(16.0f) * f31) + f18), (int) ((org.telegram.messenger.i0.L(16.0f) * f31) + f19));
                    path.rewind();
                    path.addRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i15 = i17;
                    f19 = measuredHeight;
                }
                rectF2.set((int) (f18 - (org.telegram.messenger.i0.L(16.0f) * f30)), (int) (f19 - (org.telegram.messenger.i0.L(16.0f) * f30)), (int) ((org.telegram.messenger.i0.L(16.0f) * f30) + f18), (int) ((org.telegram.messenger.i0.L(16.0f) * f30) + f19));
                org.telegram.ui.ActionBar.t6.r(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                path.rewind();
                path.addRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f) * f30, org.telegram.messenger.i0.L(16.0f) * f30, direction);
                int alpha5 = W0.getAlpha();
                float f34 = f29 * 0.4f;
                W0.setAlpha((int) (alpha5 * f34));
                canvas2.drawPath(path, W0);
                W0.setAlpha(alpha5);
                if (unVar.xa.g()) {
                    int alpha6 = org.telegram.ui.ActionBar.t6.h2.getAlpha();
                    if (z11) {
                        org.telegram.ui.ActionBar.t6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.t6.h2.setAlpha((int) (f34 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.t6.h2);
                    org.telegram.ui.ActionBar.t6.h2.setAlpha(alpha6);
                }
                if (i15 != 0) {
                    canvas2.restore();
                }
                float f35 = iVar3.a / f16;
                if (f35 != 0.0f && f35 != 1.0f) {
                    float f36 = f35 + 1.0f;
                    float strokeWidth = paint5.getStrokeWidth();
                    float f37 = (1.0f - f35) * strokeWidth;
                    if (f37 != 0.0f) {
                        rectF2.set((int) ((f18 - (org.telegram.messenger.i0.L(16.0f) * f36)) + f37), (int) ((f19 - (org.telegram.messenger.i0.L(16.0f) * f36)) + f37), (int) (((org.telegram.messenger.i0.L(16.0f) * f36) + f18) - f37), (int) (((org.telegram.messenger.i0.L(16.0f) * f36) + f19) - f37));
                        org.telegram.ui.ActionBar.t6.r(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                        int alpha7 = paint5.getAlpha();
                        paint5.setAlpha((int) (alpha7 * f29));
                        paint5.setStrokeWidth(f37);
                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f) * f36, org.telegram.messenger.i0.L(16.0f) * f36, paint5);
                        paint5.setStrokeWidth(strokeWidth);
                        paint5.setAlpha(alpha7);
                        if (unVar.xa.g()) {
                            int alpha8 = paint3.getAlpha();
                            if (z11) {
                                paint3.setColor(-1);
                            }
                            paint3.setAlpha((int) (alpha8 * f29));
                            paint3.setStrokeWidth(f37);
                            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f) * f36, org.telegram.messenger.i0.L(16.0f) * f36, paint3);
                            paint3.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i18 = (int) (f29 * 255.0f);
                Drawable drawable = p6Var != null ? p6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.t6.R0("drawableReplyIcon");
                }
                drawable.setAlpha(i18);
                drawable.setBounds((int) (f18 - ((drawable.getIntrinsicWidth() / 2) * f30)), (int) (f19 - ((drawable.getIntrinsicHeight() / 2) * f30)), (int) (((drawable.getIntrinsicWidth() / 2) * f30) + f18), (int) (((drawable.getIntrinsicHeight() / 2) * f30) + f19));
                drawable.draw(canvas2);
                drawable.setAlpha(org.telegram.messenger.zs.e4);
                int i19 = i14;
                paint3.setColor(i19);
                paint4.setColor(i19);
                if (unVar.ga != 0.0f || unVar.isInPreviewMode() || unVar.ib || (i10 = unVar.f4) == 3 || i10 == 1) {
                    tpVar = unVar.ia;
                    if (tpVar == null) {
                        tpVar.O = 0.0f;
                        tpVar.N = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (unVar.na != 0.0f) {
                    float measuredHeight2 = unVar.z0.getMeasuredHeight() - unVar.ga;
                    un unVar2 = unVar.ma;
                    f11 = (measuredHeight2 + (unVar2 == null ? 0.0f : unVar2.ha)) * unVar.na;
                } else {
                    f11 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - unVar.Ua) - f11);
                if (unVar.ia == null) {
                    i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    tp tpVar2 = new tp(i13, unVar.fragmentView, unVar.j6, unVar.Na, unVar.Oa, unVar.b(), unVar.xa);
                    unVar.ia = tpVar2;
                    tpVar2.S = unVar.Qc.e;
                    ArrayList arrayList = unVar.Ab;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        unVar.ia.h((TLRPC.Chat) unVar.Ab.get(0));
                    } else if (unVar.v4) {
                        unVar.ia.i();
                    } else {
                        unVar.ia.g();
                    }
                    tp tpVar3 = unVar.ia;
                    tpVar3.F.P();
                    org.telegram.ui.Components.f5 f5Var = tpVar3.k0;
                    if (f5Var != null && (view = tpVar3.a0) != null) {
                        f5Var.a(view);
                    }
                    org.telegram.messenger.zs.f(tpVar3.e0).c(tpVar3, org.telegram.messenger.zs.r);
                }
                tp tpVar4 = unVar.ia;
                int measuredWidth3 = getMeasuredWidth() - (unVar.P9() ? org.telegram.messenger.i0.L(71.0f) : 0);
                ImageReceiver imageReceiver = tpVar4.F;
                TextPaint textPaint = tpVar4.f;
                TextPaint textPaint2 = tpVar4.h;
                boolean z12 = tpVar4.X;
                if (measuredWidth3 != tpVar4.c || (z12 && (tL_forumTopic = tpVar4.H) != null && tpVar4.I != tL_forumTopic.id)) {
                    tpVar4.d = org.telegram.messenger.i0.L(56.0f) / f10;
                    tpVar4.c = measuredWidth3;
                    TLRPC.Chat chat = tpVar4.G;
                    if (chat != null) {
                        L0 = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = tpVar4.H;
                        if (tL_forumTopic2 != null) {
                            L0 = tL_forumTopic2.title;
                        } else {
                            if (z12) {
                                i11 = 0;
                                L0 = org.telegram.messenger.cd.a0(null, null, 2131744334, org.telegram.messenger.vp.r1(tpVar4.e0).L0(Long.valueOf(-tpVar4.i0)).title);
                            } else {
                                i11 = 0;
                                L0 = org.telegram.messenger.cd.L0(2131744337, null);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) L0, i11, L0.length());
                            tpVar4.y = measureText;
                            int C = org.telegram.messenger.z20.C(60.0f, tpVar4.c, measureText);
                            tpVar4.y = C;
                            tpVar4.s = org.telegram.ui.Components.ov0.c(L0, textPaint, C, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, C, 1, true);
                            if (!tpVar4.V) {
                                L02 = org.telegram.messenger.cd.L0(2131744335, null);
                                L03 = org.telegram.messenger.cd.L0(2131746342, null);
                            } else if (z12) {
                                L02 = org.telegram.messenger.cd.L0(2131744333, null);
                                L03 = org.telegram.messenger.cd.L0(2131746341, null);
                            } else {
                                boolean z13 = tpVar4.W;
                                if (z13 && (i12 = tpVar4.a) != tpVar4.f0 && i12 != 0) {
                                    L02 = org.telegram.messenger.cd.L0(2131744339, null);
                                    L03 = org.telegram.messenger.cd.L0(2131746345, null);
                                } else if (z13) {
                                    L02 = org.telegram.messenger.cd.L0(2131744336, null);
                                    L03 = org.telegram.messenger.cd.L0(2131746343, null);
                                } else {
                                    L02 = org.telegram.messenger.cd.L0(2131744338, null);
                                    L03 = org.telegram.messenger.cd.L0(2131746344, null);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(L02);
                            tpVar4.D = measureText2;
                            tpVar4.D = org.telegram.messenger.z20.C(60.0f, tpVar4.c, measureText2);
                            int i20 = tpVar4.D;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            tpVar4.w = new StaticLayout(L02, textPaint2, i20, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(L03);
                            tpVar4.E = measureText3;
                            tpVar4.E = org.telegram.messenger.z20.C(60.0f, tpVar4.c, measureText3);
                            tpVar4.x = new StaticLayout(L03, textPaint2, tpVar4.E, alignment, 1.0f, 0.0f, false);
                            imageReceiver.y0((tpVar4.c / f10) - (org.telegram.messenger.i0.L(40.0f) / f10), (org.telegram.messenger.i0.L(12.0f) + tpVar4.d) - (org.telegram.messenger.i0.L(40.0f) / f10), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
                            imageReceiver.J0((int) (org.telegram.messenger.i0.L(40.0f) / f10));
                            tpVar4.c0.d(org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(100.0f));
                            if (z12) {
                                tpVar4.I = tpVar4.H == null ? 0L : r3.id;
                            }
                        }
                    }
                    i11 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) L0, i11, L0.length());
                    tpVar4.y = measureText4;
                    int C2 = org.telegram.messenger.z20.C(60.0f, tpVar4.c, measureText4);
                    tpVar4.y = C2;
                    tpVar4.s = org.telegram.ui.Components.ov0.c(L0, textPaint, C2, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, C2, 1, true);
                    if (!tpVar4.V) {
                    }
                    int measureText22 = (int) textPaint2.measureText(L02);
                    tpVar4.D = measureText22;
                    tpVar4.D = org.telegram.messenger.z20.C(60.0f, tpVar4.c, measureText22);
                    int i202 = tpVar4.D;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    tpVar4.w = new StaticLayout(L02, textPaint2, i202, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(L03);
                    tpVar4.E = measureText32;
                    tpVar4.E = org.telegram.messenger.z20.C(60.0f, tpVar4.c, measureText32);
                    tpVar4.x = new StaticLayout(L03, textPaint2, tpVar4.E, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.y0((tpVar4.c / f10) - (org.telegram.messenger.i0.L(40.0f) / f10), (org.telegram.messenger.i0.L(12.0f) + tpVar4.d) - (org.telegram.messenger.i0.L(40.0f) / f10), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
                    imageReceiver.J0((int) (org.telegram.messenger.i0.L(40.0f) / f10));
                    tpVar4.c0.d(org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(100.0f));
                    if (z12) {
                    }
                }
                float min = Math.min(1.0f, unVar.ga / org.telegram.messenger.i0.L(110.0f));
                canvas2.translate(unVar.P9() ? org.telegram.messenger.i0.W1(unVar.d9(), org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(71.0f)) : 0.0f, -(unVar.j9(org.telegram.ui.Components.k21.c) + unVar.T.getInputBubbleHeight() + unVar.w.d() + org.telegram.messenger.i0.L(10.0f)));
                unVar.ia.a(canvas2, unVar.z0, min, 1.0f - unVar.na);
                canvas2.restore();
                if (unVar.ma != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.z0.getMeasuredWidth(), unVar.ma.z0.getMeasuredHeight(), (int) (unVar.na * f7), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - unVar.ga) - f11);
                    unVar.ma.z0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f7 = 255.0f;
        f10 = 2.0f;
        if (unVar.ga != 0.0f) {
        }
        tpVar = unVar.ia;
        if (tpVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.F3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mh.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        un unVar = this.F3;
        lm lmVar = unVar.q9;
        lmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.i0.r(lmVar.f0);
            lmVar.z = false;
        }
        if (!this.V1 && ((lVar = unVar.qa) == null || !lVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (lVar2.u() || unVar.M9()) {
                return onInterceptTouchEvent;
            }
            C1(motionEvent);
            if (onInterceptTouchEvent || unVar.u9) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.f3;
        int i15 = i12 - i10;
        un unVar = this.F3;
        if (i14 != i15) {
            if (i14 != 0) {
                unVar.u9(false);
            }
            this.f3 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.E3 != measuredHeight) {
            this.D3 = true;
            xj xjVar = unVar.A0;
            if (xjVar != null) {
                xjVar.g();
            }
            unVar.k9.a();
            this.D3 = false;
            this.E3 = measuredHeight;
        }
        unVar.h6 = false;
        lm lmVar = unVar.q9;
        if (lmVar != null && lmVar.x()) {
            unVar.q9.w();
        }
        unVar.B9();
        unVar.R9();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        tp tpVar;
        un unVar = this.F3;
        fe.b bVar = unVar.Qc;
        lm lmVar = unVar.q9;
        lmVar.getClass();
        final int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.i0.r(lmVar.f0);
            lmVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            unVar.La = true;
        }
        if (unVar.ga != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, unVar.ga / org.telegram.messenger.i0.L(110.0f));
            final int i13 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (tpVar = unVar.ia) == null || tpVar.R) {
                tp tpVar2 = unVar.ia;
                if (tpVar2 != null && tpVar2.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    tp tpVar3 = unVar.ia;
                    if (currentTimeMillis - tpVar3.U < 500 && tpVar3.M) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        unVar.ja = animatorSet;
                        if (unVar.ia != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(unVar.ga, org.telegram.messenger.i0.L(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.uj
                            public final /* synthetic */ vj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        un unVar2 = this.b.F3;
                                        unVar2.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar2.z0.invalidate();
                                        break;
                                    case 1:
                                        un unVar3 = this.b.F3;
                                        unVar3.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar3.z0.invalidate();
                                        break;
                                    case 2:
                                        un unVar4 = this.b.F3;
                                        unVar4.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar4.z0.invalidate();
                                        break;
                                    default:
                                        un unVar5 = this.b.F3;
                                        unVar5.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar5.z0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(org.telegram.messenger.i0.L(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.uj
                            public final /* synthetic */ vj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        un unVar2 = this.b.F3;
                                        unVar2.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar2.z0.invalidate();
                                        break;
                                    case 1:
                                        un unVar3 = this.b.F3;
                                        unVar3.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar3.z0.invalidate();
                                        break;
                                    case 2:
                                        un unVar4 = this.b.F3;
                                        unVar4.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar4.z0.invalidate();
                                        break;
                                    default:
                                        un unVar5 = this.b.F3;
                                        unVar5.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar5.z0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(ci.o.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(unVar.ga, 0.0f);
                unVar.ja = ofFloat3;
                if (unVar.ia != null) {
                    bVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.uj
                    public final /* synthetic */ vj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                un unVar2 = this.b.F3;
                                unVar2.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar2.z0.invalidate();
                                break;
                            case 1:
                                un unVar3 = this.b.F3;
                                unVar3.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar3.z0.invalidate();
                                break;
                            case 2:
                                un unVar4 = this.b.F3;
                                unVar4.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar4.z0.invalidate();
                                break;
                            default:
                                un unVar5 = this.b.F3;
                                unVar5.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar5.z0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(ci.o.V);
                ofFloat3.start();
            } else if (tpVar.K != 1.0f) {
                float f7 = unVar.ga;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, org.telegram.messenger.i0.L(8.0f) + f7);
                unVar.ja = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.uj
                    public final /* synthetic */ vj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                un unVar2 = this.b.F3;
                                unVar2.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar2.z0.invalidate();
                                break;
                            case 1:
                                un unVar3 = this.b.F3;
                                unVar3.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar3.z0.invalidate();
                                break;
                            case 2:
                                un unVar4 = this.b.F3;
                                unVar4.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar4.z0.invalidate();
                                break;
                            default:
                                un unVar5 = this.b.F3;
                                unVar5.ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar5.z0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                ofFloat4.setInterpolator(grVar);
                ofFloat4.start();
                final tp tpVar4 = unVar.ia;
                rh rhVar = new rh(this, i10);
                AnimatorSet animatorSet2 = tpVar4.J;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    tpVar4.J.cancel();
                }
                tpVar4.Y = rhVar;
                tpVar4.J = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(tpVar4.K, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.sp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                tp tpVar5 = tpVar4;
                                tpVar5.getClass();
                                tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tpVar5.T.invalidate();
                                View view = tpVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                tp tpVar6 = tpVar4;
                                tpVar6.getClass();
                                tpVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = tpVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(tpVar4.L, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.sp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                tp tpVar5 = tpVar4;
                                tpVar5.getClass();
                                tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tpVar5.T.invalidate();
                                View view = tpVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                tp tpVar6 = tpVar4;
                                tpVar6.getClass();
                                tpVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = tpVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                tpVar4.J.addListener(new s9(tpVar4, 20));
                tpVar4.J.playTogether(ofFloat5, ofFloat6);
                tpVar4.J.setDuration(120L);
                tpVar4.J.setInterpolator(grVar);
                tpVar4.J.start();
            } else {
                un.d2(unVar);
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (lVar.u() || unVar.M9()) {
                return onTouchEvent;
            }
            C1(motionEvent);
            if (unVar.y9 || unVar.u9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.F3.e9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.gl0 X3;
        org.telegram.ui.Components.q81 q81Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.F3.r9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (X3 = ((org.telegram.ui.Cells.q1) view).X3()) != null && (q81Var = X3.d0) != null && X3.e0 && q81Var.w && !q81Var.E) {
                if (!q81Var.x) {
                    return;
                }
                if (!q81Var.y && (q81Var.L & 3) != 1) {
                    return;
                }
            }
            C1(null);
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.D3) {
            return;
        }
        zg.a aVar = this.F3.lc;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(s4.l0 l0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(l0Var);
    }

    @Override // org.telegram.ui.Components.tk0, android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            un unVar = this.F3;
            unVar.A9();
            unVar.C9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float f7;
        char c10;
        un unVar;
        float f10;
        int i12;
        float f11;
        int i13;
        org.telegram.messenger.ej ejVar;
        int i14;
        ArrayList arrayList;
        org.telegram.messenger.dj djVar;
        boolean z10;
        int i15;
        org.telegram.messenger.ej currentMessagesGroup;
        int i16;
        int i17;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar;
        int measuredHeight;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar2;
        int measuredHeight2;
        vj vjVar = this;
        Canvas canvas2 = canvas;
        int childCount = vjVar.getChildCount();
        org.telegram.messenger.ej ejVar2 = null;
        int i20 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            f7 = 0.0f;
            c10 = 0;
            unVar = vjVar.F3;
            if (i20 >= childCount) {
                f10 = 1.0f;
                break;
            }
            View childAt = vjVar.getChildAt(i20);
            f10 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!un.k2(unVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.y1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (unVar.C0.n && (childAt instanceof org.telegram.ui.Cells.f0)) {
                        float measuredHeight3 = ((((vjVar.getMeasuredHeight() - unVar.L9) - unVar.Ua) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + unVar.L9;
                        if (!((org.telegram.ui.Cells.f0) childAt).I && !unVar.z0.V1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                        float measuredHeight4 = ((((vjVar.getMeasuredHeight() - unVar.L9) - unVar.Ua) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + unVar.L9;
                        if (!((org.telegram.ui.Cells.ra) childAt).O && !unVar.z0.V1) {
                            if (childAt.getTop() > measuredHeight4) {
                                childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else {
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            org.telegram.messenger.ej currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != ejVar2) {
                                org.telegram.messenger.bj currentPosition = q1Var.getCurrentPosition();
                                org.telegram.ui.Components.aa0 backgroundDrawable = q1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || q1Var.w2()) && (currentPosition == null || (2 & currentPosition.l) != 0)) {
                                    boolean z12 = q1Var.v6;
                                    org.telegram.ui.ActionBar.p6 p6Var = vjVar.n2;
                                    z11 = true;
                                    if (z12 || q1Var.w6) {
                                        i17 = i20;
                                        if (currentPosition == null) {
                                            Paint W0 = vjVar.W0("paintChatMessageBackgroundSelected");
                                            sn snVar = unVar.xa;
                                            if ((snVar == null || !snVar.q) && W0 != null) {
                                                if (unVar.J9()) {
                                                    measuredHeight = unVar.z0.getTop();
                                                } else {
                                                    lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                                    measuredHeight = lVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - unVar.l1.getBackgroundTranslationY();
                                                int backgroundSizeY = unVar.l1.getBackgroundSizeY();
                                                sn snVar2 = unVar.xa;
                                                if (snVar2 != null) {
                                                    snVar2.b(q1Var.getX(), backgroundTranslationY, vjVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.t6.r(q1Var.getX(), backgroundTranslationY, vjVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                W0 = org.telegram.ui.ActionBar.t6.a2;
                                                W0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vd, p6Var));
                                            }
                                            Paint paint = W0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, q1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, q1Var.getTop(), vjVar.getMeasuredWidth(), q1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y3 = (int) q1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i18 = q1Var.getMeasuredHeight();
                                            i17 = i20;
                                        } else {
                                            int measuredHeight5 = q1Var.getMeasuredHeight() + y3;
                                            long j10 = 0;
                                            float f12 = 0.0f;
                                            int i21 = 0;
                                            while (i21 < childCount) {
                                                View childAt2 = vjVar.getChildAt(i21);
                                                int i22 = i20;
                                                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                    if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.aa0 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                        i19 = i21;
                                                        y3 = Math.min(y3, (int) q1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                        long j11 = backgroundDrawable2.l;
                                                        if (j11 > j10) {
                                                            j10 = j11;
                                                            f7 = q1Var2.getX() + backgroundDrawable2.h;
                                                            f12 = q1Var2.getY() + backgroundDrawable2.i;
                                                        }
                                                        i21 = i19 + 1;
                                                        i20 = i22;
                                                    }
                                                }
                                                i19 = i21;
                                                i21 = i19 + 1;
                                                i20 = i22;
                                            }
                                            i17 = i20;
                                            backgroundDrawable.j = f7;
                                            backgroundDrawable.k = f12 - y3;
                                            i18 = measuredHeight5 - y3;
                                        }
                                        int i23 = i18 + y3;
                                        canvas2.clipRect(0, y3, vjVar.getMeasuredWidth(), i23);
                                        Paint W02 = vjVar.W0("paintChatMessageBackgroundSelected");
                                        sn snVar3 = unVar.xa;
                                        if (snVar3 == null || snVar3.q || W02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vd, p6Var));
                                        } else {
                                            backgroundDrawable.b = W02;
                                            if (unVar.J9()) {
                                                measuredHeight2 = unVar.z0.getTop();
                                            } else {
                                                lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                                measuredHeight2 = lVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - unVar.l1.getBackgroundTranslationY();
                                            int backgroundSizeY2 = unVar.l1.getBackgroundSizeY();
                                            sn snVar4 = unVar.xa;
                                            if (snVar4 != null) {
                                                snVar4.b(q1Var.getX(), backgroundTranslationY2, vjVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.t6.r(q1Var.getX(), backgroundTranslationY2, vjVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y3, vjVar.getMeasuredWidth(), i23);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i17 = i20;
                                    z11 = true;
                                }
                                ejVar2 = currentMessagesGroup2;
                            } else {
                                i17 = i20;
                                z11 = true;
                            }
                            if (unVar.X8 != q1Var && currentMessagesGroup2 == null && q1Var.J0()) {
                                canvas2.save();
                                canvas2.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                                if (q1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX(), q1Var.getHeight() >> 1);
                                }
                                q1Var.K0(canvas2, z11, false);
                                canvas2.restore();
                            }
                        } else {
                            i17 = i20;
                            if (childAt instanceof org.telegram.ui.Cells.s0) {
                                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                                if (s0Var.R()) {
                                    canvas2.save();
                                    canvas2.translate(s0Var.getX(), s0Var.getY() + s0Var.getPaddingTop());
                                    canvas2.scale(s0Var.getScaleX(), s0Var.getScaleY(), s0Var.getMeasuredWidth() / 2.0f, s0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(unVar.e9() / 2.0f, 0.0f);
                                    s0Var.H(canvas2, true);
                                    s0Var.J(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                        i20 = i17 + 1;
                    }
                }
            }
            i17 = i20;
            i20 = i17 + 1;
        }
        View view = unVar.X8;
        org.telegram.messenger.ej currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup() : null;
        int i24 = 0;
        while (i24 < 3) {
            ArrayList arrayList2 = vjVar.k3;
            arrayList2.clear();
            if (i24 != i11 || unVar.z0.V1) {
                int i25 = 0;
                while (i25 < childCount) {
                    View childAt3 = unVar.z0.getChildAt(i25);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= unVar.z0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && q1Var3.getVisibility() != i10 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.dj djVar2 = currentMessagesGroup.m;
                            if (i24 == 0) {
                                i15 = i10;
                                i16 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i25++;
                                    i10 = i15;
                                    i11 = 2;
                                    f7 = 0.0f;
                                }
                            } else {
                                i15 = i10;
                                i16 = 1;
                            }
                            if ((i24 != i16 || djVar2.i) && ((i24 != 0 || !q1Var3.getMessageObject().Z) && ((i24 != 1 || q1Var3.getMessageObject().Z) && ((i24 != i11 || q1Var3.xa) && (i24 == i11 || !q1Var3.xa))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    djVar2.a = 0;
                                    djVar2.b = 0;
                                    djVar2.c = 0;
                                    djVar2.d = 0;
                                    djVar2.l = false;
                                    djVar2.k = false;
                                    djVar2.m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                djVar2.k = q1Var3.F2();
                                djVar2.l = q1Var3.E2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.i0.L(10.0f);
                                }
                                int i26 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.i0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i27 = backgroundDrawableBottom;
                                if (q1Var3.xa) {
                                    djVar2.m = q1Var3;
                                }
                                int i28 = djVar2.b;
                                if (i28 == 0 || i26 < i28) {
                                    djVar2.b = i26;
                                }
                                int i29 = djVar2.d;
                                if (i29 == 0 || i27 > i29) {
                                    djVar2.d = i27;
                                }
                                int i30 = djVar2.a;
                                if (i30 == 0 || backgroundDrawableLeft < i30) {
                                    djVar2.a = backgroundDrawableLeft;
                                }
                                int i31 = djVar2.c;
                                if (i31 == 0 || backgroundDrawableRight > i31) {
                                    djVar2.c = backgroundDrawableRight;
                                }
                            }
                            i25++;
                            i10 = i15;
                            i11 = 2;
                            f7 = 0.0f;
                        }
                    }
                    i15 = i10;
                    i25++;
                    i10 = i15;
                    i11 = 2;
                    f7 = 0.0f;
                }
                i12 = i10;
                int i32 = 0;
                while (i32 < arrayList2.size()) {
                    org.telegram.messenger.ej ejVar3 = (org.telegram.messenger.ej) arrayList2.get(i32);
                    org.telegram.messenger.dj djVar3 = ejVar3.m;
                    ArrayList arrayList3 = ejVar3.d;
                    float P1 = djVar3.m.P1(true);
                    float f13 = djVar3.a + P1 + djVar3.e;
                    float f14 = djVar3.b + djVar3.f;
                    float f15 = djVar3.g + djVar3.c + P1;
                    float f16 = djVar3.d + djVar3.h;
                    if (!djVar3.j) {
                        f14 += djVar3.m.getTranslationY();
                        f16 += djVar3.m.getTranslationY();
                    }
                    float f17 = f14;
                    if (f16 > org.telegram.messenger.i0.L(20.0f) + unVar.z0.getMeasuredHeight()) {
                        f16 = org.telegram.messenger.i0.L(20.0f) + unVar.z0.getMeasuredHeight();
                    }
                    boolean z13 = (djVar3.m.getScaleX() == f10 && djVar3.m.getScaleY() == f10) ? false : true;
                    if (z13) {
                        canvas2.save();
                        ejVar = ejVar3;
                        i14 = i24;
                        arrayList = arrayList2;
                        canvas2.scale(djVar3.m.getScaleX(), djVar3.m.getScaleY(), c3.i0.B(f15, f13, 2.0f, f13), c3.i0.B(f16, f17, 2.0f, f17));
                    } else {
                        ejVar = ejVar3;
                        i14 = i24;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i33 = 0;
                    while (true) {
                        if (i33 >= size) {
                            djVar = djVar3;
                            z10 = true;
                            break;
                        }
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList3.get(i33);
                        djVar = djVar3;
                        if (unVar.m6[org.telegram.messenger.jj.B0(jjVar.k) == unVar.j6 ? (char) 0 : (char) 1].indexOfKey(jjVar.f1()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i33++;
                            djVar3 = djVar;
                        }
                    }
                    float f18 = f16;
                    un unVar2 = unVar;
                    boolean z14 = z10;
                    org.telegram.messenger.ej ejVar4 = ejVar;
                    djVar.m.I0(canvas, (int) f13, (int) f17, (int) f15, (int) f16, djVar.k, djVar.l, z14, 0);
                    if (ejVar4 != currentMessagesGroup3) {
                        djVar.m = null;
                    }
                    djVar.o = ejVar4.c;
                    if (z13) {
                        canvas.restore();
                        for (int i34 = 0; i34 < childCount; i34++) {
                            View childAt4 = unVar2.z0.getChildAt(i34);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == ejVar4) {
                                    int left = q1Var4.getLeft();
                                    int top = q1Var4.getTop();
                                    childAt4.setPivotX(((f15 - f13) / 2.0f) + (f13 - left));
                                    childAt4.setPivotY(((f18 - f17) / 2.0f) + (f17 - top));
                                }
                            }
                        }
                    }
                    i32++;
                    canvas2 = canvas;
                    unVar = unVar2;
                    i24 = i14;
                    arrayList2 = arrayList;
                    c10 = 0;
                }
                f11 = 0.0f;
                i13 = 2;
            } else {
                i12 = i10;
                i13 = i11;
                f11 = f7;
            }
            canvas2 = canvas;
            unVar = unVar;
            i10 = i12;
            f7 = f11;
            i11 = i13;
            c10 = c10;
            i24++;
            vjVar = this;
        }
    }
}
