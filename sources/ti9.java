// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ti9 extends HorizontalScrollView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti9(FrameLayout frameLayout, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = frameLayout;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
                    int measuredWidth = getMeasuredWidth();
                    int i3 = ((ui9) this.b).L;
                    if (mode == Integer.MIN_VALUE) {
                        i3 = Math.min(i3, View.MeasureSpec.getSize(i));
                    }
                    setMeasuredDimension(Math.min(measuredWidth, i3), getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i, i2);
                    break;
                }
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        amb textSelectionHelper;
        switch (this.a) {
            case 1:
                super.onScrollChanged(i, i2, i3, i4);
                xh9 xh9Var = ((xl9) this.b).F;
                if (xh9Var != null && (textSelectionHelper = xh9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w()) {
                    textSelectionHelper.v();
                }
                invalidate();
                break;
            default:
                super.onScrollChanged(i, i2, i3, i4);
                break;
        }
    }
}
