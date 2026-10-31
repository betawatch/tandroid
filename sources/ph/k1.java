package ph;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
import org.telegram.ui.u71;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k1 extends FrameLayout implements k6 {
    public final u71 a;
    public int b;
    public final t5 c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public int r;

    public k1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint(1);
        this.r = TLObject.FLAG_31;
        u71 u71Var = new u71(this, context, 20);
        this.a = u71Var;
        u71Var.setClipToPadding(false);
        u71Var.setClipChildren(false);
        u71Var.setOrientation(0);
        u71Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f));
        addView(u71Var, b6.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.c = new t5(u71Var, 0L, 320L, gr.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                this.a.invalidate();
                return;
            } else {
                ((TextView) arrayList.get(i10)).setTextColor(t6.w(t6.x0(null, t6.b6, false), t6.x0(null, t6.c6, false)));
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
