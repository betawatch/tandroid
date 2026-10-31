package th;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y6 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ o7 a;

    public y6(o7 o7Var) {
        this.a = o7Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        o7 o7Var = this.a;
        o7Var.g1 = false;
        return !o7.u(o7Var, o7Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        o7 o7Var = this.a;
        if (o7Var.Z != 0.0f && o7Var.u1 == null && f10 < -1000.0f && !o7Var.a0) {
            o7Var.a0 = true;
            try {
                o7Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            o7.v(o7Var);
        }
        if (o7Var.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                o7Var.A(true);
            } else if (f10 > 1000.0f) {
                o7Var.A(false);
            } else {
                o7Var.A(o7Var.x.f > 0.5f);
            }
        }
        o7Var.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        wb wbVar;
        o7 o7Var = this.a;
        if (!o7Var.j0) {
            return false;
        }
        if (o7Var.l0) {
            o7Var.Z += f10;
            float L = org.telegram.messenger.i0.L(200.0f);
            if (o7Var.Z > L && !o7Var.a0) {
                o7Var.a0 = true;
                o7.v(o7Var);
                try {
                    o7Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            o7Var.d0 = Utilities.i(o7Var.Z / L, 1.0f, 0.0f);
            if (o7Var.n0.getCurrentPeerView() != null) {
                o7Var.n0.getCurrentPeerView().invalidate();
            }
            if (o7Var.Z < 0.0f) {
                o7Var.Z = 0.0f;
                o7Var.l0 = false;
            }
            return true;
        }
        if (o7Var.c0) {
            float f12 = o7Var.e0;
            if (f12 <= o7Var.x.c || f10 <= 0.0f) {
                o7Var.e0 = f12 + f10;
            } else {
                o7Var.e0 = (0.05f * f10) + f12;
            }
            c7 c7Var = o7Var.s;
            wb wbVar2 = wb.w;
            if (wbVar2 != null && wbVar2.h == c7Var) {
                wbVar2.b();
            }
            if (o7Var.n0.getCurrentPeerView() != null) {
                o7Var.n0.getCurrentPeerView().invalidate();
            }
            o7Var.w.invalidate();
            if (o7Var.e0 < 0.0f) {
                o7Var.e0 = 0.0f;
                o7Var.c0 = false;
            }
            return true;
        }
        if (o7Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && o7Var.W > 0.0f) || (f13 < 0.0f && o7Var.W < 0.0f)) {
                f11 = 0.3f;
                o7Var.W -= f10 * f11;
                c7 c7Var2 = o7Var.s;
                wbVar = wb.w;
                if (wbVar != null && wbVar.h == c7Var2) {
                    wbVar.b();
                }
                o7.w(o7Var);
                return true;
            }
        }
        f11 = 0.6f;
        o7Var.W -= f10 * f11;
        c7 c7Var22 = o7Var.s;
        wbVar = wb.w;
        if (wbVar != null) {
            wbVar.b();
        }
        o7.w(o7Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        z2 currentPeerView;
        o7 o7Var = this.a;
        if (o7Var.e0 == 0.0f && o7Var.f0) {
            if (o7Var.y || o7Var.L0 || o7Var.m1 || o7Var.i1 || o7Var.j1) {
                e7 e7Var = o7Var.n0;
                if (e7Var != null && (currentPeerView = e7Var.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
                }
            } else {
                z2 H = o7Var.H();
                if (H == null || !H.x1.f) {
                    boolean z10 = motionEvent.getX() > ((float) o7Var.w.getMeasuredWidth()) * 0.33f;
                    z2 currentPeerView2 = o7Var.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (o7Var.n0.E(z10)) {
                            e7 e7Var2 = o7Var.n0;
                            e7Var2.L0 = true;
                            e7Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            ew ewVar = e7Var2.M0;
                            org.telegram.messenger.i0.r(ewVar);
                            org.telegram.messenger.i0.h3(ewVar, 150L);
                            return false;
                        }
                        if (z10) {
                            o7Var.D(true);
                            return false;
                        }
                        n7 n7Var = o7Var.z0;
                        if (n7Var != null) {
                            n7Var.loopBack();
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
