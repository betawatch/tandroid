// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class tw0 extends zo0 {
    public final /* synthetic */ xw0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(xw0 xw0Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.s = xw0Var;
    }

    @Override // zo0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.s.f0 && hl.O1() && !hl.E && !hl.N1()) {
            Point point = hl.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
