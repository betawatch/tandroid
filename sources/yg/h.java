package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final n5 a;
    public long b;

    public h(Context context, i6 i6Var) {
        super(context);
        n5 n5Var = new n5(context);
        n5Var.setTextSize(16);
        u6.X(n5Var, n6.j5, i6Var);
        n5Var.setGravity(gd.a0 ? 5 : 3);
        addView(n5Var);
        n5 n5Var2 = new n5(context);
        this.a = n5Var2;
        n5Var2.setTextSize(16);
        u6.X(n5Var2, n6.L6, i6Var);
        n5Var2.setGravity(gd.a0 ? 3 : 5);
        addView(n5Var2);
        n5Var.l(gd.a0("BoostingDateAndTime", null, 2131753537, new Object[0]), false);
        boolean z10 = gd.a0;
        n5Var.setLayoutParams(ma.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = gd.a0;
        n5Var2.setLayoutParams(ma.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        u6.h(n6.h5, this, i6Var);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j3) {
        this.b = j3;
        Date date = new Date(j3);
        this.a.l(gd.a0("formatDateAtTime", null, 2131742525, gd.E0().q0().format(date), gd.E0().p0().format(date)), false);
    }
}
