package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i extends c {
    public final l5 s;
    public Object w;

    public i(Context context, g6 g6Var) {
        super(context, g6Var);
        this.c.setVisibility(8);
        l5 l5Var = this.e;
        int i7 = l6.B6;
        s6.X(l5Var, i7, g6Var);
        l5 l5Var2 = new l5(context);
        this.s = l5Var2;
        l5Var2.setTextSize(16);
        s6.X(l5Var2, i7, g6Var);
        l5Var2.setGravity(id.a0 ? 3 : 5);
        addView(l5Var2);
        boolean z9 = id.a0;
        l5Var2.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 3 : 5) | 16, z9 ? 20.0f : 0.0f, 0.0f, z9 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // yg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
