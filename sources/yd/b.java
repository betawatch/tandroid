package yd;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import uf.v0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b {
    public final a a;
    public v0 b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;

    public b(a aVar) {
        this.a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.a;
        if (action == 0) {
            b(view, x10, y10);
            if (aVar.needClickAt(view, x10, y10)) {
                this.c |= 1;
                this.d = x10;
                this.e = y10;
                aVar.onClickTouchDown(view, x10, y10);
                if (aVar.needLongPress(x10, y10) && view != null) {
                    if (this.b != null) {
                        throw new AssertionError();
                    }
                    this.c |= 2;
                    v0 v0Var = new v0(13, this, view);
                    this.b = v0Var;
                    view.postDelayed(v0Var, aVar.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i10 = this.c;
            if ((i10 & 1) != 0) {
                if ((i10 & 4) != 0) {
                    aVar.onLongPressFinish(view, x10, y10);
                    this.c &= -5;
                } else {
                    aVar.onClickAt(view, x10, y10);
                    if ((this.c & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                b(view, x10, y10);
                return true;
            }
        } else if (action != 2) {
            if (action == 3 && (this.c & 1) != 0) {
                b(view, x10, y10);
                return true;
            }
        } else if ((this.c & 1) != 0) {
            aVar.onClickTouchMove(view, x10, y10);
            if ((this.c & 4) != 0) {
                aVar.onLongPressMove(view, motionEvent, x10, y10, this.f, this.g);
                return true;
            }
            if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.e - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                b(view, x10, y10);
                return true;
            }
        }
        return (this.c & 1) != 0;
    }

    public final void b(View view, float f10, float f11) {
        int i10 = this.c;
        if ((i10 & 2) != 0) {
            this.c = i10 & (-3);
            v0 v0Var = this.b;
            if (v0Var == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(v0Var);
            this.b = null;
        }
        int i11 = this.c;
        int i12 = i11 & 8;
        a aVar = this.a;
        if (i12 != 0) {
            this.c = i11 & (-9);
            aVar.onLongPressCancelled(view, f10, f11);
        }
        if ((this.c & 4) != 0) {
            aVar.onLongPressFinish(view, f10, f11);
            this.c &= -5;
        }
        if ((this.c & 1) != 0) {
            aVar.onClickTouchUp(view, f10, f11);
            this.c &= -2;
        }
    }
}
