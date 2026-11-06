package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g1 extends FrameLayout implements a6 {
    public final c61 a;
    public int b;
    public final w5 c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public int r;

    public g1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint(1);
        this.r = TLObject.FLAG_31;
        c61 c61Var = new c61(25, context, this);
        this.a = c61Var;
        c61Var.setClipToPadding(false);
        c61Var.setClipChildren(false);
        c61Var.setOrientation(0);
        c61Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(c61Var, ha.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.c = new w5(c61Var, 0L, 320L, xq.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                this.a.invalidate();
                return;
            } else {
                ((TextView) arrayList.get(i7)).setTextColor(k6.w(k6.x0(null, k6.b6, false), k6.x0(null, k6.c6, false)));
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
