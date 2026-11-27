// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
