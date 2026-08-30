package ph;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.m20;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class aa extends m20 {
    public final /* synthetic */ ca a;

    public aa(ca caVar) {
        this.a = caVar;
    }

    @Override // org.telegram.ui.Components.m20
    public final boolean a() {
        i9 i9Var;
        da daVar = this.a.B0;
        if (daVar.c0 != 0 || (i9Var = daVar.y0) == null || daVar.P1 || !i9Var.isInited() || daVar.M1 || daVar.L0.u0) {
            return false;
        }
        d6 d6Var = daVar.A0;
        return (d6Var == null || !(d6Var.x.h || d6Var.I)) && !daVar.J() && daVar.m2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        da daVar = this.a.B0;
        i9 i9Var = daVar.y0;
        if (i9Var == null || daVar.P1 || daVar.M1 || !i9Var.isInited() || daVar.c0 != 0 || daVar.L1 == -1) {
            return false;
        }
        daVar.y0.switchCamera();
        daVar.L0.d(180.0f);
        da.a0(daVar.y0.isFrontface());
        if (daVar.q0()) {
            daVar.s.c(null);
            return true;
        }
        daVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        i9 i9Var = this.a.B0.y0;
        if (i9Var == null) {
            return false;
        }
        i9Var.K = null;
        i9Var.H = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ca caVar = this.a;
        caVar.z0 = 0.0f;
        caVar.A0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        d6 d6Var;
        i9 i9Var;
        h91 h91Var;
        r9 r9Var;
        ca caVar = this.a;
        da daVar = caVar.B0;
        ValueAnimator valueAnimator = daVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((d6Var = daVar.A0) != null && (d6Var.x.h || d6Var.I)) || daVar.L0.u0 || (((i9Var = daVar.y0) != null && i9Var.s) || caVar.x0 || (((h91Var = daVar.S0) != null && (h91Var.C || h91Var.D)) || daVar.I())))) {
            return false;
        }
        boolean z4 = true;
        caVar.v0 = true;
        if (daVar.T) {
            if (Math.abs(daVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && daVar.H <= 0.4f) {
                    da.c(daVar);
                } else {
                    daVar.q(true);
                }
            } else if (daVar.J0 != null && !daVar.I0 && daVar.L1 != -1) {
                if (Math.abs(f11) <= 200.0f || (daVar.J0.d.canScrollVertically(-1) && daVar.H0)) {
                    daVar.f(!daVar.N1 && daVar.J0.getTranslationY() < ((float) daVar.J0.getPadding()));
                } else {
                    daVar.f(!daVar.N1 && f11 < 0.0f);
                }
            }
            daVar.I0 = false;
            daVar.T = false;
            daVar.U = false;
            if (z4 && (r9Var = daVar.x0) != null) {
                r9Var.d();
            }
            return z4;
        }
        z4 = false;
        daVar.I0 = false;
        daVar.T = false;
        daVar.U = false;
        if (z4) {
            r9Var.d();
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
        d6 d6Var;
        i9 i9Var;
        h91 h91Var;
        e9 e9Var;
        float f12;
        ca caVar = this.a;
        da daVar = caVar.B0;
        ValueAnimator valueAnimator = daVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || daVar.l2 != null || daVar.k2 != null || (((d6Var = daVar.A0) != null && (d6Var.x.h || d6Var.I)) || daVar.L0.u0 || (((i9Var = daVar.y0) != null && i9Var.s) || caVar.x0 || (((h91Var = daVar.S0) != null && (h91Var.C || h91Var.D)) || daVar.I() || daVar.N1 || daVar.M1 || daVar.c0 != 0)))) {
            return false;
        }
        if (!daVar.U) {
            float f13 = caVar.z0 + f11;
            caVar.z0 = f13;
            if (!daVar.T && Math.abs(f13) >= AndroidUtilities.touchSlop) {
                r9 r9Var = daVar.x0;
                if (r9Var != null) {
                    r9Var.d();
                }
                daVar.T = true;
            }
        }
        if (daVar.T) {
            int measuredHeight = (daVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            e9 e9Var2 = daVar.J0;
            if (e9Var2 != null) {
                float f14 = measuredHeight;
                if (e9Var2.getTranslationY() < f14) {
                    caVar.y0 = daVar.J0.getTranslationY() - f14;
                    e9Var = daVar.J0;
                    if (e9Var != null && e9Var.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = caVar.y0 - f11;
                    caVar.y0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    caVar.y0 = max;
                    if (daVar.c0 == 1) {
                        caVar.y0 = Math.max(0.0f, max);
                    }
                    f12 = caVar.y0;
                    if (f12 < 0.0f) {
                        daVar.r.setTranslationY(f12);
                        e9 e9Var3 = daVar.J0;
                        if (e9Var3 != null) {
                            e9Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        daVar.r.setTranslationY(0.0f);
                        if (daVar.J0 == null) {
                            daVar.t(false);
                        }
                        daVar.J0.setTranslationY(measuredHeight + caVar.y0);
                    }
                }
            }
            caVar.y0 = daVar.r.a;
            e9Var = daVar.J0;
            if (e9Var != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = caVar.y0 - f11;
            caVar.y0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            caVar.y0 = max2;
            if (daVar.c0 == 1) {
            }
            f12 = caVar.y0;
            if (f12 < 0.0f) {
            }
        }
        if (!daVar.T) {
            float f16 = caVar.A0 + f10;
            caVar.A0 = f16;
            if (!daVar.U && Math.abs(f16) >= AndroidUtilities.touchSlop) {
                r9 r9Var2 = daVar.x0;
                if (r9Var2 != null) {
                    r9Var2.d();
                }
                daVar.U = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        i9 i9Var = this.a.B0.y0;
        if (i9Var == null) {
            return false;
        }
        u0 u0Var = i9Var.K;
        if (u0Var == null) {
            return true;
        }
        u0Var.run();
        i9Var.K = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        da daVar = this.a.B0;
        daVar.T = false;
        daVar.U = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!daVar.J() || motionEvent.getY() >= daVar.J0.g()) {
            return false;
        }
        daVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
