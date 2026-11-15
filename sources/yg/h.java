package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final j5 a;
    public long b;

    public h(Context context, e6 e6Var) {
        super(context);
        j5 j5Var = new j5(context);
        j5Var.setTextSize(16);
        q6.X(j5Var, j6.j5, e6Var);
        j5Var.setGravity(hd.a0 ? 5 : 3);
        addView(j5Var);
        j5 j5Var2 = new j5(context);
        this.a = j5Var2;
        j5Var2.setTextSize(16);
        q6.X(j5Var2, j6.L6, e6Var);
        j5Var2.setGravity(hd.a0 ? 3 : 5);
        addView(j5Var2);
        j5Var.l(hd.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z10 = hd.a0;
        j5Var.setLayoutParams(ja.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = hd.a0;
        j5Var2.setLayoutParams(ja.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        q6.h(j6.h5, this, e6Var);
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
        this.a.l(hd.a0("formatDateAtTime", null, 2131742783, hd.E0().q0().format(date), hd.E0().p0().format(date)), false);
    }
}
