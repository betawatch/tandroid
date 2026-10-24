package wg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class i extends c {
    public final n5 s;
    public Object v;

    public i(Context context, g6 g6Var) {
        super(context, g6Var);
        this.c.setVisibility(8);
        n5 n5Var = this.e;
        int i10 = k6.B6;
        r6.Z(n5Var, i10, g6Var);
        n5 n5Var2 = new n5(context);
        this.s = n5Var2;
        n5Var2.setTextSize(16);
        r6.Z(n5Var2, i10, g6Var);
        n5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(n5Var2);
        boolean z10 = LocaleController.isRTL;
        n5Var2.setLayoutParams(z5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // wg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
