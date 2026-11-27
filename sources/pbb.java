// default package

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class pbb extends tu4 {
    public final /* synthetic */ rbb a;

    public pbb(rbb rbbVar) {
        this.a = rbbVar;
    }

    @Override // tu4
    public final boolean a() {
        xab xabVar;
        sbb sbbVar = this.a.o0;
        if (sbbVar.g0 != 0 || (xabVar = sbbVar.C0) == null || sbbVar.T1 || !xabVar.isInited() || sbbVar.Q1 || sbbVar.P0.y0) {
            return false;
        }
        du9 du9Var = sbbVar.E0;
        return (du9Var == null || !(du9Var.y.i || du9Var.M)) && !sbbVar.H() && sbbVar.q2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        sbb sbbVar = this.a.o0;
        xab xabVar = sbbVar.C0;
        if (xabVar == null || sbbVar.T1 || sbbVar.Q1 || !xabVar.isInited() || sbbVar.g0 != 0 || sbbVar.P1 == -1) {
            return false;
        }
        sbbVar.C0.switchCamera();
        sbbVar.P0.d(180.0f);
        uc7.e1().edit().putBoolean("stories_camera", sbbVar.C0.isFrontface()).apply();
        if (sbbVar.p0()) {
            sbbVar.s.c(null);
            return true;
        }
        sbbVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        xab xabVar = this.a.o0.C0;
        if (xabVar == null) {
            return false;
        }
        xabVar.O = null;
        xabVar.L = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        rbb rbbVar = this.a;
        rbbVar.m0 = 0.0f;
        rbbVar.n0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        du9 du9Var;
        xab xabVar;
        r3d r3dVar;
        gbb gbbVar;
        rbb rbbVar = this.a;
        sbb sbbVar = rbbVar.o0;
        ValueAnimator valueAnimator = sbbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((du9Var = sbbVar.E0) != null && (du9Var.y.i || du9Var.M)) || sbbVar.P0.y0 || (((xabVar = sbbVar.C0) != null && xabVar.s) || rbbVar.k0 || (((r3dVar = sbbVar.W0) != null && (r3dVar.G || r3dVar.H)) || sbbVar.G())))) {
            return false;
        }
        boolean z = true;
        rbbVar.i0 = true;
        if (sbbVar.X) {
            if (Math.abs(sbbVar.r.a) >= hl.L(1.0f)) {
                if ((f2 <= 0.0f || Math.abs(f2) <= 2000.0f || Math.abs(f2) <= Math.abs(f)) && sbbVar.L <= 0.4f) {
                    sbbVar.b();
                } else {
                    sbbVar.o(true);
                }
            } else if (sbbVar.N0 != null && !sbbVar.M0 && sbbVar.P1 != -1) {
                if (Math.abs(f2) <= 200.0f || (sbbVar.N0.d.canScrollVertically(-1) && sbbVar.L0)) {
                    sbbVar.c(!sbbVar.R1 && sbbVar.N0.getTranslationY() < ((float) sbbVar.N0.getPadding()));
                } else {
                    sbbVar.c(!sbbVar.R1 && f2 < 0.0f);
                }
            }
            sbbVar.M0 = false;
            sbbVar.X = false;
            sbbVar.Y = false;
            if (z && (gbbVar = sbbVar.B0) != null) {
                gbbVar.a();
            }
            return z;
        }
        z = false;
        sbbVar.M0 = false;
        sbbVar.X = false;
        sbbVar.Y = false;
        if (z) {
            gbbVar.a();
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
        du9 du9Var;
        xab xabVar;
        r3d r3dVar;
        zt4 zt4Var;
        float max;
        rbb rbbVar = this.a;
        sbb sbbVar = rbbVar.o0;
        ValueAnimator valueAnimator = sbbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || sbbVar.p2 != null || sbbVar.o2 != null || (((du9Var = sbbVar.E0) != null && (du9Var.y.i || du9Var.M)) || sbbVar.P0.y0 || (((xabVar = sbbVar.C0) != null && xabVar.s) || rbbVar.k0 || (((r3dVar = sbbVar.W0) != null && (r3dVar.G || r3dVar.H)) || sbbVar.G() || sbbVar.R1 || sbbVar.Q1 || sbbVar.g0 != 0)))) {
            return false;
        }
        if (!sbbVar.Y) {
            float f3 = rbbVar.m0 + f2;
            rbbVar.m0 = f3;
            if (!sbbVar.X && Math.abs(f3) >= hl.e) {
                gbb gbbVar = sbbVar.B0;
                if (gbbVar != null) {
                    gbbVar.a();
                }
                sbbVar.X = true;
            }
        }
        if (sbbVar.X) {
            int measuredHeight = (sbbVar.n.getMeasuredHeight() - ((int) (hl.q.y * 0.35f))) - (a.getCurrentActionBarHeight() + hl.m);
            zt4 zt4Var2 = sbbVar.N0;
            if (zt4Var2 != null) {
                float f4 = measuredHeight;
                if (zt4Var2.getTranslationY() < f4) {
                    rbbVar.l0 = sbbVar.N0.getTranslationY() - f4;
                    zt4Var = sbbVar.N0;
                    if (zt4Var != null && zt4Var.d.canScrollVertically(-1)) {
                        f2 = Math.max(0.0f, f2);
                    }
                    float f5 = rbbVar.l0 - f2;
                    rbbVar.l0 = f5;
                    max = Math.max(-measuredHeight, f5);
                    rbbVar.l0 = max;
                    if (sbbVar.g0 == 1) {
                        max = Math.max(0.0f, max);
                        rbbVar.l0 = max;
                    }
                    if (max < 0.0f) {
                        sbbVar.r.setTranslationY(max);
                        zt4 zt4Var3 = sbbVar.N0;
                        if (zt4Var3 != null) {
                            zt4Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        sbbVar.r.setTranslationY(0.0f);
                        if (sbbVar.N0 == null) {
                            sbbVar.r(false);
                        }
                        sbbVar.N0.setTranslationY(measuredHeight + rbbVar.l0);
                    }
                }
            }
            rbbVar.l0 = sbbVar.r.a;
            zt4Var = sbbVar.N0;
            if (zt4Var != null) {
                f2 = Math.max(0.0f, f2);
            }
            float f52 = rbbVar.l0 - f2;
            rbbVar.l0 = f52;
            max = Math.max(-measuredHeight, f52);
            rbbVar.l0 = max;
            if (sbbVar.g0 == 1) {
            }
            if (max < 0.0f) {
            }
        }
        if (!sbbVar.X) {
            float f6 = rbbVar.n0 + f;
            rbbVar.n0 = f6;
            if (!sbbVar.Y && Math.abs(f6) >= hl.e) {
                gbb gbbVar2 = sbbVar.B0;
                if (gbbVar2 != null) {
                    gbbVar2.a();
                }
                sbbVar.Y = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        xab xabVar = this.a.o0.C0;
        if (xabVar == null) {
            return false;
        }
        zr3 zr3Var = xabVar.O;
        if (zr3Var == null) {
            return true;
        }
        zr3Var.run();
        xabVar.O = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sbb sbbVar = this.a.o0;
        sbbVar.X = false;
        sbbVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!sbbVar.H() || motionEvent.getY() >= sbbVar.N0.g()) {
            return false;
        }
        sbbVar.c(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
