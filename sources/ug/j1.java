package ug;

import android.view.GestureDetector;
import android.view.MotionEvent;
import b8.be;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ l1 d;

    public j1(l1 l1Var) {
        this.d = l1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        l1 l1Var = this.d;
        boolean contains = l1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (l1Var.f != contains) {
            l1Var.f = contains;
            l1Var.invalidate();
            if (contains) {
                k1 k1Var = l1Var.L;
                this.a = k1Var != null ? k1Var.get() : l1Var.I.c;
                this.b = false;
            }
        }
        return l1Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l1 l1Var = this.d;
        if (l1Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f12 = this.a;
            float y9 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / l1Var.e.height();
            float f13 = l1Var.H;
            float f14 = l1Var.G;
            float a10 = be.a(com.google.android.recaptcha.internal.a.y(f13, f14, y9, f12), f14, f13);
            k1 k1Var = l1Var.L;
            if (k1Var != null) {
                k1Var.s(a10);
            } else {
                l1Var.I.c = a10;
            }
            l1Var.x.e(true, a10);
            Runnable runnable = l1Var.J;
            if (runnable != null) {
                runnable.run();
            }
            l1Var.invalidate();
        }
        return l1Var.f;
    }
}
