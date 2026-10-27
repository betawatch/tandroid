package pe;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.ui.Wallet.a6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b {
    public final a a;
    public a6 b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;

    public b(a aVar) {
        this.a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.a;
        if (action == 0) {
            b(view, x9, y3);
            if (aVar.needClickAt(view, x9, y3)) {
                this.c |= 1;
                this.d = x9;
                this.e = y3;
                aVar.onClickTouchDown(view, x9, y3);
                if (aVar.needLongPress(x9, y3) && view != null) {
                    if (this.b != null) {
                        throw new AssertionError();
                    }
                    this.c |= 2;
                    a6 a6Var = new a6(22, this, view);
                    this.b = a6Var;
                    view.postDelayed(a6Var, aVar.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i10 = this.c;
            if ((i10 & 1) != 0) {
                if ((i10 & 4) != 0) {
                    aVar.onLongPressFinish(view, x9, y3);
                    this.c &= -5;
                } else {
                    aVar.onClickAt(view, x9, y3);
                    if ((this.c & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                b(view, x9, y3);
                return true;
            }
        } else if (action != 2) {
            if (action == 3 && (this.c & 1) != 0) {
                b(view, x9, y3);
                return true;
            }
        } else if ((this.c & 1) != 0) {
            aVar.onClickTouchMove(view, x9, y3);
            if ((this.c & 4) != 0) {
                aVar.onLongPressMove(view, motionEvent, x9, y3, this.f, this.g);
                return true;
            }
            if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x9), Math.abs(this.e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                b(view, x9, y3);
                return true;
            }
        }
        return (this.c & 1) != 0;
    }

    public final void b(View view, float f7, float f10) {
        int i10 = this.c;
        if ((i10 & 2) != 0) {
            this.c = i10 & (-3);
            a6 a6Var = this.b;
            if (a6Var == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(a6Var);
            this.b = null;
        }
        int i11 = this.c;
        int i12 = i11 & 8;
        a aVar = this.a;
        if (i12 != 0) {
            this.c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.c &= -5;
        }
        if ((this.c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.c &= -2;
        }
    }
}
