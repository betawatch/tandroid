package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class x extends n4 {
    public final j6 r;

    public x(Context context, f6 f6Var) {
        super(context, f6Var);
        j6 j6Var = new j6(context, true, true, true);
        this.r = j6Var;
        j6Var.b(0.45f, 240L, xq.h);
        j6Var.setGravity(id.a0 ? 3 : 5);
        j6Var.setTextSize(g0.L(15.0f));
        j6Var.setTypeface(g0.o());
        r6.Z(j6Var, k6.L6, f6Var);
        addView(j6Var, ha.d(-2, 24.0f, (id.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        r6.i(k6.h5, this, f6Var);
    }
}
