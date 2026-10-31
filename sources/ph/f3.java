package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f3 extends org.telegram.ui.ActionBar.b1 {
    public final int V;
    public long W;
    public d3 a0;

    public f3(int i10, Context context, p6 p6Var) {
        super(0, context, p6Var, false, false);
        this.V = i10;
        setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        int i11 = t6.E8;
        int i12 = t6.F8;
        c(i11, i12);
        g(t6.w0(i12, p6Var), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(org.telegram.messenger.i0.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new l.d(this, 13));
    }

    @Override // org.telegram.ui.ActionBar.b1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.i0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
    }
}
