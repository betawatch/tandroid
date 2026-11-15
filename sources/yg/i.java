package yg;

import android.content.Context;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i extends c {
    public final j5 s;
    public Object w;

    public i(Context context, e6 e6Var) {
        super(context, e6Var);
        this.c.setVisibility(8);
        j5 j5Var = this.e;
        int i7 = j6.B6;
        q6.X(j5Var, i7, e6Var);
        j5 j5Var2 = new j5(context);
        this.s = j5Var2;
        j5Var2.setTextSize(16);
        q6.X(j5Var2, i7, e6Var);
        j5Var2.setGravity(hd.a0 ? 3 : 5);
        addView(j5Var2);
        boolean z10 = hd.a0;
        j5Var2.setLayoutParams(ja.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // yg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
