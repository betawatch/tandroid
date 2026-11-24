// default package

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class s9b extends qu4 {
    public final /* synthetic */ u9b a;

    public s9b(u9b u9bVar) {
        this.a = u9bVar;
    }

    @Override // qu4
    public final boolean a() {
        a9b a9bVar;
        v9b v9bVar = this.a.u0;
        if (v9bVar.g0 != 0 || (a9bVar = v9bVar.C0) == null || v9bVar.T1 || !a9bVar.isInited() || v9bVar.Q1 || v9bVar.P0.y0) {
            return false;
        }
        ms9 ms9Var = v9bVar.E0;
        return (ms9Var == null || !(ms9Var.y.i || ms9Var.M)) && !v9bVar.H() && v9bVar.q2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        v9b v9bVar = this.a.u0;
        a9b a9bVar = v9bVar.C0;
        if (a9bVar == null || v9bVar.T1 || v9bVar.Q1 || !a9bVar.isInited() || v9bVar.g0 != 0 || v9bVar.P1 == -1) {
            return false;
        }
        v9bVar.C0.switchCamera();
        v9bVar.P0.d(180.0f);
        oc7.d1().edit().putBoolean("stories_camera", v9bVar.C0.isFrontface()).apply();
        if (v9bVar.p0()) {
            v9bVar.s.c(null);
            return true;
        }
        v9bVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        a9b a9bVar = this.a.u0.C0;
        if (a9bVar == null) {
            return false;
        }
        a9bVar.O = null;
        a9bVar.L = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        u9b u9bVar = this.a;
        u9bVar.s0 = 0.0f;
        u9bVar.t0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ms9 ms9Var;
        a9b a9bVar;
        b1d b1dVar;
        j9b j9bVar;
        u9b u9bVar = this.a;
        v9b v9bVar = u9bVar.u0;
        ValueAnimator valueAnimator = v9bVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((ms9Var = v9bVar.E0) != null && (ms9Var.y.i || ms9Var.M)) || v9bVar.P0.y0 || (((a9bVar = v9bVar.C0) != null && a9bVar.s) || u9bVar.q0 || (((b1dVar = v9bVar.W0) != null && (b1dVar.G || b1dVar.H)) || v9bVar.G())))) {
            return false;
        }
        boolean z = true;
        u9bVar.o0 = true;
        if (v9bVar.X) {
            if (Math.abs(v9bVar.r.a) >= gm.L(1.0f)) {
                if ((f2 <= 0.0f || Math.abs(f2) <= 2000.0f || Math.abs(f2) <= Math.abs(f)) && v9bVar.L <= 0.4f) {
                    v9bVar.b();
                } else {
                    v9bVar.o(true);
                }
            } else if (v9bVar.N0 != null && !v9bVar.M0 && v9bVar.P1 != -1) {
                if (Math.abs(f2) <= 200.0f || (v9bVar.N0.d.canScrollVertically(-1) && v9bVar.L0)) {
                    v9bVar.c(!v9bVar.R1 && v9bVar.N0.getTranslationY() < ((float) v9bVar.N0.getPadding()));
                } else {
                    v9bVar.c(!v9bVar.R1 && f2 < 0.0f);
                }
            }
            v9bVar.M0 = false;
            v9bVar.X = false;
            v9bVar.Y = false;
            if (z && (j9bVar = v9bVar.B0) != null) {
                j9bVar.a();
            }
            return z;
        }
        z = false;
        v9bVar.M0 = false;
        v9bVar.X = false;
        v9bVar.Y = false;
        if (z) {
            j9bVar.a();
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
        ms9 ms9Var;
        a9b a9bVar;
        b1d b1dVar;
        wt4 wt4Var;
        float max;
        u9b u9bVar = this.a;
        v9b v9bVar = u9bVar.u0;
        ValueAnimator valueAnimator = v9bVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || v9bVar.p2 != null || v9bVar.o2 != null || (((ms9Var = v9bVar.E0) != null && (ms9Var.y.i || ms9Var.M)) || v9bVar.P0.y0 || (((a9bVar = v9bVar.C0) != null && a9bVar.s) || u9bVar.q0 || (((b1dVar = v9bVar.W0) != null && (b1dVar.G || b1dVar.H)) || v9bVar.G() || v9bVar.R1 || v9bVar.Q1 || v9bVar.g0 != 0)))) {
            return false;
        }
        if (!v9bVar.Y) {
            float f3 = u9bVar.s0 + f2;
            u9bVar.s0 = f3;
            if (!v9bVar.X && Math.abs(f3) >= gm.e) {
                j9b j9bVar = v9bVar.B0;
                if (j9bVar != null) {
                    j9bVar.a();
                }
                v9bVar.X = true;
            }
        }
        if (v9bVar.X) {
            int measuredHeight = (v9bVar.n.getMeasuredHeight() - ((int) (gm.q.y * 0.35f))) - (a.getCurrentActionBarHeight() + gm.m);
            wt4 wt4Var2 = v9bVar.N0;
            if (wt4Var2 != null) {
                float f4 = measuredHeight;
                if (wt4Var2.getTranslationY() < f4) {
                    u9bVar.r0 = v9bVar.N0.getTranslationY() - f4;
                    wt4Var = v9bVar.N0;
                    if (wt4Var != null && wt4Var.d.canScrollVertically(-1)) {
                        f2 = Math.max(0.0f, f2);
                    }
                    float f5 = u9bVar.r0 - f2;
                    u9bVar.r0 = f5;
                    max = Math.max(-measuredHeight, f5);
                    u9bVar.r0 = max;
                    if (v9bVar.g0 == 1) {
                        max = Math.max(0.0f, max);
                        u9bVar.r0 = max;
                    }
                    if (max < 0.0f) {
                        v9bVar.r.setTranslationY(max);
                        wt4 wt4Var3 = v9bVar.N0;
                        if (wt4Var3 != null) {
                            wt4Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        v9bVar.r.setTranslationY(0.0f);
                        if (v9bVar.N0 == null) {
                            v9bVar.r(false);
                        }
                        v9bVar.N0.setTranslationY(measuredHeight + u9bVar.r0);
                    }
                }
            }
            u9bVar.r0 = v9bVar.r.a;
            wt4Var = v9bVar.N0;
            if (wt4Var != null) {
                f2 = Math.max(0.0f, f2);
            }
            float f52 = u9bVar.r0 - f2;
            u9bVar.r0 = f52;
            max = Math.max(-measuredHeight, f52);
            u9bVar.r0 = max;
            if (v9bVar.g0 == 1) {
            }
            if (max < 0.0f) {
            }
        }
        if (!v9bVar.X) {
            float f6 = u9bVar.t0 + f;
            u9bVar.t0 = f6;
            if (!v9bVar.Y && Math.abs(f6) >= gm.e) {
                j9b j9bVar2 = v9bVar.B0;
                if (j9bVar2 != null) {
                    j9bVar2.a();
                }
                v9bVar.Y = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        a9b a9bVar = this.a.u0.C0;
        if (a9bVar == null) {
            return false;
        }
        rs3 rs3Var = a9bVar.O;
        if (rs3Var == null) {
            return true;
        }
        rs3Var.run();
        a9bVar.O = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        v9b v9bVar = this.a.u0;
        v9bVar.X = false;
        v9bVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!v9bVar.H() || motionEvent.getY() >= v9bVar.N0.g()) {
            return false;
        }
        v9bVar.c(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
