package yg;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        m5Var2.setGravity(hd.a0 ? 3 : 5);
        addView(m5Var2);
        boolean z10 = hd.a0;
        m5Var2.setLayoutParams(ma.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // yg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
