package qg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ h c;

    public f(h hVar) {
        this.c = hVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        h hVar = this.c;
        if (!hVar.f || hVar.n) {
            return false;
        }
        q1.h hVar2 = hVar.c.m;
        if ((f10 / 7.0f) + ((float) hVar2.i) >= hVar.getWidth() / 2.0f) {
            displayMetrics = hVar.getResources().getDisplayMetrics();
            f12 = 2.14748365E9f;
        } else {
            displayMetrics = hVar.getResources().getDisplayMetrics();
            f12 = -2.14748365E9f;
        }
        hVar2.i = h.a(displayMetrics, f12);
        hVar.d.m.i = h.b(hVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) hVar.d.m.i));
        hVar.c.h();
        hVar.d.h();
        hVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.c;
        int i3 = hVar.G;
        if (!hVar.n) {
            g0.r(hVar.r);
        }
        if (!hVar.f && (Math.abs(f10) >= i3 || Math.abs(f11) >= i3)) {
            this.a = (float) hVar.c.m.i;
            this.b = (float) hVar.d.m.i;
            hVar.f = true;
        }
        if (hVar.f && !hVar.n) {
            hVar.c.m.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            hVar.d.m.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            hVar.c.h();
            hVar.d.h();
        }
        return hVar.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h hVar = this.c;
        if (hVar.n || hVar.s) {
            return false;
        }
        hVar.c(true);
        return true;
    }
}
