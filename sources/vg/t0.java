package vg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t0 extends b5.l {
    public final /* synthetic */ v0 A0;
    public long x0;
    public boolean y0;
    public final s0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, Context context) {
        super(context);
        this.A0 = v0Var;
        try {
            Field declaredField = b5.l.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            s0 s0Var = new s0(this, getContext());
            this.z0 = s0Var;
            declaredField.set(this, s0Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        s0 s0Var;
        if (motionEvent.getAction() == 0) {
            this.x0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.x0 <= ViewConfiguration.getTapTimeout() && (s0Var = this.z0) != null && s0Var.isFinished()) {
                this.y0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                v0 v0Var = this.A0;
                if (x10 <= width) {
                    int i3 = v0Var.y1 - 1;
                    if (i3 >= 0) {
                        x(i3, true);
                    }
                } else if (v0Var.y1 + 1 < v0Var.l1.size()) {
                    x(v0Var.y1 + 1, true);
                }
                this.y0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.x0 = -1L;
        }
        return false;
    }

    @Override // b5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // b5.l, android.view.View
    public final void onMeasure(int i3, int i10) {
        int L = org.telegram.messenger.g0.L(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
            L = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L + this.A0.D1, TLObject.FLAG_30));
    }

    @Override // b5.l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A0.t1) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
