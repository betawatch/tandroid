package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final m5 a;
    public long b;

    public h(Context context, h6 h6Var) {
        super(context);
        m5 m5Var = new m5(context);
        m5Var.setTextSize(16);
        t6.X(m5Var, m6.j5, h6Var);
        m5Var.setGravity(id.a0 ? 5 : 3);
        addView(m5Var);
        m5 m5Var2 = new m5(context);
        this.a = m5Var2;
        m5Var2.setTextSize(16);
        t6.X(m5Var2, m6.L6, h6Var);
        m5Var2.setGravity(id.a0 ? 3 : 5);
        addView(m5Var2);
        m5Var.l(id.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z9 = id.a0;
        m5Var.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 0.0f : 21.0f, 0.0f, z9 ? 21.0f : 0.0f, 0.0f));
        boolean z10 = id.a0;
        m5Var2.setLayoutParams(ha.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 21.0f : 0.0f, 0.0f, z10 ? 0.0f : 21.0f, 0.0f));
        t6.h(m6.h5, this, h6Var);
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
        this.a.l(id.a0("formatDateAtTime", null, 2131742783, id.E0().q0().format(date), id.E0().p0().format(date)), false);
    }
}
