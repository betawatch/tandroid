package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class i extends c {
    public final j5 r;
    public Object s;

    public i(Context context, e6 e6Var) {
        super(context, e6Var);
        this.c.setVisibility(8);
        j5 j5Var = this.e;
        int i10 = i6.B6;
        j5Var.setTextColor(i6.v0(i10, e6Var));
        j5 j5Var2 = new j5(context);
        this.r = j5Var2;
        j5Var2.setTextSize(16);
        j5Var2.setTextColor(i6.v0(i10, e6Var));
        j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j5Var2);
        boolean z10 = LocaleController.isRTL;
        j5Var2.setLayoutParams(x5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // vg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
