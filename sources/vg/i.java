package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i extends c {
    public final i5 r;
    public Object s;

    public i(Context context, d6 d6Var) {
        super(context, d6Var);
        this.c.setVisibility(8);
        i5 i5Var = this.e;
        int i10 = h6.B6;
        i5Var.setTextColor(h6.v0(i10, d6Var));
        i5 i5Var2 = new i5(context);
        this.r = i5Var2;
        i5Var2.setTextSize(16);
        i5Var2.setTextColor(h6.v0(i10, d6Var));
        i5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(i5Var2);
        boolean z10 = LocaleController.isRTL;
        i5Var2.setLayoutParams(x5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // vg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
