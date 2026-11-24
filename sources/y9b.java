// default package

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class y9b implements GestureDetector.OnGestureListener {
    public final /* synthetic */ oab a;

    public y9b(oab oabVar) {
        this.a = oabVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        oab oabVar = this.a;
        oabVar.g1 = false;
        return !oabVar.v(oabVar.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        oab oabVar = this.a;
        if (oabVar.a0 != 0.0f && oabVar.u1 == null && f2 < -1000.0f && !oabVar.b0) {
            oabVar.b0 = true;
            try {
                oabVar.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            oabVar.R();
        }
        if (oabVar.f0 != 0.0f) {
            if (f2 < -1000.0f) {
                oabVar.k(true);
            } else if (f2 > 1000.0f) {
                oabVar.k(false);
            } else {
                oabVar.k(oabVar.x.f > 0.5f);
            }
        }
        oabVar.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        u31 u31Var;
        oab oabVar = this.a;
        if (!oabVar.k0) {
            return false;
        }
        if (oabVar.m0) {
            oabVar.a0 += f2;
            float L = gm.L(200.0f);
            if (oabVar.a0 > L && !oabVar.b0) {
                oabVar.b0 = true;
                oabVar.R();
                try {
                    oabVar.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            oabVar.e0 = Utilities.i(oabVar.a0 / L, 1.0f, 0.0f);
            if (oabVar.o0.getCurrentPeerView() != null) {
                oabVar.o0.getCurrentPeerView().invalidate();
            }
            if (oabVar.a0 < 0.0f) {
                oabVar.a0 = 0.0f;
                oabVar.m0 = false;
            }
            return true;
        }
        if (oabVar.d0) {
            float f4 = oabVar.f0;
            if (f4 <= oabVar.x.c || f2 <= 0.0f) {
                oabVar.f0 = f4 + f2;
            } else {
                oabVar.f0 = (0.05f * f2) + f4;
            }
            cab cabVar = oabVar.s;
            u31 u31Var2 = u31.x;
            if (u31Var2 != null && u31Var2.h == cabVar) {
                u31Var2.b();
            }
            if (oabVar.o0.getCurrentPeerView() != null) {
                oabVar.o0.getCurrentPeerView().invalidate();
            }
            oabVar.w.invalidate();
            if (oabVar.f0 < 0.0f) {
                oabVar.f0 = 0.0f;
                oabVar.d0 = false;
            }
            return true;
        }
        if (oabVar.W > 0.8f) {
            float f5 = -f2;
            if ((f5 > 0.0f && oabVar.X > 0.0f) || (f5 < 0.0f && oabVar.X < 0.0f)) {
                f3 = 0.3f;
                oabVar.X -= f2 * f3;
                cab cabVar2 = oabVar.s;
                u31Var = u31.x;
                if (u31Var != null && u31Var.h == cabVar2) {
                    u31Var.b();
                }
                oabVar.V();
                return true;
            }
        }
        f3 = 0.6f;
        oabVar.X -= f2 * f3;
        cab cabVar22 = oabVar.s;
        u31Var = u31.x;
        if (u31Var != null) {
            u31Var.b();
        }
        oabVar.V();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        a58 currentPeerView;
        oab oabVar = this.a;
        if (oabVar.f0 == 0.0f && oabVar.g0) {
            if (oabVar.y || oabVar.L0 || oabVar.m1 || oabVar.i1 || oabVar.j1) {
                eab eabVar = oabVar.o0;
                if (eabVar != null && (currentPeerView = eabVar.getCurrentPeerView()) != null) {
                    currentPeerView.i0();
                }
            } else {
                a58 w = oabVar.w();
                if (w == null || !w.E1.f) {
                    boolean z = motionEvent.getX() > ((float) oabVar.w.getMeasuredWidth()) * 0.33f;
                    a58 currentPeerView2 = oabVar.o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.Z0(z)) {
                        if (oabVar.o0.E(z)) {
                            eab eabVar2 = oabVar.o0;
                            eabVar2.M0 = true;
                            eabVar2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            zka zkaVar = eabVar2.N0;
                            gm.r(zkaVar);
                            gm.d3(zkaVar, 150L);
                            return false;
                        }
                        if (z) {
                            oabVar.o(true);
                            return false;
                        }
                        nab nabVar = oabVar.A0;
                        if (nabVar != null) {
                            nabVar.loopBack();
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
