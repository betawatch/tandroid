package yg;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class x extends o4 {
    public final o6 r;

    public x(Context context, h6 h6Var) {
        super(context, h6Var);
        o6 o6Var = new o6(context, true, true, true);
        this.r = o6Var;
        o6Var.b(0.45f, 240L, nr.h);
        o6Var.setGravity(gd.a0 ? 3 : 5);
        o6Var.setTextSize(g0.L(15.0f));
        o6Var.setTypeface(g0.o());
        t6.Y(o6Var, m6.L6, h6Var);
        addView(o6Var, ma.d(-2, 24.0f, (gd.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        t6.h(m6.h5, this, h6Var);
    }
}
