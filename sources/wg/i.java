package wg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        h5Var2.setLayoutParams(z5.a(-2.0f, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f, -1, (z10 ? 3 : 5) | 16));
    }

    @Override // wg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
