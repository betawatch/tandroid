package ug;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i extends c {
    public final l5 r;
    public Object s;

    public i(Context context, f6 f6Var) {
        super(context, f6Var);
        this.c.setVisibility(8);
        l5 l5Var = this.e;
        int i10 = j6.B6;
        l5Var.setTextColor(j6.v0(i10, f6Var));
        l5 l5Var2 = new l5(context);
        this.r = l5Var2;
        l5Var2.setTextSize(16);
        l5Var2.setTextColor(j6.v0(i10, f6Var));
        l5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(l5Var2);
        boolean z10 = LocaleController.isRTL;
        l5Var2.setLayoutParams(a6.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // ug.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
