package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class i extends c {
    public final j5 r;
    public Object s;

    public i(Context context, e6 e6Var) {
        super(context, e6Var);
        this.c.setVisibility(8);
        j5 j5Var = this.e;
        int i10 = j6.B6;
        j5Var.setTextColor(j6.v0(i10, e6Var));
        j5 j5Var2 = new j5(context);
        this.r = j5Var2;
        j5Var2.setTextSize(16);
        j5Var2.setTextColor(j6.v0(i10, e6Var));
        j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j5Var2);
        boolean z10 = LocaleController.isRTL;
        j5Var2.setLayoutParams(y5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // vg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
