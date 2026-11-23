package yg;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x extends o4 {
    public final o6 r;

    public x(Context context, h6 h6Var) {
        super(context, h6Var);
        o6 o6Var = new o6(context, true, true, true);
        this.r = o6Var;
        o6Var.b(0.45f, 240L, nr.h);
        o6Var.setGravity(hd.a0 ? 3 : 5);
        o6Var.setTextSize(g0.L(15.0f));
        o6Var.setTypeface(g0.o());
        t6.Y(o6Var, m6.L6, h6Var);
        addView(o6Var, ma.d(-2, 24.0f, (hd.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        t6.h(m6.h5, this, h6Var);
    }
}
