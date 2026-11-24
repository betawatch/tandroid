// default package

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rm8 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ cic c;

    public rm8(cic cicVar) {
        this.c = cicVar;
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
        if (Math.abs(x) > gm.Z0(true, 0.4f) && Math.abs(x) / 3.0f > y && this.a && !this.b) {
            this.a = false;
            ku kuVar = new ku(this, x, (byte) 3);
            cic cicVar = this.c;
            ValueAnimator valueAnimator = cicVar.V;
            if (valueAnimator != null) {
                this.b = true;
                gm.d3(kuVar, (valueAnimator.getDuration() - cicVar.V.getCurrentPlayTime()) + 50);
            } else {
                kuVar.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
