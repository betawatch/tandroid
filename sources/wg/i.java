package wg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i extends c {
    public final h5 s;
    public Object v;

    public i(Context context, c6 c6Var) {
        super(context, c6Var);
        this.c.setVisibility(8);
        h5 h5Var = this.e;
        int i10 = g6.B6;
        h5Var.setTextColor(g6.w0(i10, c6Var));
        h5 h5Var2 = new h5(context);
        this.s = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(g6.w0(i10, c6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2);
        boolean z10 = LocaleController.isRTL;
        h5Var2.setLayoutParams(a6.a(-2.0f, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f, -1, (z10 ? 3 : 5) | 16));
    }

    @Override // wg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
