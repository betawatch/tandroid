// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class qr4 extends be0 {
    public final /* synthetic */ byte H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qr4(Context context, byte b) {
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
