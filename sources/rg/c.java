package rg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nl0;
import zh.a4;
import zh.f3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ c(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                ValueAnimator valueAnimator = fVar.S;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    fVar.S.cancel();
                    fVar.S = null;
                }
                AnimatorSet animatorSet = fVar.T;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    fVar.T.cancel();
                    fVar.T = null;
                }
                AndroidUtilities.cancelRunOnUIThread(fVar.U);
                fVar.a = true;
                break;
            default:
                a4 a4Var = (a4) this.b;
                a4Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = a4Var.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    a4Var.M.cancel();
                    a4Var.M = null;
                }
                a4Var.L = false;
                a4Var.O.w = false;
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.a) {
            case 0:
                break;
            default:
                a4 a4Var = (a4) this.b;
                a4Var.d.fling((int) a4Var.e, 0, (int) (-f7), 0, (int) a4Var.f, (int) a4Var.h, 0, 0);
                a4Var.invalidate();
                break;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ((f) this.b).g();
                break;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.a) {
            case 0:
                a aVar = ((f) this.b).b;
                aVar.d = (f7 * 0.5f) + aVar.d;
                aVar.g = (f10 * 0.05f) + aVar.g;
                return true;
            default:
                a4 a4Var = (a4) this.b;
                float f11 = a4Var.e + f7;
                a4Var.e = f11;
                float f12 = a4Var.f;
                if (f11 < f12) {
                    a4Var.e = f12;
                }
                float f13 = a4Var.e;
                float f14 = a4Var.h;
                if (f13 > f14) {
                    a4Var.e = f14;
                }
                a4Var.invalidate();
                return false;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.a;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                float measuredWidth = ((f) this.b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new nl0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
                return true;
            default:
                a4 a4Var = (a4) this.b;
                ArrayList arrayList = a4Var.G;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    f3 f3Var = (f3) arrayList.get(i10);
                    if (((f3) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = a4Var.K;
                        int i12 = f3Var.b;
                        if (i11 != i12) {
                            a4Var.c(i12, true, false);
                        } else {
                            a4Var.N.n(false);
                        }
                    }
                }
                return false;
        }
    }

    private final void a(MotionEvent motionEvent) {
    }

    private final void b(MotionEvent motionEvent) {
    }

    private final void c(MotionEvent motionEvent) {
    }
}
