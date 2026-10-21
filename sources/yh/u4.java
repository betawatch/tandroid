package yh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class u4 extends View {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(Context context, TL_stars.StarGift starGift, float f7) {
        super(context);
        this.a = starGift;
        this.b = f7;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.b), TLObject.FLAG_30), i11);
        }
    }
}
