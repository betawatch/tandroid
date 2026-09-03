package qh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.n20;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y9 extends n20 {
    public final /* synthetic */ aa a;

    public y9(aa aaVar) {
        this.a = aaVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final boolean a() {
        f9 f9Var;
        ba baVar = this.a.B0;
        if (baVar.c0 != 0 || (f9Var = baVar.y0) == null || baVar.P1 || !f9Var.isInited() || baVar.M1 || baVar.L0.u0) {
            return false;
        }
        a6 a6Var = baVar.A0;
        return (a6Var == null || !(a6Var.x.h || a6Var.I)) && !baVar.J() && baVar.m2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ba baVar = this.a.B0;
        f9 f9Var = baVar.y0;
        if (f9Var == null || baVar.P1 || baVar.M1 || !f9Var.isInited() || baVar.c0 != 0 || baVar.L1 == -1) {
            return false;
        }
        baVar.y0.switchCamera();
        baVar.L0.d(180.0f);
        ba.a0(baVar.y0.isFrontface());
        if (baVar.q0()) {
            baVar.s.c(null);
            return true;
        }
        baVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        f9 f9Var = this.a.B0.y0;
        if (f9Var == null) {
            return false;
        }
        f9Var.K = null;
        f9Var.H = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        aa aaVar = this.a;
        aaVar.z0 = 0.0f;
        aaVar.A0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        a6 a6Var;
        f9 f9Var;
        h91 h91Var;
        o9 o9Var;
        aa aaVar = this.a;
        ba baVar = aaVar.B0;
        ValueAnimator valueAnimator = baVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((a6Var = baVar.A0) != null && (a6Var.x.h || a6Var.I)) || baVar.L0.u0 || (((f9Var = baVar.y0) != null && f9Var.s) || aaVar.x0 || (((h91Var = baVar.S0) != null && (h91Var.C || h91Var.D)) || baVar.I())))) {
            return false;
        }
        boolean z4 = true;
        aaVar.v0 = true;
        if (baVar.T) {
            if (Math.abs(baVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && baVar.H <= 0.4f) {
                    ba.c(baVar);
                } else {
                    baVar.q(true);
                }
            } else if (baVar.J0 != null && !baVar.I0 && baVar.L1 != -1) {
                if (Math.abs(f11) <= 200.0f || (baVar.J0.d.canScrollVertically(-1) && baVar.H0)) {
                    baVar.f(!baVar.N1 && baVar.J0.getTranslationY() < ((float) baVar.J0.getPadding()));
                } else {
                    baVar.f(!baVar.N1 && f11 < 0.0f);
                }
            }
            baVar.I0 = false;
            baVar.T = false;
            baVar.U = false;
            if (z4 && (o9Var = baVar.x0) != null) {
                o9Var.d();
            }
            return z4;
        }
        z4 = false;
        baVar.I0 = false;
        baVar.T = false;
        baVar.U = false;
        if (z4) {
            o9Var.d();
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        a6 a6Var;
        f9 f9Var;
        h91 h91Var;
        b9 b9Var;
        float f12;
        aa aaVar = this.a;
        ba baVar = aaVar.B0;
        ValueAnimator valueAnimator = baVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || baVar.l2 != null || baVar.k2 != null || (((a6Var = baVar.A0) != null && (a6Var.x.h || a6Var.I)) || baVar.L0.u0 || (((f9Var = baVar.y0) != null && f9Var.s) || aaVar.x0 || (((h91Var = baVar.S0) != null && (h91Var.C || h91Var.D)) || baVar.I() || baVar.N1 || baVar.M1 || baVar.c0 != 0)))) {
            return false;
        }
        if (!baVar.U) {
            float f13 = aaVar.z0 + f11;
            aaVar.z0 = f13;
            if (!baVar.T && Math.abs(f13) >= AndroidUtilities.touchSlop) {
                o9 o9Var = baVar.x0;
                if (o9Var != null) {
                    o9Var.d();
                }
                baVar.T = true;
            }
        }
        if (baVar.T) {
            int measuredHeight = (baVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            b9 b9Var2 = baVar.J0;
            if (b9Var2 != null) {
                float f14 = measuredHeight;
                if (b9Var2.getTranslationY() < f14) {
                    aaVar.y0 = baVar.J0.getTranslationY() - f14;
                    b9Var = baVar.J0;
                    if (b9Var != null && b9Var.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = aaVar.y0 - f11;
                    aaVar.y0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    aaVar.y0 = max;
                    if (baVar.c0 == 1) {
                        aaVar.y0 = Math.max(0.0f, max);
                    }
                    f12 = aaVar.y0;
                    if (f12 < 0.0f) {
                        baVar.r.setTranslationY(f12);
                        b9 b9Var3 = baVar.J0;
                        if (b9Var3 != null) {
                            b9Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        baVar.r.setTranslationY(0.0f);
                        if (baVar.J0 == null) {
                            baVar.t(false);
                        }
                        baVar.J0.setTranslationY(measuredHeight + aaVar.y0);
                    }
                }
            }
            aaVar.y0 = baVar.r.a;
            b9Var = baVar.J0;
            if (b9Var != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = aaVar.y0 - f11;
            aaVar.y0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            aaVar.y0 = max2;
            if (baVar.c0 == 1) {
            }
            f12 = aaVar.y0;
            if (f12 < 0.0f) {
            }
        }
        if (!baVar.T) {
            float f16 = aaVar.A0 + f10;
            aaVar.A0 = f16;
            if (!baVar.U && Math.abs(f16) >= AndroidUtilities.touchSlop) {
                o9 o9Var2 = baVar.x0;
                if (o9Var2 != null) {
                    o9Var2.d();
                }
                baVar.U = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        f9 f9Var = this.a.B0.y0;
        if (f9Var == null) {
            return false;
        }
        u0 u0Var = f9Var.K;
        if (u0Var == null) {
            return true;
        }
        u0Var.run();
        f9Var.K = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ba baVar = this.a.B0;
        baVar.T = false;
        baVar.U = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!baVar.J() || motionEvent.getY() >= baVar.J0.g()) {
            return false;
        }
        baVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
