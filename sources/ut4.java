// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ut4 extends de0 {
    public final /* synthetic */ byte H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut4(Context context, byte b) {
        super(context);
        this.H = b;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.H) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                setMeasuredDimension(size, size);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.H) {
            case 1:
                super.setAlpha(f);
                setVisibility(f > 0.0f ? 0 : 4);
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }
}
