package rh;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r1 extends HorizontalScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i10);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i11);
                    int measuredWidth = getMeasuredWidth();
                    if (mode == Integer.MIN_VALUE) {
                        measuredWidth = Math.min(measuredWidth, size);
                    }
                    setMeasuredDimension(measuredWidth, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
            default:
                int mode2 = View.MeasureSpec.getMode(i10);
                int size2 = View.MeasureSpec.getSize(i10);
                if (mode2 != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i11);
                    int measuredWidth2 = getMeasuredWidth();
                    if (mode2 == Integer.MIN_VALUE) {
                        measuredWidth2 = Math.min(measuredWidth2, size2);
                    }
                    setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
        }
    }
}
