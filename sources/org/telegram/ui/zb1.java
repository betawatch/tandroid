package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zb1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ ec1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb1(ec1 ec1Var, Activity activity) {
        super(activity);
        this.e = ec1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ec1 ec1Var = this.e;
        org.telegram.ui.Components.voip.y2 y2Var = ec1Var.w;
        if (view == y2Var && (ec1Var.n0 || ec1Var.m0)) {
            return false;
        }
        if ((view != y2Var && view != ec1Var.d0 && (view != ec1Var.Z || !ec1Var.b0)) || (!ec1Var.g1 && ec1Var.i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = ec1Var.f1;
        canvas.scale(f10, f10, ec1Var.b1, ec1Var.c1);
        canvas.translate(ec1Var.Y0, ec1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ec1 ec1Var = this.e;
        qb1 qb1Var = ec1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ec1Var.E.b(false, false);
            ec1Var.w.a();
            org.telegram.messenger.g0.r(qb1Var);
            if (ec1Var.p0 == 3) {
                org.telegram.messenger.g0.i3(qb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.ip ipVar;
        ec1 ec1Var = this.e;
        qb1 qb1Var = ec1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ec1Var.E.b(false, false);
            ec1Var.w.a();
            org.telegram.messenger.g0.r(qb1Var);
            if (ec1Var.p0 == 3) {
                org.telegram.messenger.g0.i3(qb1Var, 10000L);
            }
        }
        if (!ec1Var.h1 && !ec1Var.a1 && !ec1Var.g1 && motionEvent.getActionMasked() != 0) {
            ec1.a(ec1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ec1Var.h1 = false;
            ec1Var.a1 = false;
            ec1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.o2 o2Var = ec1Var.m0 ? ec1Var.d0 : ec1Var.e0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(o2Var.getX(), o2Var.getY(), o2Var.getX() + o2Var.getMeasuredWidth(), o2Var.getY() + o2Var.getMeasuredHeight());
                rectF.inset(((o2Var.getMeasuredHeight() * o2Var.U) - o2Var.getMeasuredHeight()) / 2.0f, ((o2Var.getMeasuredWidth() * o2Var.U) - o2Var.getMeasuredWidth()) / 2.0f);
                if (c40.E5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, o2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, o2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ec1Var.h1 = contains;
                if (!contains) {
                    ec1.a(ec1Var);
                }
            }
            if (ec1Var.h1 && !ec1Var.a1 && motionEvent.getPointerCount() == 2) {
                ec1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ec1Var.b1 = x10;
                ec1Var.V0 = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ec1Var.c1 = y10;
                ec1Var.W0 = y10;
                ec1Var.f1 = 1.0f;
                ec1Var.d1 = motionEvent.getPointerId(0);
                ec1Var.e1 = motionEvent.getPointerId(1);
                ec1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && ec1Var.a1) {
            int i7 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (ec1Var.d1 == motionEvent.getPointerId(i11)) {
                    i7 = i11;
                }
                if (ec1Var.e1 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i7 == -1 || i10 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ec1.a(ec1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / ec1Var.X0;
                ec1Var.f1 = hypot;
                if (hypot > 1.005f && !ec1Var.g1) {
                    ec1Var.X0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                    float x11 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                    ec1Var.b1 = x11;
                    ec1Var.V0 = x11;
                    float y11 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                    ec1Var.c1 = y11;
                    ec1Var.W0 = y11;
                    ec1Var.f1 = 1.0f;
                    ec1Var.Y0 = 0.0f;
                    ec1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    ec1Var.g1 = true;
                    ec1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                float y12 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                float f10 = ec1Var.V0 - x12;
                float f11 = ec1Var.W0 - y12;
                float f12 = ec1Var.f1;
                ec1Var.Y0 = (-f10) / f12;
                ec1Var.Z0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ec1Var.d1 == motionEvent.getPointerId(0) && ec1Var.e1 == motionEvent.getPointerId(1)) || (ec1Var.d1 == motionEvent.getPointerId(1) && ec1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            ec1.a(ec1Var);
        }
        ec1Var.s.invalidate();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a = motionEvent.getX();
            this.b = motionEvent.getY();
            this.c = true;
            this.d = System.currentTimeMillis();
        } else if (action != 1) {
            if (action == 3) {
                this.c = false;
            }
        } else if (this.c) {
            float x13 = motionEvent.getX() - this.a;
            float y13 = motionEvent.getY() - this.b;
            long currentTimeMillis = System.currentTimeMillis();
            float f13 = (y13 * y13) + (x13 * x13);
            float f14 = ec1Var.t0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - ec1Var.K0 > 300) {
                ec1Var.K0 = System.currentTimeMillis();
                if (ec1Var.C0) {
                    ec1Var.d(false);
                } else if (ec1Var.z0) {
                    ec1Var.r(!ec1Var.x0);
                    ec1Var.q0 = ec1Var.p0;
                    if (!ec1Var.x0 && (ipVar = ec1Var.N0) != null && ipVar.W) {
                        ipVar.f(true);
                    }
                    ec1Var.y();
                }
            }
            this.c = false;
        }
        return ec1Var.h1 || this.c;
    }
}
