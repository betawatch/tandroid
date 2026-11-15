package yg;

import android.content.Context;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x extends n4 {
    public final h6 r;

    public x(Context context, e6 e6Var) {
        super(context, e6Var);
        h6 h6Var = new h6(context, true, true, true);
        this.r = h6Var;
        h6Var.b(0.45f, 240L, er.h);
        h6Var.setGravity(hd.a0 ? 3 : 5);
        h6Var.setTextSize(g0.L(15.0f));
        h6Var.setTypeface(g0.o());
        q6.Y(h6Var, j6.L6, e6Var);
        addView(h6Var, ja.d(-2, 24.0f, (hd.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        q6.h(j6.h5, this, e6Var);
    }
}
