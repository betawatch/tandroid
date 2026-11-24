// default package

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pk8 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ bgc c;

    public pk8(bgc bgcVar) {
        this.c = bgcVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = true;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent.getX() - motionEvent2.getX();
        float y = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x) > gl.Z0(true, 0.4f) && Math.abs(x) / 3.0f > y && this.a && !this.b) {
            this.a = false;
            kt ktVar = new kt(this, x, (byte) 3);
            bgc bgcVar = this.c;
            ValueAnimator valueAnimator = bgcVar.V;
            if (valueAnimator != null) {
                this.b = true;
                gl.d3(ktVar, (valueAnimator.getDuration() - bgcVar.V.getCurrentPlayTime()) + 50);
            } else {
                ktVar.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
