package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import bi.m6;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b3 extends org.telegram.ui.ActionBar.z0 {
    public final int V;
    public long W;
    public z2 a0;

    public b3(int i7, Context context, f6 f6Var) {
        super(0, context, f6Var, false, false);
        this.V = i7;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        int i10 = k6.E8;
        int i11 = k6.F8;
        c(i10, i11);
        g(k6.w0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new m6(this, 15));
    }

    @Override // org.telegram.ui.ActionBar.z0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
    }
}
