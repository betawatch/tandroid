package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final k5 a;
    public long b;

    public h(Context context, f6 f6Var) {
        super(context);
        k5 k5Var = new k5(context);
        k5Var.setTextSize(16);
        r6.Y(k5Var, k6.j5, f6Var);
        k5Var.setGravity(id.a0 ? 5 : 3);
        addView(k5Var);
        k5 k5Var2 = new k5(context);
        this.a = k5Var2;
        k5Var2.setTextSize(16);
        r6.Y(k5Var2, k6.L6, f6Var);
        k5Var2.setGravity(id.a0 ? 3 : 5);
        addView(k5Var2);
        k5Var.l(id.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z9 = id.a0;
        k5Var.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 0.0f : 21.0f, 0.0f, z9 ? 21.0f : 0.0f, 0.0f));
        boolean z10 = id.a0;
        k5Var2.setLayoutParams(ha.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 21.0f : 0.0f, 0.0f, z10 ? 0.0f : 21.0f, 0.0f));
        r6.i(k6.h5, this, f6Var);
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
        this.a.l(id.a0("formatDateAtTime", null, 2131742786, id.E0().q0().format(date), id.E0().p0().format(date)), false);
    }
}
