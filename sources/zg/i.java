package zg;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i extends c {
    public final k5 s;
    public Object w;

    public i(Context context, e6 e6Var) {
        super(context, e6Var);
        this.c.setVisibility(8);
        k5 k5Var = this.e;
        int i3 = k6.B6;
        r6.Y(k5Var, i3, e6Var);
        k5 k5Var2 = new k5(context);
        this.s = k5Var2;
        k5Var2.setTextSize(16);
        r6.Y(k5Var2, i3, e6Var);
        k5Var2.setGravity(bd.a0 ? 3 : 5);
        addView(k5Var2);
        boolean z10 = bd.a0;
        k5Var2.setLayoutParams(mf.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // zg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
