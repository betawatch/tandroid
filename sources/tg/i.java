package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.em0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class i implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public i(n nVar, int i10) {
        this.b = nVar;
        this.a = i10;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.b;
        ValueAnimator valueAnimator = nVar.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.c0.cancel();
            nVar.c0 = null;
        }
        AnimatorSet animatorSet = nVar.d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.d0.cancel();
            nVar.d0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.e0);
        nVar.a = true;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.h();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.a;
        n nVar = this.b;
        if (i10 == 4) {
            g gVar = nVar.b;
            gVar.d -= f7 * 0.5f;
            gVar.i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.i = (f10 * 0.05f) + gVar2.i;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new em0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
