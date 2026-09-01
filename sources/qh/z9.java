package qh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.n20;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class z9 extends n20 {
    public final /* synthetic */ ba a;

    public z9(ba baVar) {
        this.a = baVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final boolean a() {
        g9 g9Var;
        ca caVar = this.a.B0;
        if (caVar.c0 != 0 || (g9Var = caVar.y0) == null || caVar.P1 || !g9Var.isInited() || caVar.M1 || caVar.L0.u0) {
            return false;
        }
        b6 b6Var = caVar.A0;
        return (b6Var == null || !(b6Var.x.h || b6Var.I)) && !caVar.J() && caVar.m2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ca caVar = this.a.B0;
        g9 g9Var = caVar.y0;
        if (g9Var == null || caVar.P1 || caVar.M1 || !g9Var.isInited() || caVar.c0 != 0 || caVar.L1 == -1) {
            return false;
        }
        caVar.y0.switchCamera();
        caVar.L0.d(180.0f);
        ca.a0(caVar.y0.isFrontface());
        if (caVar.q0()) {
            caVar.s.c(null);
            return true;
        }
        caVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        g9 g9Var = this.a.B0.y0;
        if (g9Var == null) {
            return false;
        }
        g9Var.K = null;
        g9Var.H = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ba baVar = this.a;
        baVar.z0 = 0.0f;
        baVar.A0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        b6 b6Var;
        g9 g9Var;
        i91 i91Var;
        p9 p9Var;
        ba baVar = this.a;
        ca caVar = baVar.B0;
        ValueAnimator valueAnimator = caVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((b6Var = caVar.A0) != null && (b6Var.x.h || b6Var.I)) || caVar.L0.u0 || (((g9Var = caVar.y0) != null && g9Var.s) || baVar.x0 || (((i91Var = caVar.S0) != null && (i91Var.C || i91Var.D)) || caVar.I())))) {
            return false;
        }
        boolean z4 = true;
        baVar.v0 = true;
        if (caVar.T) {
            if (Math.abs(caVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && caVar.H <= 0.4f) {
                    ca.c(caVar);
                } else {
                    caVar.q(true);
                }
            } else if (caVar.J0 != null && !caVar.I0 && caVar.L1 != -1) {
                if (Math.abs(f11) <= 200.0f || (caVar.J0.d.canScrollVertically(-1) && caVar.H0)) {
                    caVar.f(!caVar.N1 && caVar.J0.getTranslationY() < ((float) caVar.J0.getPadding()));
                } else {
                    caVar.f(!caVar.N1 && f11 < 0.0f);
                }
            }
            caVar.I0 = false;
            caVar.T = false;
            caVar.U = false;
            if (z4 && (p9Var = caVar.x0) != null) {
                p9Var.d();
            }
            return z4;
        }
        z4 = false;
        caVar.I0 = false;
        caVar.T = false;
        caVar.U = false;
        if (z4) {
            p9Var.d();
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
        b6 b6Var;
        g9 g9Var;
        i91 i91Var;
        c9 c9Var;
        float f12;
        ba baVar = this.a;
        ca caVar = baVar.B0;
        ValueAnimator valueAnimator = caVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || caVar.l2 != null || caVar.k2 != null || (((b6Var = caVar.A0) != null && (b6Var.x.h || b6Var.I)) || caVar.L0.u0 || (((g9Var = caVar.y0) != null && g9Var.s) || baVar.x0 || (((i91Var = caVar.S0) != null && (i91Var.C || i91Var.D)) || caVar.I() || caVar.N1 || caVar.M1 || caVar.c0 != 0)))) {
            return false;
        }
        if (!caVar.U) {
            float f13 = baVar.z0 + f11;
            baVar.z0 = f13;
            if (!caVar.T && Math.abs(f13) >= AndroidUtilities.touchSlop) {
                p9 p9Var = caVar.x0;
                if (p9Var != null) {
                    p9Var.d();
                }
                caVar.T = true;
            }
        }
        if (caVar.T) {
            int measuredHeight = (caVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            c9 c9Var2 = caVar.J0;
            if (c9Var2 != null) {
                float f14 = measuredHeight;
                if (c9Var2.getTranslationY() < f14) {
                    baVar.y0 = caVar.J0.getTranslationY() - f14;
                    c9Var = caVar.J0;
                    if (c9Var != null && c9Var.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = baVar.y0 - f11;
                    baVar.y0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    baVar.y0 = max;
                    if (caVar.c0 == 1) {
                        baVar.y0 = Math.max(0.0f, max);
                    }
                    f12 = baVar.y0;
                    if (f12 < 0.0f) {
                        caVar.r.setTranslationY(f12);
                        c9 c9Var3 = caVar.J0;
                        if (c9Var3 != null) {
                            c9Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        caVar.r.setTranslationY(0.0f);
                        if (caVar.J0 == null) {
                            caVar.t(false);
                        }
                        caVar.J0.setTranslationY(measuredHeight + baVar.y0);
                    }
                }
            }
            baVar.y0 = caVar.r.a;
            c9Var = caVar.J0;
            if (c9Var != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = baVar.y0 - f11;
            baVar.y0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            baVar.y0 = max2;
            if (caVar.c0 == 1) {
            }
            f12 = baVar.y0;
            if (f12 < 0.0f) {
            }
        }
        if (!caVar.T) {
            float f16 = baVar.A0 + f10;
            baVar.A0 = f16;
            if (!caVar.U && Math.abs(f16) >= AndroidUtilities.touchSlop) {
                p9 p9Var2 = caVar.x0;
                if (p9Var2 != null) {
                    p9Var2.d();
                }
                caVar.U = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        g9 g9Var = this.a.B0.y0;
        if (g9Var == null) {
            return false;
        }
        u0 u0Var = g9Var.K;
        if (u0Var == null) {
            return true;
        }
        u0Var.run();
        g9Var.K = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ca caVar = this.a.B0;
        caVar.T = false;
        caVar.U = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!caVar.J() || motionEvent.getY() >= caVar.J0.g()) {
            return false;
        }
        caVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
