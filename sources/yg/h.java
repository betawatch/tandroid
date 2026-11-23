package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final m5 a;
    public long b;

    public h(Context context, h6 h6Var) {
        super(context);
        m5 m5Var = new m5(context);
        m5Var.setTextSize(16);
        t6.X(m5Var, m6.j5, h6Var);
        m5Var.setGravity(hd.a0 ? 5 : 3);
        addView(m5Var);
        m5 m5Var2 = new m5(context);
        this.a = m5Var2;
        m5Var2.setTextSize(16);
        t6.X(m5Var2, m6.L6, h6Var);
        m5Var2.setGravity(hd.a0 ? 3 : 5);
        addView(m5Var2);
        m5Var.l(hd.a0("BoostingDateAndTime", null, 2131753536, new Object[0]), false);
        boolean z10 = hd.a0;
        m5Var.setLayoutParams(ma.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = hd.a0;
        m5Var2.setLayoutParams(ma.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
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
        this.a.l(hd.a0("formatDateAtTime", null, 2131742517, hd.E0().q0().format(date), hd.E0().p0().format(date)), false);
    }
}
