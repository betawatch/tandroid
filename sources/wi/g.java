package wi;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import fi.u2;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.z51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g extends n10 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ h d;

    public g(h hVar, int i7) {
        this.d = hVar;
        this.c = i7;
    }

    @Override // org.telegram.ui.Components.n10
    public final boolean a() {
        h hVar = this.d;
        return (hVar.K || hVar.H || !hVar.c()) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        h hVar = this.d;
        z51 z51Var = hVar.F;
        l lVar = hVar.b;
        if (hVar.b() && hVar.c()) {
            boolean z10 = motionEvent.getX() >= ((float) hVar.x) * 0.5f;
            long duration = lVar.getDuration();
            long n10 = lVar.n();
            long j3 = (z10 ? 10000 : -10000) + n10;
            if (j3 > duration) {
                j3 = duration;
            } else if (j3 < 0) {
                if (j3 >= -9000) {
                    j3 = 0;
                }
                return true;
            }
            if (n10 != j3) {
                z51Var.e(true);
                z51Var.d(!z10);
                long j10 = z51Var.o + 10000;
                z51Var.o = j10;
                z51Var.p = gd.G((int) (j10 / 1000), "Seconds", new Object[0]);
                lVar.c(j3);
                z51Var.g(0L);
                hVar.I = j3 / duration;
                u2 u2Var = hVar.o;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                d dVar = hVar.m;
                if (dVar != null) {
                    dVar.invalidate();
                }
                if (!hVar.u) {
                    hVar.u = true;
                    hVar.o(true);
                    if (!hVar.w) {
                        hVar.w = true;
                        g0.h3(hVar.P, 2500L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        h hVar = this.d;
        if (hVar.u) {
            for (int i7 = 1; i7 < hVar.i.getChildCount(); i7++) {
                View childAt = hVar.i.getChildAt(i7);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    hVar.t = childAt;
                    return true;
                }
            }
        }
        this.a = hVar.B;
        this.b = hVar.C;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        if (!hVar.r || hVar.s) {
            return false;
        }
        r1.g gVar = hVar.D;
        gVar.a = f10;
        gVar.b = hVar.B;
        gVar.c = true;
        gVar.m.i = h.n((f10 / 7.0f) + r0, hVar.x);
        hVar.D.h();
        r1.g gVar2 = hVar.E;
        gVar2.a = f11;
        gVar2.b = hVar.C;
        gVar2.c = true;
        gVar2.m.i = h.e((f11 / 10.0f) + r7, hVar.y);
        hVar.E.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        WindowManager.LayoutParams layoutParams = hVar.e;
        if (!hVar.r && hVar.v == null && !hVar.s) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                hVar.r = true;
                hVar.D.d();
                hVar.E.d();
                hVar.L = false;
                hVar.b.T0();
                g0.r(hVar.N);
            }
        }
        if (hVar.r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            hVar.C = rawY;
            r1.g gVar = hVar.D;
            if (gVar.f) {
                gVar.m.i = rawX;
            } else {
                hVar.B = rawX;
                layoutParams.x = (int) rawX;
            }
            layoutParams.y = (int) rawY;
            hVar.r();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        h hVar = this.d;
        e eVar = hVar.P;
        if (hVar.v == null) {
            if (hVar.w) {
                g0.r(eVar);
                hVar.w = false;
            }
            boolean z10 = !hVar.u;
            hVar.u = z10;
            hVar.o(z10);
            if (hVar.u) {
                g0.h3(eVar, 2500L);
                hVar.w = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (a()) {
            return super.onSingleTapUp(motionEvent);
        }
        onSingleTapConfirmed(motionEvent);
        return true;
    }
}
