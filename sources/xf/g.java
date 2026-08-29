package xf;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        j jVar = this.c;
        if (!jVar.f || jVar.n) {
            return false;
        }
        l lVar = jVar.c.u;
        if ((f9 / 7.0f) + ((float) lVar.i) >= jVar.getWidth() / 2.0f) {
            displayMetrics = jVar.getResources().getDisplayMetrics();
            f11 = 2.14748365E9f;
        } else {
            displayMetrics = jVar.getResources().getDisplayMetrics();
            f11 = -2.14748365E9f;
        }
        lVar.i = j.a(displayMetrics, f11);
        jVar.d.u.i = j.b(jVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) jVar.d.u.i));
        jVar.c.f();
        jVar.d.f();
        jVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        j jVar = this.c;
        int i10 = jVar.B;
        if (!jVar.n) {
            AndroidUtilities.cancelRunOnUIThread(jVar.r);
        }
        if (!jVar.f && (Math.abs(f9) >= i10 || Math.abs(f10) >= i10)) {
            this.a = (float) jVar.c.u.i;
            this.b = (float) jVar.d.u.i;
            jVar.f = true;
        }
        if (jVar.f && !jVar.n) {
            jVar.c.u.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            jVar.d.u.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            jVar.c.f();
            jVar.d.f();
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
