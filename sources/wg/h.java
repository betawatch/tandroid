package wg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.jj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public h(m mVar, int i3) {
        this.b = mVar;
        this.a = i3;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.b;
        ValueAnimator valueAnimator = mVar.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.d0.cancel();
            mVar.d0 = null;
        }
        AnimatorSet animatorSet = mVar.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.e0.cancel();
            mVar.e0 = null;
        }
        g0.r(mVar.f0);
        mVar.a = true;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.h();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i3 = this.a;
        m mVar = this.b;
        if (i3 == 4) {
            f fVar = mVar.b;
            fVar.d -= f10 * 0.5f;
            fVar.i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.i = (f11 * 0.05f) + fVar2.i;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.b;
        g0.i3(new jj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
