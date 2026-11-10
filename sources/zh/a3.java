package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a3 extends org.telegram.ui.ActionBar.z0 {
    public final int V;
    public long W;
    public y2 a0;

    public a3(int i7, Context context, h6 h6Var) {
        super(0, context, h6Var, false, false);
        this.V = i7;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        int i10 = m6.E8;
        int i11 = m6.F8;
        c(i10, i11);
        g(m6.w0(i11, h6Var), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new bi.m6(this, 15));
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
