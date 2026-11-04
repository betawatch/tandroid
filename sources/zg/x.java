package zg;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x extends n4 {
    public final h6 r;

    public x(Context context, e6 e6Var) {
        super(context, e6Var);
        h6 h6Var = new h6(context, true, true, true);
        this.r = h6Var;
        h6Var.b(0.45f, 240L, xq.h);
        h6Var.setGravity(bd.a0 ? 3 : 5);
        h6Var.setTextSize(g0.L(15.0f));
        h6Var.setTypeface(g0.o());
        r6.Z(h6Var, k6.L6, e6Var);
        addView(h6Var, mf.d(-2, 24.0f, (bd.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        r6.i(k6.h5, this, e6Var);
    }
}
