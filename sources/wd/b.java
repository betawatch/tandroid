package wd;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import sf.o1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public final a a;
    public o1 b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;

    public b(a aVar) {
        this.a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.a;
        if (action == 0) {
            b(view, x4, y8);
            if (aVar.needClickAt(view, x4, y8)) {
                this.c |= 1;
                this.d = x4;
                this.e = y8;
                aVar.onClickTouchDown(view, x4, y8);
                if (aVar.needLongPress(x4, y8) && view != null) {
                    if (this.b != null) {
                        throw new AssertionError();
                    }
                    this.c |= 2;
                    o1 o1Var = new o1(12, this, view);
                    this.b = o1Var;
                    view.postDelayed(o1Var, aVar.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i10 = this.c;
            if ((i10 & 1) != 0) {
                if ((i10 & 4) != 0) {
                    aVar.onLongPressFinish(view, x4, y8);
                    this.c &= -5;
                } else {
                    aVar.onClickAt(view, x4, y8);
                    if ((this.c & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                b(view, x4, y8);
                return true;
            }
        } else if (action != 2) {
            if (action == 3 && (this.c & 1) != 0) {
                b(view, x4, y8);
                return true;
            }
        } else if ((this.c & 1) != 0) {
            aVar.onClickTouchMove(view, x4, y8);
            if ((this.c & 4) != 0) {
                aVar.onLongPressMove(view, motionEvent, x4, y8, this.f, this.g);
                return true;
            }
            if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x4), Math.abs(this.e - y8)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                b(view, x4, y8);
                return true;
            }
        }
        return (this.c & 1) != 0;
    }

    public final void b(View view, float f9, float f10) {
        int i10 = this.c;
        if ((i10 & 2) != 0) {
            this.c = i10 & (-3);
            o1 o1Var = this.b;
            if (o1Var == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(o1Var);
            this.b = null;
        }
        int i11 = this.c;
        int i12 = i11 & 8;
        a aVar = this.a;
        if (i12 != 0) {
            this.c = i11 & (-9);
            aVar.onLongPressCancelled(view, f9, f10);
        }
        if ((this.c & 4) != 0) {
            aVar.onLongPressFinish(view, f9, f10);
            this.c &= -5;
        }
        if ((this.c & 1) != 0) {
            aVar.onClickTouchUp(view, f9, f10);
            this.c &= -2;
        }
    }
}
