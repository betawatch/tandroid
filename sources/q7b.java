// default package

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class q7b extends ps4 {
    public final /* synthetic */ s7b a;

    public q7b(s7b s7bVar) {
        this.a = s7bVar;
    }

    @Override // ps4
    public final boolean a() {
        y6b y6bVar;
        t7b t7bVar = this.a.u0;
        if (t7bVar.g0 != 0 || (y6bVar = t7bVar.C0) == null || t7bVar.T1 || !y6bVar.isInited() || t7bVar.Q1 || t7bVar.P0.y0) {
            return false;
        }
        lq9 lq9Var = t7bVar.E0;
        return (lq9Var == null || !(lq9Var.y.i || lq9Var.M)) && !t7bVar.H() && t7bVar.q2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        t7b t7bVar = this.a.u0;
        y6b y6bVar = t7bVar.C0;
        if (y6bVar == null || t7bVar.T1 || t7bVar.Q1 || !y6bVar.isInited() || t7bVar.g0 != 0 || t7bVar.P1 == -1) {
            return false;
        }
        t7bVar.C0.switchCamera();
        t7bVar.P0.d(180.0f);
        na7.c1().edit().putBoolean("stories_camera", t7bVar.C0.isFrontface()).apply();
        if (t7bVar.p0()) {
            t7bVar.s.c(null);
            return true;
        }
        t7bVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        y6b y6bVar = this.a.u0.C0;
        if (y6bVar == null) {
            return false;
        }
        y6bVar.O = null;
        y6bVar.L = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        s7b s7bVar = this.a;
        s7bVar.s0 = 0.0f;
        s7bVar.t0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        lq9 lq9Var;
        y6b y6bVar;
        azc azcVar;
        h7b h7bVar;
        s7b s7bVar = this.a;
        t7b t7bVar = s7bVar.u0;
        ValueAnimator valueAnimator = t7bVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((lq9Var = t7bVar.E0) != null && (lq9Var.y.i || lq9Var.M)) || t7bVar.P0.y0 || (((y6bVar = t7bVar.C0) != null && y6bVar.s) || s7bVar.q0 || (((azcVar = t7bVar.W0) != null && (azcVar.G || azcVar.H)) || t7bVar.G())))) {
            return false;
        }
        boolean z = true;
        s7bVar.o0 = true;
        if (t7bVar.X) {
            if (Math.abs(t7bVar.r.a) >= gl.L(1.0f)) {
                if ((f2 <= 0.0f || Math.abs(f2) <= 2000.0f || Math.abs(f2) <= Math.abs(f)) && t7bVar.L <= 0.4f) {
                    t7bVar.b();
                } else {
                    t7bVar.o(true);
                }
            } else if (t7bVar.N0 != null && !t7bVar.M0 && t7bVar.P1 != -1) {
                if (Math.abs(f2) <= 200.0f || (t7bVar.N0.d.canScrollVertically(-1) && t7bVar.L0)) {
                    t7bVar.c(!t7bVar.R1 && t7bVar.N0.getTranslationY() < ((float) t7bVar.N0.getPadding()));
                } else {
                    t7bVar.c(!t7bVar.R1 && f2 < 0.0f);
                }
            }
            t7bVar.M0 = false;
            t7bVar.X = false;
            t7bVar.Y = false;
            if (z && (h7bVar = t7bVar.B0) != null) {
                h7bVar.a();
            }
            return z;
        }
        z = false;
        t7bVar.M0 = false;
        t7bVar.X = false;
        t7bVar.Y = false;
        if (z) {
            h7bVar.a();
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        lq9 lq9Var;
        y6b y6bVar;
        azc azcVar;
        vr4 vr4Var;
        float max;
        s7b s7bVar = this.a;
        t7b t7bVar = s7bVar.u0;
        ValueAnimator valueAnimator = t7bVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || t7bVar.p2 != null || t7bVar.o2 != null || (((lq9Var = t7bVar.E0) != null && (lq9Var.y.i || lq9Var.M)) || t7bVar.P0.y0 || (((y6bVar = t7bVar.C0) != null && y6bVar.s) || s7bVar.q0 || (((azcVar = t7bVar.W0) != null && (azcVar.G || azcVar.H)) || t7bVar.G() || t7bVar.R1 || t7bVar.Q1 || t7bVar.g0 != 0)))) {
            return false;
        }
        if (!t7bVar.Y) {
            float f3 = s7bVar.s0 + f2;
            s7bVar.s0 = f3;
            if (!t7bVar.X && Math.abs(f3) >= gl.e) {
                h7b h7bVar = t7bVar.B0;
                if (h7bVar != null) {
                    h7bVar.a();
                }
                t7bVar.X = true;
            }
        }
        if (t7bVar.X) {
            int measuredHeight = (t7bVar.n.getMeasuredHeight() - ((int) (gl.q.y * 0.35f))) - (a.getCurrentActionBarHeight() + gl.m);
            vr4 vr4Var2 = t7bVar.N0;
            if (vr4Var2 != null) {
                float f4 = measuredHeight;
                if (vr4Var2.getTranslationY() < f4) {
                    s7bVar.r0 = t7bVar.N0.getTranslationY() - f4;
                    vr4Var = t7bVar.N0;
                    if (vr4Var != null && vr4Var.d.canScrollVertically(-1)) {
                        f2 = Math.max(0.0f, f2);
                    }
                    float f5 = s7bVar.r0 - f2;
                    s7bVar.r0 = f5;
                    max = Math.max(-measuredHeight, f5);
                    s7bVar.r0 = max;
                    if (t7bVar.g0 == 1) {
                        max = Math.max(0.0f, max);
                        s7bVar.r0 = max;
                    }
                    if (max < 0.0f) {
                        t7bVar.r.setTranslationY(max);
                        vr4 vr4Var3 = t7bVar.N0;
                        if (vr4Var3 != null) {
                            vr4Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        t7bVar.r.setTranslationY(0.0f);
                        if (t7bVar.N0 == null) {
                            t7bVar.r(false);
                        }
                        t7bVar.N0.setTranslationY(measuredHeight + s7bVar.r0);
                    }
                }
            }
            s7bVar.r0 = t7bVar.r.a;
            vr4Var = t7bVar.N0;
            if (vr4Var != null) {
                f2 = Math.max(0.0f, f2);
            }
            float f52 = s7bVar.r0 - f2;
            s7bVar.r0 = f52;
            max = Math.max(-measuredHeight, f52);
            s7bVar.r0 = max;
            if (t7bVar.g0 == 1) {
            }
            if (max < 0.0f) {
            }
        }
        if (!t7bVar.X) {
            float f6 = s7bVar.t0 + f;
            s7bVar.t0 = f6;
            if (!t7bVar.Y && Math.abs(f6) >= gl.e) {
                h7b h7bVar2 = t7bVar.B0;
                if (h7bVar2 != null) {
                    h7bVar2.a();
                }
                t7bVar.Y = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        y6b y6bVar = this.a.u0.C0;
        if (y6bVar == null) {
            return false;
        }
        hr3 hr3Var = y6bVar.O;
        if (hr3Var == null) {
            return true;
        }
        hr3Var.run();
        y6bVar.O = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t7b t7bVar = this.a.u0;
        t7bVar.X = false;
        t7bVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!t7bVar.H() || motionEvent.getY() >= t7bVar.N0.g()) {
            return false;
        }
        t7bVar.c(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
