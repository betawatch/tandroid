package ug;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import fi.z6;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                fVar.n = true;
                fVar.b();
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.a) {
            case 0:
                g gVar = ((f) this.b).a;
                gVar.d -= f7 * 0.5f;
                gVar.i -= f10 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f7, f10);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i10 = this.a;
        View view = this.b;
        switch (i10) {
            case 0:
                f fVar = (f) view;
                g gVar = fVar.a;
                if (Math.abs(gVar.d) > 10.0f) {
                    return true;
                }
                float max = Math.max(1.0f, fVar.getWidth() / 2.0f);
                float x9 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                float y3 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                fVar.b();
                float f7 = gVar.d;
                float f10 = gVar.i;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                fVar.d = ofFloat;
                ofFloat.setDuration(220L);
                fVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                fVar.d.addUpdateListener(new z6(this, f7, x9, f10, y3, 2));
                fVar.d.addListener(new hc1(this, 20));
                fVar.d.start();
                return true;
            default:
                yh.i iVar = (yh.i) view;
                if (!iVar.e.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (iVar.e.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= iVar.e.f.getRight() || iVar.e.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= iVar.e.f.getBottom())) {
                    iVar.e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
        }
    }
}
