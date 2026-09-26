package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class i extends c {
    public final h5 r;
    public Object s;

    public i(Context context, d6 d6Var) {
        super(context, d6Var);
        this.c.setVisibility(8);
        h5 h5Var = this.e;
        int i10 = h6.B6;
        h5Var.setTextColor(h6.v0(i10, d6Var));
        h5 h5Var2 = new h5(context);
        this.r = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(h6.v0(i10, d6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2);
        boolean z10 = LocaleController.isRTL;
        h5Var2.setLayoutParams(y5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // vg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
