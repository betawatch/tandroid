package ug;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u0 extends c5.k {
    public long w0;
    public boolean x0;
    public final t0 y0;
    public final /* synthetic */ w0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, Context context) {
        super(context);
        this.z0 = w0Var;
        try {
            Field declaredField = c5.k.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            t0 t0Var = new t0(this, getContext());
            this.y0 = t0Var;
            declaredField.set(this, t0Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        t0 t0Var;
        if (motionEvent.getAction() == 0) {
            this.w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.w0 <= ViewConfiguration.getTapTimeout() && (t0Var = this.y0) != null && t0Var.isFinished()) {
                this.x0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                w0 w0Var = this.z0;
                if (x10 <= width) {
                    int i7 = w0Var.x1 - 1;
                    if (i7 >= 0) {
                        x(i7, true);
                    }
                } else if (w0Var.x1 + 1 < w0Var.k1.size()) {
                    x(w0Var.x1 + 1, true);
                }
                this.x0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.w0 = -1L;
        }
        return false;
    }

    @Override // c5.k, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // c5.k, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L = org.telegram.messenger.g0.L(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L + this.z0.C1, TLObject.FLAG_30));
    }

    @Override // c5.k, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.z0.s1) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
