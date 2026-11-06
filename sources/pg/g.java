package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ j c;

    public g(j jVar) {
        this.c = jVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        j jVar = this.c;
        if (!jVar.f || jVar.n) {
            return false;
        }
        r1.h hVar = jVar.c.m;
        if ((f10 / 7.0f) + ((float) hVar.i) >= jVar.getWidth() / 2.0f) {
            displayMetrics = jVar.getResources().getDisplayMetrics();
            f12 = 2.14748365E9f;
        } else {
            displayMetrics = jVar.getResources().getDisplayMetrics();
            f12 = -2.14748365E9f;
        }
        hVar.i = j.a(displayMetrics, f12);
        jVar.d.m.i = j.b(jVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) jVar.d.m.i));
        jVar.c.h();
        jVar.d.h();
        jVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j jVar = this.c;
        int i7 = jVar.F;
        if (!jVar.n) {
            g0.r(jVar.r);
        }
        if (!jVar.f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.a = (float) jVar.c.m.i;
            this.b = (float) jVar.d.m.i;
            jVar.f = true;
        }
        if (jVar.f && !jVar.n) {
            jVar.c.m.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            jVar.d.m.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            jVar.c.h();
            jVar.d.h();
        }
        return jVar.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j jVar = this.c;
        if (jVar.n || jVar.s) {
            return false;
        }
        jVar.c(true);
        return true;
    }
}
