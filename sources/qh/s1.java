package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.s10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s1 extends HorizontalScrollView {
    public final s10 a;
    public final y5 b;
    public final y5 c;
    public final /* synthetic */ x1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(x1 x1Var, Context context) {
        super(context);
        this.d = x1Var;
        this.a = new s10();
        gr grVar = gr.h;
        this.b = new y5(this, 300L, grVar);
        this.c = new y5(this, 300L, grVar);
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
            s10 s10Var = this.a;
            if (e10 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
                s10Var.b(canvas2, rectF, 0, e10);
            }
            if (e11 > 0.0f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                s10Var.b(canvas2, rectF2, 2, e11);
            }
            canvas2.restore();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        if (mode == 1073741824) {
            super.onMeasure(i9, i10);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 0), i10);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.d.g0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i9));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
