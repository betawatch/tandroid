package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.dc1;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class p1 extends FrameLayout {
    public final dc1 a;
    public int b;
    public final c6 c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public int r;

    public p1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint(1);
        this.r = TLObject.FLAG_31;
        dc1 dc1Var = new dc1(this, context, 18);
        this.a = dc1Var;
        dc1Var.setClipToPadding(false);
        dc1Var.setClipChildren(false);
        dc1Var.setOrientation(0);
        dc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(dc1Var, x5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.c = new c6(dc1Var, 0L, 320L, qr.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
