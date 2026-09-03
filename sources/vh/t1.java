package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.i20;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class t1 extends HorizontalScrollView {
    public final i20 a;
    public final org.telegram.ui.Components.z5 b;
    public final org.telegram.ui.Components.z5 c;
    public final /* synthetic */ y1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(y1 y1Var, Context context) {
        super(context);
        this.d = y1Var;
        this.a = new i20();
        mr mrVar = mr.h;
        this.b = new org.telegram.ui.Components.z5(this, 300L, mrVar);
        this.c = new org.telegram.ui.Components.z5(this, 300L, mrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.b.e(canScrollHorizontally(-1));
        float e6 = this.c.e(canScrollHorizontally(1));
        if (e > 0.0f || e6 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        if (e > 0.0f || e6 > 0.0f) {
            canvas2.save();
            i20 i20Var = this.a;
            if (e > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
                i20Var.b(canvas2, rectF, 0, e);
            }
            if (e6 > 0.0f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                i20Var.b(canvas2, rectF2, 2, e6);
            }
            canvas2.restore();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == 1073741824) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.d.h0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
