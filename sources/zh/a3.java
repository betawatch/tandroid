package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import bi.m6;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a3 extends org.telegram.ui.ActionBar.z0 {
    public final int V;
    public long W;
    public y2 a0;

    public a3(int i7, Context context, g6 g6Var) {
        super(0, context, g6Var, false, false);
        this.V = i7;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        int i10 = l6.E8;
        int i11 = l6.F8;
        c(i10, i11);
        g(l6.w0(i11, g6Var), PorterDuff.Mode.SRC_IN);
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
