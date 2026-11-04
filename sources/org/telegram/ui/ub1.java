package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ub1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ zb1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub1(zb1 zb1Var, Activity activity) {
        super(activity);
        this.e = zb1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        zb1 zb1Var = this.e;
        org.telegram.ui.Components.voip.j2 j2Var = zb1Var.w;
        if (view == j2Var && (zb1Var.o0 || zb1Var.n0)) {
            return false;
        }
        if ((view != j2Var && view != zb1Var.d0 && (view != zb1Var.Z || !zb1Var.b0)) || (!zb1Var.h1 && zb1Var.j1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = zb1Var.g1;
        canvas.scale(f10, f10, zb1Var.c1, zb1Var.d1);
        canvas.translate(zb1Var.Z0, zb1Var.a1);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        zb1 zb1Var = this.e;
        kb1 kb1Var = zb1Var.U0;
        if (motionEvent.getActionMasked() == 1) {
            zb1Var.E.b(false, false);
            zb1Var.w.a();
            org.telegram.messenger.g0.r(kb1Var);
            if (zb1Var.q0 == 3) {
                org.telegram.messenger.g0.i3(kb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.zo zoVar;
        zb1 zb1Var = this.e;
        kb1 kb1Var = zb1Var.U0;
        if (motionEvent.getActionMasked() == 1) {
            zb1Var.E.b(false, false);
            zb1Var.w.a();
            org.telegram.messenger.g0.r(kb1Var);
            if (zb1Var.q0 == 3) {
                org.telegram.messenger.g0.i3(kb1Var, 10000L);
            }
        }
        if (!zb1Var.i1 && !zb1Var.b1 && !zb1Var.h1 && motionEvent.getActionMasked() != 0) {
            zb1.a(zb1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            zb1Var.i1 = false;
            zb1Var.b1 = false;
            zb1Var.h1 = false;
        }
        org.telegram.ui.Components.voip.z1 z1Var = zb1Var.n0 ? zb1Var.d0 : zb1Var.e0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(z1Var.getX(), z1Var.getY(), z1Var.getX() + z1Var.getMeasuredWidth(), z1Var.getY() + z1Var.getMeasuredHeight());
                rectF.inset(((z1Var.getMeasuredHeight() * z1Var.U) - z1Var.getMeasuredHeight()) / 2.0f, ((z1Var.getMeasuredWidth() * z1Var.U) - z1Var.getMeasuredWidth()) / 2.0f);
                if (x30.x5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, z1Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, z1Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                zb1Var.i1 = contains;
                if (!contains) {
                    zb1.a(zb1Var);
                }
            }
            if (zb1Var.i1 && !zb1Var.b1 && motionEvent.getPointerCount() == 2) {
                zb1Var.Y0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                zb1Var.c1 = x10;
                zb1Var.W0 = x10;
                float y9 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                zb1Var.d1 = y9;
                zb1Var.X0 = y9;
                zb1Var.g1 = 1.0f;
                zb1Var.e1 = motionEvent.getPointerId(0);
                zb1Var.f1 = motionEvent.getPointerId(1);
                zb1Var.b1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && zb1Var.b1) {
            int i3 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (zb1Var.e1 == motionEvent.getPointerId(i11)) {
                    i3 = i11;
                }
                if (zb1Var.f1 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i3 == -1 || i10 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                zb1.a(zb1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i3), motionEvent.getY(i10) - motionEvent.getY(i3))) / zb1Var.Y0;
                zb1Var.g1 = hypot;
                if (hypot > 1.005f && !zb1Var.h1) {
                    zb1Var.Y0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i3), motionEvent.getY(i10) - motionEvent.getY(i3));
                    float x11 = (motionEvent.getX(i10) + motionEvent.getX(i3)) / 2.0f;
                    zb1Var.c1 = x11;
                    zb1Var.W0 = x11;
                    float y10 = (motionEvent.getY(i10) + motionEvent.getY(i3)) / 2.0f;
                    zb1Var.d1 = y10;
                    zb1Var.X0 = y10;
                    zb1Var.g1 = 1.0f;
                    zb1Var.Z0 = 0.0f;
                    zb1Var.a1 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    zb1Var.h1 = true;
                    zb1Var.b1 = true;
                }
                float x12 = (motionEvent.getX(i10) + motionEvent.getX(i3)) / 2.0f;
                float y11 = (motionEvent.getY(i10) + motionEvent.getY(i3)) / 2.0f;
                float f10 = zb1Var.W0 - x12;
                float f11 = zb1Var.X0 - y11;
                float f12 = zb1Var.g1;
                zb1Var.Z0 = (-f10) / f12;
                zb1Var.a1 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((zb1Var.e1 == motionEvent.getPointerId(0) && zb1Var.f1 == motionEvent.getPointerId(1)) || (zb1Var.e1 == motionEvent.getPointerId(1) && zb1Var.f1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            zb1.a(zb1Var);
        }
        zb1Var.s.invalidate();
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
            float y12 = motionEvent.getY() - this.b;
            long currentTimeMillis = System.currentTimeMillis();
            float f13 = (y12 * y12) + (x13 * x13);
            float f14 = zb1Var.u0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - zb1Var.L0 > 300) {
                zb1Var.L0 = System.currentTimeMillis();
                if (zb1Var.D0) {
                    zb1Var.e(false);
                } else if (zb1Var.A0) {
                    zb1Var.z(!zb1Var.y0);
                    zb1Var.r0 = zb1Var.q0;
                    if (!zb1Var.y0 && (zoVar = zb1Var.O0) != null && zoVar.W) {
                        zoVar.f(true);
                    }
                    zb1Var.G();
                }
            }
            this.c = false;
        }
        return zb1Var.i1 || this.c;
    }
}
