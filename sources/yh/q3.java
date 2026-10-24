package yh;

import ai.n6;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class q3 extends org.telegram.ui.ActionBar.e1 {
    public final int V;
    public long W;
    public o3 a0;

    public q3(Context context, int i10, g6 g6Var) {
        super(0, context, g6Var, false, false);
        this.V = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int i11 = k6.E8;
        int i12 = k6.F8;
        c(i11, i12);
        g(k6.w0(i12, g6Var), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new n6(this, 15));
    }

    @Override // org.telegram.ui.ActionBar.e1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
    }
}
