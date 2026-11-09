package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final l5 a;
    public long b;

    public h(Context context, g6 g6Var) {
        super(context);
        l5 l5Var = new l5(context);
        l5Var.setTextSize(16);
        s6.X(l5Var, l6.j5, g6Var);
        l5Var.setGravity(id.a0 ? 5 : 3);
        addView(l5Var);
        l5 l5Var2 = new l5(context);
        this.a = l5Var2;
        l5Var2.setTextSize(16);
        s6.X(l5Var2, l6.L6, g6Var);
        l5Var2.setGravity(id.a0 ? 3 : 5);
        addView(l5Var2);
        l5Var.l(id.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z9 = id.a0;
        l5Var.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 0.0f : 21.0f, 0.0f, z9 ? 21.0f : 0.0f, 0.0f));
        boolean z10 = id.a0;
        l5Var2.setLayoutParams(ha.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 21.0f : 0.0f, 0.0f, z10 ? 0.0f : 21.0f, 0.0f));
        s6.h(l6.h5, this, g6Var);
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
