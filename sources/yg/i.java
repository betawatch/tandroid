package yg;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i extends c {
    public final n5 s;
    public Object w;

    public i(Context context, i6 i6Var) {
        super(context, i6Var);
        this.c.setVisibility(8);
        n5 n5Var = this.e;
        int i7 = n6.B6;
        u6.X(n5Var, i7, i6Var);
        n5 n5Var2 = new n5(context);
        this.s = n5Var2;
        n5Var2.setTextSize(16);
        u6.X(n5Var2, i7, i6Var);
        n5Var2.setGravity(gd.a0 ? 3 : 5);
        addView(n5Var2);
        boolean z10 = gd.a0;
        n5Var2.setLayoutParams(ma.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // yg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
