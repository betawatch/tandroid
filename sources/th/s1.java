package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s1 extends HorizontalScrollView {
    public final u10 a;
    public final d6 b;
    public final d6 c;
    public final /* synthetic */ x1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(x1 x1Var, Context context) {
        super(context);
        this.d = x1Var;
        this.a = new u10();
        jr jrVar = jr.h;
        this.b = new d6(this, 300L, jrVar);
        this.c = new d6(this, 300L, jrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.b.e(canScrollHorizontally(-1));
        float e11 = this.c.e(canScrollHorizontally(1));
        if (e10 > 0.0f || e11 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        if (e10 > 0.0f || e11 > 0.0f) {
            canvas2.save();
            u10 u10Var = this.a;
            if (e10 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
                u10Var.b(canvas2, rectF, 0, e10);
            }
            if (e11 > 0.0f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                u10Var.b(canvas2, rectF2, 2, e11);
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
        int i12 = this.d.g0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
