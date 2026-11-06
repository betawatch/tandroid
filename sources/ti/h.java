package ti;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import di.b3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.j51;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class h extends b10 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ i d;

    public h(i iVar, int i7) {
        this.d = iVar;
        this.c = i7;
    }

    @Override // org.telegram.ui.Components.b10
    public final boolean a() {
        i iVar = this.d;
        return (iVar.K || iVar.H || !iVar.c()) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        i iVar = this.d;
        j51 j51Var = iVar.F;
        m mVar = iVar.b;
        if (iVar.b() && iVar.c()) {
            boolean z9 = motionEvent.getX() >= ((float) iVar.x) * 0.5f;
            long duration = mVar.getDuration();
            long l10 = mVar.l();
            long j3 = (z9 ? 10000 : -10000) + l10;
            if (j3 > duration) {
                j3 = duration;
            } else if (j3 < 0) {
                if (j3 >= -9000) {
                    j3 = 0;
                }
                return true;
            }
            if (l10 != j3) {
                j51Var.e(true);
                j51Var.d(!z9);
                long j10 = j51Var.o + 10000;
                j51Var.o = j10;
                j51Var.p = hd.G((int) (j10 / 1000), "Seconds", new Object[0]);
                mVar.c(j3);
                j51Var.g(0L);
                iVar.I = j3 / duration;
                b3 b3Var = iVar.o;
                if (b3Var != null) {
                    b3Var.invalidate();
                }
                e eVar = iVar.m;
                if (eVar != null) {
                    eVar.invalidate();
                }
                if (!iVar.u) {
                    iVar.u = true;
                    iVar.o(true);
                    if (!iVar.w) {
                        iVar.w = true;
                        g0.i3(iVar.P, 2500L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        i iVar = this.d;
        if (iVar.u) {
            for (int i7 = 1; i7 < iVar.i.getChildCount(); i7++) {
                View childAt = iVar.i.getChildAt(i7);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    iVar.t = childAt;
                    return true;
                }
            }
        }
        this.a = iVar.B;
        this.b = iVar.C;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.d;
        if (!iVar.r || iVar.s) {
            return false;
        }
        r1.g gVar = iVar.D;
        gVar.a = f10;
        gVar.b = iVar.B;
        gVar.c = true;
        gVar.m.i = i.n((f10 / 7.0f) + r0, iVar.x);
        iVar.D.h();
        r1.g gVar2 = iVar.E;
        gVar2.a = f11;
        gVar2.b = iVar.C;
        gVar2.c = true;
        gVar2.m.i = i.e((f11 / 10.0f) + r7, iVar.y);
        iVar.E.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.d;
        WindowManager.LayoutParams layoutParams = iVar.e;
        if (!iVar.r && iVar.v == null && !iVar.s) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                iVar.r = true;
                iVar.D.d();
                iVar.E.d();
                iVar.L = false;
                iVar.b.F();
                g0.r(iVar.N);
            }
        }
        if (iVar.r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            iVar.C = rawY;
            r1.g gVar = iVar.D;
            if (gVar.f) {
                gVar.m.i = rawX;
            } else {
                iVar.B = rawX;
                layoutParams.x = (int) rawX;
            }
            layoutParams.y = (int) rawY;
            iVar.r();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        i iVar = this.d;
        f fVar = iVar.P;
        if (iVar.v == null) {
            if (iVar.w) {
                g0.r(fVar);
                iVar.w = false;
            }
            boolean z9 = !iVar.u;
            iVar.u = z9;
            iVar.o(z9);
            if (iVar.u) {
                g0.i3(fVar, 2500L);
                iVar.w = true;
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
