package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yi1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ dj1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi1(dj1 dj1Var, Activity activity) {
        super(activity);
        this.e = dj1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        dj1 dj1Var = this.e;
        org.telegram.ui.Components.voip.b3 b3Var = dj1Var.v;
        if (view == b3Var && (dj1Var.n0 || dj1Var.m0)) {
            return false;
        }
        if ((view != b3Var && view != dj1Var.c0 && (view != dj1Var.Y || !dj1Var.a0)) || (!dj1Var.g1 && dj1Var.i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = dj1Var.f1;
        canvas.scale(f7, f7, dj1Var.b1, dj1Var.c1);
        canvas.translate(dj1Var.Y0, dj1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dj1 dj1Var = this.e;
        ni1 ni1Var = dj1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            dj1Var.y.b(false, false);
            dj1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ni1Var);
            if (dj1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(ni1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.c3 c3Var;
        dj1 dj1Var = this.e;
        ni1 ni1Var = dj1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            dj1Var.y.b(false, false);
            dj1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ni1Var);
            if (dj1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(ni1Var, 10000L);
            }
        }
        if (!dj1Var.h1 && !dj1Var.a1 && !dj1Var.g1 && motionEvent.getActionMasked() != 0) {
            dj1.i(dj1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            dj1Var.h1 = false;
            dj1Var.a1 = false;
            dj1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.r2 r2Var = dj1Var.m0 ? dj1Var.c0 : dj1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(r2Var.getX(), r2Var.getY(), r2Var.getX() + r2Var.getMeasuredWidth(), r2Var.getY() + r2Var.getMeasuredHeight());
                rectF.inset(((r2Var.getMeasuredHeight() * r2Var.T) - r2Var.getMeasuredHeight()) / 2.0f, ((r2Var.getMeasuredWidth() * r2Var.T) - r2Var.getMeasuredWidth()) / 2.0f);
                if (n60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, r2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, r2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                dj1Var.h1 = contains;
                if (!contains) {
                    dj1.i(dj1Var);
                }
            }
            if (dj1Var.h1 && !dj1Var.a1 && motionEvent.getPointerCount() == 2) {
                dj1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                dj1Var.b1 = x10;
                dj1Var.V0 = x10;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                dj1Var.c1 = y3;
                dj1Var.W0 = y3;
                dj1Var.f1 = 1.0f;
                dj1Var.d1 = motionEvent.getPointerId(0);
                dj1Var.e1 = motionEvent.getPointerId(1);
                dj1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && dj1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (dj1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (dj1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                dj1.i(dj1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / dj1Var.X0;
                dj1Var.f1 = hypot;
                if (hypot > 1.005f && !dj1Var.g1) {
                    dj1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    dj1Var.b1 = x11;
                    dj1Var.V0 = x11;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    dj1Var.c1 = y10;
                    dj1Var.W0 = y10;
                    dj1Var.f1 = 1.0f;
                    dj1Var.Y0 = 0.0f;
                    dj1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    dj1Var.g1 = true;
                    dj1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = dj1Var.V0 - x12;
                float f10 = dj1Var.W0 - y11;
                float f11 = dj1Var.f1;
                dj1Var.Y0 = (-f7) / f11;
                dj1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((dj1Var.d1 == motionEvent.getPointerId(0) && dj1Var.e1 == motionEvent.getPointerId(1)) || (dj1Var.d1 == motionEvent.getPointerId(1) && dj1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            dj1.i(dj1Var);
        }
        dj1Var.s.invalidate();
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
            float f12 = (y12 * y12) + (x13 * x13);
            float f13 = dj1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - dj1Var.K0 > 300) {
                dj1Var.K0 = System.currentTimeMillis();
                if (dj1Var.C0) {
                    dj1Var.l(false);
                } else if (dj1Var.z0) {
                    dj1Var.z(!dj1Var.x0);
                    dj1Var.q0 = dj1Var.p0;
                    if (!dj1Var.x0 && (c3Var = dj1Var.N0) != null && c3Var.V) {
                        c3Var.e(true);
                    }
                    dj1Var.G();
                }
            }
            this.c = false;
        }
        return dj1Var.h1 || this.c;
    }
}
