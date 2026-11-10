package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i extends c {
    public final m5 s;
    public Object w;

    public i(Context context, h6 h6Var) {
        super(context, h6Var);
        this.c.setVisibility(8);
        m5 m5Var = this.e;
        int i7 = m6.B6;
        t6.X(m5Var, i7, h6Var);
        m5 m5Var2 = new m5(context);
        this.s = m5Var2;
        m5Var2.setTextSize(16);
        t6.X(m5Var2, i7, h6Var);
        m5Var2.setGravity(id.a0 ? 3 : 5);
        addView(m5Var2);
        boolean z9 = id.a0;
        m5Var2.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 3 : 5) | 16, z9 ? 20.0f : 0.0f, 0.0f, z9 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // yg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
