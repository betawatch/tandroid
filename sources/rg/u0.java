package rg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class u0 extends z4.g {
    public long w0;
    public boolean x0;
    public final t0 y0;
    public final /* synthetic */ x0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, Context context) {
        super(context);
        this.z0 = x0Var;
        try {
            Field declaredField = z4.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            t0 t0Var = new t0(this, getContext());
            this.y0 = t0Var;
            declaredField.set(this, t0Var);
        } catch (Exception e) {
            FileLog.e(e);
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
                x0 x0Var = this.z0;
                if (x10 <= width) {
                    int i10 = x0Var.G - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                } else if (x0Var.G + 1 < x0Var.d.size()) {
                    x(x0Var.G + 1, true);
                }
                this.x0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.w0 = -1L;
        }
        return false;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // z4.g, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.z0.L, TLObject.FLAG_30));
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.z0.w) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
