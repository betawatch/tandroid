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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wi extends ol {
    public final q1.f A3;
    public final q1.g B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final /* synthetic */ wm G3;
    public int g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public int m3;
    public int n3;
    public int o3;
    public long p3;
    public float q3;
    public float r3;
    public boolean s3;
    public final float t3;
    public final Paint u3;
    public final Paint v3;
    public final q1.f w3;
    public final q1.g x3;
    public final q1.f y3;
    public final q1.g z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(wm wmVar, Context context, um umVar) {
        super(wmVar, context, umVar);
        this.G3 = wmVar;
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList(10);
        this.t3 = 2000.0f;
        Paint paint = new Paint(1);
        this.u3 = paint;
        Paint paint2 = new Paint(1);
        this.v3 = paint2;
        q1.f fVar = new q1.f(0.0f);
        this.w3 = fVar;
        q1.g gVar = new q1.g(fVar);
        gVar.h = 0.0f;
        gVar.g = 2000.0f;
        gVar.m = org.telegram.ui.Cells.f1.s(0.0f, 1500.0f, 1.0f);
        final int i3 = 0;
        gVar.b(new q1.d(this) { // from class: org.telegram.ui.vi
            public final /* synthetic */ wi b;

            {
                this.b = this;
            }

            @Override // q1.d
            public final void a(q1.g gVar2, float f10, float f11) {
                switch (i3) {
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
        this.x3 = gVar;
        q1.f fVar2 = new q1.f(0.0f);
        this.y3 = fVar2;
        q1.g gVar2 = new q1.g(fVar2);
        gVar2.h = 0.0f;
        gVar2.m = org.telegram.ui.Cells.f1.s(0.0f, 400.0f, 0.5f);
        final int i10 = 1;
        gVar2.b(new q1.d(this) { // from class: org.telegram.ui.vi
            public final /* synthetic */ wi b;

            {
                this.b = this;
            }

            @Override // q1.d
            public final void a(q1.g gVar22, float f10, float f11) {
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
        this.z3 = gVar2;
        q1.f fVar3 = new q1.f(0.0f);
        this.A3 = fVar3;
        q1.g gVar3 = new q1.g(fVar3);
        gVar3.h = 0.0f;
        gVar3.m = org.telegram.ui.Cells.f1.s(0.0f, 200.0f, 1.0f);
        final int i11 = 2;
        gVar3.b(new q1.d(this) { // from class: org.telegram.ui.vi
            public final /* synthetic */ wi b;

            {
                this.b = this;
            }

            @Override // q1.d
            public final void a(q1.g gVar22, float f10, float f11) {
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
        this.B3 = gVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1(Canvas canvas, RectF rectF) {
        float f10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.h3;
        int size = arrayList2.size();
        wm wmVar = this.G3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i3);
                if (!wm.l2(wmVar, q1Var, rectF)) {
                    canvas.save();
                    canvas.translate(q1Var.R1(false) + q1Var.getLeft(), q1Var.getY() + q1Var.getPaddingTop());
                    q1Var.x1(q1Var.a() ? q1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.i3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i10);
                if (!wm.l2(wmVar, q1Var2, rectF)) {
                    float R1 = q1Var2.R1(false) + q1Var2.getLeft();
                    float y9 = q1Var2.getY() + q1Var2.getPaddingTop();
                    float alpha = q1Var2.a() ? q1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(R1, y9);
                    q1Var2.setInvalidatesParent(true);
                    q1Var2.h1(canvas, alpha);
                    q1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.j3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i11 = 0;
            while (i11 < size3) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList4.get(i11);
                if (wm.l2(wmVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z12 = (q1Var3.getCurrentPosition() == null || (q1Var3.getCurrentPosition().l & z10) != 0) ? z11 : z10;
                    float alpha2 = q1Var3.a() ? q1Var3.getAlpha() : 1.0f;
                    float R12 = q1Var3.R1(z11) + q1Var3.getLeft();
                    float y10 = q1Var3.getY() + q1Var3.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.ui currentMessagesGroup = q1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        org.telegram.messenger.ti tiVar = currentMessagesGroup.m;
                        if (tiVar.j) {
                            float R13 = q1Var3.R1(z10);
                            float f11 = tiVar.a + R13 + tiVar.e;
                            arrayList = arrayList4;
                            float f12 = tiVar.b + tiVar.f;
                            float f13 = tiVar.c + R13 + tiVar.g;
                            float f14 = tiVar.d + tiVar.h;
                            if (!tiVar.j) {
                                f12 += q1Var3.getTranslationY();
                                f14 += q1Var3.getTranslationY();
                            }
                            canvas.clipRect(f11 + org.telegram.messenger.g0.L(8.0f), f12 + org.telegram.messenger.g0.L(8.0f), f13 - org.telegram.messenger.g0.L(8.0f), f14 - org.telegram.messenger.g0.L(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (q1Var3.getTransitionParams().w0) {
                        canvas.translate(R12, y10);
                        q1Var3.setInvalidatesParent(true);
                        q1Var3.Q0(alpha2, canvas, z12);
                        q1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i11++;
                arrayList4 = arrayList;
                z10 = 1;
                z11 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.k3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i12 = 0; i12 < size4; i12++) {
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList5.get(i12);
                if (!wm.l2(wmVar, q1Var4, rectF)) {
                    boolean z13 = q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().l & 1) == 0;
                    float alpha3 = q1Var4.a() ? q1Var4.getAlpha() : 1.0f;
                    float R14 = q1Var4.R1(false) + q1Var4.getLeft();
                    float y11 = q1Var4.getY() + q1Var4.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.ui currentMessagesGroup2 = q1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        org.telegram.messenger.ti tiVar2 = currentMessagesGroup2.m;
                        if (tiVar2.j) {
                            float R15 = q1Var4.R1(true);
                            float f15 = tiVar2.a + R15 + tiVar2.e;
                            float f16 = tiVar2.b + tiVar2.f;
                            float f17 = tiVar2.c + R15 + tiVar2.g;
                            float f18 = tiVar2.d + tiVar2.h;
                            if (!tiVar2.j) {
                                f16 += q1Var4.getTranslationY();
                                f18 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f15 + org.telegram.messenger.g0.L(f10), f16 + org.telegram.messenger.g0.L(f10), f17 - org.telegram.messenger.g0.L(f10), f18 - org.telegram.messenger.g0.L(f10));
                        }
                    }
                    if (!z13 && q1Var4.getTransitionParams().w0) {
                        canvas.translate(R14, y11);
                        q1Var4.setInvalidatesParent(true);
                        q1Var4.o1(canvas, alpha3, null);
                        q1Var4.V0(canvas, alpha3);
                        q1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void B1(boolean z10) {
        float f10;
        VelocityTracker velocityTracker;
        wm wmVar = this.G3;
        if (!z10 || (velocityTracker = wmVar.y9) == null) {
            f10 = 0.0f;
        } else {
            velocityTracker.computeCurrentVelocity(1000);
            f10 = wmVar.y9.getXVelocity();
        }
        VelocityTracker velocityTracker2 = wmVar.y9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            wmVar.y9 = null;
        }
        wmVar.v9 = false;
        wmVar.C0.R = true;
        org.telegram.ui.Components.n01 n01Var = wmVar.n0;
        if (n01Var != null) {
            n01Var.settle(f10);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        org.telegram.messenger.ui S8;
        org.telegram.messenger.zi ziVar;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z11;
        wm wmVar = this.G3;
        if (motionEvent != null) {
            wmVar.Q4 = true;
        }
        if (wmVar.ea() && wmVar.s9 == null) {
            if (motionEvent == null) {
                if (wmVar.v9) {
                    B1(false);
                }
                wmVar.u9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z11 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
                    boolean z12 = (z11 || wmVar.y9() || motionEvent.getX() < ((float) getMeasuredWidth()) * 0.55f) ? false : true;
                    wmVar.u9 = z12;
                    if (z12) {
                        wmVar.v9 = false;
                        wmVar.w9 = motionEvent.getX();
                        wmVar.x9 = motionEvent.getY();
                        VelocityTracker velocityTracker = wmVar.y9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        wmVar.y9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                    wmVar.v9 = false;
                } else if (wmVar.u9 || wmVar.v9) {
                    if (actionMasked != 2) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            if (wmVar.v9) {
                                VelocityTracker velocityTracker2 = wmVar.y9;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.addMovement(motionEvent);
                                }
                                B1(actionMasked == 1);
                            }
                            wmVar.u9 = false;
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker3 = wmVar.y9;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - wmVar.w9;
                    float abs = Math.abs(motionEvent.getY() - wmVar.x9);
                    if (!wmVar.u9 || wmVar.v9 || getScrollState() != 0 || x10 > (-org.telegram.messenger.g0.a1(true, 0.4f)) || Math.abs(x10) / 3.0f <= abs || wmVar.y8() == null) {
                        if (wmVar.v9) {
                            wmVar.n0.setProgress((-(motionEvent.getX() - wmVar.w9)) / wmVar.n0.getContentWidth());
                            return;
                        }
                        return;
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.onInterceptTouchEvent(obtain2);
                    obtain2.recycle();
                    wmVar.C0.R = false;
                    wmVar.u9 = false;
                    wmVar.v9 = true;
                    wmVar.w9 = motionEvent.getX();
                    org.telegram.ui.Components.n01 n01Var = wmVar.n0;
                    ValueAnimator valueAnimator = n01Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        n01Var.K = null;
                    }
                    org.telegram.messenger.g0.v1(wmVar.m1);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    return;
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !wmVar.z9 && !wmVar.t9 && wmVar.s9 == null) {
            z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (!(pressedChildView instanceof org.telegram.ui.Cells.t0)) {
                        return;
                    }
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) pressedChildView;
                    float x11 = motionEvent.getX() - pressedChildView.getX();
                    float y9 = motionEvent.getY() - pressedChildView.getY();
                    if (!t0Var.S()) {
                        return;
                    }
                    org.telegram.ui.Wallet.b4 b4Var = t0Var.J0;
                    float f10 = (x11 - t0Var.L0) - (t0Var.k0 / 2.0f);
                    float paddingTop = (y9 - t0Var.M0) - t0Var.getPaddingTop();
                    org.telegram.ui.Wallet.a4 a4Var = b4Var.m;
                    if (a4Var != null && a4Var.n && b4Var.w.contains((int) f10, (int) paddingTop)) {
                        return;
                    }
                }
                if (wmVar.s9 != null) {
                    wm.d2(wmVar, 0.0f);
                }
                wmVar.s9 = pressedChildView;
                org.telegram.messenger.zi Z1 = wm.Z1(wmVar);
                boolean T6 = wmVar.T6(Z1);
                int i3 = wmVar.g4;
                if ((i3 != 0 && i3 != 5 && i3 != 8 && (i3 != 3 || wmVar.s4 != wmVar.getUserConfig().e())) || (((arrayList = wmVar.p4) != null && arrayList.contains(Z1)) || ((wmVar.Y8(Z1) == 1 && (org.telegram.messenger.zi.B0(Z1.k) == wmVar.c7 || Z1.n5())) || ((wmVar.h == null && Z1.f1() < 0) || (((chat2 = wmVar.e) != null && org.telegram.messenger.t3.c0(chat2) && !T6) || wmVar.y9() || (org.telegram.messenger.zi.d3(Z1.k) && Z1.O3())))))) {
                    wm.d2(wmVar, 0.0f);
                    wmVar.s9 = null;
                    return;
                } else {
                    this.o3 = motionEvent.getPointerId(0);
                    wmVar.t9 = true;
                    this.m3 = (int) motionEvent.getX();
                    this.n3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (wmVar.s9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.o3) {
            int max = Math.max(org.telegram.messenger.g0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.n3);
            if (getScrollState() == 0 && wmVar.t9 && !wmVar.z9 && max <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                wmVar.s9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                wmVar.C0.R = false;
                wmVar.t9 = false;
                wmVar.z9 = true;
                this.m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (wmVar.z9) {
                if (Math.abs(max) < org.telegram.messenger.g0.L(50.0f)) {
                    this.s3 = false;
                } else if (!this.s3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.s3 = true;
                }
                float f11 = max;
                wm.d2(wmVar, f11);
                org.telegram.messenger.zi Z12 = wm.Z1(wmVar);
                if (Z12 != null && (Z12.i4() || org.telegram.messenger.zi.M4(Z12.k))) {
                    wmVar.rd(false, false);
                }
                View view = wmVar.s9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f11);
                }
                invalidate();
                return;
            }
            return;
        }
        if (wmVar.s9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.o3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = wmVar.s9;
                if (Math.abs(view2 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view2).R1(false) : view2 instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view2).getWalletSlidingOffset() : 0.0f) >= org.telegram.messenger.g0.L(50.0f)) {
                    org.telegram.messenger.zi Z13 = wm.Z1(wmVar);
                    boolean T62 = wmVar.T6(Z13);
                    qj qjVar = wmVar.d1;
                    if ((qjVar == null || qjVar.getVisibility() != 0 || ((wmVar.X0 && T62) || Z13.V1)) && ((chat = wmVar.e) == null || ((!org.telegram.messenger.t3.r0(chat) || wmVar.da()) && ((!org.telegram.messenger.t3.T(wmVar.e) || org.telegram.messenger.t3.w(5, wmVar.e) || wmVar.e.megagroup) && org.telegram.messenger.t3.n(wmVar.e))))) {
                        wmVar.ec(wm.Z1(wmVar));
                    } else {
                        if (Z13.d1() != 0 && (S8 = wmVar.S8(Z13.d1())) != null && (ziVar = S8.h) != null) {
                            Z13 = ziVar;
                        }
                        wmVar.E5 = Z13;
                        Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
                        l10.putBoolean("quote", true);
                        l10.putBoolean("reply_to", true);
                        long o10 = org.telegram.messenger.m5.o(Z13.b1());
                        if (o10 != 0 && o10 != wmVar.a() && o10 != wmVar.getUserConfig().e() && o10 > 0) {
                            l10.putLong("reply_to_author", o10);
                        }
                        l10.putInt("messagesCount", 1);
                        l10.putBoolean("canSelectTopics", true);
                        uw uwVar = new uw(l10);
                        uwVar.D2 = wmVar;
                        wmVar.presentFragment(uwVar);
                    }
                }
            }
            View view3 = wmVar.s9;
            float slidingOffsetX = view3 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX() : view3 instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view3).getWalletSlidingOffset() : 0.0f;
            this.r3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                wmVar.s9 = null;
            }
            this.p3 = System.currentTimeMillis();
            this.q3 = 0.0f;
            invalidate();
            wmVar.t9 = false;
            wmVar.z9 = false;
            wmVar.C0.R = true;
        }
    }

    public final void D1(org.telegram.ui.Cells.q1 q1Var, float f10) {
        org.telegram.messenger.ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != q1Var && (childAt instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    q1Var2.setSlidingOffset(f10);
                    q1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wm wmVar = this.G3;
        wmVar.J8 = null;
        canvas.save();
        if (wmVar.pa != null && wmVar.la) {
            boolean z10 = wmVar.ma;
        }
        this.F1.setEmpty();
        if (wmVar.ha != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-wmVar.ha) - (wmVar.oa != 0.0f ? (wmVar.A0.getMeasuredHeight() - wmVar.ha) * wmVar.oa : 0.0f);
            wmVar.Ta = measuredHeight;
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
    
        if ((java.lang.System.currentTimeMillis() - r2.e7) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        int i3;
        int L;
        int i10;
        org.telegram.ui.ActionBar.t4 t4Var;
        float f11;
        org.telegram.ui.ActionBar.t4 t4Var2;
        boolean z11;
        km kmVar;
        int i11;
        int i12;
        float f12;
        int L2;
        int i13;
        float f13;
        float f14;
        boolean z12;
        wm wmVar = this.G3;
        ArrayList arrayList2 = wmVar.L6;
        ColorMatrix colorMatrix = wmVar.i7;
        m.b3 b3Var = wmVar.j7;
        org.telegram.ui.ActionBar.t4 t4Var3 = wmVar.k7;
        Paint paint = wmVar.s7;
        Paint paint2 = wmVar.g7;
        ArrayList arrayList3 = wmVar.f7;
        Paint paint3 = wmVar.h7;
        long j10 = wmVar.e7 != 0 ? 0L : 0L;
        if (!org.telegram.messenger.g0.Q1() && !wmVar.v4 && wmVar.f == null) {
            TLRPC.Chat chat = wmVar.e;
            boolean z13 = (chat == null || org.telegram.messenger.t3.V(chat)) && wmVar.g4 != 7;
            if (wmVar.ha != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -wmVar.ha);
            }
            int i14 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.o2;
            boolean z14 = i0.a.h(org.telegram.ui.ActionBar.k6.w0(i14, e6Var)) <= 0.699999988079071d;
            int i15 = org.telegram.ui.ActionBar.k6.i6;
            boolean z15 = z13;
            int f15 = i0.a.f(z14 ? 0.9f : 0.5f, org.telegram.ui.ActionBar.k6.w0(i15, e6Var), Color.argb(z14 ? 33 : 3, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4));
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i15, e6Var), z14 ? 24 : wm.jd);
            if (wmVar.r7 != o10 || wmVar.q7 != f15) {
                wmVar.q7 = f15;
                wmVar.r7 = o10;
                int L3 = org.telegram.messenger.g0.L(200.0f);
                wmVar.m7 = L3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L3, 0.0f, new int[]{o10, f15, f15, o10}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                wmVar.p7 = linearGradient;
                wmVar.n7 = (-wmVar.m7) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z14 ? 43 : 96, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, wmVar.m7, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                wmVar.u7 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.t4 t4Var4 = t4Var3;
            long j11 = wmVar.l7;
            int i16 = 2;
            Matrix matrix = wmVar.t7;
            m.b3 b3Var2 = b3Var;
            Matrix matrix2 = wmVar.o7;
            long abs = Math.abs(j11 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j12 = abs < 4 ? j10 : abs;
            int width = getWidth();
            wmVar.l7 = elapsedRealtime;
            int i17 = (int) (wmVar.n7 + ((width * j12) / 400.0f));
            wmVar.n7 = i17;
            if (i17 >= width * 2) {
                wmVar.n7 = (-wmVar.m7) * 2;
            }
            matrix2.setTranslate(wmVar.n7, 0.0f);
            LinearGradient linearGradient3 = wmVar.p7;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(wmVar.n7, 0.0f);
            LinearGradient linearGradient4 = wmVar.u7;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - wmVar.Va) - ((int) (wmVar.r9(org.telegram.ui.Components.c11.c) + wmVar.w.d()))) - org.telegram.messenger.g0.L(57.0f);
            int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                int top = getChildAt(i19).getTop();
                if (top < i18) {
                    i18 = top;
                }
            }
            if (wmVar.e7 == j10 && i18 <= 0) {
                z12 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
                wmVar.Z6(z12);
            }
            Paint W0 = W0("paintChatActionBackground");
            if (paint3.getColor() != W0.getColor()) {
                paint3.setColor(W0.getColor());
            }
            if (paint3.getShader() != W0.getShader()) {
                paint3.setShader(W0.getShader());
                colorMatrix.setSaturation(wm.kd);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i20 = 0;
            while (i20 < getChildCount()) {
                View childAt = getChildAt(i20);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    org.telegram.messenger.ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + q1Var.L1(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        f13 = 1.0f;
                        f14 = r13.b + currentMessagesGroup.m.f;
                    } else {
                        f13 = 1.0f;
                        f14 = 0.0f;
                    }
                    int i21 = (int) (top2 + f14);
                    i13 = i20;
                    if (wmVar.e7 == j10 && wmVar.ba()) {
                        i21 = org.telegram.messenger.g0.W1(childAt.getAlpha(), height, i21);
                    } else if (childAt.getAlpha() != f13) {
                        i21 = height;
                    }
                    if (i21 < height) {
                        height = i21;
                    }
                } else {
                    i13 = i20;
                    if (childAt instanceof org.telegram.ui.Cells.t0) {
                        int W1 = (wmVar.e7 == j10 && wmVar.ba()) ? org.telegram.messenger.g0.W1(childAt.getAlpha(), height, childAt.getTop()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (W1 < height) {
                            height = W1;
                        }
                    }
                }
                i20 = i13 + 1;
            }
            if (wmVar.ba()) {
                boolean z16 = org.telegram.messenger.az.o() != 0 && org.telegram.ui.ActionBar.k6.d1();
                int i22 = org.telegram.ui.ActionBar.k6.d6;
                boolean z17 = i0.a.h(org.telegram.ui.ActionBar.k6.w0(i22, e6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.k6.d1();
                boolean z18 = i0.a.h(org.telegram.ui.ActionBar.k6.w0(i22, e6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.k6.d1();
                if (z16) {
                    org.telegram.ui.ActionBar.k6.r(0.0f, getY() - wmVar.Q9, getMeasuredWidth(), org.telegram.messenger.g0.q.y);
                }
                int alpha = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                if (z18) {
                    org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (wmVar.e7 != j10) {
                    z10 = z17;
                    f10 = 1.0f - ((System.currentTimeMillis() - wmVar.e7) / 200.0f);
                } else {
                    z10 = z17;
                    f10 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                um umVar = wmVar.ya;
                float f16 = (umVar == null || !umVar.q || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f10 * f16));
                float f17 = alpha2;
                paint2.setAlpha((int) (f10 * f16 * f17));
                paint.setAlpha((int) (f10 * f17));
                int i23 = 0;
                while (height > wmVar.Ua) {
                    int L4 = height - org.telegram.messenger.g0.L(3.0f);
                    if (i23 >= arrayList3.size()) {
                        kmVar = new km();
                        t4Var2 = t4Var4;
                        TLRPC.Chat chat2 = wmVar.e;
                        if (chat2 == null || !org.telegram.messenger.t3.V(chat2)) {
                            z11 = z16;
                            kmVar.b = Utilities.c.nextInt(org.telegram.messenger.g0.L(64.0f)) + org.telegram.messenger.g0.L(64.0f);
                        } else {
                            z11 = z16;
                            kmVar.b = Utilities.c.nextInt(org.telegram.messenger.g0.L(64.0f)) + org.telegram.messenger.g0.L(128.0f);
                        }
                        float width2 = wmVar.A0.getWidth() * 0.8f;
                        if (z15) {
                            f12 = 42.0f;
                            L2 = 0;
                        } else {
                            f12 = 42.0f;
                            L2 = org.telegram.messenger.g0.L(42.0f);
                        }
                        kmVar.a = (int) Math.min(width2 - L2, (((Utilities.c.nextFloat() * 0.35f) + 0.4f) * wmVar.A0.getWidth()) + org.telegram.messenger.g0.L(f12));
                        arrayList3.add(kmVar);
                    } else {
                        t4Var2 = t4Var4;
                        z11 = z16;
                        kmVar = (km) arrayList3.get(i23);
                    }
                    boolean z19 = z10;
                    if (wmVar.e7 != j10) {
                        i11 = i16;
                        i12 = arrayList2.size() <= i11 ? Math.min(kmVar.c, L4) : kmVar.c;
                    } else {
                        i11 = i16;
                        i12 = L4;
                    }
                    kmVar.c = i12;
                    height = L4 - kmVar.b;
                    i23++;
                    i16 = i11;
                    z16 = z11;
                    z10 = z19;
                    t4Var4 = t4Var2;
                }
                org.telegram.ui.ActionBar.t4 t4Var5 = t4Var4;
                boolean z20 = z16;
                boolean z21 = z10;
                if (arrayList3.isEmpty()) {
                    L = getHeight() - wmVar.Va;
                    i3 = 0;
                } else {
                    i3 = 0;
                    L = ((km) arrayList3.get(0)).c + org.telegram.messenger.g0.L(3.0f);
                }
                int L5 = org.telegram.messenger.g0.L(z15 ? 3.0f : 51.0f);
                if (wmVar.Z9()) {
                    L5 = org.telegram.messenger.g0.W1(wmVar.k9(), L5, org.telegram.messenger.g0.L(71.0f));
                }
                while (i3 < arrayList3.size() && L > wmVar.Ua) {
                    int L6 = L - org.telegram.messenger.g0.L(3.0f);
                    km kmVar2 = (km) arrayList3.get(i3);
                    int i24 = kmVar2.c;
                    ArrayList arrayList4 = arrayList3;
                    boolean z22 = z21;
                    org.telegram.ui.ActionBar.t4 t4Var6 = t4Var5;
                    t4Var6.setBounds(L5, i24 - kmVar2.b, kmVar2.a, i24);
                    m.b3 b3Var3 = b3Var2;
                    if (z20) {
                        t4Var6.e(canvas, b3Var3, paint3);
                    }
                    t4Var6.e(canvas, b3Var3, paint2);
                    if (z22) {
                        t4Var6.e(canvas, b3Var3, org.telegram.ui.ActionBar.k6.h2);
                    }
                    t4Var6.e(canvas, b3Var3, paint);
                    if (z15) {
                        b3Var2 = b3Var3;
                        i10 = L5;
                        t4Var = t4Var6;
                    } else {
                        if (z20) {
                            f11 = 27.0f;
                            b3Var2 = b3Var3;
                            i10 = L5;
                            canvas.drawCircle(org.telegram.messenger.g0.L(27.0f), i24 - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), paint3);
                        } else {
                            b3Var2 = b3Var3;
                            i10 = L5;
                            f11 = 27.0f;
                        }
                        canvas.drawCircle(org.telegram.messenger.g0.L(f11), i24 - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), paint2);
                        if (z22) {
                            t4Var = t4Var6;
                            canvas.drawCircle(org.telegram.messenger.g0.L(f11), i24 - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.ui.ActionBar.k6.h2);
                        } else {
                            t4Var = t4Var6;
                        }
                        canvas.drawCircle(org.telegram.messenger.g0.L(f11), i24 - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), paint);
                    }
                    L = L6 - kmVar2.b;
                    i3++;
                    arrayList3 = arrayList4;
                    z21 = z22;
                    L5 = i10;
                    t4Var5 = t4Var;
                }
                arrayList = arrayList3;
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.k6.h2.setAlpha(alpha);
                invalidate();
            } else {
                arrayList = arrayList3;
                if (System.currentTimeMillis() - wmVar.e7 > 200) {
                    arrayList.clear();
                }
            }
            arrayList.size();
            arrayList2.size();
            if (wmVar.ha != 0.0f) {
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
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.ui.Cells.t0 t0Var;
        int i3;
        org.telegram.messenger.ui uiVar;
        int i10;
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        boolean z13;
        float f12;
        boolean z14;
        boolean z15;
        int paddingTop;
        float f13;
        float checkBoxTranslation;
        int i11;
        float f14;
        int b10;
        int b11;
        int i12;
        int i13;
        org.telegram.messenger.zi ziVar;
        wm wmVar = this.G3;
        if (wmVar.ba()) {
            invalidate();
        }
        boolean z16 = view == wmVar.Y8;
        boolean z17 = view instanceof org.telegram.ui.Cells.q1;
        if (z17) {
            q1Var = (org.telegram.ui.Cells.q1) view;
            z10 = q1Var.hb.x0;
        } else {
            q1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.qt0.f0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z16 = true;
        }
        if (z17) {
            q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (wmVar.E6.contains(q1Var2)) {
                z16 = true;
            }
            org.telegram.messenger.ri currentPosition = q1Var2.getCurrentPosition();
            uiVar = q1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i14 = currentPosition.e;
                int i15 = currentPosition.i;
                if (i14 != i15 && i15 == 1000 && currentPosition.m == null && uiVar.b) {
                    i3 = q1Var2.getBackgroundDrawableLeft();
                    i10 = 0;
                    i13 = q1Var2.L1;
                    if (i13 != 7) {
                    }
                    wmVar.J8 = q1Var2;
                    if (!z16) {
                    }
                    if (z16) {
                    }
                    t0Var = null;
                } else if (currentPosition.m != null) {
                    i10 = view.getBottom() - org.telegram.messenger.g0.L((q1Var2.G2() ? 1 : 0) + 1);
                    i3 = 0;
                    i13 = q1Var2.L1;
                    if ((i13 != 7 || i13 == 4) && (ziVar = q1Var2.P5) != null && ziVar.D != 5 && MediaController.B().I(q1Var2.P5)) {
                        wmVar.J8 = q1Var2;
                    }
                    if (!z16) {
                        View view2 = wmVar.Y8;
                        if (view2 instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) view2;
                            if (q1Var3.getCurrentMessagesGroup() != null && q1Var3.getCurrentMessagesGroup() == uiVar) {
                                z16 = true;
                            }
                        }
                    }
                    if (z16) {
                        q1Var2.getPhotoImage().getClass();
                    }
                    t0Var = null;
                }
            }
            i3 = 0;
            i10 = 0;
            i13 = q1Var2.L1;
            if (i13 != 7) {
            }
            wmVar.J8 = q1Var2;
            if (!z16) {
            }
            if (z16) {
            }
            t0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.t0) {
                t0Var = (org.telegram.ui.Cells.t0) view;
                q1Var2 = null;
            } else {
                q1Var2 = null;
                t0Var = null;
            }
            i3 = 0;
            uiVar = null;
            i10 = 0;
        }
        if (i3 != 0) {
            canvas.save();
        } else if (i10 != 0) {
            canvas.save();
        }
        if (z16) {
            z16 = false;
        }
        if (z16) {
            z11 = true;
            f10 = 0.0f;
            z12 = false;
        } else {
            boolean z18 = (q1Var2 == null || q1Var2.hb.w1 || uiVar == null || !uiVar.m.j) ? false : true;
            if (z18) {
                canvas.save();
                float R1 = q1Var2.R1(true);
                org.telegram.messenger.ti tiVar = uiVar.m;
                z11 = true;
                float f15 = tiVar.c + R1;
                f10 = 0.0f;
                canvas.clipRect(tiVar.a + R1 + tiVar.e + org.telegram.messenger.g0.L(4.0f), tiVar.b + tiVar.f + org.telegram.messenger.g0.L(4.0f), (f15 + tiVar.g) - org.telegram.messenger.g0.L(4.0f), (tiVar.d + tiVar.h) - org.telegram.messenger.g0.L(4.0f));
            } else {
                z11 = true;
                f10 = 0.0f;
            }
            if (q1Var2 != null) {
                org.telegram.ui.Cells.x1 x1Var = q1Var2.hb;
                if (x1Var.w1) {
                    canvas.save();
                    canvas.translate(q1Var2.getX(), q1Var2.getY());
                    q1Var2.d1(canvas);
                    canvas.restore();
                    z12 = x1Var.h;
                    if (z18) {
                        canvas.restore();
                    }
                    if (q1Var2 == null && q1Var2.j2()) {
                        canvas.save();
                        canvas.translate(q1Var2.getX(), q1Var2.getPaddingTopAnimated() + q1Var2.getY());
                        q1Var2.i1(canvas);
                        canvas.restore();
                    } else if (t0Var != null) {
                        canvas.save();
                        canvas.translate(t0Var.getX(), t0Var.getY());
                        t0Var.H(canvas);
                        canvas.restore();
                    }
                }
            }
            z12 = (q1Var2 == null || !z18) ? super.drawChild(canvas, view, j10) : super.drawChild(canvas, view, j10);
            if (z18) {
            }
            if (q1Var2 == null) {
            }
            if (t0Var != null) {
            }
        }
        if (i3 != 0 || i10 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            f11 = f10;
            canvas.translate(f11, view.getTranslationY());
        } else {
            f11 = f10;
        }
        if (q1Var2 != null) {
            q1Var2.S0(canvas);
        }
        if (view.getTranslationY() != f11) {
            canvas.restore();
        }
        if (view.getTranslationY() != f11) {
            canvas.save();
            canvas.translate(f11, view.getTranslationY());
        }
        if (q1Var2 != null) {
            org.telegram.messenger.zi messageObject = q1Var2.getMessageObject();
            org.telegram.messenger.ri currentPosition2 = q1Var2.getCurrentPosition();
            if (!z16) {
                if (currentPosition2 != null || q1Var2.getTransitionParams().x0) {
                    if (currentPosition2 == null || currentPosition2.h || (currentPosition2.a == 0 && currentPosition2.c == 0)) {
                        if (currentPosition2 == null || currentPosition2.h) {
                            this.h3.add(q1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.a == 0 && currentPosition2.c == 0)) && q1Var2.i2()) {
                            this.i3.add(q1Var2);
                        }
                    }
                    if (currentPosition2 != null || q1Var2.getTransitionParams().D0 || q1Var2.getTransitionParams().x0) {
                        if (currentPosition2 == null || (currentPosition2.l & q1Var2.B()) != 0) {
                            this.j3.add(q1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i16 = currentPosition2.l;
                            if ((i16 & 8) != 0) {
                            }
                        }
                        this.k3.add(q1Var2);
                    }
                }
                if (wmVar.I8 != null && ((messageObject.i4() || org.telegram.messenger.zi.M4(messageObject.k)) && !messageObject.U4() && MediaController.B().I(messageObject))) {
                    ImageReceiver photoImage = q1Var2.getPhotoImage();
                    float x10 = q1Var2.getX() + photoImage.L0;
                    float y9 = (wmVar.A0.getY() + ((q1Var2.getY() + q1Var2.getPaddingTop()) + photoImage.M0)) - wmVar.I8.getTop();
                    if (wmVar.I8.getTranslationX() != x10 || wmVar.I8.getTranslationY() != y9) {
                        wmVar.I8.setTranslationX(x10);
                        wmVar.I8.setTranslationY(y9);
                        wmVar.fragmentView.invalidate();
                        wmVar.I8.invalidate();
                    }
                }
            }
        }
        if (q1Var != null) {
            org.telegram.messenger.zi messageObject2 = q1Var.getMessageObject();
            org.telegram.messenger.ri currentPosition3 = q1Var.getCurrentPosition();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null && wmVar.k9() < 1.0f) {
                org.telegram.messenger.ui s92 = wmVar.s9(messageObject2);
                if (!q1Var.getMessageObject().Z) {
                    wmVar.A0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z14 = z11;
                        z15 = (!wmVar.A0.W1 || (s92 != null && s92.m.j)) ? z11 : false;
                        paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                        if (q1Var.m()) {
                            if (q1Var.ya) {
                                b11 = ((SparseArray) wmVar.l9.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) wmVar.l9.j).keyAt(b11);
                                }
                            } else {
                                b11 = wmVar.A0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (s92 != null) {
                                    ArrayList arrayList = s92.e;
                                    if (currentPosition3 != null) {
                                        int indexOf = arrayList.indexOf(currentPosition3);
                                        f13 = 1.0f;
                                        int size = arrayList.size();
                                        if ((currentPosition3.l & 8) != 0) {
                                            i12 = (b11 - size) + indexOf;
                                        } else {
                                            i12 = b11 - 1;
                                            int i17 = indexOf + 1;
                                            while (i17 < size) {
                                                int i18 = i17;
                                                z13 = z12;
                                                if (((org.telegram.messenger.ri) arrayList.get(i17)).c > currentPosition3.d) {
                                                    break;
                                                }
                                                i12--;
                                                i17 = i18 + 1;
                                                z12 = z13;
                                            }
                                        }
                                        z13 = z12;
                                        if (q1Var.ya) {
                                            if (wmVar.A0.K(i12) != null) {
                                                if (view.getTranslationY() != 0.0f) {
                                                    canvas.restore();
                                                }
                                                avatarImage.O0(false, false);
                                                return z13;
                                            }
                                        } else if (((View) ((SparseArray) wmVar.l9.j).get(i12)) != null) {
                                            if (view.getTranslationY() != 0.0f) {
                                                canvas.restore();
                                            }
                                            avatarImage.O0(false, false);
                                            return z13;
                                        }
                                        checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                        int layoutHeight = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                                        int measuredHeight = wmVar.A0.getMeasuredHeight() - wmVar.A0.getPaddingBottom();
                                        boolean z19 = ((!q1Var.n1 || q1Var.o1) && checkBoxTranslation == 0.0f) ? z11 : false;
                                        if (!q1Var.I2() || q1Var.getTransitionParams().l2) {
                                            if (q1Var.getTransitionParams().l2) {
                                                float f16 = q1Var.getTransitionParams().L1;
                                                if (!q1Var.I2()) {
                                                    f16 = f13 - f16;
                                                }
                                                layoutHeight = (int) com.google.android.recaptcha.internal.a.y(f13, f16, Math.min(layoutHeight, measuredHeight), layoutHeight * f16);
                                            }
                                        } else if (layoutHeight > measuredHeight) {
                                            layoutHeight = measuredHeight;
                                        }
                                        if (!z15 && view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        if (q1Var.j()) {
                                            if (q1Var.ya) {
                                                b10 = ((SparseArray) wmVar.l9.j).indexOfValue(view);
                                                if (b10 >= 0) {
                                                    b10 = ((SparseArray) wmVar.l9.j).keyAt(b10);
                                                }
                                            } else {
                                                b10 = wmVar.A0.T(view).b();
                                            }
                                            if (b10 >= 0) {
                                                float f17 = checkBoxTranslation;
                                                ?? r11 = q1Var;
                                                int i19 = b10;
                                                int i20 = 0;
                                                while (i20 < 20) {
                                                    i20++;
                                                    if (s92 != null) {
                                                        ArrayList arrayList2 = s92.e;
                                                        if (currentPosition3 != null) {
                                                            int indexOf2 = arrayList2.indexOf(currentPosition3);
                                                            if (indexOf2 < 0) {
                                                                break;
                                                            }
                                                            arrayList2.size();
                                                            i11 = layoutHeight;
                                                            if ((currentPosition3.l & 4) != 0) {
                                                                i19 = i19 + indexOf2 + 1;
                                                            } else {
                                                                i19++;
                                                                int i21 = indexOf2 - 1;
                                                                while (i21 >= 0) {
                                                                    int i22 = i21;
                                                                    if (((org.telegram.messenger.ri) arrayList2.get(i21)).d < currentPosition3.c) {
                                                                        break;
                                                                    }
                                                                    i19++;
                                                                    i21 = i22 - 1;
                                                                }
                                                            }
                                                            if (!r11.l()) {
                                                                ?? r02 = (View) ((SparseArray) wmVar.l9.j).get(i19);
                                                                if (r02 == 0) {
                                                                    break;
                                                                }
                                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                                if (!(r02 instanceof org.telegram.ui.Cells.p4)) {
                                                                    break;
                                                                }
                                                                r11 = (org.telegram.ui.Cells.p4) r02;
                                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                                if (z19 && checkBoxTranslation2 > 0.0f) {
                                                                    f17 = checkBoxTranslation2;
                                                                }
                                                                if (!r11.j()) {
                                                                    break;
                                                                }
                                                                layoutHeight = i11;
                                                                r11 = r11;
                                                            } else {
                                                                u4.d1 K = wmVar.A0.K(i19);
                                                                if (K == null) {
                                                                    break;
                                                                }
                                                                ?? r03 = K.a;
                                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                                if (!(r03 instanceof org.telegram.ui.Cells.q1)) {
                                                                    break;
                                                                }
                                                                r11 = (org.telegram.ui.Cells.p4) r03;
                                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                                if (z19 && checkBoxTranslation3 > 0.0f) {
                                                                    f17 = checkBoxTranslation3;
                                                                }
                                                                if (!r11.j()) {
                                                                    break;
                                                                }
                                                                layoutHeight = i11;
                                                                r11 = r11;
                                                            }
                                                            int L = i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop ? org.telegram.messenger.g0.L(48.0f) + paddingTop : i11;
                                                            if (!q1Var.m()) {
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
                                                                avatarImage.M0 = L - org.telegram.messenger.g0.L(44.0f);
                                                            }
                                                            if (q1Var.a()) {
                                                                avatarImage.setAlpha(q1Var.getAlpha() * (1.0f - wmVar.k9()));
                                                                canvas.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX() + q1Var.getX(), q1Var.getY() + (q1Var.getHeight() >> 1));
                                                                f14 = 1.0f;
                                                            } else {
                                                                f14 = 1.0f;
                                                                avatarImage.setAlpha(1.0f - wmVar.k9());
                                                            }
                                                            if (z14) {
                                                                avatarImage.O0(z11, false);
                                                            }
                                                            if (wmVar.k9() > 0.0f) {
                                                                canvas.scale(f14 - wmVar.k9(), f14 - wmVar.k9(), avatarImage.y(), avatarImage.A());
                                                                f12 = 0.0f;
                                                                canvas.translate(wmVar.k9() * org.telegram.messenger.g0.L(24.0f), 0.0f);
                                                            } else {
                                                                f12 = 0.0f;
                                                            }
                                                            avatarImage.h(canvas, null);
                                                            canvas.restore();
                                                            if (!z15 && view.getTranslationY() != f12) {
                                                                canvas.save();
                                                            }
                                                            if (view.getTranslationY() != f12) {
                                                                canvas.restore();
                                                            }
                                                            return z13;
                                                        }
                                                    }
                                                    i11 = layoutHeight;
                                                    i19++;
                                                    if (!r11.l()) {
                                                    }
                                                    if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                                                    }
                                                    if (!q1Var.m()) {
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
                                                    if (wmVar.k9() > 0.0f) {
                                                    }
                                                    avatarImage.h(canvas, null);
                                                    canvas.restore();
                                                    if (!z15) {
                                                        canvas.save();
                                                    }
                                                    if (view.getTranslationY() != f12) {
                                                    }
                                                    return z13;
                                                }
                                                i11 = layoutHeight;
                                                q1Var = r11;
                                                checkBoxTranslation = f17;
                                                if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                                                }
                                                if (!q1Var.m()) {
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
                                                if (wmVar.k9() > 0.0f) {
                                                }
                                                avatarImage.h(canvas, null);
                                                canvas.restore();
                                                if (!z15) {
                                                }
                                                if (view.getTranslationY() != f12) {
                                                }
                                                return z13;
                                            }
                                        }
                                        i11 = layoutHeight;
                                        if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                                        }
                                        if (!q1Var.m()) {
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
                                        if (wmVar.k9() > 0.0f) {
                                        }
                                        avatarImage.h(canvas, null);
                                        canvas.restore();
                                        if (!z15) {
                                        }
                                        if (view.getTranslationY() != f12) {
                                        }
                                        return z13;
                                    }
                                }
                                z13 = z12;
                                f13 = 1.0f;
                                i12 = b11 - 1;
                                if (q1Var.ya) {
                                }
                                checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                int layoutHeight2 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                                int measuredHeight2 = wmVar.A0.getMeasuredHeight() - wmVar.A0.getPaddingBottom();
                                if (q1Var.n1) {
                                }
                                if (q1Var.I2()) {
                                }
                                if (q1Var.getTransitionParams().l2) {
                                }
                                if (!z15) {
                                    canvas.restore();
                                }
                                if (q1Var.j()) {
                                }
                                i11 = layoutHeight2;
                                if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                                }
                                if (!q1Var.m()) {
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
                                if (wmVar.k9() > 0.0f) {
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                if (!z15) {
                                }
                                if (view.getTranslationY() != f12) {
                                }
                                return z13;
                            }
                        }
                        z13 = z12;
                        f13 = 1.0f;
                        checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                        int layoutHeight22 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                        int measuredHeight22 = wmVar.A0.getMeasuredHeight() - wmVar.A0.getPaddingBottom();
                        if (q1Var.n1) {
                        }
                        if (q1Var.I2()) {
                        }
                        if (q1Var.getTransitionParams().l2) {
                        }
                        if (!z15) {
                        }
                        if (q1Var.j()) {
                        }
                        i11 = layoutHeight22;
                        if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                        }
                        if (!q1Var.m()) {
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
                        if (wmVar.k9() > 0.0f) {
                        }
                        avatarImage.h(canvas, null);
                        canvas.restore();
                        if (!z15) {
                        }
                        if (view.getTranslationY() != f12) {
                        }
                        return z13;
                    }
                }
                z14 = false;
                if (wmVar.A0.W1) {
                }
                paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                if (q1Var.m()) {
                }
                z13 = z12;
                f13 = 1.0f;
                checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                int layoutHeight222 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                int measuredHeight222 = wmVar.A0.getMeasuredHeight() - wmVar.A0.getPaddingBottom();
                if (q1Var.n1) {
                }
                if (q1Var.I2()) {
                }
                if (q1Var.getTransitionParams().l2) {
                }
                if (!z15) {
                }
                if (q1Var.j()) {
                }
                i11 = layoutHeight222;
                if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                }
                if (!q1Var.m()) {
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
                if (wmVar.k9() > 0.0f) {
                }
                avatarImage.h(canvas, null);
                canvas.restore();
                if (!z15) {
                }
                if (view.getTranslationY() != f12) {
                }
                return z13;
            }
        }
        z13 = z12;
        f12 = 0.0f;
        if (view.getTranslationY() != f12) {
        }
        return z13;
    }

    @Override // org.telegram.ui.Components.tj0
    public final void j1(View view, float f10, float f11, boolean z10) {
        org.telegram.messenger.ui currentMessagesGroup;
        super.j1(view, f10, f11, z10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            if (messageObject.J3() || messageObject.V2() || (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
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
        float f10;
        float f11;
        to toVar;
        int i3;
        float f12;
        int i10;
        String M0;
        String M02;
        String M03;
        int i11;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i12;
        View view;
        Paint paint;
        Paint paint2;
        int i13;
        float f13;
        float f14;
        float f15;
        float f16;
        Paint paint3;
        float f17;
        Paint paint4;
        Paint paint5;
        float f18;
        float f19;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i14;
        float f20;
        float f21;
        super.onDraw(canvas);
        wm wmVar = this.G3;
        View view2 = wmVar.s9;
        if (view2 != null) {
            float slidingOffsetX = view2 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view2).getSlidingOffsetX() : view2 instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view2).getWalletSlidingOffset() : 0.0f;
            if (!wmVar.t9 && !wmVar.z9 && this.r3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f22 = ((currentTimeMillis - this.p3) / 180.0f) + this.q3;
                this.q3 = f22;
                if (f22 > 1.0f) {
                    this.q3 = 1.0f;
                }
                this.p3 = currentTimeMillis;
                float interpolation = (1.0f - org.telegram.messenger.g0.F.getInterpolation(this.q3)) * this.r3;
                if (interpolation == 0.0f) {
                    this.r3 = 0.0f;
                }
                View view3 = wmVar.s9;
                if (view3 instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view3, interpolation);
                }
                wm.d2(wmVar, interpolation);
                org.telegram.messenger.zi Z1 = wm.Z1(wmVar);
                if (Z1 != null && (Z1.i4() || org.telegram.messenger.zi.M4(Z1.k))) {
                    wmVar.rd(false, false);
                }
                float f23 = this.q3;
                if (f23 == 1.0f || f23 == 0.0f) {
                    wm.d2(wmVar, 0.0f);
                    wmVar.s9 = null;
                }
                invalidate();
            }
            if (wmVar.s9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint W0 = W0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.k6.h2;
                Paint paint7 = this.u3;
                if (paint7.getColor() != W0.getColor()) {
                    paint7.setColor(W0.getColor());
                }
                Paint paint8 = this.v3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != W0.getShader()) {
                    paint7.setShader(W0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                q1.f fVar = this.y3;
                float f24 = fVar.a;
                float f25 = this.t3;
                float f26 = f24 / f25;
                f10 = 255.0f;
                int color = paint8.getColor();
                if (f26 > 1.0f) {
                    this.C3 = true;
                }
                f11 = 2.0f;
                View view4 = wmVar.s9;
                float R1 = view4 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view4).R1(false) : view4 instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view4).getWalletSlidingOffset() : 0.0f;
                q1.f fVar2 = this.w3;
                float f27 = fVar2.a;
                q1.f fVar3 = this.A3;
                q1.g gVar = this.B3;
                q1.g gVar2 = this.z3;
                if (f27 == 0.0f) {
                    gVar2.d();
                    paint = paint6;
                    paint2 = paint7;
                    i13 = color;
                    double d = 0.0f;
                    gVar2.m.i = d;
                    fVar.a = 0.0f;
                    gVar.d();
                    gVar.m.i = d;
                    fVar3.a = 0.0f;
                    this.C3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i13 = color;
                }
                if (((float) gVar2.m.i) != f25) {
                    f13 = 1.0f;
                    f14 = b8.be.a(((-R1) - org.telegram.messenger.g0.L(20.0f)) / org.telegram.messenger.g0.L(30.0f), 0.0f, 1.0f);
                } else {
                    f13 = 1.0f;
                    f14 = 1.0f;
                }
                if (f14 == f13) {
                    q1.h hVar = gVar2.m;
                    f15 = 20.0f;
                    f16 = f26;
                    if (((float) hVar.i) != f25) {
                        double d10 = f25;
                        hVar.i = d10;
                        gVar2.h();
                        gVar.m.i = d10;
                        gVar.h();
                    }
                } else {
                    f15 = 20.0f;
                    f16 = f26;
                }
                float f28 = R1 <= ((float) (-org.telegram.messenger.g0.L(f15))) ? f25 : 0.0f;
                q1.g gVar3 = this.x3;
                q1.h hVar2 = gVar3.m;
                float f29 = f16;
                if (f28 != ((float) hVar2.i)) {
                    hVar2.i = f28;
                    if (!gVar3.f) {
                        gVar3.h();
                    }
                }
                float f30 = fVar2.a / f25;
                org.telegram.messenger.zi Z12 = wm.Z1(wmVar);
                float measuredWidth = (R1 * ((Z12 == null || !Z12.O3()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (wmVar.s9.getMeasuredHeight() / 2.0f) + wmVar.s9.getTop();
                boolean z10 = this.C3;
                float f31 = z10 ? f29 : f30;
                float f32 = z10 ? 0.0f : 1.0f - f29;
                int i15 = org.telegram.ui.ActionBar.k6.d6;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.o2;
                boolean z11 = i0.a.h(org.telegram.ui.ActionBar.k6.w0(i15, e6Var2)) <= 0.5d;
                if (f30 != 0.0f) {
                    paint3 = paint8;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (org.telegram.messenger.g0.L(16.0f) * f31))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (org.telegram.messenger.g0.L(16.0f) * f31))), (int) (((org.telegram.messenger.g0.L(16.0f) * f31) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((org.telegram.messenger.g0.L(16.0f) * f31) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.k6.r(0.0f, getY() + rectF.top, getMeasuredWidth(), org.telegram.messenger.g0.q.y);
                    if (f29 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        paint2.setAlpha((int) (alpha * f30));
                        float f33 = f14 * 360.0f;
                        f17 = f25;
                        paint4 = paint;
                        f18 = f14;
                        e6Var = e6Var2;
                        Paint paint9 = paint2;
                        f19 = measuredWidth;
                        canvas.drawArc(rectF, -90.0f, f33, false, paint9);
                        paint9.setAlpha(alpha);
                        if (wmVar.ya.g()) {
                            int alpha2 = paint3.getAlpha();
                            paint3 = paint3;
                            if (z11) {
                                paint3.setColor(-1);
                            }
                            paint3.setAlpha((int) (alpha2 * f30));
                            paint5 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f33, false, paint3);
                        } else {
                            paint5 = paint9;
                            paint3 = paint3;
                            canvas2 = canvas;
                        }
                    } else {
                        canvas2 = canvas;
                        f17 = f25;
                        paint4 = paint;
                        paint5 = paint2;
                        f18 = f14;
                        f19 = measuredWidth;
                        e6Var = e6Var2;
                    }
                } else {
                    canvas2 = canvas;
                    paint3 = paint8;
                    f17 = f25;
                    paint4 = paint;
                    paint5 = paint2;
                    f18 = f14;
                    f19 = measuredWidth;
                    e6Var = e6Var2;
                }
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set((int) (f19 - (org.telegram.messenger.g0.L(16.0f) * f31)), (int) (measuredHeight - (org.telegram.messenger.g0.L(16.0f) * f31)), (int) ((org.telegram.messenger.g0.L(16.0f) * f31) + f19), (int) ((org.telegram.messenger.g0.L(16.0f) * f31) + measuredHeight));
                int measuredWidth2 = getMeasuredWidth();
                Point point = org.telegram.messenger.g0.q;
                org.telegram.ui.ActionBar.k6.r(0.0f, getY() + rectF2.top, measuredWidth2, point.y);
                Path path = this.D3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f) * f31, org.telegram.messenger.g0.L(16.0f) * f31, direction);
                int alpha3 = W0.getAlpha();
                float f34 = 0.6f * f30 * f18;
                W0.setAlpha((int) (alpha3 * f34));
                canvas2.drawPath(path, W0);
                W0.setAlpha(alpha3);
                if (wmVar.ya.g()) {
                    int alpha4 = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                    if (z11) {
                        f21 = f34;
                        org.telegram.ui.ActionBar.k6.h2.setColor(-1);
                    } else {
                        f21 = f34;
                    }
                    org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (alpha4 * f21));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.h2);
                    org.telegram.ui.ActionBar.k6.h2.setAlpha(alpha4);
                }
                int i16 = (f32 > 0.0f ? 1 : (f32 == 0.0f ? 0 : -1));
                if (i16 != 0) {
                    i14 = i16;
                    f20 = measuredHeight;
                    rectF2.set((int) (f19 - (org.telegram.messenger.g0.L(16.0f) * f32)), (int) (measuredHeight - (org.telegram.messenger.g0.L(16.0f) * f32)), (int) ((org.telegram.messenger.g0.L(16.0f) * f32) + f19), (int) ((org.telegram.messenger.g0.L(16.0f) * f32) + f20));
                    path.rewind();
                    path.addRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i14 = i16;
                    f20 = measuredHeight;
                }
                rectF2.set((int) (f19 - (org.telegram.messenger.g0.L(16.0f) * f31)), (int) (f20 - (org.telegram.messenger.g0.L(16.0f) * f31)), (int) ((org.telegram.messenger.g0.L(16.0f) * f31) + f19), (int) ((org.telegram.messenger.g0.L(16.0f) * f31) + f20));
                org.telegram.ui.ActionBar.k6.r(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                path.rewind();
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f) * f31, org.telegram.messenger.g0.L(16.0f) * f31, direction);
                int alpha5 = W0.getAlpha();
                float f35 = f30 * 0.4f;
                W0.setAlpha((int) (alpha5 * f35));
                canvas2.drawPath(path, W0);
                W0.setAlpha(alpha5);
                if (wmVar.ya.g()) {
                    int alpha6 = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                    if (z11) {
                        org.telegram.ui.ActionBar.k6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (f35 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.h2);
                    org.telegram.ui.ActionBar.k6.h2.setAlpha(alpha6);
                }
                if (i14 != 0) {
                    canvas2.restore();
                }
                float f36 = fVar3.a / f17;
                if (f36 != 0.0f && f36 != 1.0f) {
                    float f37 = f36 + 1.0f;
                    float strokeWidth = paint5.getStrokeWidth();
                    float f38 = (1.0f - f36) * strokeWidth;
                    if (f38 != 0.0f) {
                        rectF2.set((int) ((f19 - (org.telegram.messenger.g0.L(16.0f) * f37)) + f38), (int) ((f20 - (org.telegram.messenger.g0.L(16.0f) * f37)) + f38), (int) (((org.telegram.messenger.g0.L(16.0f) * f37) + f19) - f38), (int) (((org.telegram.messenger.g0.L(16.0f) * f37) + f20) - f38));
                        org.telegram.ui.ActionBar.k6.r(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                        int alpha7 = paint5.getAlpha();
                        paint5.setAlpha((int) (alpha7 * f30));
                        paint5.setStrokeWidth(f38);
                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f) * f37, org.telegram.messenger.g0.L(16.0f) * f37, paint5);
                        paint5.setStrokeWidth(strokeWidth);
                        paint5.setAlpha(alpha7);
                        if (wmVar.ya.g()) {
                            int alpha8 = paint3.getAlpha();
                            if (z11) {
                                paint3.setColor(-1);
                            }
                            paint3.setAlpha((int) (alpha8 * f30));
                            paint3.setStrokeWidth(f38);
                            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f) * f37, org.telegram.messenger.g0.L(16.0f) * f37, paint3);
                            paint3.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i17 = (int) (f30 * 255.0f);
                Drawable drawable = e6Var != null ? e6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.k6.R0("drawableReplyIcon");
                }
                drawable.setAlpha(i17);
                drawable.setBounds((int) (f19 - ((drawable.getIntrinsicWidth() / 2) * f31)), (int) (f20 - ((drawable.getIntrinsicHeight() / 2) * f31)), (int) (((drawable.getIntrinsicWidth() / 2) * f31) + f19), (int) (((drawable.getIntrinsicHeight() / 2) * f31) + f20));
                drawable.draw(canvas2);
                drawable.setAlpha(org.telegram.messenger.hs.e4);
                int i18 = i13;
                paint3.setColor(i18);
                paint4.setColor(i18);
                if (wmVar.ha != 0.0f || wmVar.isInPreviewMode() || wmVar.jb || (i3 = wmVar.g4) == 3 || i3 == 1) {
                    toVar = wmVar.ja;
                    if (toVar == null) {
                        toVar.P = 0.0f;
                        toVar.O = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (wmVar.oa != 0.0f) {
                    float measuredHeight2 = wmVar.A0.getMeasuredHeight() - wmVar.ha;
                    wm wmVar2 = wmVar.na;
                    f12 = (measuredHeight2 + (wmVar2 == null ? 0.0f : wmVar2.ia)) * wmVar.oa;
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - wmVar.Va) - f12);
                if (wmVar.ja == null) {
                    i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    to toVar2 = new to(i12, wmVar.fragmentView, wmVar.k6, wmVar.Oa, wmVar.Pa, wmVar.b(), wmVar.ya);
                    wmVar.ja = toVar2;
                    toVar2.T = wmVar.Zc.e;
                    ArrayList arrayList = wmVar.Cb;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        wmVar.ja.g((TLRPC.Chat) wmVar.Cb.get(0));
                    } else if (wmVar.w4) {
                        wmVar.ja.h();
                    } else {
                        wmVar.ja.f();
                    }
                    to toVar3 = wmVar.ja;
                    toVar3.G.P();
                    org.telegram.ui.Components.g5 g5Var = toVar3.l0;
                    if (g5Var != null && (view = toVar3.b0) != null) {
                        g5Var.a(view);
                    }
                    org.telegram.messenger.hs.f(toVar3.f0).c(toVar3, org.telegram.messenger.hs.r);
                }
                to toVar4 = wmVar.ja;
                int measuredWidth3 = getMeasuredWidth() - (wmVar.Z9() ? org.telegram.messenger.g0.L(71.0f) : 0);
                ImageReceiver imageReceiver = toVar4.G;
                TextPaint textPaint = toVar4.f;
                TextPaint textPaint2 = toVar4.h;
                boolean z12 = toVar4.Y;
                if (measuredWidth3 != toVar4.c || (z12 && (tL_forumTopic = toVar4.I) != null && toVar4.J != tL_forumTopic.id)) {
                    toVar4.d = org.telegram.messenger.g0.L(56.0f) / f11;
                    toVar4.c = measuredWidth3;
                    TLRPC.Chat chat = toVar4.H;
                    if (chat != null) {
                        M0 = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = toVar4.I;
                        if (tL_forumTopic2 != null) {
                            M0 = tL_forumTopic2.title;
                        } else {
                            if (z12) {
                                i10 = 0;
                                M0 = org.telegram.messenger.bd.a0(null, null, 2131744318, org.telegram.messenger.hp.s1(toVar4.f0).M0(Long.valueOf(-toVar4.j0)).title);
                            } else {
                                i10 = 0;
                                M0 = org.telegram.messenger.bd.M0(2131744321, null);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) M0, i10, M0.length());
                            toVar4.y = measureText;
                            int C = org.telegram.messenger.camera.q.C(60.0f, toVar4.c, measureText);
                            toVar4.y = C;
                            toVar4.s = org.telegram.ui.Components.lu0.c(M0, textPaint, C, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, C, 1, true);
                            if (!toVar4.W) {
                                M02 = org.telegram.messenger.bd.M0(2131744319, null);
                                M03 = org.telegram.messenger.bd.M0(2131746335, null);
                            } else if (z12) {
                                M02 = org.telegram.messenger.bd.M0(2131744317, null);
                                M03 = org.telegram.messenger.bd.M0(2131746334, null);
                            } else {
                                boolean z13 = toVar4.X;
                                if (z13 && (i11 = toVar4.a) != toVar4.g0 && i11 != 0) {
                                    M02 = org.telegram.messenger.bd.M0(2131744323, null);
                                    M03 = org.telegram.messenger.bd.M0(2131746338, null);
                                } else if (z13) {
                                    M02 = org.telegram.messenger.bd.M0(2131744320, null);
                                    M03 = org.telegram.messenger.bd.M0(2131746336, null);
                                } else {
                                    M02 = org.telegram.messenger.bd.M0(2131744322, null);
                                    M03 = org.telegram.messenger.bd.M0(2131746337, null);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(M02);
                            toVar4.E = measureText2;
                            toVar4.E = org.telegram.messenger.camera.q.C(60.0f, toVar4.c, measureText2);
                            int i19 = toVar4.E;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            toVar4.w = new StaticLayout(M02, textPaint2, i19, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(M03);
                            toVar4.F = measureText3;
                            toVar4.F = org.telegram.messenger.camera.q.C(60.0f, toVar4.c, measureText3);
                            toVar4.x = new StaticLayout(M03, textPaint2, toVar4.F, alignment, 1.0f, 0.0f, false);
                            imageReceiver.y0((toVar4.c / f11) - (org.telegram.messenger.g0.L(40.0f) / f11), (org.telegram.messenger.g0.L(12.0f) + toVar4.d) - (org.telegram.messenger.g0.L(40.0f) / f11), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                            imageReceiver.J0((int) (org.telegram.messenger.g0.L(40.0f) / f11));
                            toVar4.d0.d(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(100.0f));
                            if (z12) {
                                toVar4.J = toVar4.I == null ? 0L : r3.id;
                            }
                        }
                    }
                    i10 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) M0, i10, M0.length());
                    toVar4.y = measureText4;
                    int C2 = org.telegram.messenger.camera.q.C(60.0f, toVar4.c, measureText4);
                    toVar4.y = C2;
                    toVar4.s = org.telegram.ui.Components.lu0.c(M0, textPaint, C2, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, C2, 1, true);
                    if (!toVar4.W) {
                    }
                    int measureText22 = (int) textPaint2.measureText(M02);
                    toVar4.E = measureText22;
                    toVar4.E = org.telegram.messenger.camera.q.C(60.0f, toVar4.c, measureText22);
                    int i192 = toVar4.E;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    toVar4.w = new StaticLayout(M02, textPaint2, i192, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(M03);
                    toVar4.F = measureText32;
                    toVar4.F = org.telegram.messenger.camera.q.C(60.0f, toVar4.c, measureText32);
                    toVar4.x = new StaticLayout(M03, textPaint2, toVar4.F, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.y0((toVar4.c / f11) - (org.telegram.messenger.g0.L(40.0f) / f11), (org.telegram.messenger.g0.L(12.0f) + toVar4.d) - (org.telegram.messenger.g0.L(40.0f) / f11), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    imageReceiver.J0((int) (org.telegram.messenger.g0.L(40.0f) / f11));
                    toVar4.d0.d(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(100.0f));
                    if (z12) {
                    }
                }
                float min = Math.min(1.0f, wmVar.ha / org.telegram.messenger.g0.L(110.0f));
                canvas2.translate(wmVar.Z9() ? org.telegram.messenger.g0.W1(wmVar.k9(), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(71.0f)) : 0.0f, -(wmVar.r9(org.telegram.ui.Components.c11.c) + wmVar.U.getInputBubbleHeight() + wmVar.w.d() + org.telegram.messenger.g0.L(10.0f)));
                wmVar.ja.a(canvas2, wmVar.A0, min, 1.0f - wmVar.oa);
                canvas2.restore();
                if (wmVar.na != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.A0.getMeasuredWidth(), wmVar.na.A0.getMeasuredHeight(), (int) (wmVar.oa * f10), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - wmVar.ha) - f12);
                    wmVar.na.A0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f10 = 255.0f;
        f11 = 2.0f;
        if (wmVar.ha != 0.0f) {
        }
        toVar = wmVar.ja;
        if (toVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xh.j jVar;
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.G3;
        ll llVar = wmVar.r9;
        llVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(llVar.f0);
            llVar.z = false;
        }
        if (!this.W1 && ((jVar = wmVar.ra) == null || !jVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (kVar.v() || wmVar.W9()) {
                return onInterceptTouchEvent;
            }
            C1(motionEvent);
            if (onInterceptTouchEvent || wmVar.v9) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = this.g3;
        int i14 = i11 - i3;
        wm wmVar = this.G3;
        if (i13 != i14) {
            if (i13 != 0) {
                wmVar.E9(false);
            }
            this.g3 = i14;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            yi yiVar = wmVar.B0;
            if (yiVar != null) {
                yiVar.g();
            }
            wmVar.l9.a();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        wmVar.i6 = false;
        ll llVar = wmVar.r9;
        if (llVar != null && llVar.x()) {
            wmVar.r9.w();
        }
        wmVar.L9();
        wmVar.ba();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        to toVar;
        wm wmVar = this.G3;
        qe.a aVar = wmVar.Zc;
        ll llVar = wmVar.r9;
        llVar.getClass();
        final int i3 = 3;
        final int i10 = 0;
        final int i11 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(llVar.f0);
            llVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            wmVar.Ma = true;
        }
        if (wmVar.ha != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, wmVar.ha / org.telegram.messenger.g0.L(110.0f));
            final int i12 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (toVar = wmVar.ja) == null || toVar.S) {
                to toVar2 = wmVar.ja;
                if (toVar2 != null && toVar2.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    to toVar3 = wmVar.ja;
                    if (currentTimeMillis - toVar3.V < 500 && toVar3.N) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        wmVar.ka = animatorSet;
                        if (wmVar.ja != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(wmVar.ha, org.telegram.messenger.g0.L(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ui
                            public final /* synthetic */ wi b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        wm wmVar2 = this.b.G3;
                                        wmVar2.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar2.A0.invalidate();
                                        break;
                                    case 1:
                                        wm wmVar3 = this.b.G3;
                                        wmVar3.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar3.A0.invalidate();
                                        break;
                                    case 2:
                                        wm wmVar4 = this.b.G3;
                                        wmVar4.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar4.A0.invalidate();
                                        break;
                                    default:
                                        wm wmVar5 = this.b.G3;
                                        wmVar5.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ui
                            public final /* synthetic */ wi b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        wm wmVar2 = this.b.G3;
                                        wmVar2.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar2.A0.invalidate();
                                        break;
                                    case 1:
                                        wm wmVar3 = this.b.G3;
                                        wmVar3.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar3.A0.invalidate();
                                        break;
                                    case 2:
                                        wm wmVar4 = this.b.G3;
                                        wmVar4.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar4.A0.invalidate();
                                        break;
                                    default:
                                        wm wmVar5 = this.b.G3;
                                        wmVar5.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(ni.l.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(wmVar.ha, 0.0f);
                wmVar.ka = ofFloat3;
                if (wmVar.ja != null) {
                    aVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ui
                    public final /* synthetic */ wi b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i3) {
                            case 0:
                                wm wmVar2 = this.b.G3;
                                wmVar2.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar2.A0.invalidate();
                                break;
                            case 1:
                                wm wmVar3 = this.b.G3;
                                wmVar3.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar3.A0.invalidate();
                                break;
                            case 2:
                                wm wmVar4 = this.b.G3;
                                wmVar4.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar4.A0.invalidate();
                                break;
                            default:
                                wm wmVar5 = this.b.G3;
                                wmVar5.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(ni.l.V);
                ofFloat3.start();
            } else if (toVar.L != 1.0f) {
                float f10 = wmVar.ha;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, org.telegram.messenger.g0.L(8.0f) + f10);
                wmVar.ka = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ui
                    public final /* synthetic */ wi b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                wm wmVar2 = this.b.G3;
                                wmVar2.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar2.A0.invalidate();
                                break;
                            case 1:
                                wm wmVar3 = this.b.G3;
                                wmVar3.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar3.A0.invalidate();
                                break;
                            case 2:
                                wm wmVar4 = this.b.G3;
                                wmVar4.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar4.A0.invalidate();
                                break;
                            default:
                                wm wmVar5 = this.b.G3;
                                wmVar5.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
                ofFloat4.setInterpolator(xqVar);
                ofFloat4.start();
                final to toVar4 = wmVar.ja;
                xg xgVar = new xg(this, i3);
                AnimatorSet animatorSet2 = toVar4.K;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    toVar4.K.cancel();
                }
                toVar4.Z = xgVar;
                toVar4.K = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(toVar4.L, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.so
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                to toVar5 = toVar4;
                                toVar5.getClass();
                                toVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                toVar5.U.invalidate();
                                View view = toVar5.b0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                to toVar6 = toVar4;
                                toVar6.getClass();
                                toVar6.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = toVar6.b0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(toVar4.M, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.so
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                to toVar5 = toVar4;
                                toVar5.getClass();
                                toVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                toVar5.U.invalidate();
                                View view = toVar5.b0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                to toVar6 = toVar4;
                                toVar6.getClass();
                                toVar6.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = toVar6.b0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                toVar4.K.addListener(new org.telegram.ui.Cells.w9(toVar4, 9));
                toVar4.K.playTogether(ofFloat5, ofFloat6);
                toVar4.K.setDuration(120L);
                toVar4.K.setInterpolator(xqVar);
                toVar4.K.start();
            } else {
                wm.e2(wmVar);
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (kVar.v() || wmVar.W9()) {
                return onTouchEvent;
            }
            C1(motionEvent);
            if (wmVar.z9 || wmVar.v9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.G3.f9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.gk0 Z3;
        org.telegram.ui.Components.h71 h71Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.G3.s9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (Z3 = ((org.telegram.ui.Cells.q1) view).Z3()) != null && (h71Var = Z3.e0) != null && Z3.f0 && h71Var.w && !h71Var.E) {
                if (!h71Var.x) {
                    return;
                }
                if (!h71Var.y && (h71Var.L & 3) != 1) {
                    return;
                }
            }
            C1(null);
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E3) {
            return;
        }
        kh.a aVar = this.G3.rc;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                aVar.a.getChildAt(i3).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(u4.m0 m0Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override // org.telegram.ui.Components.tj0, android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            wm wmVar = this.G3;
            wmVar.K9();
            wmVar.M9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i3;
        int i10;
        float f10;
        char c2;
        wm wmVar;
        float f11;
        int i11;
        float f12;
        int i12;
        org.telegram.messenger.ui uiVar;
        int i13;
        ArrayList arrayList;
        org.telegram.messenger.ti tiVar;
        boolean z10;
        int i14;
        org.telegram.messenger.ui currentMessagesGroup;
        int i15;
        int i16;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        wi wiVar = this;
        Canvas canvas2 = canvas;
        int childCount = wiVar.getChildCount();
        org.telegram.messenger.ui uiVar2 = null;
        int i19 = 0;
        while (true) {
            i3 = 8;
            i10 = 2;
            f10 = 0.0f;
            c2 = 0;
            wmVar = wiVar.G3;
            if (i19 >= childCount) {
                f11 = 1.0f;
                break;
            }
            View childAt = wiVar.getChildAt(i19);
            f11 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!wm.l2(wmVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.y1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (wmVar.D0.n && (childAt instanceof org.telegram.ui.Cells.f0)) {
                        float measuredHeight3 = ((((wiVar.getMeasuredHeight() - wmVar.M9) - wmVar.Va) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + wmVar.M9;
                        if (!((org.telegram.ui.Cells.f0) childAt).J && !wmVar.A0.W1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                        float measuredHeight4 = ((((wiVar.getMeasuredHeight() - wmVar.M9) - wmVar.Va) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + wmVar.M9;
                        if (!((org.telegram.ui.Cells.ra) childAt).P && !wmVar.A0.W1) {
                            if (childAt.getTop() > measuredHeight4) {
                                childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else {
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            org.telegram.messenger.ui currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != uiVar2) {
                                org.telegram.messenger.ri currentPosition = q1Var.getCurrentPosition();
                                org.telegram.ui.Components.e90 backgroundDrawable = q1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || q1Var.y2()) && (currentPosition == null || (2 & currentPosition.l) != 0)) {
                                    boolean z12 = q1Var.w6;
                                    org.telegram.ui.ActionBar.e6 e6Var = wiVar.o2;
                                    z11 = true;
                                    if (z12 || q1Var.x6) {
                                        i16 = i19;
                                        if (currentPosition == null) {
                                            Paint W0 = wiVar.W0("paintChatMessageBackgroundSelected");
                                            um umVar = wmVar.ya;
                                            if ((umVar == null || !umVar.q) && W0 != null) {
                                                if (wmVar.T9()) {
                                                    measuredHeight = wmVar.A0.getTop();
                                                } else {
                                                    kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                                    measuredHeight = kVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - wmVar.m1.getBackgroundTranslationY();
                                                int backgroundSizeY = wmVar.m1.getBackgroundSizeY();
                                                um umVar2 = wmVar.ya;
                                                if (umVar2 != null) {
                                                    umVar2.b(q1Var.getX(), backgroundTranslationY, wiVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.k6.r(q1Var.getX(), backgroundTranslationY, wiVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                W0 = org.telegram.ui.ActionBar.k6.a2;
                                                W0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vd, e6Var));
                                            }
                                            Paint paint = W0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, q1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, q1Var.getTop(), wiVar.getMeasuredWidth(), q1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y9 = (int) q1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i17 = q1Var.getMeasuredHeight();
                                            i16 = i19;
                                        } else {
                                            int measuredHeight5 = q1Var.getMeasuredHeight() + y9;
                                            long j10 = 0;
                                            float f13 = 0.0f;
                                            int i20 = 0;
                                            while (i20 < childCount) {
                                                View childAt2 = wiVar.getChildAt(i20);
                                                int i21 = i19;
                                                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                    if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.e90 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                        i18 = i20;
                                                        y9 = Math.min(y9, (int) q1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                        long j11 = backgroundDrawable2.l;
                                                        if (j11 > j10) {
                                                            j10 = j11;
                                                            f10 = q1Var2.getX() + backgroundDrawable2.h;
                                                            f13 = q1Var2.getY() + backgroundDrawable2.i;
                                                        }
                                                        i20 = i18 + 1;
                                                        i19 = i21;
                                                    }
                                                }
                                                i18 = i20;
                                                i20 = i18 + 1;
                                                i19 = i21;
                                            }
                                            i16 = i19;
                                            backgroundDrawable.j = f10;
                                            backgroundDrawable.k = f13 - y9;
                                            i17 = measuredHeight5 - y9;
                                        }
                                        int i22 = i17 + y9;
                                        canvas2.clipRect(0, y9, wiVar.getMeasuredWidth(), i22);
                                        Paint W02 = wiVar.W0("paintChatMessageBackgroundSelected");
                                        um umVar3 = wmVar.ya;
                                        if (umVar3 == null || umVar3.q || W02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vd, e6Var));
                                        } else {
                                            backgroundDrawable.b = W02;
                                            if (wmVar.T9()) {
                                                measuredHeight2 = wmVar.A0.getTop();
                                            } else {
                                                kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                                measuredHeight2 = kVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - wmVar.m1.getBackgroundTranslationY();
                                            int backgroundSizeY2 = wmVar.m1.getBackgroundSizeY();
                                            um umVar4 = wmVar.ya;
                                            if (umVar4 != null) {
                                                umVar4.b(q1Var.getX(), backgroundTranslationY2, wiVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.k6.r(q1Var.getX(), backgroundTranslationY2, wiVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y9, wiVar.getMeasuredWidth(), i22);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i16 = i19;
                                    z11 = true;
                                }
                                uiVar2 = currentMessagesGroup2;
                            } else {
                                i16 = i19;
                                z11 = true;
                            }
                            if (wmVar.Y8 != q1Var && currentMessagesGroup2 == null && q1Var.L0()) {
                                canvas2.save();
                                canvas2.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                                if (q1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX(), q1Var.getHeight() >> 1);
                                }
                                q1Var.M0(canvas2, z11, false);
                                canvas2.restore();
                            }
                        } else {
                            i16 = i19;
                            if (childAt instanceof org.telegram.ui.Cells.t0) {
                                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                                if (t0Var.Q()) {
                                    canvas2.save();
                                    canvas2.translate(t0Var.getX(), t0Var.getY() + t0Var.getPaddingTop());
                                    canvas2.scale(t0Var.getScaleX(), t0Var.getScaleY(), t0Var.getMeasuredWidth() / 2.0f, t0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(wmVar.l9() / 2.0f, 0.0f);
                                    t0Var.G(canvas2, true);
                                    t0Var.I(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                        i19 = i16 + 1;
                    }
                }
            }
            i16 = i19;
            i19 = i16 + 1;
        }
        View view = wmVar.Y8;
        org.telegram.messenger.ui currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup() : null;
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList2 = wiVar.l3;
            arrayList2.clear();
            if (i23 != i10 || wmVar.A0.W1) {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = wmVar.A0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= wmVar.A0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && q1Var3.getVisibility() != i3 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.ti tiVar2 = currentMessagesGroup.m;
                            if (i23 == 0) {
                                i14 = i3;
                                i15 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i24++;
                                    i3 = i14;
                                    i10 = 2;
                                    f10 = 0.0f;
                                }
                            } else {
                                i14 = i3;
                                i15 = 1;
                            }
                            if ((i23 != i15 || tiVar2.i) && ((i23 != 0 || !q1Var3.getMessageObject().Z) && ((i23 != 1 || q1Var3.getMessageObject().Z) && ((i23 != i10 || q1Var3.ya) && (i23 == i10 || !q1Var3.ya))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    tiVar2.a = 0;
                                    tiVar2.b = 0;
                                    tiVar2.c = 0;
                                    tiVar2.d = 0;
                                    tiVar2.l = false;
                                    tiVar2.k = false;
                                    tiVar2.m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                tiVar2.k = q1Var3.H2();
                                tiVar2.l = q1Var3.G2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                }
                                int i25 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i26 = backgroundDrawableBottom;
                                if (q1Var3.ya) {
                                    tiVar2.m = q1Var3;
                                }
                                int i27 = tiVar2.b;
                                if (i27 == 0 || i25 < i27) {
                                    tiVar2.b = i25;
                                }
                                int i28 = tiVar2.d;
                                if (i28 == 0 || i26 > i28) {
                                    tiVar2.d = i26;
                                }
                                int i29 = tiVar2.a;
                                if (i29 == 0 || backgroundDrawableLeft < i29) {
                                    tiVar2.a = backgroundDrawableLeft;
                                }
                                int i30 = tiVar2.c;
                                if (i30 == 0 || backgroundDrawableRight > i30) {
                                    tiVar2.c = backgroundDrawableRight;
                                }
                            }
                            i24++;
                            i3 = i14;
                            i10 = 2;
                            f10 = 0.0f;
                        }
                    }
                    i14 = i3;
                    i24++;
                    i3 = i14;
                    i10 = 2;
                    f10 = 0.0f;
                }
                i11 = i3;
                int i31 = 0;
                while (i31 < arrayList2.size()) {
                    org.telegram.messenger.ui uiVar3 = (org.telegram.messenger.ui) arrayList2.get(i31);
                    org.telegram.messenger.ti tiVar3 = uiVar3.m;
                    ArrayList arrayList3 = uiVar3.d;
                    float R1 = tiVar3.m.R1(true);
                    float f14 = tiVar3.a + R1 + tiVar3.e;
                    float f15 = tiVar3.b + tiVar3.f;
                    float f16 = tiVar3.g + tiVar3.c + R1;
                    float f17 = tiVar3.d + tiVar3.h;
                    if (!tiVar3.j) {
                        f15 += tiVar3.m.getTranslationY();
                        f17 += tiVar3.m.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > org.telegram.messenger.g0.L(20.0f) + wmVar.A0.getMeasuredHeight()) {
                        f17 = org.telegram.messenger.g0.L(20.0f) + wmVar.A0.getMeasuredHeight();
                    }
                    boolean z13 = (tiVar3.m.getScaleX() == f11 && tiVar3.m.getScaleY() == f11) ? false : true;
                    if (z13) {
                        canvas2.save();
                        uiVar = uiVar3;
                        i13 = i23;
                        arrayList = arrayList2;
                        canvas2.scale(tiVar3.m.getScaleX(), tiVar3.m.getScaleY(), com.google.android.recaptcha.internal.a.z(f16, f14, 2.0f, f14), com.google.android.recaptcha.internal.a.z(f17, f18, 2.0f, f18));
                    } else {
                        uiVar = uiVar3;
                        i13 = i23;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 >= size) {
                            tiVar = tiVar3;
                            z10 = true;
                            break;
                        }
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList3.get(i32);
                        tiVar = tiVar3;
                        if (wmVar.n6[org.telegram.messenger.zi.B0(ziVar.k) == wmVar.k6 ? (char) 0 : (char) 1].indexOfKey(ziVar.f1()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i32++;
                            tiVar3 = tiVar;
                        }
                    }
                    float f19 = f17;
                    wm wmVar2 = wmVar;
                    boolean z14 = z10;
                    org.telegram.messenger.ui uiVar4 = uiVar;
                    tiVar.m.K0(canvas, (int) f14, (int) f18, (int) f16, (int) f17, tiVar.k, tiVar.l, z14, 0);
                    if (uiVar4 != currentMessagesGroup3) {
                        tiVar.m = null;
                    }
                    tiVar.o = uiVar4.c;
                    if (z13) {
                        canvas.restore();
                        for (int i33 = 0; i33 < childCount; i33++) {
                            View childAt4 = wmVar2.A0.getChildAt(i33);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == uiVar4) {
                                    int left = q1Var4.getLeft();
                                    int top = q1Var4.getTop();
                                    childAt4.setPivotX(((f16 - f14) / 2.0f) + (f14 - left));
                                    childAt4.setPivotY(((f19 - f18) / 2.0f) + (f18 - top));
                                }
                            }
                        }
                    }
                    i31++;
                    canvas2 = canvas;
                    wmVar = wmVar2;
                    i23 = i13;
                    arrayList2 = arrayList;
                    c2 = 0;
                }
                f12 = 0.0f;
                i12 = 2;
            } else {
                i11 = i3;
                i12 = i10;
                f12 = f10;
            }
            canvas2 = canvas;
            wmVar = wmVar;
            i3 = i11;
            f10 = f12;
            i10 = i12;
            c2 = c2;
            i23++;
            wiVar = this;
        }
    }
}
