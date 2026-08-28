package zf;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u0 extends m2.g {
    public long s0;
    public boolean t0;
    public final t0 u0;
    public final /* synthetic */ x0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, Context context) {
        super(context);
        this.v0 = x0Var;
        try {
            Field declaredField = m2.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            t0 t0Var = new t0(this, getContext());
            this.u0 = t0Var;
            declaredField.set(this, t0Var);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        t0 t0Var;
        if (motionEvent.getAction() == 0) {
            this.s0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.s0 <= ViewConfiguration.getTapTimeout() && (t0Var = this.u0) != null && t0Var.isFinished()) {
                this.t0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                x0 x0Var = this.v0;
                if (x10 <= width) {
                    int i9 = x0Var.C - 1;
                    if (i9 >= 0) {
                        x(i9, true);
                    }
                } else if (x0Var.C + 1 < x0Var.d.size()) {
                    x(x0Var.C + 1, true);
                }
                this.t0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.s0 = -1L;
        }
        return false;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // m2.g, android.view.View
    public final void onMeasure(int i9, int i10) {
        int dp = AndroidUtilities.dp(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(dp + this.v0.H, TLObject.FLAG_30));
    }

    @Override // m2.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.v0.w) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
