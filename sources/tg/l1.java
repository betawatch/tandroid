package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.l9;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ n1 d;

    public l1(n1 n1Var) {
        this.d = n1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        n1 n1Var = this.d;
        boolean contains = n1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (n1Var.f != contains) {
            n1Var.f = contains;
            n1Var.invalidate();
            if (contains) {
                m1 m1Var = n1Var.L;
                this.a = m1Var != null ? m1Var.get() : n1Var.I.c;
                this.b = false;
            }
        }
        return n1Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        n1 n1Var = this.d;
        if (n1Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f12 = this.a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / n1Var.e.height();
            float f13 = n1Var.H;
            float f14 = n1Var.G;
            float a10 = l9.a(com.google.android.gms.internal.vision.e2.z(f13, f14, y10, f12), f14, f13);
            m1 m1Var = n1Var.L;
            if (m1Var != null) {
                m1Var.y1(a10);
            } else {
                n1Var.I.c = a10;
            }
            n1Var.x.e(true, a10);
            Runnable runnable = n1Var.J;
            if (runnable != null) {
                runnable.run();
            }
            n1Var.invalidate();
        }
        return n1Var.f;
    }
}
