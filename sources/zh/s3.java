package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import bi.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s3 extends org.telegram.ui.ActionBar.g1 {
    public final int V;
    public long W;
    public q3 a0;

    public s3(Context context, int i10, u6 u6Var) {
        super(0, context, u6Var, false, false);
        this.V = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int i11 = y6.E8;
        int i12 = y6.F8;
        c(i11, i12);
        g(y6.w0(i12, u6Var), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new i6(this, 16));
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
    }
}
