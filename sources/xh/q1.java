package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.ub1;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class q1 extends FrameLayout {
    public final ub1 a;
    public int b;
    public final e6 c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public int r;

    public q1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint(1);
        this.r = TLObject.FLAG_31;
        ub1 ub1Var = new ub1(this, context, 18);
        this.a = ub1Var;
        ub1Var.setClipToPadding(false);
        ub1Var.setClipChildren(false);
        ub1Var.setOrientation(0);
        ub1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(ub1Var, y5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.c = new e6(ub1Var, 0L, 320L, rr.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
