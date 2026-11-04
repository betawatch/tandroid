package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.Date;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final k5 a;
    public long b;

    public h(Context context, e6 e6Var) {
        super(context);
        k5 k5Var = new k5(context);
        k5Var.setTextSize(16);
        r6.Y(k5Var, k6.j5, e6Var);
        k5Var.setGravity(bd.a0 ? 5 : 3);
        addView(k5Var);
        k5 k5Var2 = new k5(context);
        this.a = k5Var2;
        k5Var2.setTextSize(16);
        r6.Y(k5Var2, k6.L6, e6Var);
        k5Var2.setGravity(bd.a0 ? 3 : 5);
        addView(k5Var2);
        k5Var.l(bd.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z10 = bd.a0;
        k5Var.setLayoutParams(mf.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = bd.a0;
        k5Var2.setLayoutParams(mf.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        r6.i(k6.h5, this, e6Var);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j10) {
        this.b = j10;
        Date date = new Date(j10);
        this.a.l(bd.a0("formatDateAtTime", null, 2131742793, bd.E0().q0().format(date), bd.E0().p0().format(date)), false);
    }
}
