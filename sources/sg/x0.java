package sg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class x0 extends z4.g {
    public long w0;
    public boolean x0;
    public final w0 y0;
    public final /* synthetic */ a1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(a1 a1Var, Context context) {
        super(context);
        this.z0 = a1Var;
        try {
            Field declaredField = z4.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            w0 w0Var = new w0(this, getContext());
            this.y0 = w0Var;
            declaredField.set(this, w0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        w0 w0Var;
        if (motionEvent.getAction() == 0) {
            this.w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.w0 <= ViewConfiguration.getTapTimeout() && (w0Var = this.y0) != null && w0Var.isFinished()) {
                this.x0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                a1 a1Var = this.z0;
                if (x10 <= width) {
                    int i10 = a1Var.G - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                } else if (a1Var.G + 1 < a1Var.d.size()) {
                    x(a1Var.G + 1, true);
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
