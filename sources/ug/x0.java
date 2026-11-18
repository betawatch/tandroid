package ug;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x0 extends c5.l {
    public final /* synthetic */ z0 A0;
    public long x0;
    public boolean y0;
    public final w0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, Context context) {
        super(context);
        this.A0 = z0Var;
        try {
            Field declaredField = c5.l.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            w0 w0Var = new w0(this, getContext());
            this.z0 = w0Var;
            declaredField.set(this, w0Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        w0 w0Var;
        if (motionEvent.getAction() == 0) {
            this.x0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.x0 <= ViewConfiguration.getTapTimeout() && (w0Var = this.z0) != null && w0Var.isFinished()) {
                this.y0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                z0 z0Var = this.A0;
                if (x10 <= width) {
                    int i7 = z0Var.B1 - 1;
                    if (i7 >= 0) {
                        x(i7, true);
                    }
                } else if (z0Var.B1 + 1 < z0Var.o1.size()) {
                    x(z0Var.B1 + 1, true);
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
