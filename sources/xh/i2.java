package xh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i2 extends r {
    public final /* synthetic */ m2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(m2 m2Var, Context context, p6 p6Var) {
        super(context, p6Var);
        this.s = m2Var;
    }

    @Override // xh.r, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.s.e0 && org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.P1()) {
            Point point = org.telegram.messenger.i0.q;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
