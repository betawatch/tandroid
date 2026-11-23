package ug;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class w0 extends c5.l {
    public final /* synthetic */ y0 A0;
    public long x0;
    public boolean y0;
    public final v0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, Context context) {
        super(context);
        this.A0 = y0Var;
        try {
            Field declaredField = c5.l.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            v0 v0Var = new v0(this, getContext());
            this.z0 = v0Var;
            declaredField.set(this, v0Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        v0 v0Var;
        if (motionEvent.getAction() == 0) {
            this.x0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.x0 <= ViewConfiguration.getTapTimeout() && (v0Var = this.z0) != null && v0Var.isFinished()) {
                this.y0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                y0 y0Var = this.A0;
                if (x10 <= width) {
                    int i7 = y0Var.B1 - 1;
                    if (i7 >= 0) {
                        x(i7, true);
                    }
                } else if (y0Var.B1 + 1 < y0Var.o1.size()) {
                    x(y0Var.B1 + 1, true);
                }
                this.y0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.x0 = -1L;
        }
        return false;
    }

    @Override // c5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // c5.l, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L = org.telegram.messenger.g0.L(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L + this.A0.G1, TLObject.FLAG_30));
    }

    @Override // c5.l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A0.w1) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
