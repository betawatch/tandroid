// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rp3 extends lg0 {
    public wp3 d;

    @Override // lg0
    public final j79 a() {
        wp3 wp3Var = new wp3(yac.t0, this.a);
        this.d = wp3Var;
        wp3Var.r = this;
        return wp3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        wp3 wp3Var = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = wp3Var.f;
        yp3 yp3Var = new yp3(context, wp3Var.c);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            yp3Var.a((xp3) arrayList.get(i4));
            yp3Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_31));
            ((xp3) arrayList.get(i4)).e = i3;
            i3 += yp3Var.getMeasuredHeight();
        }
        wp3Var.n = i3;
    }
}
