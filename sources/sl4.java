// default package

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class sl4 extends qu4 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tl4 d;

    public sl4(tl4 tl4Var, int i) {
        this.d = tl4Var;
        this.c = i;
    }

    @Override // qu4
    public final boolean a() {
        tl4 tl4Var = this.d;
        return (tl4Var.K || tl4Var.H || !tl4Var.c()) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        tl4 tl4Var = this.d;
        ucc uccVar = tl4Var.F;
        vc8 vc8Var = tl4Var.b;
        if (tl4Var.b() && tl4Var.c()) {
            boolean z = motionEvent.getX() >= ((float) tl4Var.x) * 0.5f;
            long duration = vc8Var.getDuration();
            long k = vc8Var.k();
            long j = (z ? 10000 : -10000) + k;
            if (j > duration) {
                j = duration;
            } else if (j < 0) {
                if (j >= -9000) {
                    j = 0;
                }
                return true;
            }
            if (k != j) {
                uccVar.c(true);
                uccVar.b(!z);
                long j2 = uccVar.o + 10000;
                uccVar.o = j2;
                uccVar.p = jb6.G((int) (j2 / 1000), "Seconds", new Object[0]);
                vc8Var.e(j);
                uccVar.e(0L);
                tl4Var.I = j / duration;
                yc ycVar = tl4Var.o;
                if (ycVar != null) {
                    ycVar.invalidate();
                }
                pl4 pl4Var = tl4Var.m;
                if (pl4Var != null) {
                    pl4Var.invalidate();
                }
                if (!tl4Var.u) {
                    tl4Var.u = true;
                    tl4Var.o(true);
                    if (!tl4Var.w) {
                        tl4Var.w = true;
                        gm.d3(tl4Var.P, 2500L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        tl4 tl4Var = this.d;
        if (tl4Var.u) {
            for (int i = 1; i < tl4Var.i.getChildCount(); i++) {
                View childAt = tl4Var.i.getChildAt(i);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    tl4Var.t = childAt;
                    return true;
                }
            }
        }
        this.a = tl4Var.B;
        this.b = tl4Var.C;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        tl4 tl4Var = this.d;
        if (!tl4Var.r || tl4Var.s) {
            return false;
        }
        zna znaVar = tl4Var.D;
        znaVar.a = f;
        znaVar.b = tl4Var.B;
        znaVar.c = true;
        znaVar.m.i = tl4.n((f / 7.0f) + r4, tl4Var.x);
        tl4Var.D.h();
        zna znaVar2 = tl4Var.E;
        znaVar2.a = f2;
        znaVar2.b = tl4Var.C;
        znaVar2.c = true;
        znaVar2.m.i = tl4.e((f2 / 10.0f) + r4, tl4Var.y);
        tl4Var.E.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        tl4 tl4Var = this.d;
        WindowManager.LayoutParams layoutParams = tl4Var.e;
        if (!tl4Var.r && tl4Var.v == null && !tl4Var.s) {
            float abs = Math.abs(f);
            float f3 = this.c;
            if (abs >= f3 || Math.abs(f2) >= f3) {
                tl4Var.r = true;
                tl4Var.D.d();
                tl4Var.E.d();
                tl4Var.L = false;
                tl4Var.b.R();
                gm.r(tl4Var.N);
            }
        }
        if (tl4Var.r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            tl4Var.C = rawY;
            zna znaVar = tl4Var.D;
            if (znaVar.f) {
                znaVar.m.i = rawX;
            } else {
                tl4Var.B = rawX;
                layoutParams.x = (int) rawX;
            }
            layoutParams.y = (int) rawY;
            tl4Var.r();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tl4 tl4Var = this.d;
        ql4 ql4Var = tl4Var.P;
        if (tl4Var.v == null) {
            if (tl4Var.w) {
                gm.r(ql4Var);
                tl4Var.w = false;
            }
            boolean z = !tl4Var.u;
            tl4Var.u = z;
            tl4Var.o(z);
            if (tl4Var.u) {
                gm.d3(ql4Var, 2500L);
                tl4Var.w = true;
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
