package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class s3 extends org.telegram.ui.ActionBar.g1 {
    public final int L;
    public long M;
    public q3 N;

    public s3(Context context, int i10, f6 f6Var) {
        super(0, context, f6Var, false, false);
        this.L = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int v02 = j6.v0(j6.E8, f6Var);
        int i11 = j6.F8;
        c(v02, j6.v0(i11, f6Var));
        e(j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new ai.u2(this, 14));
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
