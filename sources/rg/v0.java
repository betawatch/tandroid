package rg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class v0 extends z4.g {
    public long w0;
    public boolean x0;
    public final u0 y0;
    public final /* synthetic */ y0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(y0 y0Var, Context context) {
        super(context);
        this.z0 = y0Var;
        try {
            Field declaredField = z4.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            u0 u0Var = new u0(this, getContext());
            this.y0 = u0Var;
            declaredField.set(this, u0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        u0 u0Var;
        if (motionEvent.getAction() == 0) {
            this.w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.w0 <= ViewConfiguration.getTapTimeout() && (u0Var = this.y0) != null && u0Var.isFinished()) {
                this.x0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                y0 y0Var = this.z0;
                if (x10 <= width) {
                    int i10 = y0Var.G - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                } else if (y0Var.G + 1 < y0Var.d.size()) {
                    x(y0Var.G + 1, true);
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
