package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x extends n4 {
    public final i6 r;

    public x(Context context, h6 h6Var) {
        super(context, h6Var);
        i6 i6Var = new i6(context, true, true, true);
        this.r = i6Var;
        i6Var.b(0.45f, 240L, wq.h);
        i6Var.setGravity(id.a0 ? 3 : 5);
        i6Var.setTextSize(g0.L(15.0f));
        i6Var.setTypeface(g0.o());
        t6.Y(i6Var, m6.L6, h6Var);
        addView(i6Var, ha.d(-2, 24.0f, (id.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        t6.h(m6.h5, this, h6Var);
    }
}
