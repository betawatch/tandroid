package zh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e7 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ u7 a;

    public e7(u7 u7Var) {
        this.a = u7Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        u7 u7Var = this.a;
        u7Var.g1 = false;
        return !u7.i(u7Var, u7Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        u7 u7Var = this.a;
        if (u7Var.Z != 0.0f && u7Var.u1 == null && f10 < -1000.0f && !u7Var.a0) {
            u7Var.a0 = true;
            try {
                u7Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            u7.j(u7Var);
        }
        if (u7Var.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                u7Var.n(true);
            } else if (f10 > 1000.0f) {
                u7Var.n(false);
            } else {
                u7Var.n(u7Var.w.f > 0.5f);
            }
        }
        u7Var.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        pc pcVar;
        u7 u7Var = this.a;
        if (!u7Var.j0) {
            return false;
        }
        if (u7Var.l0) {
            u7Var.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (u7Var.Z > dp && !u7Var.a0) {
                u7Var.a0 = true;
                u7.j(u7Var);
                try {
                    u7Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            u7Var.d0 = Utilities.clamp(u7Var.Z / dp, 1.0f, 0.0f);
            if (u7Var.n0.getCurrentPeerView() != null) {
                u7Var.n0.getCurrentPeerView().invalidate();
            }
            if (u7Var.Z < 0.0f) {
                u7Var.Z = 0.0f;
                u7Var.l0 = false;
            }
            return true;
        }
        if (u7Var.c0) {
            float f12 = u7Var.e0;
            if (f12 <= u7Var.w.c || f10 <= 0.0f) {
                u7Var.e0 = f12 + f10;
            } else {
                u7Var.e0 = (0.05f * f10) + f12;
            }
            i7 i7Var = u7Var.s;
            pc pcVar2 = pc.w;
            if (pcVar2 != null && pcVar2.h == i7Var) {
                pcVar2.b();
            }
            if (u7Var.n0.getCurrentPeerView() != null) {
                u7Var.n0.getCurrentPeerView().invalidate();
            }
            u7Var.v.invalidate();
            if (u7Var.e0 < 0.0f) {
                u7Var.e0 = 0.0f;
                u7Var.c0 = false;
            }
            return true;
        }
        if (u7Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && u7Var.W > 0.0f) || (f13 < 0.0f && u7Var.W < 0.0f)) {
                f11 = 0.3f;
                u7Var.W -= f10 * f11;
                i7 i7Var2 = u7Var.s;
                pcVar = pc.w;
                if (pcVar != null && pcVar.h == i7Var2) {
                    pcVar.b();
                }
                u7.k(u7Var);
                return true;
            }
        }
        f11 = 0.6f;
        u7Var.W -= f10 * f11;
        i7 i7Var22 = u7Var.s;
        pcVar = pc.w;
        if (pcVar != null) {
            pcVar.b();
        }
        u7.k(u7Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        a3 currentPeerView;
        u7 u7Var = this.a;
        if (u7Var.e0 == 0.0f && u7Var.f0) {
            if (u7Var.x || u7Var.L0 || u7Var.m1 || u7Var.i1 || u7Var.j1) {
                k7 k7Var = u7Var.n0;
                if (k7Var != null && (currentPeerView = k7Var.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                a3 t10 = u7Var.t();
                if (t10 == null || !t10.O1.f) {
                    boolean z10 = motionEvent.getX() > ((float) u7Var.v.getMeasuredWidth()) * 0.33f;
                    a3 currentPeerView2 = u7Var.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (u7Var.n0.E(z10)) {
                            k7 k7Var2 = u7Var.n0;
                            k7Var2.L0 = true;
                            k7Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            sg.a1 a1Var = k7Var2.M0;
                            AndroidUtilities.cancelRunOnUIThread(a1Var);
                            AndroidUtilities.runOnUIThread(a1Var, 150L);
                            return false;
                        }
                        if (z10) {
                            u7Var.q(true);
                            return false;
                        }
                        t7 t7Var = u7Var.z0;
                        if (t7Var != null) {
                            t7Var.loopBack();
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
