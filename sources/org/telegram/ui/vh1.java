package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vh1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ ai1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh1(ai1 ai1Var, Activity activity) {
        super(activity);
        this.e = ai1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ai1 ai1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = ai1Var.v;
        if (view == c3Var && (ai1Var.k0 || ai1Var.j0)) {
            return false;
        }
        if ((view != c3Var && view != ai1Var.Z && (view != ai1Var.V || !ai1Var.X)) || (!ai1Var.d1 && ai1Var.f1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = ai1Var.c1;
        canvas.scale(f10, f10, ai1Var.Y0, ai1Var.Z0);
        canvas.translate(ai1Var.V0, ai1Var.W0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ai1 ai1Var = this.e;
        kh1 kh1Var = ai1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ai1Var.y.b(false, false);
            ai1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(kh1Var);
            if (ai1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(kh1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.d3 d3Var;
        ai1 ai1Var = this.e;
        kh1 kh1Var = ai1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ai1Var.y.b(false, false);
            ai1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(kh1Var);
            if (ai1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(kh1Var, 10000L);
            }
        }
        if (!ai1Var.e1 && !ai1Var.X0 && !ai1Var.d1 && motionEvent.getActionMasked() != 0) {
            ai1.j(ai1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ai1Var.e1 = false;
            ai1Var.X0 = false;
            ai1Var.d1 = false;
        }
        org.telegram.ui.Components.voip.s2 s2Var = ai1Var.j0 ? ai1Var.Z : ai1Var.a0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(s2Var.getX(), s2Var.getY(), s2Var.getX() + s2Var.getMeasuredWidth(), s2Var.getY() + s2Var.getMeasuredHeight());
                rectF.inset(((s2Var.getMeasuredHeight() * s2Var.Q) - s2Var.getMeasuredHeight()) / 2.0f, ((s2Var.getMeasuredWidth() * s2Var.Q) - s2Var.getMeasuredWidth()) / 2.0f);
                if (c60.C3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, s2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, s2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ai1Var.e1 = contains;
                if (!contains) {
                    ai1.j(ai1Var);
                }
            }
            if (ai1Var.e1 && !ai1Var.X0 && motionEvent.getPointerCount() == 2) {
                ai1Var.U0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ai1Var.Y0 = x10;
                ai1Var.S0 = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ai1Var.Z0 = y10;
                ai1Var.T0 = y10;
                ai1Var.c1 = 1.0f;
                ai1Var.a1 = motionEvent.getPointerId(0);
                ai1Var.b1 = motionEvent.getPointerId(1);
                ai1Var.X0 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && ai1Var.X0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (ai1Var.a1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (ai1Var.b1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ai1.j(ai1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ai1Var.U0;
                ai1Var.c1 = hypot;
                if (hypot > 1.005f && !ai1Var.d1) {
                    ai1Var.U0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    ai1Var.Y0 = x11;
                    ai1Var.S0 = x11;
                    float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    ai1Var.Z0 = y11;
                    ai1Var.T0 = y11;
                    ai1Var.c1 = 1.0f;
                    ai1Var.V0 = 0.0f;
                    ai1Var.W0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    ai1Var.d1 = true;
                    ai1Var.X0 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y12 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f10 = ai1Var.S0 - x12;
                float f11 = ai1Var.T0 - y12;
                float f12 = ai1Var.c1;
                ai1Var.V0 = (-f10) / f12;
                ai1Var.W0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ai1Var.a1 == motionEvent.getPointerId(0) && ai1Var.b1 == motionEvent.getPointerId(1)) || (ai1Var.a1 == motionEvent.getPointerId(1) && ai1Var.b1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            ai1.j(ai1Var);
        }
        ai1Var.s.invalidate();
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
            float f14 = ai1Var.q0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - ai1Var.H0 > 300) {
                ai1Var.H0 = System.currentTimeMillis();
                if (ai1Var.z0) {
                    ai1Var.m(false);
                } else if (ai1Var.w0) {
                    ai1Var.A(!ai1Var.u0);
                    ai1Var.n0 = ai1Var.m0;
                    if (!ai1Var.u0 && (d3Var = ai1Var.K0) != null && d3Var.S) {
                        d3Var.e(true);
                    }
                    ai1Var.H();
                }
            }
            this.c = false;
        }
        return ai1Var.e1 || this.c;
    }
}
