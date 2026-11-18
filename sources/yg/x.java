package yg;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x extends o4 {
    public final n6 r;

    public x(Context context, i6 i6Var) {
        super(context, i6Var);
        n6 n6Var = new n6(context, true, true, true);
        this.r = n6Var;
        n6Var.b(0.45f, 240L, lr.h);
        n6Var.setGravity(gd.a0 ? 3 : 5);
        n6Var.setTextSize(g0.L(15.0f));
        n6Var.setTypeface(g0.o());
        u6.Y(n6Var, org.telegram.ui.ActionBar.n6.L6, i6Var);
        addView(n6Var, ma.d(-2, 24.0f, (gd.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        u6.h(org.telegram.ui.ActionBar.n6.h5, this, i6Var);
    }
}
