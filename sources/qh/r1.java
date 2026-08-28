package qh;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r1 extends HorizontalScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i9);
                int size = View.MeasureSpec.getSize(i9);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i10);
                    int measuredWidth = getMeasuredWidth();
                    if (mode == Integer.MIN_VALUE) {
                        measuredWidth = Math.min(measuredWidth, size);
                    }
                    setMeasuredDimension(measuredWidth, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i9, i10);
                    break;
                }
            default:
                int mode2 = View.MeasureSpec.getMode(i9);
                int size2 = View.MeasureSpec.getSize(i9);
                if (mode2 != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i10);
                    int measuredWidth2 = getMeasuredWidth();
                    if (mode2 == Integer.MIN_VALUE) {
                        measuredWidth2 = Math.min(measuredWidth2, size2);
                    }
                    setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i9, i10);
                    break;
                }
        }
    }
}
