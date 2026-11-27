// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x4a extends View {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4a(Context context, TL_stars.StarGift starGift, float f) {
        super(context);
        this.a = starGift;
        this.b = f;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.a == null) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.b), TLObject.FLAG_30), i2);
        }
    }
}
