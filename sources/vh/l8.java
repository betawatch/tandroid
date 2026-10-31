package vh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.s81;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l8 extends r10 {
    public final /* synthetic */ n8 a;

    public l8(n8 n8Var) {
        this.a = n8Var;
    }

    @Override // org.telegram.ui.Components.r10
    public final boolean a() {
        t7 t7Var;
        o8 o8Var = this.a.n0;
        if (o8Var.f0 != 0 || (t7Var = o8Var.B0) == null || o8Var.S1 || !t7Var.isInited() || o8Var.P1 || o8Var.O0.x0) {
            return false;
        }
        a5 a5Var = o8Var.D0;
        return (a5Var == null || !(a5Var.y.i || a5Var.L)) && !o8Var.I() && o8Var.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        o8 o8Var = this.a.n0;
        t7 t7Var = o8Var.B0;
        if (t7Var == null || o8Var.S1 || o8Var.P1 || !t7Var.isInited() || o8Var.f0 != 0 || o8Var.O1 == -1) {
            return false;
        }
        o8Var.B0.switchCamera();
        o8Var.O0.d(180.0f);
        o8.Z(o8Var.B0.isFrontface());
        if (o8Var.p0()) {
            o8Var.s.c(null);
            return true;
        }
        o8Var.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        t7 t7Var = this.a.n0.B0;
        if (t7Var == null) {
            return false;
        }
        t7Var.N = null;
        t7Var.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        n8 n8Var = this.a;
        n8Var.l0 = 0.0f;
        n8Var.m0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        a5 a5Var;
        t7 t7Var;
        s81 s81Var;
        c8 c8Var;
        n8 n8Var = this.a;
        o8 o8Var = n8Var.n0;
        ValueAnimator valueAnimator = o8Var.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((a5Var = o8Var.D0) != null && (a5Var.y.i || a5Var.L)) || o8Var.O0.x0 || (((t7Var = o8Var.B0) != null && t7Var.s) || n8Var.j0 || (((s81Var = o8Var.V0) != null && (s81Var.F || s81Var.G)) || o8Var.H())))) {
            return false;
        }
        boolean z10 = true;
        n8Var.h0 = true;
        if (o8Var.W) {
            if (Math.abs(o8Var.r.a) >= org.telegram.messenger.i0.L(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f7)) && o8Var.K <= 0.4f) {
                    o8.b(o8Var);
                } else {
                    o8Var.p(true);
                }
            } else if (o8Var.M0 != null && !o8Var.L0 && o8Var.O1 != -1) {
                if (Math.abs(f10) <= 200.0f || (o8Var.M0.d.canScrollVertically(-1) && o8Var.K0)) {
                    o8Var.e(!o8Var.Q1 && o8Var.M0.getTranslationY() < ((float) o8Var.M0.getPadding()));
                } else {
                    o8Var.e(!o8Var.Q1 && f10 < 0.0f);
                }
            }
            o8Var.L0 = false;
            o8Var.W = false;
            o8Var.X = false;
            if (z10 && (c8Var = o8Var.A0) != null) {
                c8Var.d();
            }
            return z10;
        }
        z10 = false;
        o8Var.L0 = false;
        o8Var.W = false;
        o8Var.X = false;
        if (z10) {
            c8Var.d();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        a5 a5Var;
        t7 t7Var;
        s81 s81Var;
        m2 m2Var;
        float f11;
        n8 n8Var = this.a;
        o8 o8Var = n8Var.n0;
        ValueAnimator valueAnimator = o8Var.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || o8Var.o2 != null || o8Var.n2 != null || (((a5Var = o8Var.D0) != null && (a5Var.y.i || a5Var.L)) || o8Var.O0.x0 || (((t7Var = o8Var.B0) != null && t7Var.s) || n8Var.j0 || (((s81Var = o8Var.V0) != null && (s81Var.F || s81Var.G)) || o8Var.H() || o8Var.Q1 || o8Var.P1 || o8Var.f0 != 0)))) {
            return false;
        }
        if (!o8Var.X) {
            float f12 = n8Var.l0 + f10;
            n8Var.l0 = f12;
            if (!o8Var.W && Math.abs(f12) >= org.telegram.messenger.i0.e) {
                c8 c8Var = o8Var.A0;
                if (c8Var != null) {
                    c8Var.d();
                }
                o8Var.W = true;
            }
        }
        if (o8Var.W) {
            int measuredHeight = (o8Var.n.getMeasuredHeight() - ((int) (org.telegram.messenger.i0.q.y * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m);
            m2 m2Var2 = o8Var.M0;
            if (m2Var2 != null) {
                float f13 = measuredHeight;
                if (m2Var2.getTranslationY() < f13) {
                    n8Var.k0 = o8Var.M0.getTranslationY() - f13;
                    m2Var = o8Var.M0;
                    if (m2Var != null && m2Var.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = n8Var.k0 - f10;
                    n8Var.k0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    n8Var.k0 = max;
                    if (o8Var.f0 == 1) {
                        n8Var.k0 = Math.max(0.0f, max);
                    }
                    f11 = n8Var.k0;
                    if (f11 < 0.0f) {
                        o8Var.r.setTranslationY(f11);
                        m2 m2Var3 = o8Var.M0;
                        if (m2Var3 != null) {
                            m2Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        o8Var.r.setTranslationY(0.0f);
                        if (o8Var.M0 == null) {
                            o8Var.s(false);
                        }
                        o8Var.M0.setTranslationY(measuredHeight + n8Var.k0);
                    }
                }
            }
            n8Var.k0 = o8Var.r.a;
            m2Var = o8Var.M0;
            if (m2Var != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = n8Var.k0 - f10;
            n8Var.k0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            n8Var.k0 = max2;
            if (o8Var.f0 == 1) {
            }
            f11 = n8Var.k0;
            if (f11 < 0.0f) {
            }
        }
        if (!o8Var.W) {
            float f15 = n8Var.m0 + f7;
            n8Var.m0 = f15;
            if (!o8Var.X && Math.abs(f15) >= org.telegram.messenger.i0.e) {
                c8 c8Var2 = o8Var.A0;
                if (c8Var2 != null) {
                    c8Var2.d();
                }
                o8Var.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        t7 t7Var = this.a.n0.B0;
        if (t7Var == null) {
            return false;
        }
        t0 t0Var = t7Var.N;
        if (t0Var == null) {
            return true;
        }
        t0Var.run();
        t7Var.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o8 o8Var = this.a.n0;
        o8Var.W = false;
        o8Var.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!o8Var.I() || motionEvent.getY() >= o8Var.M0.g()) {
            return false;
        }
        o8Var.e(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
