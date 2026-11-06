package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        org.telegram.ui.Components.voip.u2 u2Var = ec1Var.w;
        if (view == u2Var && (ec1Var.m0 || ec1Var.l0)) {
            return false;
        }
        if ((view != u2Var && view != ec1Var.c0 && (view != ec1Var.Y || !ec1Var.a0)) || (!ec1Var.f1 && ec1Var.h1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = ec1Var.e1;
        canvas.scale(f10, f10, ec1Var.a1, ec1Var.b1);
        canvas.translate(ec1Var.X0, ec1Var.Y0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ec1 ec1Var = this.e;
        qb1 qb1Var = ec1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            ec1Var.D.b(false, false);
            ec1Var.w.a();
            org.telegram.messenger.g0.r(qb1Var);
            if (ec1Var.o0 == 3) {
                org.telegram.messenger.g0.i3(qb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.zo zoVar;
        ec1 ec1Var = this.e;
        qb1 qb1Var = ec1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            ec1Var.D.b(false, false);
            ec1Var.w.a();
            org.telegram.messenger.g0.r(qb1Var);
            if (ec1Var.o0 == 3) {
                org.telegram.messenger.g0.i3(qb1Var, 10000L);
            }
        }
        if (!ec1Var.g1 && !ec1Var.Z0 && !ec1Var.f1 && motionEvent.getActionMasked() != 0) {
            ec1.a(ec1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ec1Var.g1 = false;
            ec1Var.Z0 = false;
            ec1Var.f1 = false;
        }
        org.telegram.ui.Components.voip.k2 k2Var = ec1Var.l0 ? ec1Var.c0 : ec1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(k2Var.getX(), k2Var.getY(), k2Var.getX() + k2Var.getMeasuredWidth(), k2Var.getY() + k2Var.getMeasuredHeight());
                rectF.inset(((k2Var.getMeasuredHeight() * k2Var.T) - k2Var.getMeasuredHeight()) / 2.0f, ((k2Var.getMeasuredWidth() * k2Var.T) - k2Var.getMeasuredWidth()) / 2.0f);
                if (c40.w5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, k2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, k2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ec1Var.g1 = contains;
                if (!contains) {
                    ec1.a(ec1Var);
                }
            }
            if (ec1Var.g1 && !ec1Var.Z0 && motionEvent.getPointerCount() == 2) {
                ec1Var.W0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ec1Var.a1 = x10;
                ec1Var.U0 = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ec1Var.b1 = y10;
                ec1Var.V0 = y10;
                ec1Var.e1 = 1.0f;
                ec1Var.c1 = motionEvent.getPointerId(0);
                ec1Var.d1 = motionEvent.getPointerId(1);
                ec1Var.Z0 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && ec1Var.Z0) {
            int i7 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (ec1Var.c1 == motionEvent.getPointerId(i11)) {
                    i7 = i11;
                }
                if (ec1Var.d1 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i7 == -1 || i10 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ec1.a(ec1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / ec1Var.W0;
                ec1Var.e1 = hypot;
                if (hypot > 1.005f && !ec1Var.f1) {
                    ec1Var.W0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                    float x11 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                    ec1Var.a1 = x11;
                    ec1Var.U0 = x11;
                    float y11 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                    ec1Var.b1 = y11;
                    ec1Var.V0 = y11;
                    ec1Var.e1 = 1.0f;
                    ec1Var.X0 = 0.0f;
                    ec1Var.Y0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    ec1Var.f1 = true;
                    ec1Var.Z0 = true;
                }
                float x12 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                float y12 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                float f10 = ec1Var.U0 - x12;
                float f11 = ec1Var.V0 - y12;
                float f12 = ec1Var.e1;
                ec1Var.X0 = (-f10) / f12;
                ec1Var.Y0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ec1Var.c1 == motionEvent.getPointerId(0) && ec1Var.d1 == motionEvent.getPointerId(1)) || (ec1Var.c1 == motionEvent.getPointerId(1) && ec1Var.d1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
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
            float f14 = ec1Var.s0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - ec1Var.J0 > 300) {
                ec1Var.J0 = System.currentTimeMillis();
                if (ec1Var.B0) {
                    ec1Var.d(false);
                } else if (ec1Var.y0) {
                    ec1Var.r(!ec1Var.w0);
                    ec1Var.p0 = ec1Var.o0;
                    if (!ec1Var.w0 && (zoVar = ec1Var.M0) != null && zoVar.V) {
                        zoVar.f(true);
                    }
                    ec1Var.y();
                }
            }
            this.c = false;
        }
        return ec1Var.g1 || this.c;
    }
}
